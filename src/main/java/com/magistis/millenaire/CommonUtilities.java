package com.magistis.millenaire;

import com.magistis.millenaire.item.MillItems;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

import java.util.Random;

public class CommonUtilities {

    public static Random random = new Random();

    public static void changeMoney(Player player) {
        ItemStack denier = new ItemStack(MillItems.DENIER.get(), 0);
        ItemStack argent = new ItemStack(MillItems.DENIER_ARGENT.get(), 0);
        ItemStack or = new ItemStack(MillItems.DENIER_OR.get(), 0);

        for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
            ItemStack stack = player.getInventory().getItem(i);
            if (stack.getItem() == MillItems.DENIER.get()) {
                denier.setCount(denier.getCount() + stack.getCount());
                player.getInventory().setItem(i, ItemStack.EMPTY);
            }
            if (stack.getItem() == MillItems.DENIER_ARGENT.get()) {
                argent.setCount(argent.getCount() + stack.getCount());
                player.getInventory().setItem(i, ItemStack.EMPTY);
            }
            if (stack.getItem() == MillItems.DENIER_OR.get()) {
                or.setCount(or.getCount() + stack.getCount());
                player.getInventory().setItem(i, ItemStack.EMPTY);
            }
        }

        int denierCount = denier.getCount();
        int argentCount = argent.getCount();
        int orCount = or.getCount();

        Millenaire.LOGGER.info("denierCount: " + denierCount);
        Millenaire.LOGGER.info("argentCount: " + argentCount);
        Millenaire.LOGGER.info("orCount: " + orCount);

        argentCount += denierCount / 64;
        orCount += argentCount / 64;

        argentCount = argentCount % 64;
        denierCount = denierCount % 64;

        if (denierCount > 0) {
            Millenaire.LOGGER.info("denierCount: " + denierCount);
            player.getInventory().add(new ItemStack(MillItems.DENIER.get(), denierCount));
        }
        if (argentCount > 0) {
            Millenaire.LOGGER.info("argentCount: " + argentCount);
            player.getInventory().add(new ItemStack(MillItems.DENIER_ARGENT.get(), argentCount));
        }
        if (orCount > 0) {
            Millenaire.LOGGER.info("orCount: " + orCount);
            player.getInventory().add(new ItemStack(MillItems.DENIER_OR.get(), orCount));
        }
    }
}