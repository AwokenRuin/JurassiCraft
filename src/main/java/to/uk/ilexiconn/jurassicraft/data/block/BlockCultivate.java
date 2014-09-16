package to.uk.ilexiconn.jurassicraft.data.block;

import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.AxisAlignedBB;
import net.minecraft.world.World;
import to.uk.ilexiconn.jurassicraft.DinoEntry;
import to.uk.ilexiconn.jurassicraft.data.tile.TileCultivate;

public class BlockCultivate
{
    public static AxisAlignedBB[][] boxes =
            {
                    { //top
                            AxisAlignedBB.getBoundingBox(0.0f,      -1.0f,      0.0f,       1.0f,       -0.6215f,   1.0f),

                            AxisAlignedBB.getBoundingBox(0.0f,      -0.6215f,   0.0f,       0.062f,     0.93f,      0.062f),
                            AxisAlignedBB.getBoundingBox(0.938f,    -0.6215f,   0.0f,       1.0f,       0.93f,      0.062f),
                            AxisAlignedBB.getBoundingBox(0.0f,      -0.6215f,   0.938f,     0.062f,     0.93f,      1.0f),
                            AxisAlignedBB.getBoundingBox(0.938f,    -0.6215f,   0.938f,     1.0f,       0.93f,      1.0f),

                            AxisAlignedBB.getBoundingBox(0.062f,    -0.6215f,   0.062f,     0.938f,     0.93f,      0.938f),

                            AxisAlignedBB.getBoundingBox(0.0f,      0.93f,      0.0f,       1.0f,       1.0f,       1.0f)
                    },
                    { //bottom
                            AxisAlignedBB.getBoundingBox(0.0f,      0.0f,       0.0f,       1.0f,       0.3785f,    1.0f),

                            AxisAlignedBB.getBoundingBox(0.0f,      0.3785f,    0.0f,       0.062f,     1.93f,      0.062f),
                            AxisAlignedBB.getBoundingBox(0.938f,    0.3785f,    0.0f,       1.0f,       1.93f,      0.062f),
                            AxisAlignedBB.getBoundingBox(0.0f,      0.3785f,    0.938f,     0.062f,     1.93f,      1.0f),
                            AxisAlignedBB.getBoundingBox(0.938f,    0.3785f,    0.938f,     1.0f,       1.93f,      1.0f),

                            AxisAlignedBB.getBoundingBox(0.062f,    0.3785f,    0.062f,     0.938f,     1.93f,      0.938f),

                            AxisAlignedBB.getBoundingBox(0.0f,      1.93f,      0.0f,       1.0f,       2.0f,       1.0f)
                    }
            };

    public static void updateBlockStateWithBottom(World world, int x, int y, int z, boolean lit)
    {
        int metadata = world.getBlockMetadata(x, y, z);
        TileEntity tileEntity = world.getTileEntity(x, y, z);

        world.setBlock(x, y, z, DinoEntry.getBlock(lit ? 2 : 0));
        world.setBlock(x, y + 1, z, DinoEntry.getBlock(lit ? 3 : 1));

        if (tileEntity != null)
        {
            tileEntity.validate();
            world.setTileEntity(x, y, z, tileEntity);
        }

        world.setBlockMetadataWithNotify(x, y, z, metadata, 2);
        world.setBlockMetadataWithNotify(x, y + 1, z, metadata, 2);
    }

    public static int getRotation(World world, int x, int y, int z)
    {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        return tileEntity instanceof TileCultivate ? ((TileCultivate) tileEntity).rotation : 0;
    }

    public static void setRotation(World world, int x, int y, int z, int rotation)
    {
        TileEntity tileEntity = world.getTileEntity(x, y, z);
        if (tileEntity instanceof TileCultivate) ((TileCultivate) tileEntity).rotation = rotation;
    }
}