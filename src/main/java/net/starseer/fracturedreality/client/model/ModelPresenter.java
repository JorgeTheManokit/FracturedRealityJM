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

// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports
public class ModelPresenter<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(ResourceLocation.fromNamespaceAndPath("fractured_reality", "model_presenter"), "main");
	public final ModelPart Hips;
	public final ModelPart Waist;
	public final ModelPart Chest;
	public final ModelPart RArmU;
	public final ModelPart RArmL;
	public final ModelPart LArmU;
	public final ModelPart LArmL;
	public final ModelPart Neck;
	public final ModelPart Head;
	public final ModelPart Eye;
	public final ModelPart LLegT;
	public final ModelPart LLegM;
	public final ModelPart LLegB;
	public final ModelPart RLegT;
	public final ModelPart RLegM;
	public final ModelPart RLegB;

	public ModelPresenter(ModelPart root) {
		this.Hips = root.getChild("Hips");
		this.Waist = this.Hips.getChild("Waist");
		this.Chest = this.Waist.getChild("Chest");
		this.RArmU = this.Chest.getChild("RArmU");
		this.RArmL = this.RArmU.getChild("RArmL");
		this.LArmU = this.Chest.getChild("LArmU");
		this.LArmL = this.LArmU.getChild("LArmL");
		this.Neck = this.Chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Eye = this.Head.getChild("Eye");
		this.LLegT = this.Hips.getChild("LLegT");
		this.LLegM = this.LLegT.getChild("LLegM");
		this.LLegB = this.LLegM.getChild("LLegB");
		this.RLegT = this.Hips.getChild("RLegT");
		this.RLegM = this.RLegT.getChild("RLegM");
		this.RLegB = this.RLegM.getChild("RLegB");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();
		PartDefinition Hips = partdefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 11).addBox(-3.5F, -1.0F, -1.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-0.5F, -2.0F, -0.5F));
		PartDefinition Waist = Hips.addOrReplaceChild("Waist", CubeListBuilder.create().texOffs(8, 31).addBox(-1.5F, -5.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -1.0F, 0.5F));
		PartDefinition Chest = Waist.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F, -7.0F, -2.5F, 7.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 0.0F));
		PartDefinition RArmU = Chest.addOrReplaceChild("RArmU", CubeListBuilder.create().texOffs(12, 17).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -5.5F, -0.5F));
		PartDefinition RArmL = RArmU.addOrReplaceChild("RArmL", CubeListBuilder.create().texOffs(0, 31).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.5F, 0.0F));
		PartDefinition LArmU = Chest.addOrReplaceChild("LArmU", CubeListBuilder.create().texOffs(0, 17).addBox(-1.5F, -1.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -5.5F, -0.5F));
		PartDefinition LArmL = LArmU.addOrReplaceChild("LArmL", CubeListBuilder.create().texOffs(24, 27).addBox(-1.0F, -1.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.5F, 0.0F));
		PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(8, 39).addBox(-1.0F, -2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));
		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(), PartPose.offset(0.0F, -2.0F, 0.0F));
		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(40, 20).addBox(2.0F, -1.0F, 4.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 40).addBox(1.0F, -1.0F, 2.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 29)
						.addBox(-7.0F, -1.0F, -3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 24).addBox(-4.0F, -1.0F, -3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 39)
						.addBox(-2.0F, -1.0F, -3.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(40, 27).addBox(0.0F, -1.0F, 1.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 22)
						.addBox(-1.0F, -1.0F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));
		PartDefinition Eye = Head.addOrReplaceChild("Eye", CubeListBuilder.create(), PartPose.offset(0.0F, -0.525F, -1.6213F));
		PartDefinition cube_r2 = Eye.addOrReplaceChild("cube_r2", CubeListBuilder.create().texOffs(20, 31).addBox(1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offsetAndRotation(0.0F, 0.5F, 2.1213F, 0.0F, 0.7854F, 0.0F));
		PartDefinition LLegT = Hips.addOrReplaceChild("LLegT", CubeListBuilder.create().texOffs(24, 11).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 2.0F, 0.5F));
		PartDefinition LLegM = LLegT.addOrReplaceChild("LLegM", CubeListBuilder.create().texOffs(36, 10).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, -1.5F));
		PartDefinition LLegB = LLegM.addOrReplaceChild("LLegB", CubeListBuilder.create().texOffs(32, 37).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 2.0F));
		PartDefinition RLegT = Hips.addOrReplaceChild("RLegT", CubeListBuilder.create().texOffs(22, 0).addBox(-1.5F, 0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 2.0F, 0.5F));
		PartDefinition RLegM = RLegT.addOrReplaceChild("RLegM", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F, 0.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, -1.5F));
		PartDefinition RLegB = RLegM.addOrReplaceChild("RLegB", CubeListBuilder.create().texOffs(32, 27).addBox(-1.0F, 0.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 2.0F));
		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay, int rgb) {
		Hips.render(poseStack, vertexConsumer, packedLight, packedOverlay, rgb);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
		this.LLegT.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RArmU.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LArmU.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RLegT.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}