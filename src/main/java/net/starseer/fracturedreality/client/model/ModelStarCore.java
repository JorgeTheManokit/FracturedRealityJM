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
public class ModelStarCore<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("fractured_reality", "model_star_core"), "main");
	public final ModelPart Head;
	public final ModelPart Star;
	public final ModelPart StarPoint;
	public final ModelPart StarPoint2;
	public final ModelPart StarPoint3;
	public final ModelPart StarPoint4;
	public final ModelPart StarPoint5;
	public final ModelPart StarPoint6;
	public final ModelPart StarPoint7;
	public final ModelPart StarPoint8;

	public ModelStarCore(ModelPart root) {
		this.Head = root.getChild("Head");
		this.Star = this.Head.getChild("Star");
		this.StarPoint = this.Star.getChild("StarPoint");
		this.StarPoint2 = this.Star.getChild("StarPoint2");
		this.StarPoint3 = this.Star.getChild("StarPoint3");
		this.StarPoint4 = this.Star.getChild("StarPoint4");
		this.StarPoint5 = this.Star.getChild("StarPoint5");
		this.StarPoint6 = this.Star.getChild("StarPoint6");
		this.StarPoint7 = this.Star.getChild("StarPoint7");
		this.StarPoint8 = this.Star.getChild("StarPoint8");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Head = partdefinition.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, 24.0F, 0.0F));
		PartDefinition Star = Head.addOrReplaceChild("Star", CubeListBuilder.create().texOffs(-10, 12).addBox(-5.0F, -0.25F, -5.0F, 10.0F, 0.0F, 10.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition StarPoint = Star.addOrReplaceChild("StarPoint", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -11.0F, -8.0F, 5.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition StarPoint2 = Star.addOrReplaceChild("StarPoint2", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -11.0F, -8.0F, 5.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition StarPoint3 = Star.addOrReplaceChild("StarPoint3", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -11.0F, -8.0F, 5.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition StarPoint4 = Star.addOrReplaceChild("StarPoint4", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -11.0F, -8.0F, 5.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition StarPoint5 = Star.addOrReplaceChild("StarPoint5", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -11.0F, -8.0F, 5.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition StarPoint6 = Star.addOrReplaceChild("StarPoint6", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -11.0F, -8.0F, 5.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition StarPoint7 = Star.addOrReplaceChild("StarPoint7", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -11.0F, -8.0F, 5.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition StarPoint8 = Star.addOrReplaceChild("StarPoint8", CubeListBuilder.create().texOffs(0, 0).addBox(-2.5F, -11.0F, -8.0F, 5.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 32, 32);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}