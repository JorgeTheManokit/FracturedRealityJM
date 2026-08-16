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

// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelvoidGenerator<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("fractured_reality", "modelvoid_generator"), "main");
	public final ModelPart Base;
	public final ModelPart Fragments;

	public ModelvoidGenerator(ModelPart root) {
		this.Base = root.getChild("Base");
		this.Fragments = root.getChild("Fragments");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Base = partdefinition.addOrReplaceChild("Base",
				CubeListBuilder.create().texOffs(0, 72).addBox(-16.0F, -9.0F, 0.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.1F)).texOffs(0, 0).addBox(-16.0F, -5.0F, 0.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 13.0F, -8.0F));
		PartDefinition Fragments = partdefinition.addOrReplaceChild("Fragments", CubeListBuilder.create().texOffs(0, 86).addBox(0.0F, -7.0F, -7.0F, 0.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition cube_r1 = Fragments.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 86).addBox(0.0F, -7.0F, -7.0F, 0.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition cube_r2 = Fragments.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 86).addBox(0.0F, -7.0F, -7.0F, 0.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 1.5708F, 0.0F));
		PartDefinition cube_r3 = Fragments.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(0, 86).addBox(0.0F, -7.0F, -7.0F, 0.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 2.3562F, 0.0F));
		PartDefinition cube_r4 = Fragments.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(0, 86).addBox(0.0F, -7.0F, -7.0F, 0.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 3.1416F, 0.0F));
		PartDefinition cube_r5 = Fragments.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(0, 86).addBox(0.0F, -7.0F, -7.0F, 0.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -2.3562F, 0.0F));
		PartDefinition cube_r6 = Fragments.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 86).addBox(0.0F, -7.0F, -7.0F, 0.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.5708F, 0.0F));
		PartDefinition cube_r7 = Fragments.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(0, 86).addBox(0.0F, -7.0F, -7.0F, 0.0F, 14.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.7854F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Base.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Fragments.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}