package net.starseer.fracturedreality.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.model.geom.builders.PartDefinition;
import net.minecraft.client.model.geom.builders.MeshDefinition;
import net.minecraft.client.model.geom.builders.LayerDefinition;
import net.minecraft.client.model.geom.builders.CubeListBuilder;
import net.minecraft.client.model.geom.builders.CubeDeformation;
import net.minecraft.client.model.geom.PartPose;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayerLocation;
import net.minecraft.client.model.EntityModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelvoidBlockerTotem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("fractured_reality", "modelvoid_blocker_totem"), "main");
	public final ModelPart Base;
	public final ModelPart Ring1;
	public final ModelPart Ring2;
	public final ModelPart Ring3;

	public ModelvoidBlockerTotem(ModelPart root) {
		this.Base = root.getChild("Base");
		this.Ring1 = root.getChild("Ring1");
		this.Ring2 = root.getChild("Ring2");
		this.Ring3 = root.getChild("Ring3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Base = partdefinition
				.addOrReplaceChild(
						"Base", CubeListBuilder.create().texOffs(0, 32).addBox(-16.0F, -4.0F, 0.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(64, 48).addBox(-12.0F, -12.0F, 4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F))
								.texOffs(0, 52).addBox(-16.0F, -16.0F, 0.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-16.0F, -32.0F, 0.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.1F)),
						PartPose.offset(8.0F, 24.0F, -8.0F));
		PartDefinition Ring1 = partdefinition.addOrReplaceChild("Ring1", CubeListBuilder.create().texOffs(64, 0).addBox(-8.0F, 0.0F, -8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.0F, 0.0F));
		PartDefinition Ring2 = partdefinition.addOrReplaceChild("Ring2", CubeListBuilder.create().texOffs(64, 16).addBox(-8.0F, 0.0F, -8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition Ring3 = partdefinition.addOrReplaceChild("Ring3", CubeListBuilder.create().texOffs(64, 32).addBox(-8.0F, 0.0F, -8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Base.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Ring1.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Ring2.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Ring3.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}