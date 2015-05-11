package net.ilexiconn.jurassicraft.client.model.entity.player;

import com.mojang.authlib.minecraft.MinecraftProfileTexture;
import cpw.mods.fml.common.eventhandler.SubscribeEvent;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;
import net.ilexiconn.jurassicraft.common.JurassiCraft;
import net.minecraft.client.Minecraft;
import net.minecraft.client.entity.AbstractClientPlayer;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.event.RenderPlayerEvent;
import org.lwjgl.opengl.GL11;

import java.util.UUID;

@SideOnly(Side.CLIENT)
public class RenderPlayerEventHandler
{
    public UUID[] uuid = new UUID[]{
            // iLexiconn
            UUID.fromString("40e85e42-21f6-46b6-b5b3-6aeb07f3e3fd"),
            // Ry_dog101
            UUID.fromString("a10dddd1-f990-433b-875b-8349d51fec57"),
            // BobMowzie
            UUID.fromString("487a286b-25a6-44d0-aaa0-f6b87fee6bfb"),
            // Kashyapo
            UUID.fromString("8803f3ac-1ed0-412a-ab44-844981af6e8b"),
            //TheLarsinator
            UUID.fromString("a94683c5-aac9-464f-b064-67b1696237a5"),
            //gegy1000
            UUID.fromString("c3ed4d52-fb4f-4964-ba1b-9cda2453741e"),
            // GinjaninjaS7
            UUID.fromString("18eb6ad8-1656-4e41-89f6-88b708a0474c"),
            // JTGhawk137
            UUID.fromString("54201149-1f1f-498b-98ca-50f66951a68f"),
            // Cryrano
            UUID.fromString("4e88e24d-f77e-436a-ac80-457365c8deaa")};
    public UUID[] donators = new UUID[]{};
    public ModelSantaHat santaHat = new ModelSantaHat();

    @SubscribeEvent
    public void playerRender(RenderPlayerEvent.Pre event)
    {
        if (JurassiCraft.isChristmas)
        {
            GL11.glPushMatrix();
            GL11.glScalef(0.6f, 0.6f, 0.6f);
            GL11.glRotatef(-event.entityPlayer.rotationYaw, 0, 1, 0);
            GL11.glTranslatef(0f, -0.1f, 0f);
            GL11.glRotatef(event.entityPlayer.rotationPitch, 1, 0, 0);
            GL11.glTranslatef(0f, 1.85f, 0f);
            GL11.glTranslatef(0f, 0.2f, 0f);
            GL11.glRotated(180f, 0f, 0f, 1f);
            GL11.glRotatef(180f, 0f, 1f, 0f);
            Minecraft.getMinecraft().renderEngine.bindTexture(new ResourceLocation("jurassicraft", "textures/entity/SantaHat.png"));
            santaHat.renderAll();
            GL11.glPopMatrix();
        }

        if (event.entityPlayer instanceof AbstractClientPlayer && isDev(event.entityPlayer.getUniqueID()))
        {
            ((AbstractClientPlayer) event.entityPlayer).func_152121_a(MinecraftProfileTexture.Type.CAPE, new ResourceLocation("jurassicraft", "textures/cape/awesomeCape.png"));
        }

        else if (event.entityPlayer instanceof AbstractClientPlayer && isDonator(event.entityPlayer.getUniqueID()))
        {
            ((AbstractClientPlayer) event.entityPlayer).func_152121_a(MinecraftProfileTexture.Type.CAPE, new ResourceLocation("jurassicraft", "textures/cape/donatorCape.png"));
        }
    }

    public boolean isDev(UUID id)
    {
        for (UUID uuid1 : uuid)
            if (id.equals(uuid1))
                return true;
        return false;
    }

    public boolean isDonator(UUID id)
    {
        for (UUID uuid1 : donators)
            if (id.equals(uuid1))
                return true;
        return false;
    }
}
