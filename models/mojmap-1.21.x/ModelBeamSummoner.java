// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelBeamSummoner<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "beamsummoner"), "main");
	private final ModelPart Ring;
	private final ModelPart DontTouchThisItsHereToRotateTheLimbsBy45Degrees;
	private final ModelPart Leg;
	private final ModelPart Leg2;
	private final ModelPart Leg3;
	private final ModelPart Leg13;
	private final ModelPart Leg14;
	private final ModelPart Leg15;
	private final ModelPart Leg10;
	private final ModelPart Leg11;
	private final ModelPart Leg12;
	private final ModelPart Leg22;
	private final ModelPart Leg23;
	private final ModelPart Leg24;
	private final ModelPart Leg7;
	private final ModelPart Leg8;
	private final ModelPart Leg9;
	private final ModelPart Leg19;
	private final ModelPart Leg20;
	private final ModelPart Leg21;
	private final ModelPart Leg4;
	private final ModelPart Leg5;
	private final ModelPart Leg6;
	private final ModelPart Leg16;
	private final ModelPart Leg17;
	private final ModelPart Leg18;
	private final ModelPart EyeThingIDFK;

	public ModelBeamSummoner(ModelPart root) {
		this.Ring = root.getChild("Ring");
		this.DontTouchThisItsHereToRotateTheLimbsBy45Degrees = this.Ring
				.getChild("DontTouchThisItsHereToRotateTheLimbsBy45Degrees");
		this.Leg = this.DontTouchThisItsHereToRotateTheLimbsBy45Degrees.getChild("Leg");
		this.Leg2 = this.Leg.getChild("Leg2");
		this.Leg3 = this.Leg2.getChild("Leg3");
		this.Leg13 = this.DontTouchThisItsHereToRotateTheLimbsBy45Degrees.getChild("Leg13");
		this.Leg14 = this.Leg13.getChild("Leg14");
		this.Leg15 = this.Leg14.getChild("Leg15");
		this.Leg10 = this.DontTouchThisItsHereToRotateTheLimbsBy45Degrees.getChild("Leg10");
		this.Leg11 = this.Leg10.getChild("Leg11");
		this.Leg12 = this.Leg11.getChild("Leg12");
		this.Leg22 = this.DontTouchThisItsHereToRotateTheLimbsBy45Degrees.getChild("Leg22");
		this.Leg23 = this.Leg22.getChild("Leg23");
		this.Leg24 = this.Leg23.getChild("Leg24");
		this.Leg7 = this.DontTouchThisItsHereToRotateTheLimbsBy45Degrees.getChild("Leg7");
		this.Leg8 = this.Leg7.getChild("Leg8");
		this.Leg9 = this.Leg8.getChild("Leg9");
		this.Leg19 = this.DontTouchThisItsHereToRotateTheLimbsBy45Degrees.getChild("Leg19");
		this.Leg20 = this.Leg19.getChild("Leg20");
		this.Leg21 = this.Leg20.getChild("Leg21");
		this.Leg4 = this.DontTouchThisItsHereToRotateTheLimbsBy45Degrees.getChild("Leg4");
		this.Leg5 = this.Leg4.getChild("Leg5");
		this.Leg6 = this.Leg5.getChild("Leg6");
		this.Leg16 = this.DontTouchThisItsHereToRotateTheLimbsBy45Degrees.getChild("Leg16");
		this.Leg17 = this.Leg16.getChild("Leg17");
		this.Leg18 = this.Leg17.getChild("Leg18");
		this.EyeThingIDFK = this.Ring.getChild("EyeThingIDFK");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Ring = partdefinition.addOrReplaceChild("Ring",
				CubeListBuilder.create().texOffs(78, 62)
						.addBox(-7.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 66)
						.addBox(5.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(78, 70)
						.addBox(-1.0F, -1.0F, -7.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 79)
						.addBox(-1.0F, -1.0F, 5.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -6.0F, 0.0F));

		PartDefinition cube_r1 = Ring.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(70, 62)
						.addBox(-7.0F, -3.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(44, 67)
						.addBox(5.0F, -3.0F, -1.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(36, 67)
						.addBox(-1.0F, -3.0F, -7.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 57)
						.addBox(-1.0F, -3.0F, 5.0F, 2.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, -0.7854F, 0.0F));

		PartDefinition cube_r2 = Ring.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(24, 77)
						.addBox(-7.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 77)
						.addBox(5.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 75)
						.addBox(-1.0F, -2.0F, -7.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(66, 75)
						.addBox(-1.0F, -2.0F, 5.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, -1.309F, 0.0F));

		PartDefinition cube_r3 = Ring.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(42, 74)
						.addBox(-7.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(34, 74)
						.addBox(5.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 20)
						.addBox(-1.0F, -2.0F, -7.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(74, 14)
						.addBox(-1.0F, -2.0F, 5.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -1.0472F, 0.0F));

		PartDefinition cube_r4 = Ring.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(74, 8)
						.addBox(-7.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(26, 71)
						.addBox(5.0F, -2.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(18, 71)
						.addBox(-1.0F, -2.0F, -7.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(70, 69)
						.addBox(-1.0F, -2.0F, 5.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, -0.5236F, 0.0F));

		PartDefinition cube_r5 = Ring.addOrReplaceChild("cube_r5",
				CubeListBuilder.create().texOffs(8, 75)
						.addBox(-7.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 75)
						.addBox(5.0F, -2.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(58, 74)
						.addBox(-1.0F, -2.0F, -7.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(50, 74)
						.addBox(-1.0F, -2.0F, 5.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 0.0F, 0.0F, -0.2618F, 0.0F));

		PartDefinition DontTouchThisItsHereToRotateTheLimbsBy45Degrees = Ring.addOrReplaceChild(
				"DontTouchThisItsHereToRotateTheLimbsBy45Degrees", CubeListBuilder.create(),
				PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Leg = DontTouchThisItsHereToRotateTheLimbsBy45Degrees.addOrReplaceChild("Leg", CubeListBuilder
				.create().texOffs(52, 54).addBox(-12.0F, -0.5F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, 1.5F, 0.0F));

		PartDefinition Leg2 = Leg.addOrReplaceChild("Leg2", CubeListBuilder.create().texOffs(56, 0).addBox(-12.0F,
				-0.5F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 0.0F, 0.0F));

		PartDefinition Leg3 = Leg2.addOrReplaceChild("Leg3", CubeListBuilder.create().texOffs(56, 2).addBox(-12.0F,
				-0.5F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 0.0F, 0.0F));

		PartDefinition Leg13 = DontTouchThisItsHereToRotateTheLimbsBy45Degrees.addOrReplaceChild("Leg13",
				CubeListBuilder.create().texOffs(18, 69).addBox(-8.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(-7.0F, -1.5F, 0.0F));

		PartDefinition Leg14 = Leg13.addOrReplaceChild("Leg14", CubeListBuilder.create().texOffs(56, 26).addBox(-8.0F,
				-0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 0.0F, 0.0F));

		PartDefinition Leg15 = Leg14.addOrReplaceChild("Leg15", CubeListBuilder.create().texOffs(18, 67).addBox(-8.0F,
				-0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, 0.0F, 0.0F));

		PartDefinition Leg10 = DontTouchThisItsHereToRotateTheLimbsBy45Degrees.addOrReplaceChild("Leg10",
				CubeListBuilder.create().texOffs(0, 55).addBox(0.0F, -0.5F, -0.5F, 12.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(7.0F, 1.5F, 0.0F));

		PartDefinition Leg11 = Leg10.addOrReplaceChild("Leg11", CubeListBuilder.create().texOffs(56, 4).addBox(0.0F,
				-0.5F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, 0.0F, 0.0F));

		PartDefinition Leg12 = Leg11.addOrReplaceChild("Leg12", CubeListBuilder.create().texOffs(56, 6).addBox(0.0F,
				-0.5F, -0.5F, 12.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(12.0F, 0.0F, 0.0F));

		PartDefinition Leg22 = DontTouchThisItsHereToRotateTheLimbsBy45Degrees.addOrReplaceChild("Leg22",
				CubeListBuilder.create().texOffs(70, 56).addBox(0.0F, -0.5F, -0.5F, 8.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(7.0F, -1.5F, 0.0F));

		PartDefinition Leg23 = Leg22.addOrReplaceChild("Leg23", CubeListBuilder.create().texOffs(70, 58).addBox(0.0F,
				-0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, 0.0F));

		PartDefinition Leg24 = Leg23.addOrReplaceChild("Leg24", CubeListBuilder.create().texOffs(70, 60).addBox(0.0F,
				-0.5F, -0.5F, 8.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(8.0F, 0.0F, 0.0F));

		PartDefinition Leg7 = DontTouchThisItsHereToRotateTheLimbsBy45Degrees.addOrReplaceChild("Leg7", CubeListBuilder
				.create().texOffs(28, 28).addBox(-0.5F, -0.5F, -12.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.5F, -7.0F));

		PartDefinition Leg8 = Leg7.addOrReplaceChild("Leg8", CubeListBuilder.create().texOffs(54, 28).addBox(-0.5F,
				-0.5F, -12.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -12.0F));

		PartDefinition Leg9 = Leg8.addOrReplaceChild("Leg9", CubeListBuilder.create().texOffs(54, 41).addBox(-0.5F,
				-0.5F, -12.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -12.0F));

		PartDefinition Leg19 = DontTouchThisItsHereToRotateTheLimbsBy45Degrees.addOrReplaceChild("Leg19",
				CubeListBuilder.create().texOffs(0, 57).addBox(-0.5F, -0.5F, -8.0F, 1.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.5F, -7.0F));

		PartDefinition Leg20 = Leg19.addOrReplaceChild("Leg20", CubeListBuilder.create().texOffs(52, 65).addBox(-0.5F,
				-0.5F, -8.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition Leg21 = Leg20.addOrReplaceChild("Leg21", CubeListBuilder.create().texOffs(0, 66).addBox(-0.5F,
				-0.5F, -8.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, -8.0F));

		PartDefinition Leg4 = DontTouchThisItsHereToRotateTheLimbsBy45Degrees.addOrReplaceChild("Leg4", CubeListBuilder
				.create().texOffs(28, 41).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 1.5F, 7.0F));

		PartDefinition Leg5 = Leg4.addOrReplaceChild("Leg5", CubeListBuilder.create().texOffs(0, 42).addBox(-0.5F,
				-0.5F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 12.0F));

		PartDefinition Leg6 = Leg5.addOrReplaceChild("Leg6", CubeListBuilder.create().texOffs(26, 54).addBox(-0.5F,
				-0.5F, 0.0F, 1.0F, 1.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 12.0F));

		PartDefinition Leg16 = DontTouchThisItsHereToRotateTheLimbsBy45Degrees.addOrReplaceChild("Leg16",
				CubeListBuilder.create().texOffs(56, 8).addBox(-0.5F, -0.5F, 0.0F, 1.0F, 1.0F, 8.0F,
						new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -1.5F, 7.0F));

		PartDefinition Leg17 = Leg16.addOrReplaceChild("Leg17", CubeListBuilder.create().texOffs(56, 17).addBox(-0.5F,
				-0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 8.0F));

		PartDefinition Leg18 = Leg17.addOrReplaceChild("Leg18", CubeListBuilder.create().texOffs(52, 56).addBox(-0.5F,
				-0.5F, 0.0F, 1.0F, 1.0F, 8.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 8.0F));

		PartDefinition EyeThingIDFK = Ring.addOrReplaceChild("EyeThingIDFK",
				CubeListBuilder.create().texOffs(28, 14)
						.addBox(-7.0F, -7.0F, 0.0F, 14.0F, 14.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-7.0F, 0.0F, -7.0F, 14.0F, 0.0F, 14.0F, new CubeDeformation(0.0F)).texOffs(0, 14)
						.addBox(0.0F, -7.0F, -7.0F, 0.0F, 14.0F, 14.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Ring.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}