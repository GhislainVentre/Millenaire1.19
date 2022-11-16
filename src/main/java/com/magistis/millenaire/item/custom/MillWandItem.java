package com.magistis.millenaire.item.custom;

import com.magistis.millenaire.item.MillItems;
import net.minecraft.core.BlockPos;
import net.minecraft.network.chat.Component;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.context.UseOnContext;
import net.minecraft.world.level.block.Blocks;

public class MillWandItem extends Item {
    public MillWandItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResult useOn(UseOnContext useOnContext) {

        if(this == MillItems.WAND_SUMMONING.get() && this == useOnContext.getPlayer().getMainHandItem().getItem()) {
            BlockPos pos = useOnContext.getClickedPos();
            if(useOnContext.getLevel().getBlockState(pos).getBlock() == Blocks.GOLD_BLOCK) {
                if(!useOnContext.getLevel().isClientSide()) {
                    useOnContext.getLevel().setBlockAndUpdate(pos, Blocks.DIAMOND_BLOCK.defaultBlockState());
                } else {
                    useOnContext.getPlayer().sendSystemMessage(Component.literal("You have summoned a diamond block!"));
                }
            } else {
                if(!useOnContext.getLevel().isClientSide()) {
                    useOnContext.getLevel().setBlockAndUpdate(pos, Blocks.GOLD_BLOCK.defaultBlockState());
                } else {
                    useOnContext.getPlayer().sendSystemMessage(Component.literal("You have summoned a gold block!"));
                }
            }
        }
        return super.useOn(useOnContext);
    }
}
