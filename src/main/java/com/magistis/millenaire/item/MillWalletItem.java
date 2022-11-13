package com.magistis.millenaire.item;

import com.magistis.millenaire.item.MillItems;
import com.magistis.millenaire.Millenaire;
import com.magistis.millenaire.CommonUtilities;

import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.nbt.CompoundTag;

public class MillWalletItem extends Item {
    public MillWalletItem(Properties properties) {
        super(properties);
    }

    @Override
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {

        ItemStack itemStack = player.getItemInHand(hand);
        if(level.isClientSide() && InteractionHand.MAIN_HAND == hand) {
            // if denier in inventory, add to wallet
            if(player.getInventory().contains(new ItemStack(MillItems.DENIER.get())) || player.getInventory().contains(new ItemStack(MillItems.DENIER_ARGENT.get())) || player.getInventory().contains(new ItemStack(MillItems.DENIER_OR.get()))) {
                addDenierToWallet(itemStack, player);
            } else {
                emptyWallet(itemStack, player);
            }
        }
        return super.use(level, player, hand);
    }


    private void addDenierToWallet(ItemStack stack, Player player) {
        if(stack.getItem() == this)
        {
            CommonUtilities.changeMoney(player);

            int denier = 0;
            int argent = 0;
            int or = 0;

            for(int i = 0; i < player.getInventory().getContainerSize(); i++)
            {
                player.getInventory().getItem(i);
                // if stack is denier
                if(player.getInventory().getItem(i).getItem() == MillItems.DENIER.get()) {
                    denier += player.getInventory().getItem(i).getCount();
                }
                // if stack is denier argent
                else if(player.getInventory().getItem(i).getItem() == MillItems.DENIER_ARGENT.get()) {
                    argent += player.getInventory().getItem(i).getCount();
                }
                // if stack is denier or
                else if(player.getInventory().getItem(i).getItem() == MillItems.DENIER_OR.get()) {
                    or += player.getInventory().getItem(i).getCount();
                }
            }

            CompoundTag nbt;

            if(!stack.hasTag())
            {
                nbt = new CompoundTag();
                stack.setTag(nbt);
            } else { nbt = stack.getTag(); }

            assert nbt != null;
            denier += nbt.getInt("Denier");
            argent += nbt.getInt("DenierArgent");
            or += nbt.getInt("DenierOr");

            nbt.putInt("Denier", denier);
            nbt.putInt("DenierArgent", argent);
            nbt.putInt("DenierOr", or);

            // remove denier from inventory
            for(int i = 0; i < player.getInventory().getContainerSize(); i++)
            {
                player.getInventory().getItem(i);
                // if stack is denier
                if(player.getInventory().getItem(i).getItem() == MillItems.DENIER.get()) {
                    player.getInventory().removeItem(i, player.getInventory().getItem(i).getCount());
                }
                // if stack is denier argent
                else if(player.getInventory().getItem(i).getItem() == MillItems.DENIER_ARGENT.get()) {
                    player.getInventory().removeItem(i, player.getInventory().getItem(i).getCount());
                }
                // if stack is denier or
                else if(player.getInventory().getItem(i).getItem() == MillItems.DENIER_OR.get()) {
                    player.getInventory().removeItem(i, player.getInventory().getItem(i).getCount());
                }
            }
        }
    }

    private void emptyWallet(ItemStack stack, Player player) {
        if(stack.hasTag())
        {
            CompoundTag nbt = stack.getTag();

            if(nbt.contains("DenierOr") && nbt.getInt("DenierOr") > 0) {
                ItemStack or = new ItemStack(MillItems.DENIER_OR.get(), nbt.getInt("DenierOr"), nbt);
                player.getInventory().add(or);
            }
            if(nbt.contains("DenierArgent") && nbt.getInt("DenierArgent") > 0) {
                ItemStack argent = new ItemStack(MillItems.DENIER_ARGENT.get(), nbt.getInt("DenierArgent"), nbt);
                player.getInventory().add(argent);
            }
            if(nbt.contains("Denier") && nbt.getInt("Denier") > 0) {
                ItemStack denier = new ItemStack(MillItems.DENIER.get(), nbt.getInt("Denier"), nbt);
                player.getInventory().add(denier);
            }

            stack.setTag(null);
        }
    }

}
