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
public class Modeltruthseeker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("fractured_reality", "modeltruthseeker"), "main");
	public final ModelPart Hips;
	public final ModelPart RLegU;
	public final ModelPart RLegM;
	public final ModelPart RLegL;
	public final ModelPart RFoot;
	public final ModelPart LLegU;
	public final ModelPart LLegM;
	public final ModelPart LLegL;
	public final ModelPart LFoot;
	public final ModelPart Waist;
	public final ModelPart Chest;
	public final ModelPart Neck;
	public final ModelPart Head;
	public final ModelPart Eye;
	public final ModelPart URArmU;
	public final ModelPart URArmL;
	public final ModelPart ULArmU;
	public final ModelPart ULArmL;

	public Modeltruthseeker(ModelPart root) {
		this.Hips = root.getChild("Hips");
		this.RLegU = this.Hips.getChild("RLegU");
		this.RLegM = this.RLegU.getChild("RLegM");
		this.RLegL = this.RLegM.getChild("RLegL");
		this.RFoot = this.RLegL.getChild("RFoot");
		this.LLegU = this.Hips.getChild("LLegU");
		this.LLegM = this.LLegU.getChild("LLegM");
		this.LLegL = this.LLegM.getChild("LLegL");
		this.LFoot = this.LLegL.getChild("LFoot");
		this.Waist = this.Hips.getChild("Waist");
		this.Chest = this.Waist.getChild("Chest");
		this.Neck = this.Chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Eye = this.Head.getChild("Eye");
		this.URArmU = this.Chest.getChild("URArmU");
		this.URArmL = this.URArmU.getChild("URArmL");
		this.ULArmU = this.Chest.getChild("ULArmU");
		this.ULArmL = this.ULArmU.getChild("ULArmL");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Hips = partdefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(44, 36).addBox(37.0F, 8.0F, -3.0F, 14.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-44.0F, -47.0F, 0.0F));
		PartDefinition RLegU = Hips.addOrReplaceChild("RLegU", CubeListBuilder.create().texOffs(0, 48).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 20.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(40.0F, 11.0F, 0.0F));
		PartDefinition RLegM = RLegU.addOrReplaceChild("RLegM", CubeListBuilder.create().texOffs(40, 62).addBox(-2.0F, 0.0F, -0.125F, 4.0F, 20.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, -2.375F));
		PartDefinition RLegL = RLegM.addOrReplaceChild("RLegL", CubeListBuilder.create().texOffs(0, 73).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 3.875F));
		PartDefinition RFoot = RLegL.addOrReplaceChild("RFoot", CubeListBuilder.create().texOffs(76, 56).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition LLegU = Hips.addOrReplaceChild("LLegU", CubeListBuilder.create().texOffs(20, 48).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 20.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(48.0F, 11.0F, 0.0F));
		PartDefinition LLegM = LLegU.addOrReplaceChild("LLegM", CubeListBuilder.create().texOffs(56, 62).addBox(-2.0F, 0.0F, -0.125F, 4.0F, 20.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, -2.375F));
		PartDefinition LLegL = LLegM.addOrReplaceChild("LLegL", CubeListBuilder.create().texOffs(72, 74).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 3.875F));
		PartDefinition LFoot = LLegL.addOrReplaceChild("LFoot", CubeListBuilder.create().texOffs(82, 7).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition Waist = Hips.addOrReplaceChild("Waist", CubeListBuilder.create().texOffs(12, 73).addBox(-3.0F, -8.0F, -5.0F, 6.0F, 8.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(44.0F, 8.0F, 3.0F));
		PartDefinition Chest = Waist.addOrReplaceChild("Chest",
				CubeListBuilder.create().texOffs(44, 45).addBox(-5.0F, -11.0F, -6.0F, 10.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 36).addBox(-8.0F, -17.0F, -6.0F, 16.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -8.0F, 0.0F));
		PartDefinition cube_r1 = Chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(76, 45).addBox(0.0F, 0.0F, -3.0F, 3.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-8.0F, -11.0F, -3.0F, 0.0F, 0.0F, -0.6435F));
		PartDefinition cube_r2 = Chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(80, 20).addBox(-3.0F, 0.0F, -3.0F, 3.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(8.0F, -11.0F, -3.0F, 0.0F, 0.0F, 0.6435F));
		PartDefinition Neck = Chest.addOrReplaceChild("Neck",
				CubeListBuilder.create().texOffs(82, 0).addBox(-2.0F, -3.0F, -2.0F, 4.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(82, 13).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -17.0F, -3.0F));
		PartDefinition cube_r3 = Neck.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(84, 85).addBox(1.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 74).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.0F, -3.0F, 0.0F, 0.0F, 0.0F, -0.7854F));
		PartDefinition cube_r4 = Neck.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(12, 86).addBox(-3.0F, -7.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(84, 31).addBox(-1.0F, -7.0F, -1.0F, 2.0F, 9.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(2.0F, -3.0F, 0.0F, 0.0F, 0.0F, 0.7854F));
		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(72, 62).addBox(-6.0F, -6.0F, 0.0F, 12.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -13.625F, 0.0F));
		PartDefinition Eye = Head.addOrReplaceChild("Eye", CubeListBuilder.create().texOffs(40, 48).addBox(-1.0F, -1.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition URArmU = Chest.addOrReplaceChild("URArmU", CubeListBuilder.create().texOffs(0, 0).addBox(-33.5F, -2.5F, -2.5F, 36.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.5F, -14.0F, -3.0F));
		PartDefinition URArmL = URArmU.addOrReplaceChild("URArmL", CubeListBuilder.create().texOffs(0, 20).addBox(-34.0F, -2.0F, -2.0F, 36.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-33.5F, 0.0F, 0.0F));
		PartDefinition ULArmU = Chest.addOrReplaceChild("ULArmU", CubeListBuilder.create().texOffs(0, 10).addBox(-2.5F, -2.5F, -2.5F, 36.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(10.5F, -14.0F, -3.0F));
		PartDefinition ULArmL = ULArmU.addOrReplaceChild("ULArmL", CubeListBuilder.create().texOffs(0, 28).addBox(-2.0F, -2.0F, -2.0F, 36.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(33.5F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Hips.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}
}