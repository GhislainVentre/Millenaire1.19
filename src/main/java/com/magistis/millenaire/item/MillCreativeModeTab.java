package com.magistis.millenaire.item;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;

public class MillCreativeModeTab {
    public static final CreativeModeTab MILL_TAB = new CreativeModeTab("MillTab")
    {
        public ItemStack makeIcon() { return new ItemStack(MillItems.DENIER_OR.get()); }
    };
}
