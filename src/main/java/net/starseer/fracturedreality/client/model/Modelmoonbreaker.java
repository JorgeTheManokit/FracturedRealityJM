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
public class Modelmoonbreaker<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("fractured_reality", "modelmoonbreaker"), "main");
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
	public final ModelPart EYES;
	public final ModelPart DRArmU;
	public final ModelPart DRArmL;
	public final ModelPart DLArmU;
	public final ModelPart DLArmL;
	public final ModelPart URArmU;
	public final ModelPart URArmL;
	public final ModelPart ULArmU;
	public final ModelPart ULArmL;

	public Modelmoonbreaker(ModelPart root) {
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
		this.EYES = this.Head.getChild("EYES");
		this.DRArmU = this.Waist.getChild("DRArmU");
		this.DRArmL = this.DRArmU.getChild("DRArmL");
		this.DLArmU = this.Waist.getChild("DLArmU");
		this.DLArmL = this.DLArmU.getChild("DLArmL");
		this.URArmU = this.Waist.getChild("URArmU");
		this.URArmL = this.URArmU.getChild("URArmL");
		this.ULArmU = this.Waist.getChild("ULArmU");
		this.ULArmL = this.ULArmU.getChild("ULArmL");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Hips = partdefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(44, 72).addBox(37.0F, 8.0F, -3.0F, 14.0F, 3.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-44.0F, -47.0F, 0.0F));
		PartDefinition RLegU = Hips.addOrReplaceChild("RLegU", CubeListBuilder.create().texOffs(44, 81).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 20.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(40.0F, 11.0F, 0.0F));
		PartDefinition RLegM = RLegU.addOrReplaceChild("RLegM", CubeListBuilder.create().texOffs(82, 16).addBox(-2.0F, 0.0F, -0.125F, 4.0F, 20.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, -2.375F));
		PartDefinition RLegL = RLegM.addOrReplaceChild("RLegL", CubeListBuilder.create().texOffs(16, 84).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 3.875F));
		PartDefinition RFoot = RLegL.addOrReplaceChild("RFoot", CubeListBuilder.create().texOffs(98, 25).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition LLegU = Hips.addOrReplaceChild("LLegU", CubeListBuilder.create().texOffs(64, 81).addBox(-2.5F, 0.0F, -2.5F, 5.0F, 20.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(48.0F, 11.0F, 0.0F));
		PartDefinition LLegM = LLegU.addOrReplaceChild("LLegM", CubeListBuilder.create().texOffs(0, 84).addBox(-2.0F, 0.0F, -0.125F, 4.0F, 20.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, -2.375F));
		PartDefinition LLegL = LLegM.addOrReplaceChild("LLegL", CubeListBuilder.create().texOffs(28, 84).addBox(-1.5F, 0.0F, -3.0F, 3.0F, 20.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 3.875F));
		PartDefinition LFoot = LLegL.addOrReplaceChild("LFoot", CubeListBuilder.create().texOffs(98, 31).addBox(-2.0F, -2.0F, -4.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 20.0F, 0.0F));
		PartDefinition Waist = Hips.addOrReplaceChild("Waist", CubeListBuilder.create().texOffs(84, 79).addBox(-2.0F, 11.0F, -1.0F, 4.0F, 8.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(44.0F, -11.0F, 0.0F));
		PartDefinition Chest = Waist.addOrReplaceChild("Chest",
				CubeListBuilder.create().texOffs(80, 40).addBox(-5.0F, 0.0F, -3.0F, 10.0F, 11.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 72).addBox(-8.0F, -6.0F, -3.0F, 16.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));
		PartDefinition cube_r1 = Chest.addOrReplaceChild("cube_r1", CubeListBuilder.create().texOffs(80, 57).addBox(0.0F, 0.0F, -3.0F, 3.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(-8.0F, 0.0F, 0.0F, 0.0F, 0.0F, -0.6435F));
		PartDefinition cube_r2 = Chest.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(84, 68).addBox(-3.0F, 0.0F, -3.0F, 3.0F, 5.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(8.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.6435F));
		PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(84, 91).addBox(-2.0F, -6.0F, -2.0F, 4.0F, 6.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.0F, 0.0F));
		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create().texOffs(82, 0).addBox(-3.5F, -8.75F, -4.0F, 7.0F, 9.0F, 7.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -6.25F, 0.0F));
		PartDefinition EYES = Head.addOrReplaceChild("EYES", CubeListBuilder.create().texOffs(98, 16).addBox(-3.5F, -4.5F, 0.0F, 7.0F, 9.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.25F, -4.0125F));
		PartDefinition DRArmU = Waist.addOrReplaceChild("DRArmU", CubeListBuilder.create().texOffs(0, 0).addBox(-33.5F, -2.5F, -2.5F, 36.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-7.5F, 7.0F, 0.0F));
		PartDefinition DRArmL = DRArmU.addOrReplaceChild("DRArmL", CubeListBuilder.create().texOffs(0, 40).addBox(-34.0F, -2.0F, -2.0F, 36.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-33.5F, 0.0F, 0.0F));
		PartDefinition DLArmU = Waist.addOrReplaceChild("DLArmU", CubeListBuilder.create().texOffs(0, 30).addBox(-2.5F, -2.5F, -2.5F, 36.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(7.5F, 7.0F, 0.0F));
		PartDefinition DLArmL = DLArmU.addOrReplaceChild("DLArmL", CubeListBuilder.create().texOffs(0, 64).addBox(-2.0F, -2.0F, -2.0F, 36.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(33.5F, 0.0F, 0.0F));
		PartDefinition URArmU = Waist.addOrReplaceChild("URArmU", CubeListBuilder.create().texOffs(0, 10).addBox(-33.5F, -2.5F, -2.5F, 36.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(-10.5F, -3.0F, 0.0F));
		PartDefinition URArmL = URArmU.addOrReplaceChild("URArmL", CubeListBuilder.create().texOffs(0, 48).addBox(-34.0F, -2.0F, -2.0F, 36.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(-33.5F, 0.0F, 0.0F));
		PartDefinition ULArmU = Waist.addOrReplaceChild("ULArmU", CubeListBuilder.create().texOffs(0, 20).addBox(-2.5F, -2.5F, -2.5F, 36.0F, 5.0F, 5.0F, new CubeDeformation(0.0F)), PartPose.offset(10.5F, -3.0F, 0.0F));
		PartDefinition ULArmL = ULArmU.addOrReplaceChild("ULArmL", CubeListBuilder.create().texOffs(0, 56).addBox(-2.0F, -2.0F, -2.0F, 36.0F, 4.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(33.5F, 0.0F, 0.0F));
		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Hips.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.Head.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Head.xRot = headPitch / (180F / (float) Math.PI);
	}
}