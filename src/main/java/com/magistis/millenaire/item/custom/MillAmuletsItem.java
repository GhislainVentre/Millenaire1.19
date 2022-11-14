package com.magistis.millenaire.item.custom;

import com.magistis.millenaire.Millenaire;

import com.magistis.millenaire.item.MillItems;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
// MinecraftServer

import javax.annotation.ParametersAreNonnullByDefault;

public class MillAmuletsItem extends Item {

    public MillAmuletsItem(Properties properties) {
        super(properties);
    }

    @Override
    @ParametersAreNonnullByDefault
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        if (!level.isClientSide) {
            if(this == MillItems.AMULET_SKOLLHATI.get()) {
                Millenaire.LOGGER.info("Skollhati amulet used");
                long time = level.getDayTime();
                if (time % 24000L > 11000L && time % 24000L < 23500L) {
                    Millenaire.LOGGER.info("time1 = " + time);
                    //TODO add a way to change time
                }
                else {
                    Millenaire.LOGGER.info("time2 = " + time);
                    //TODO add a way to change time
                }
            }
        }

        return super.use(level, player, hand);
    }
}