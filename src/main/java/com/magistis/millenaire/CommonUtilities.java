package com.magistis.millenaire;

import com.magistis.millenaire.item.MillItems;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.ItemStack;

//import java.util.Random;

public class CommonUtilities {

    //public static Random random = new Random();

    /**
     * pretty much orgainizes the player's money
     * @param player The player to orgainize
     */
    public static void changeMoney(Player player) {
        ItemStack denier = new ItemStack(MillItems.DENIER.get(), 0);
        ItemStack argent = new ItemStack(MillItems.DENIER_ARGENT.get(), 0);
        ItemStack or = new ItemStack(MillItems.DENIER_OR.get(), 0);

        for (int i = 0; i < player.getInventory().getContainerSize(); i++) {
            ItemStack stack = player.getInventory().getItem(i);
            if (stack.getItem() == MillItems.DENIER.get()) {
                denier.setCount(denier.getCount() + stack.getCount());
                player.getInventory().removeItem(i, stack.getCount());
            }
            if (stack.getItem() == MillItems.DENIER_ARGENT.get()) {
                argent.setCount(argent.getCount() + stack.getCount());
                player.getInventory().removeItem(i, stack.getCount());
            }
            if (stack.getItem() == MillItems.DENIER_OR.get()) {
                or.setCount(or.getCount() + stack.getCount());
                player.getInventory().removeItem(i, stack.getCount());
            }
        }

        int denierCount = denier.getCount();
        int argentCount = argent.getCount();
        int orCount = or.getCount();

        argentCount += denierCount / 64;
        orCount += argentCount / 64;

        argentCount = argentCount % 64;
        denierCount = denierCount % 64;

        if (denierCount > 0) {
            denier.setCount(denierCount);
            player.getInventory().add(denier);
        }
        if (argentCount > 0) {
            argent.setCount(argentCount);
            player.getInventory().add(argent);
        }
        if (orCount > 0) {
            or.setCount(orCount);
            player.getInventory().add(or);
        }
    }
}