package net.ilexiconn.jurassicraft.common.item;

import net.ilexiconn.jurassicraft.JurassiCraft;
import net.ilexiconn.jurassicraft.common.creativetab.ModCreativeTabs;
import net.minecraft.item.Item;

public class ItemOnAStick extends Item
{
    public ItemOnAStick(String foodOnAStick)
    {
        super();
        this.setUnlocalizedName(foodOnAStick + "OnAStick");
        this.setTextureName(JurassiCraft.getModId() + "ridingItems/" + foodOnAStick + "OnAStick");
        this.setCreativeTab(ModCreativeTabs.items);
        this.setMaxStackSize(1);
        this.setMaxDamage(8000);
    }
}
