package com.magistis.millenaire.entity.custom;

import com.magistis.millenaire.Millenaire;
import com.magistis.millenaire.entity.MillEntityTypes;
import com.magistis.millenaire.util.MillVillagerInventory;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.InteractionHand;
import net.minecraft.world.InteractionResult;
import net.minecraft.world.MenuProvider;
import net.minecraft.world.entity.AgeableMob;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.ai.attributes.AttributeSupplier;
import net.minecraft.world.entity.ai.attributes.Attributes;
import net.minecraft.world.entity.ai.navigation.GroundPathNavigation;
import net.minecraft.world.entity.animal.Animal;
import net.minecraft.world.entity.npc.AbstractVillager;
import net.minecraft.world.entity.npc.Villager;
import net.minecraft.world.entity.npc.VillagerType;
import net.minecraft.world.entity.player.Inventory;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.inventory.AbstractContainerMenu;
import net.minecraft.world.inventory.ChestMenu;
import net.minecraft.world.item.trading.MerchantOffer;
import net.minecraft.world.level.Level;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

public class MillVillagerEntity extends Animal  {

    private MillVillagerInventory inventory;
    public String name;

    public InteractionResult mobInteract(Player player, InteractionHand interactionHand) {
        return InteractionResult.PASS;
    }

    public MillVillagerEntity(EntityType<? extends MillVillagerEntity> entityType, Level level) {
        this(entityType, level, VillagerType.PLAINS);
    }

    public MillVillagerEntity(EntityType<? extends MillVillagerEntity> entityType, Level level, VillagerType villagerType) {
        super(entityType, level);
        ((GroundPathNavigation)this.getNavigation()).setCanOpenDoors(true);
        this.getNavigation().setCanFloat(true);
        this.setCanPickUpLoot(true);
        this.inventory = new MillVillagerInventory(this);
        String n = entityType.toString();
        //get last part of the string
        n = n.substring(n.lastIndexOf(".") + 1);
        this.name = n;
        //this.setVillagerData(this.getVillagerData().setType(p_35386_).setProfession(VillagerProfession.NONE));
    }

    public static AttributeSupplier setAttributes() {
        return Villager.createMobAttributes()
                .add(Attributes.MAX_HEALTH, 20)
                .add(Attributes.ATTACK_DAMAGE, 3.0f)
                .add(Attributes.MOVEMENT_SPEED, 0.4f)
                .add(Attributes.ATTACK_SPEED, 1.0f).build();
    }

    @Nullable
    @Override
    public AgeableMob getBreedOffspring(ServerLevel serverLevel, AgeableMob ageableMob) {
        return null;
    }

}
