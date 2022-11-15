package com.magistis.millenaire.item.custom;

import com.magistis.millenaire.Millenaire;

import com.magistis.millenaire.item.MillItems;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.util.Mth;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResultHolder;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.item.Item;
import net.minecraft.world.item.ItemStack;
import net.minecraft.world.level.Level;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.phys.Vec3;
// MinecraftServer

import javax.annotation.ParametersAreNonnullByDefault;

public class MillAmuletItem extends Item {
    int score_max = 100;

    public MillAmuletItem(Properties properties) {
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

    @Override
    public void inventoryTick(ItemStack stack, Level level, Entity entity, int itemSlot, boolean isSelected) {

        if(this == MillItems.AMULET_SKOLLHATI.get()) {
            return ;
        }

        Millenaire.LOGGER.info("Amulet inventory tick");

        int vis_score = 0;

        if(this == MillItems.AMULET_ALCHEMIST.get()) {
            int radius = 5;
            Vec3 vec = entity.getEyePosition();

            for(int x = -radius; x < radius; x++) {
                for(int y = -radius; y < radius; y++) {
                    for(int z = -radius; z < radius; z++) {
                        BlockPos pos = new BlockPos(vec.x + x, vec.y + y, vec.z + z);
                        if(entity.level.getBlockState(pos).getBlock() == Blocks.DIAMOND_ORE) {
                            vis_score += 30;
                        } else if(entity.level.getBlockState(pos).getBlock() == Blocks.EMERALD_ORE) {
                            vis_score += 30;
                        } else if(entity.level.getBlockState(pos).getBlock() == Blocks.GOLD_ORE) {
                            vis_score += 10;
                        } else if(entity.level.getBlockState(pos).getBlock() == Blocks.IRON_ORE) {
                            vis_score += 5;
                        } else if(entity.level.getBlockState(pos).getBlock() == Blocks.LAPIS_ORE) {
                            vis_score += 10;
                        } else if(entity.level.getBlockState(pos).getBlock() == Blocks.REDSTONE_ORE) {
                            vis_score += 5;
                        }
                    }
                }
            }
            if(vis_score > this.score_max)
                vis_score = this.score_max;
        }

        CompoundTag nbt;
        if(stack.getTag() == null)
            nbt = new CompoundTag();
        else
            nbt = stack.getTag();

        nbt.putInt("score", vis_score);
        stack.setTag(nbt);

        stack.setDamageValue(this.score_max - vis_score);

        return;
    }

    @Override
    public int getBarColor(ItemStack itemStack) {
        CompoundTag nbt = itemStack.getTag();

        if (nbt == null) {
            Millenaire.LOGGER.info("nbt is null");
            if (this == MillItems.AMULET_ALCHEMIST.get() || this == MillItems.AMULET_VISHNU.get() || this == MillItems.AMULET_YGGDRASIL.get()) {
                return Mth.hsvToRgb(0.0F, 1.0F, 1.0F);
            }
        } else {
            int score = nbt.getInt("score");
            Millenaire.LOGGER.info("score = " + score);

            if (this == MillItems.AMULET_ALCHEMIST.get() || this == MillItems.AMULET_VISHNU.get() || this == MillItems.AMULET_YGGDRASIL.get()) {
                float f = (float) Math.max(0, (score_max - score)/score_max);
                return Mth.hsvToRgb(f / 3.0F, 1.0F, 1.0F);
            }
            return 0;
        }
        return 0;
    }
}
