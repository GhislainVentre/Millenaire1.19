package com.magistis.millenaire.item.custom;

//import com.magistis.millenaire.Millenaire;
import com.magistis.millenaire.CommonUtilities;

import com.magistis.millenaire.item.MillItems;
import net.minecraft.MethodsReturnNonnullByDefault;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.nbt.CompoundTag;

import javax.annotation.ParametersAreNonnullByDefault;

public class MillWalletItem extends Item {
    CompoundTag nbt;
    public MillWalletItem(Properties properties) {
        super(properties);
    }

    @Override
    @ParametersAreNonnullByDefault
    @MethodsReturnNonnullByDefault
    public InteractionResultHolder<ItemStack> use(Level level, Player player, InteractionHand hand) {
        //TODO correct this
        ItemStack itemStack = player.getItemInHand(hand);
        if((!level.isClientSide()) && InteractionHand.MAIN_HAND == hand) {
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
                ItemStack slot = player.getInventory().getItem(i);
                // if stack is denier
                if(slot.getItem() == MillItems.DENIER.get()) {
                    denier += slot.getCount();
                    player.getInventory().removeItem(i, slot.getCount());
                }
                // if stack is denier argent
                else if(slot.getItem() == MillItems.DENIER_ARGENT.get()) {
                    argent += slot.getCount();
                    player.getInventory().removeItem(i, slot.getCount());
                }
                // if stack is denier or
                else if(slot.getItem() == MillItems.DENIER_OR.get()) {
                    or += slot.getCount();
                    player.getInventory().removeItem(i, slot.getCount());
                }
            }

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
        }
    }

    private void emptyWallet(ItemStack stack, Player player) {
        if(stack.hasTag())
        {
            CompoundTag nbt = stack.getTag();
            if(nbt.contains("DenierOr") && nbt.getInt("DenierOr") > 0) {
                player.getInventory().add(new ItemStack(MillItems.DENIER_OR.get(), nbt.getInt("DenierOr")));
            }
            if(nbt.contains("DenierArgent") && nbt.getInt("DenierArgent") > 0) {
                ItemStack argent = new ItemStack(MillItems.DENIER_ARGENT.get(), nbt.getInt("DenierArgent"));
                player.getInventory().add(argent);
            }
            if(nbt.contains("Denier") && nbt.getInt("Denier") > 0) {
                ItemStack denier = new ItemStack(MillItems.DENIER.get(), nbt.getInt("Denier"));
                player.getInventory().add(denier);
            }

            stack.setTag(null);
        }
    }

}
