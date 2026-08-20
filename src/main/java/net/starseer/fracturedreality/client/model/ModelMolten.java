package net.starseer.fracturedreality.client.model;

import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
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
public class ModelMolten<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("fractured_reality", "model_molten"), "main");
	public final ModelPart Hips;
	public final ModelPart Waist;
	public final ModelPart Chest;
	public final ModelPart RArmU;
	public final ModelPart RArmL;
	public final ModelPart LArmU;
	public final ModelPart LArmL;
	public final ModelPart LArmU2;
	public final ModelPart LArmL2;
	public final ModelPart Neck;
	public final ModelPart Head;
	public final ModelPart Eyes;
	public final ModelPart MidEye;
	public final ModelPart RightEye;
	public final ModelPart LLegT;
	public final ModelPart LLegM;
	public final ModelPart LLegB;
	public final ModelPart LLegT2;
	public final ModelPart LLegM2;
	public final ModelPart LLegB2;
	public final ModelPart RLegT;
	public final ModelPart RLegM;
	public final ModelPart RLegB;
	public final ModelPart RLegT2;
	public final ModelPart RLegM2;
	public final ModelPart RLegB2;

	public ModelMolten(ModelPart root) {
		this.Hips = root.getChild("Hips");
		this.Waist = this.Hips.getChild("Waist");
		this.Chest = this.Waist.getChild("Chest");
		this.RArmU = this.Chest.getChild("RArmU");
		this.RArmL = this.RArmU.getChild("RArmL");
		this.LArmU = this.Chest.getChild("LArmU");
		this.LArmL = this.LArmU.getChild("LArmL");
		this.LArmU2 = this.Chest.getChild("LArmU2");
		this.LArmL2 = this.LArmU2.getChild("LArmL2");
		this.Neck = this.Chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Eyes = this.Head.getChild("Eyes");
		this.MidEye = this.Eyes.getChild("MidEye");
		this.RightEye = this.Eyes.getChild("RightEye");
		this.LLegT = this.Hips.getChild("LLegT");
		this.LLegM = this.LLegT.getChild("LLegM");
		this.LLegB = this.LLegM.getChild("LLegB");
		this.LLegT2 = this.Hips.getChild("LLegT2");
		this.LLegM2 = this.LLegT2.getChild("LLegM2");
		this.LLegB2 = this.LLegM2.getChild("LLegB2");
		this.RLegT = this.Hips.getChild("RLegT");
		this.RLegM = this.RLegT.getChild("RLegM");
		this.RLegB = this.RLegM.getChild("RLegB");
		this.RLegT2 = this.Hips.getChild("RLegT2");
		this.RLegM2 = this.RLegT2.getChild("RLegM2");
		this.RLegB2 = this.RLegM2.getChild("RLegB2");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Hips = partdefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 0).addBox(-4.0F, -3.0F, -6.5F, 8.0F, 3.0F, 13.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition Waist = Hips.addOrReplaceChild("Waist", CubeListBuilder.create().texOffs(26, 52).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -3.0F, -5.0F));
		PartDefinition Chest = Waist.addOrReplaceChild("Chest",
				CubeListBuilder.create().texOffs(0, 16).addBox(-5.5F, -7.0F, -2.5F, 11.0F, 3.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 42).addBox(-2.5F, -4.0F, -2.5F, 5.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition cube_r1 = Chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(44, 9).addBox(-3.0F, -5.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(2.5F, 0.0F, -0.5F, 0.0F, 0.0F, 0.6435F));
		PartDefinition cube_r2 = Chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(42, 0).addBox(0.0F, -5.0F, -2.0F, 3.0F, 5.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(-2.5F, 0.0F, -0.5F, 0.0F, 0.0F, -0.6435F));
		PartDefinition RArmU = Chest.addOrReplaceChild("RArmU", CubeListBuilder.create().texOffs(0, 23).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.0F, -5.5F, -0.5F));
		PartDefinition RArmL = RArmU.addOrReplaceChild("RArmL", CubeListBuilder.create().texOffs(36, 34).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.5F, 0.0F));
		PartDefinition LArmU = Chest.addOrReplaceChild("LArmU", CubeListBuilder.create().texOffs(12, 23).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(7.0F, -5.5F, -0.5F));
		PartDefinition LArmL = LArmU.addOrReplaceChild("LArmL", CubeListBuilder.create().texOffs(36, 16).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.5F, 0.0F));
		PartDefinition LArmU2 = Chest.addOrReplaceChild("LArmU2", CubeListBuilder.create().texOffs(24, 23).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 16.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(4.0F, -1.5F, -0.5F));
		PartDefinition LArmL2 = LArmU2.addOrReplaceChild("LArmL2", CubeListBuilder.create().texOffs(18, 42).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 16.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 14.5F, 0.0F));
		PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(12, 60).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));
		PartDefinition cube_r3 = Head.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(30, 16).addBox(-5.0F, -0.5F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(28, 60).addBox(-4.0F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(20, 60)
						.addBox(-3.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(58, 10).addBox(-2.0F, -0.5F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(58, 15)
						.addBox(1.0F, -0.5F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(60, 52).addBox(0.0F, -0.5F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(60, 48)
						.addBox(2.0F, -0.5F, 4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(44, 51).addBox(-1.0F, -0.5F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Eyes = Head.addOrReplaceChild("Eyes", CubeListBuilder.create(), PartPose.offset(0.0F, -0.525F, -1.6213F));
		PartDefinition MidEye = Eyes.addOrReplaceChild("MidEye", CubeListBuilder.create(), PartPose.offset(0.0F, 0.0F, 0.375F));
		PartDefinition cube_r4 = MidEye.addOrReplaceChild("cube_r4", CubeListBuilder.create().texOffs(30, 19).addBox(1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 2.1213F, 0.0F, 0.7854F, 0.0F));
		PartDefinition RightEye = Eyes.addOrReplaceChild("RightEye", CubeListBuilder.create(), PartPose.offset(-1.125F, 0.0F, 2.25F));
		PartDefinition cube_r5 = RightEye.addOrReplaceChild("cube_r5", CubeListBuilder.create().texOffs(30, 21).addBox(1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 2.1213F, 0.0F, 0.7854F, 0.0F));
		PartDefinition LLegT = Hips.addOrReplaceChild("LLegT", CubeListBuilder.create().texOffs(44, 18).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.0F, -5.0F));
		PartDefinition LLegM = LLegT.addOrReplaceChild("LLegM", CubeListBuilder.create().texOffs(26, 42).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, -1.5F));
		PartDefinition LLegB = LLegM.addOrReplaceChild("LLegB", CubeListBuilder.create().texOffs(56, 18).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 2.0F));
		PartDefinition LLegT2 = Hips.addOrReplaceChild("LLegT2", CubeListBuilder.create().texOffs(44, 40).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(2.5F, 0.0F, 5.0F));
		PartDefinition LLegM2 = LLegT2.addOrReplaceChild("LLegM2", CubeListBuilder.create().texOffs(56, 38).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, -1.5F));
		PartDefinition LLegB2 = LLegM2.addOrReplaceChild("LLegB2", CubeListBuilder.create().texOffs(46, 56).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 2.0F));
		PartDefinition RLegT = Hips.addOrReplaceChild("RLegT", CubeListBuilder.create().texOffs(44, 29).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 0.0F, -5.0F));
		PartDefinition RLegM = RLegT.addOrReplaceChild("RLegM", CubeListBuilder.create().texOffs(56, 28).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, -1.5F));
		PartDefinition RLegB = RLegM.addOrReplaceChild("RLegB", CubeListBuilder.create().texOffs(38, 56).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 2.0F));
		PartDefinition RLegT2 = Hips.addOrReplaceChild("RLegT2", CubeListBuilder.create().texOffs(0, 50).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.5F, 0.0F, 5.0F));
		PartDefinition RLegM2 = RLegT2.addOrReplaceChild("RLegM2", CubeListBuilder.create().texOffs(54, 56).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, -1.5F));
		PartDefinition RLegB2 = RLegM2.addOrReplaceChild("RLegB2", CubeListBuilder.create().texOffs(58, 0).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 2.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Hips.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.RArmU.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LLegT2.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LArmU2.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RLegT.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
		this.LLegT.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.LArmU.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RLegT2.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
	}
}