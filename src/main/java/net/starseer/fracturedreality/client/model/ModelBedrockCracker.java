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

// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelBedrockCracker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("fractured_reality", "model_bedrock_cracker"), "main");
	public final ModelPart Base;
	public final ModelPart Head;

	public ModelBedrockCracker(ModelPart root) {
		this.Base = root.getChild("Base");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Base = partdefinition.addOrReplaceChild("Base",
				CubeListBuilder.create().texOffs(44, 20).addBox(5.0F, -12.0F, -8.0F, 6.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 48).addBox(1.0F, -12.0F, -8.0F, 4.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(20, 48)
						.addBox(1.0F, -12.0F, 2.0F, 4.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 20).addBox(-5.0F, -12.0F, -8.0F, 6.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(3.0F, 8.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(40, 48).addBox(-2.0F, -16.0F, -2.0F, 4.0F, 16.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 4.0F, 0.0F, 0.0F, 0.0F, -3.1416F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(0, 66).addBox(-4.0F, -7.0F, 0.0F, 8.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.0F, 0.0F, 0.0F, -0.7854F, -3.1416F));
		PartDefinition cube_r2 = Head.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(0, 66).addBox(-4.0F, -7.0F, 0.0F, 8.0F, 16.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -21.0F, 0.0F, 0.0F, 0.7854F, -3.1416F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Base.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}