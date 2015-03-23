package net.ilexiconn.jurassicraft.ai;

import net.ilexiconn.jurassicraft.entity.EntityJurassiCraftSmart;
import net.minecraft.entity.ai.EntityAIBase;
import net.minecraft.entity.ai.RandomPositionGenerator;
import net.minecraft.util.Vec3;

/**
 * This AI makes an EntityJurassiCraftSmart walk if the creature is not sitting, sleeping, flying,
 * or being ridden.
 *
 * @author RafaMv
 */
public class JurassiCraftAIWander extends EntityAIBase
{
    private EntityJurassiCraftSmart creature;
    private double xPosition;
    private double yPosition;
    private double zPosition;
    private double speed;
    private int maxDistance;
    private int maxHeight;
    private int chanceToWalk;
    private int timer;
    
    public JurassiCraftAIWander(EntityJurassiCraftSmart entity, int chanceToWalk, double velocity)
    {
        this(entity, chanceToWalk, 16, 6, velocity);
    }
    
    public JurassiCraftAIWander(EntityJurassiCraftSmart entity, int chanceToWalk, int distance, int height, double velocity)
    {
        this.creature = entity;
        this.chanceToWalk = chanceToWalk;
        this.speed = velocity;
        this.maxDistance = distance;
        this.maxHeight = height;
        this.setMutexBits(1);
    }
    
    public boolean shouldExecute()
    {
        if (this.creature.isSitting() || this.creature.isFlying() || this.creature.riddenByEntity != null || this.creature.isSleeping() || this.creature.isAngry() || this.creature.isFleeing())
        {
            return false;
        }
        else
        {
            if (timer < 0 && this.creature.getRNG().nextInt(this.chanceToWalk) == 0)
            {
                double xDirection = (double) (this.creature.getRNG().nextInt(this.maxDistance * 2 + 1) - this.maxDistance);
                double zDirection = (double) (this.creature.getRNG().nextInt(this.maxDistance * 2 + 1) - this.maxDistance);
                Vec3 vec3 = RandomPositionGenerator.findRandomTargetBlockTowards(this.creature, this.maxDistance, this.maxHeight, Vec3.createVectorHelper(this.xPosition + xDirection, 0, this.zPosition + zDirection));
                if (vec3 == null)
                {
                    return false;
                }
                else
                {
                    this.xPosition = vec3.xCoord;
                    this.yPosition = vec3.yCoord;
                    this.zPosition = vec3.zCoord;
                    return true;
                }
            }
            else
            {
                this.timer--;
                return false;
            }
        }
    }
    
    public void startExecuting()
    {
        this.creature.setSitting(false, null);
        this.creature.setSleeping(false);
        this.creature.setFlying(false);
        this.creature.getNavigator().tryMoveToXYZ(this.xPosition, this.yPosition, this.zPosition, this.speed);
    }
    
    public boolean continueExecuting()
    {
        return !this.creature.getNavigator().noPath() && !this.creature.isSitting() && this.creature.riddenByEntity == null && this.creature.getAttackTarget() == null;
    }
    
    @Override
    public void resetTask()
    {
        this.creature.getNavigator().clearPathEntity();
        this.timer = 50;
    }
}
