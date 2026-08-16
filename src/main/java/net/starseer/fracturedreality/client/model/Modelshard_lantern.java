package net.starseer.fracturedreality.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.commands.execution.Frame;
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
public class Modelshard_lantern<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("fractured_reality", "modelshard_lantern"), "main");
	public final ModelPart Frame;
	public final ModelPart Shard;

	public Modelshard_lantern(ModelPart root) {
		this.Frame = root.getChild("Frame");
		this.Shard = this.Frame.getChild("Shard");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Frame = partdefinition.addOrReplaceChild("Frame",
				CubeListBuilder.create().texOffs(0, 4).addBox(-3.0F, -3.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-3.0F, -3.0F, 13.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-16.0F, -3.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-16.0F, -3.0F, 13.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-3.0F, -16.0F, 13.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-3.0F, -16.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
						.addBox(-16.0F, -16.0F, 13.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4).addBox(-16.0F, -16.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
						.addBox(-2.5F, -13.0F, 0.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 0).addBox(-2.5F, -13.0F, 13.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-13.0F, -2.5F, 13.5F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-13.0F, -2.5F, 0.5F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-13.0F, -15.5F, 0.5F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0).addBox(-13.0F, -15.5F, 13.5F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 0).mirror()
						.addBox(-15.5F, -13.0F, 0.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 4).addBox(-2.5F, -2.375F, 3.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(2, 4)
						.addBox(-15.5F, -2.375F, 3.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(2, 4).addBox(-15.5F, -15.5F, 3.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(2, 4)
						.addBox(-2.5F, -15.5F, 3.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(42, 0).addBox(-15.5F, -13.0F, 13.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 24.0F, -8.0F));
		PartDefinition Shard = Frame.addOrReplaceChild("Shard", CubeListBuilder.create().texOffs(18, 0).addBox(-3.0F, -3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, -8.0F, 8.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Frame.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}