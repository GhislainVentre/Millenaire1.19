/* Copyright (c) 2022, Magistis
 * All rights reserved.
 * Learned everything from https://www.youtube.com/c/TKaupenjoe
 */

package com.magistis.millenaire.item.custom;

import com.magistis.millenaire.Millenaire;

import com.magistis.millenaire.item.MillItems;
import net.minecraft.core.BlockPos;
import net.minecraft.nbt.CompoundTag;
import net.minecraft.server.commands.TimeCommand;
import net.minecraft.server.level.ServerPlayer;
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
// ai
import net.minecraft.world.entity.ai.village.VillageSiege;
import org.jetbrains.annotations.NotNull;

import javax.annotation.ParametersAreNonnullByDefault;
import java.util.List;
import java.util.Objects;

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
                long time = level.getDayTime() + 24000L;

                if (time % 24000L > 11000L && time % 24000L < 23500L) {
                    TimeCommand.setTime(Objects.requireNonNull(level.getServer()).createCommandSourceStack(), (int) (time - time % 24000L - 500L));
                } else {
                    TimeCommand.setTime(Objects.requireNonNull(level.getServer()).createCommandSourceStack(), (int) (time - time % 24000L + 13000L));
                }
            }
        }

        return super.use(level, player, hand);
    }

    @Override
    public void inventoryTick(@NotNull ItemStack stack, @NotNull Level level, @NotNull Entity entity, int itemSlot, boolean isSelected) {

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
        }

        if(this == MillItems.AMULET_VISHNU.get() && entity instanceof Player) {
            int radius = 20;
            Vec3 vec = entity.getEyePosition();
            List<Player> other_players = level.getEntitiesOfClass(Player.class, entity.getBoundingBox().inflate(radius));
            for (Player other_player : other_players) {
                if (other_player != entity) {
                    Vec3 other_vec = other_player.getEyePosition();
                    int distance = (int) other_vec.distanceTo(vec);
                    if (distance <= radius) {
                        vis_score += (radius - distance) * 5;
                    }
                }
            }
        }

        if(this == MillItems.AMULET_YGGDRASIL.get()) {
            Vec3 vec = entity.getEyePosition();

            if(vec.y >= 255) {
                vis_score = 0;
            } else if(vec.y <= -64) {
                vis_score = this.score_max;
            } else {
                vis_score = Mth.floor((255 - vec.y) * 100 / 319);
            }
        }

        if(vis_score > this.score_max)
            vis_score = this.score_max;

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
