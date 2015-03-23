package net.ilexiconn.jurassicraft.client.render.block;

import net.ilexiconn.jurassicraft.client.render.RenderUtils;
import cpw.mods.fml.client.registry.ISimpleBlockRenderingHandler;
import net.ilexiconn.jurassicraft.api.Properties;
import net.minecraft.block.Block;
import net.minecraft.client.renderer.RenderBlocks;
import net.minecraft.world.IBlockAccess;

public class BlockAntHillRenderer implements ISimpleBlockRenderingHandler
{
    
    @Override
    public void renderInventoryBlock(Block block, int metadata, int modelID, RenderBlocks renderer)
    {
        renderer.setRenderBounds(0.0D, 0.0D, 0.0D, 1.0D, 0.4D, 1.0D);
        RenderUtils.instance().renderInvBlock(renderer, block, metadata);
        renderer.setRenderBounds(0.15D, 0.4D, 0.15D, 0.85D, 0.7D, 0.85D);
        RenderUtils.instance().renderInvBlock(renderer, block, metadata);
        renderer.setRenderBounds(0.3D, 0.7D, 0.3D, 0.7D, 1.0D, 0.7D);
        RenderUtils.instance().renderInvBlock(renderer, block, metadata);
    }
    
    @Override
    public boolean renderWorldBlock(IBlockAccess world, int x, int y, int z, Block block, int modelId, RenderBlocks renderer)
    {
        renderer.setRenderBounds(0.0D, 0.0D, 0.0D, 1.0D, 0.4D, 1.0D);
        renderer.renderStandardBlock(block, x, y, z);
        renderer.setRenderBounds(0.15D, 0.4D, 0.15D, 0.85D, 0.7D, 0.85D);
        renderer.renderStandardBlock(block, x, y, z);
        renderer.setRenderBounds(0.3D, 0.7D, 0.3D, 0.7D, 1.0D, 0.7D);
        renderer.renderStandardBlock(block, x, y, z);
        return true;
    }
    
    @Override
    public boolean shouldRender3DInInventory(int modelId)
    {
        return true;
    }
    
    @Override
    public int getRenderId()
    {
        return Properties.RENDER_ANT_HILL;
    }
}
