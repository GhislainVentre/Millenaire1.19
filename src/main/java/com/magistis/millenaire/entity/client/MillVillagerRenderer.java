package com.magistis.millenaire.entity.client;

import com.magistis.millenaire.Millenaire;
import com.magistis.millenaire.entity.custom.MillVillagerEntity;

import com.mojang.blaze3d.vertex.PoseStack;
import net.minecraft.client.model.VillagerModel;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.layers.CrossedArmsItemLayer;
import net.minecraft.client.renderer.entity.layers.CustomHeadLayer;
import net.minecraft.resources.ResourceLocation;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;

@OnlyIn(Dist.CLIENT)
public class MillVillagerRenderer extends MobRenderer<MillVillagerEntity, MillVillagerModel> {
    public static final ResourceLocation VILLAGER_BASE_SKIN = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_artisan0.png");
    public static final ResourceLocation BYZANTINE_ARTISAN0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_artisan0.png");
    public static final ResourceLocation BYZANTINE_ARTISAN_WIFE0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_artisan_wife0.png");
    public static final ResourceLocation BYZANTINE_BARON0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_baron0.png");
    public static final ResourceLocation BYZANTINE_BARON1 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_baron1.png");
    public static final ResourceLocation BYZANTINE_BOY0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_boy0.png");
    public static final ResourceLocation BYZANTINE_CENTURIO0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_centurio0.png");
    public static final ResourceLocation BYZANTINE_CENTURIO1 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_centurio1.png");
    public static final ResourceLocation BYZANTINE_FARMER0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_farmer0.png");
    public static final ResourceLocation BYZANTINE_FARMER1 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_farmer1.png");
    public static final ResourceLocation BYZANTINE_FARMILLER0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_farmiller0.png");
    public static final ResourceLocation BYZANTINE_FARMILLER1 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_farmiller1.png");
    public static final ResourceLocation BYZANTINE_FRAU0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_frau0.png");
    public static final ResourceLocation BYZANTINE_FRAU1 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_frau1.png");
    public static final ResourceLocation BYZANTINE_FRAU2 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_frau2.png");
    public static final ResourceLocation BYZANTINE_FRAU3 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_frau3.png");
    public static final ResourceLocation BYZANTINE_FRAU4 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_frau4.png");
    public static final ResourceLocation BYZANTINE_GIRL0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_girl0.png");
    public static final ResourceLocation BYZANTINE_KEEPER0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_keeper0.png");
    public static final ResourceLocation BYZANTINE_KEEPER1 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_keeper1.png");
    public static final ResourceLocation BYZANTINE_KEEPER2 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_keeper2.png");
    public static final ResourceLocation BYZANTINE_KEEPER3 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_keeper3.png");
    public static final ResourceLocation BYZANTINE_LUMBERMAN0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_lumberman0.png");
    public static final ResourceLocation BYZANTINE_LUMBERMAN1 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_lumberman1.png");
    public static final ResourceLocation BYZANTINE_MERCHANT0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_merchant0.png");
    public static final ResourceLocation BYZANTINE_MINER0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_miner0.png");
    public static final ResourceLocation BYZANTINE_MINER1 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_miner1.png");
    public static final ResourceLocation BYZANTINE_MINER2 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_miner2.png");
    public static final ResourceLocation BYZANTINE_PAPAS0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_papas0.png");
    public static final ResourceLocation BYZANTINE_PAPAS1 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_papas1.png");
    public static final ResourceLocation BYZANTINE_PAPAS2 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_papas2.png");
    public static final ResourceLocation BYZANTINE_PATRIARCH0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_patriarch0.png");
    public static final ResourceLocation BYZANTINE_RICH_WIFE0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_rich_wife0.png");
    public static final ResourceLocation BYZANTINE_SHEPARD0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_shepard0.png");
    public static final ResourceLocation BYZANTINE_SHEPHERD_WIFE0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_shepherd_wife0.png");
    public static final ResourceLocation BYZANTINE_SILK_SMUGGLER0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_silk_smuggler0.png");
    public static final ResourceLocation BYZANTINE_SMITH0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_smith0.png");
    public static final ResourceLocation BYZANTINE_SMITH1 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_smith1.png");
    public static final ResourceLocation BYZANTINE_SOLDIER0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_soldier0.png");
    public static final ResourceLocation BYZANTINE_WIFE0 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_wife0.png");
    public static final ResourceLocation BYZANTINE_WIFE1 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_wife1.png");
    public static final ResourceLocation BYZANTINE_WIFE2 = new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/byzantine_wife2.png");


    public MillVillagerRenderer(EntityRendererProvider.Context context) {
        super(context, new MillVillagerModel(context.bakeLayer(MillVillagerModel.VILLAGER_LAYER)), 0.5F);
    }

    public ResourceLocation getTextureLocation(MillVillagerEntity entity) {
        return new ResourceLocation(Millenaire.MOD_ID,"textures/entity/byzantine/" + entity.name + ".png");
    }

    protected void scale(MillVillagerEntity entity, PoseStack poseStack, float v) {
        float f = 0.9375F;
        poseStack.scale(0.9375F, 0.9375F, 0.9375F);
    }
}