package net.ilexiconn.jurassicraft.entity.dinosaurs;

import net.ilexiconn.jurassicraft.AnimationHandler;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAIEatDroppedFood;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAIEating;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAIFollowFood;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAIOwnerHurtsTarget;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAIOwnerIsHurtByTarget;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAISit;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAITargetIfHasAgeAndNonTamed;
import net.ilexiconn.jurassicraft.ai.JurassiCraftAIWander;
import net.ilexiconn.jurassicraft.ai.animation.AnimationAIRoar;
import net.ilexiconn.jurassicraft.ai.animation.AnimationAIVelociraptorLeap;
import net.ilexiconn.jurassicraft.ai.animation.AnimationAIVelociraptorTwitchHead;
import net.ilexiconn.jurassicraft.client.model.modelbase.ChainBuffer;
import net.ilexiconn.jurassicraft.entity.CreatureManager;
import net.ilexiconn.jurassicraft.entity.EntityJurassiCraftGroupAggressive;
import net.ilexiconn.jurassicraft.entity.mammals.EntityLeptictidium;
import net.ilexiconn.jurassicraft.entity.mammals.EntityMoeritherium;
import net.ilexiconn.jurassicraft.enums.JurassiCraftAnimationIDs;
import net.ilexiconn.jurassicraft.interfaces.ICarnivore;
import net.ilexiconn.jurassicraft.interfaces.IDinosaur;
import net.minecraft.entity.ai.EntityAIAttackOnCollide;
import net.minecraft.entity.ai.EntityAIHurtByTarget;
import net.minecraft.entity.ai.EntityAILookIdle;
import net.minecraft.entity.ai.EntityAIMoveTowardsRestriction;
import net.minecraft.entity.ai.EntityAISwimming;
import net.minecraft.entity.ai.EntityAIWatchClosest;
import net.minecraft.entity.passive.EntityChicken;
import net.minecraft.entity.passive.EntityCow;
import net.minecraft.entity.passive.EntityHorse;
import net.minecraft.entity.passive.EntityPig;
import net.minecraft.entity.passive.EntitySheep;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public class EntityVelociraptor extends EntityJurassiCraftGroupAggressive implements IDinosaur, ICarnivore
{
	public ChainBuffer tailBuffer = new ChainBuffer(6);
    public boolean leaping = false;
    public int timeSinceLeap;
    public int texid;

    public EntityVelociraptor(World world)
    {
        super(world, CreatureManager.classToCreature(EntityVelociraptor.class));
        this.getNavigator().setAvoidsWater(true);
        this.tasks.addTask(0, new EntityAISwimming(this));
        this.tasks.addTask(3, new EntityAIAttackOnCollide(this, 1.0F * this.getCreatureSpeed(), false));
        this.tasks.addTask(1, new AnimationAIVelociraptorLeap(this));
        this.tasks.addTask(3, new JurassiCraftAIWander(this, 40, 0.8D * this.getCreatureSpeed()));
        this.tasks.addTask(4, new JurassiCraftAISit(this));
        this.tasks.addTask(5, new EntityAIMoveTowardsRestriction(this, this.getCreatureSpeed()));
        this.tasks.addTask(6, new JurassiCraftAIFollowFood(this, 100, 1.2D * this.getCreatureSpeed()));
        this.tasks.addTask(6, new JurassiCraftAIEatDroppedFood(this, 16.0D));
        this.tasks.addTask(6, new JurassiCraftAIEating(this, 20));
        this.tasks.addTask(7, new EntityAIWatchClosest(this, EntityPlayer.class, 6.0F));
        this.tasks.addTask(7, new EntityAILookIdle(this));
        this.tasks.addTask(7, new AnimationAIVelociraptorTwitchHead(this));
        this.tasks.addTask(7, new AnimationAIRoar(this, 20));
        this.targetTasks.addTask(1, new JurassiCraftAIOwnerIsHurtByTarget(this));
        this.targetTasks.addTask(2, new JurassiCraftAIOwnerHurtsTarget(this));
        this.targetTasks.addTask(3, new EntityAIHurtByTarget(this, true));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityGallimimus.class, 60, 0.7F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityHypsilophodon.class, 50, 0.5F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityMoeritherium.class, 50, 0.5F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityLeptictidium.class, 50, 0.4F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityLeaellynasaura.class, 50, 0.4F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityOviraptor.class, 50, 0.4F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityHorse.class, 50, 0.6F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityCow.class, 50, 0.6F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityPig.class, 30, 0.6F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntitySheep.class, 30, 0.6F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityChicken.class, 20, 0.2F));
        this.targetTasks.addTask(3, new JurassiCraftAITargetIfHasAgeAndNonTamed(this, EntityPlayer.class, 50, 0.5F));
        this.setCreatureExperiencePoints(2500);
    }

    @Override
    public void onLivingUpdate()
    {
        // Leap AI
        float distanceFromTarget;
        if (getAttackTarget() != null)
            distanceFromTarget = (float) Math.sqrt(Math.pow((posX - getAttackTarget().posX), 2) + Math.pow((posZ - getAttackTarget().posZ), 2));
        else distanceFromTarget = -1;
        if (distanceFromTarget >= 5 && distanceFromTarget <= 6 && onGround && timeSinceLeap == 0 && animID == 0)
            AnimationHandler.sendAnimationPacket(this, JurassiCraftAnimationIDs.LEAP.animID());
        if (onGround == true) setLeaping(false);
        if (timeSinceLeap != 0) timeSinceLeap--;

        // Misc
        super.onLivingUpdate();
    }

    @Override
    public void onUpdate()
    {
        super.onUpdate();
        this.tailBuffer.calculateChainSwingBuffer(68.0F, 5, 4.0F, this);
    }

    public void setLeaping(boolean l)
    {
        this.leaping = l;
    }

    @Override
    public String getLivingSound()
    {
        if (animID == 0) AnimationHandler.sendAnimationPacket(this, JurassiCraftAnimationIDs.ROAR.animID());
        int I = rand.nextInt(4) + 1;
        if (I == 1) return "jurassicraft:velociraptorHiss01";
        if (I == 2) return "jurassicraft:velociraptorHiss02";
        if (I == 3) return "jurassicraft:velociraptorHiss03";
        else return "jurassicraft:velociraptorBark03";
    }
    
    @Override
    protected void dropFewItems(boolean recentlyBeenHit, int enchantBonus)
    {
    	float developmentFraction = this.getGrowthStage() / 120.0F;
        int count = Math.round(1 + (3.0F * developmentFraction) + this.rand.nextInt(1 + (int) (2.5F * developmentFraction)) + this.rand.nextInt(1 + enchantBonus));
    	if (!this.isBurning())
        {
            this.dropItemStackWithGenetics(new ItemStack(this.getCreature().getMeat(), count));
        }
        else
        {
            this.dropItem(this.getCreature().getSteak(), count);
        }
    	if (this.isMale() && this.worldObj.rand.nextFloat() < 0.25F) {
            this.dropItemStackWithGenetics(new ItemStack(this.getCreature().getSkin()));
    	}
    }
}
