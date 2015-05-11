package net.ilexiconn.jurassicraft.client.render.entity;

import net.ilexiconn.jurassicraft.common.entity.Creature;
import net.ilexiconn.jurassicraft.common.entity.EntityJurassiCraftCreature;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.renderer.entity.RenderLiving;
import net.minecraft.entity.EntityLivingBase;
import org.lwjgl.opengl.GL11;

public abstract class RenderFish extends RenderLiving
{

    private Creature fish;
    private float resizableShadow;

    public RenderFish(ModelBase model, Creature fish, float shadow)
    {
        super(model, 1.0F);
        this.setFish(fish);
        this.setShadow(shadow);
    }

    public float getShadow()
    {
        return this.resizableShadow;
    }

    private void setShadow(float shadow)
    {
        this.resizableShadow = shadow;
    }

    public Creature getFish()
    {
        return this.fish;
    }

    private void setFish(Creature fish)
    {
        this.fish = fish;
    }

    public void preRenderCallback(EntityLivingBase entity, float side)
    {
        float scale = ((EntityJurassiCraftCreature) entity).getCreatureScale();
        this.shadowSize = scale * this.getShadow();
        GL11.glScalef(scale, scale, scale);
    }
}
