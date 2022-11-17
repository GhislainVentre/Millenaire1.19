/* Copyright (c) 2022, Magistis
 * All rights reserved.
 * Learned everything from https://www.youtube.com/c/TKaupenjoe
 */

package com.magistis.millenaire.block.custom;

import com.magistis.millenaire.item.MillItems;
import net.minecraft.world.item.Item;
import net.minecraft.world.level.ItemLike;
import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.block.CropBlock;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.state.StateDefinition;
import net.minecraft.world.level.block.state.properties.IntegerProperty;

public class MillCropBlock extends CropBlock {
    public static final IntegerProperty AGE = IntegerProperty.create("age", 0, 1);

    public enum CropType {
        RICE,
        MAIZE,
        TURMERIC,
        GRAPES
    }

    CropType cropType;

    public MillCropBlock(Properties properties, CropType cropType) {
        super(properties);
        this.cropType = cropType;
    }

    protected ItemLike getBaseSeedId() {
        if(this.cropType == CropType.RICE) {
            return MillItems.RICE.get();
        } else if(this.cropType == CropType.MAIZE) {
            return MillItems.MAIZE.get();
        } else if(this.cropType == CropType.TURMERIC) {
            return MillItems.TURMERIC.get();
        } else if(this.cropType == CropType.GRAPES) {
            return MillItems.GRAPES.get();
        } else {
            return MillItems.RICE.get();
        }
    }

    @Override
    public IntegerProperty getAgeProperty() {
        return AGE;
    }

    @Override
    public int getMaxAge() {
        return 1;
    }

    @Override
    protected void createBlockStateDefinition(StateDefinition.Builder<Block, BlockState> blockstate) {
        blockstate.add(AGE);
    }
}
