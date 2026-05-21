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
public class ModelFaceless<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("fractured_reality", "model_faceless"), "main");
	public final ModelPart Casing;
	public final ModelPart Head;

	public ModelFaceless(ModelPart root) {
		this.Casing = root.getChild("Casing");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Casing = partdefinition.addOrReplaceChild("Casing",
				CubeListBuilder.create().texOffs(32, 14).addBox(-1.0F, 10.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 47).addBox(-1.0F, 3.0F, 10.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 22)
						.addBox(-2.0F, 10.5F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 9).addBox(-2.0F, -2.0F, 10.5F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(44, 26)
						.addBox(-4.0F, 10.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 29).addBox(-11.0F, 3.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 14)
						.addBox(-10.5F, -2.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(36, 44).addBox(3.0F, 10.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 44)
						.addBox(10.0F, 3.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 47).addBox(-1.0F, 10.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(12, 48)
						.addBox(-1.0F, 3.0F, -11.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(44, 22).addBox(-2.0F, -2.0F, -10.5F, 4.0F, 4.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(12, 45)
						.addBox(10.0F, -4.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 48).addBox(-1.0F, -4.0F, -11.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(18, 45)
						.addBox(-11.0F, -4.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 44).addBox(-1.0F, -4.0F, 10.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 47)
						.addBox(3.0F, -11.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 46).addBox(-1.0F, -11.0F, -4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(6, 47)
						.addBox(-4.0F, -11.0F, -1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 28).addBox(-2.0F, -10.5F, -2.0F, 4.0F, 0.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(48, 48)
						.addBox(-1.0F, -11.0F, 3.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 45).addBox(-11.0F, -1.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 48)
						.addBox(-11.0F, -1.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(36, 49).addBox(10.0F, -1.0F, 3.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 49)
						.addBox(10.0F, -1.0F, -4.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(28, 42).addBox(10.5F, -2.0F, -2.0F, 0.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(44, 49)
						.addBox(-4.0F, -1.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(0, 50).addBox(3.0F, -1.0F, -11.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(4, 50)
						.addBox(-4.0F, -1.0F, 10.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(8, 50).addBox(3.0F, -1.0F, 10.0F, 1.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 0.0F));
		PartDefinition cube_r1 = Casing.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 6).addBox(-5.0F, -1.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, 11.0F, 0.0F, -0.6435F, 0.0F));
		PartDefinition cube_r2 = Casing.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(14, 34).addBox(-1.0F, -1.0F, -5.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, 0.0F, -4.0F, 0.0F, 0.6435F, 0.0F));
		PartDefinition cube_r3 = Casing.addOrReplaceChild("cube_r3", CubeListBuilder.create().texOffs(44, 3).addBox(0.0F, -1.0F, 0.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 0.0F, -11.0F, 0.0F, -0.6435F, 0.0F));
		PartDefinition cube_r4 = Casing.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(28, 32).addBox(-1.0F, -1.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, 0.0F, 4.0F, 0.0F, -0.6435F, 0.0F));
		PartDefinition cube_r5 = Casing.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(44, 0).addBox(0.0F, -1.0F, -1.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(4.0F, 0.0F, 11.0F, 0.0F, 0.6435F, 0.0F));
		PartDefinition cube_r6 = Casing.addOrReplaceChild("cube_r6", CubeListBuilder.create().texOffs(0, 44).addBox(-5.0F, -1.0F, 0.0F, 5.0F, 2.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 0.0F, -11.0F, 0.0F, 0.6435F, 0.0F));
		PartDefinition cube_r7 = Casing.addOrReplaceChild("cube_r7", CubeListBuilder.create().texOffs(32, 7).addBox(0.0F, -1.0F, -5.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, 0.0F, -4.0F, 0.0F, -0.6435F, 0.0F));
		PartDefinition cube_r8 = Casing.addOrReplaceChild("cube_r8", CubeListBuilder.create().texOffs(32, 0).addBox(0.0F, -1.0F, 0.0F, 1.0F, 2.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-11.0F, 0.0F, 4.0F, 0.0F, 0.6435F, 0.0F));
		PartDefinition cube_r9 = Casing.addOrReplaceChild("cube_r9", CubeListBuilder.create().texOffs(14, 42).addBox(0.0F, 0.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -8.0F, 0.0F, 0.0F, 0.0F, -0.6435F));
		PartDefinition cube_r10 = Casing.addOrReplaceChild("cube_r10", CubeListBuilder.create().texOffs(40, 41).addBox(0.0F, 0.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-11.0F, -4.0F, 0.0F, 0.0F, 0.0F, -0.9273F));
		PartDefinition cube_r11 = Casing.addOrReplaceChild("cube_r11", CubeListBuilder.create().texOffs(0, 41).addBox(-5.0F, 0.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -8.0F, 0.0F, 0.0F, 0.0F, 0.6435F));
		PartDefinition cube_r12 = Casing.addOrReplaceChild("cube_r12", CubeListBuilder.create().texOffs(40, 38).addBox(-5.0F, 0.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(11.0F, -4.0F, 0.0F, 0.0F, 0.0F, 0.9273F));
		PartDefinition cube_r13 = Casing.addOrReplaceChild("cube_r13", CubeListBuilder.create().texOffs(0, 32).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, -8.0F, 0.6435F, 0.0F, 0.0F));
		PartDefinition cube_r14 = Casing.addOrReplaceChild("cube_r14", CubeListBuilder.create().texOffs(30, 22).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, -11.0F, 0.9273F, 0.0F, 0.0F));
		PartDefinition cube_r15 = Casing.addOrReplaceChild("cube_r15", CubeListBuilder.create().texOffs(28, 16).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -4.0F, 11.0F, -0.9273F, 0.0F, 0.0F));
		PartDefinition cube_r16 = Casing.addOrReplaceChild("cube_r16", CubeListBuilder.create().texOffs(14, 28).addBox(-1.0F, 0.0F, -5.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -8.0F, 8.0F, -0.6435F, 0.0F, 0.0F));
		PartDefinition cube_r17 = Casing.addOrReplaceChild("cube_r17", CubeListBuilder.create().texOffs(0, 26).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, -8.0F, -0.9273F, 0.0F, 0.0F));
		PartDefinition cube_r18 = Casing.addOrReplaceChild("cube_r18", CubeListBuilder.create().texOffs(16, 22).addBox(-1.0F, -1.0F, -5.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, -4.0F, -0.6435F, 0.0F, 0.0F));
		PartDefinition cube_r19 = Casing.addOrReplaceChild("cube_r19", CubeListBuilder.create().texOffs(40, 35).addBox(0.0F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, 8.0F, 0.0F, 0.0F, 0.0F, -0.9273F));
		PartDefinition cube_r20 = Casing.addOrReplaceChild("cube_r20", CubeListBuilder.create().texOffs(40, 32).addBox(0.0F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(4.0F, 11.0F, 0.0F, 0.0F, 0.0F, -0.6435F));
		PartDefinition cube_r21 = Casing.addOrReplaceChild("cube_r21", CubeListBuilder.create().texOffs(26, 39).addBox(-5.0F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-4.0F, 11.0F, 0.0F, 0.0F, 0.0F, 0.6435F));
		PartDefinition cube_r22 = Casing.addOrReplaceChild("cube_r22", CubeListBuilder.create().texOffs(0, 38).addBox(-5.0F, -1.0F, -1.0F, 5.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, 8.0F, 0.0F, 0.0F, 0.0F, 0.9273F));
		PartDefinition cube_r23 = Casing.addOrReplaceChild("cube_r23", CubeListBuilder.create().texOffs(14, 16).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 8.0F, 8.0F, 0.9273F, 0.0F, 0.0F));
		PartDefinition cube_r24 = Casing.addOrReplaceChild("cube_r24", CubeListBuilder.create().texOffs(0, 16).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 1.0F, 5.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 11.0F, 4.0F, 0.6435F, 0.0F, 0.0F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(0, 0).addBox(-8.0F, -8.0F, 0.0F, 16.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 16.0F, 0.5F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Casing.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}