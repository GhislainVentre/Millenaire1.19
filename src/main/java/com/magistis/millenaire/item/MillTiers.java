/* Copyright (c) 2022, Magistis
 * All rights reserved.
 * Learned everything from https://www.youtube.com/c/TKaupenjoe
 */

package com.magistis.millenaire.item;

import net.minecraft.tags.BlockTags;
import net.minecraft.world.item.crafting.Ingredient;
import net.minecraftforge.common.ForgeTier;

public class MillTiers {
    public static final ForgeTier NORMAN = new ForgeTier(2,1561,10f,4.0f,10, BlockTags.NEEDS_IRON_TOOL, () -> Ingredient.EMPTY);
    public static final ForgeTier OBSIDIAN = new ForgeTier(3,1561,6f,2.0f,25, BlockTags.NEEDS_DIAMOND_TOOL, () -> Ingredient.EMPTY);

}
