package com.ilexiconn.jurassicraft.data.entity.render;

import com.ilexiconn.jurassicraft.JurassiCraft;
import com.ilexiconn.jurassicraft.data.entity.Dinosaur;
import com.ilexiconn.jurassicraft.data.entity.RenderDinosaur;
import com.ilexiconn.jurassicraft.data.entity.model.ModelAnkylosaur;
import com.ilexiconn.jurassicraft.data.entity.model.ModelOviraptor;

import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.minecraft.entity.Entity;
import net.minecraft.util.ResourceLocation;

@SideOnly(Side.CLIENT)
public class RenderOviraptor extends RenderDinosaur
{
    public RenderOviraptor(Dinosaur dino)
    {
        super(new ModelOviraptor(), dino, 1f);
    }

    public ResourceLocation getEntityTexture(Entity var1)
    {
        return new ResourceLocation(JurassiCraft.getModId() + "textures/entity/oviraptor1.png");
    }
}