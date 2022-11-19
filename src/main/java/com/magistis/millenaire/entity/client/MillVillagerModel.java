// Made with Blockbench 3.5.1
// Exported for Minecraft version 1.15
// Paste this class into your mod and generate all required imports
package com.magistis.millenaire.entity.client;

import com.magistis.millenaire.Millenaire;
import com.magistis.millenaire.entity.custom.MillVillagerEntity;

import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.builders.*;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.world.entity.Pose;
import org.jetbrains.annotations.NotNull;

public class MillVillagerModel extends HumanoidModel<MillVillagerEntity>
{
    public static String BODY = "body";
    public static final ModelLayerLocation VILLAGER_LAYER = new ModelLayerLocation(new ResourceLocation(Millenaire.MOD_ID, "byzantine_artisan0"), BODY);


    public MillVillagerModel(final ModelPart part)
    {
        super(part);
        hat.visible = false;
    }

public static LayerDefinition createMesh() {
        MeshDefinition meshdefinition = createMesh(CubeDeformation.NONE, 0.6F);
        return LayerDefinition.create(meshdefinition, 64, 32);
    }
}
