// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelShattered<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "shattered"), "main");
	private final ModelPart Hips;
	private final ModelPart Spine;
	private final ModelPart Spine2;
	private final ModelPart Spine3;
	private final ModelPart Spine4;
	private final ModelPart Spine5;
	private final ModelPart Spine6;
	private final ModelPart ArmSpine;
	private final ModelPart RLArm;
	private final ModelPart RLArm2;
	private final ModelPart RLArm3;
	private final ModelPart RLArm4;
	private final ModelPart ArmSpine2;
	private final ModelPart HeadThingIDFK;
	private final ModelPart EyeThing;
	private final ModelPart Pupil;
	private final ModelPart RUArm;
	private final ModelPart RUArm2;
	private final ModelPart RUArm3;
	private final ModelPart RUArm4;
	private final ModelPart LUArm;
	private final ModelPart LUArm2;
	private final ModelPart LUArm3;
	private final ModelPart LUArm4;
	private final ModelPart RLeg;
	private final ModelPart RLeg2;
	private final ModelPart RLeg3;
	private final ModelPart RLeg4;
	private final ModelPart LLeg;
	private final ModelPart LLeg2;
	private final ModelPart LLeg3;
	private final ModelPart LLeg4;

	public ModelShattered(ModelPart root) {
		this.Hips = root.getChild("Hips");
		this.Spine = this.Hips.getChild("Spine");
		this.Spine2 = this.Spine.getChild("Spine2");
		this.Spine3 = this.Spine2.getChild("Spine3");
		this.Spine4 = this.Spine3.getChild("Spine4");
		this.Spine5 = this.Spine4.getChild("Spine5");
		this.Spine6 = this.Spine5.getChild("Spine6");
		this.ArmSpine = this.Spine6.getChild("ArmSpine");
		this.RLArm = this.ArmSpine.getChild("RLArm");
		this.RLArm2 = this.RLArm.getChild("RLArm2");
		this.RLArm3 = this.RLArm2.getChild("RLArm3");
		this.RLArm4 = this.RLArm3.getChild("RLArm4");
		this.ArmSpine2 = this.ArmSpine.getChild("ArmSpine2");
		this.HeadThingIDFK = this.ArmSpine2.getChild("HeadThingIDFK");
		this.EyeThing = this.HeadThingIDFK.getChild("EyeThing");
		this.Pupil = this.EyeThing.getChild("Pupil");
		this.RUArm = this.ArmSpine2.getChild("RUArm");
		this.RUArm2 = this.RUArm.getChild("RUArm2");
		this.RUArm3 = this.RUArm2.getChild("RUArm3");
		this.RUArm4 = this.RUArm3.getChild("RUArm4");
		this.LUArm = this.ArmSpine2.getChild("LUArm");
		this.LUArm2 = this.LUArm.getChild("LUArm2");
		this.LUArm3 = this.LUArm2.getChild("LUArm3");
		this.LUArm4 = this.LUArm3.getChild("LUArm4");
		this.RLeg = this.Hips.getChild("RLeg");
		this.RLeg2 = this.RLeg.getChild("RLeg2");
		this.RLeg3 = this.RLeg2.getChild("RLeg3");
		this.RLeg4 = this.RLeg3.getChild("RLeg4");
		this.LLeg = this.Hips.getChild("LLeg");
		this.LLeg2 = this.LLeg.getChild("LLeg2");
		this.LLeg3 = this.LLeg2.getChild("LLeg3");
		this.LLeg4 = this.LLeg3.getChild("LLeg4");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Hips = partdefinition.addOrReplaceChild("Hips",
				CubeListBuilder.create().texOffs(48, 17)
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 21)
						.addBox(3.5F, 1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 48)
						.addBox(-5.5F, 1.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -27.0F, 0.0F));

		PartDefinition cube_r1 = Hips
				.addOrReplaceChild("cube_r1",
						CubeListBuilder.create().texOffs(40, 10).addBox(0.0F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 2.618F));

		PartDefinition cube_r2 = Hips
				.addOrReplaceChild("cube_r2",
						CubeListBuilder.create().texOffs(40, 8).addBox(0.0F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, 0.0F, 0.0F, 0.0F, 0.0F, 0.5236F));

		PartDefinition Spine = Hips.addOrReplaceChild("Spine", CubeListBuilder.create().texOffs(24, 0).addBox(-1.0F,
				-4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -1.0F, 0.0F));

		PartDefinition cube_r3 = Spine
				.addOrReplaceChild("cube_r3",
						CubeListBuilder.create().texOffs(26, 18).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r4 = Spine
				.addOrReplaceChild("cube_r4",
						CubeListBuilder.create().texOffs(26, 16).addBox(0.0F, -0.5F, -0.5F, 2.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 2.8798F));

		PartDefinition Spine2 = Spine.addOrReplaceChild("Spine2", CubeListBuilder.create().texOffs(40, 12).addBox(-1.0F,
				-4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition cube_r5 = Spine2
				.addOrReplaceChild("cube_r5",
						CubeListBuilder.create().texOffs(48, 41).addBox(0.0F, -0.5F, -0.5F, 3.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 2.8798F));

		PartDefinition Spine3 = Spine2.addOrReplaceChild("Spine3", CubeListBuilder.create().texOffs(24, 6).addBox(-1.0F,
				-4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition cube_r6 = Spine3
				.addOrReplaceChild("cube_r6",
						CubeListBuilder.create().texOffs(48, 39).addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r7 = Spine3
				.addOrReplaceChild("cube_r7",
						CubeListBuilder.create().texOffs(48, 37).addBox(0.0F, -0.5F, -0.5F, 4.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 2.8798F));

		PartDefinition Spine4 = Spine3.addOrReplaceChild("Spine4", CubeListBuilder.create().texOffs(40, 24).addBox(
				-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition cube_r8 = Spine4
				.addOrReplaceChild("cube_r8",
						CubeListBuilder.create().texOffs(12, 48).addBox(0.0F, -0.5F, -0.5F, 5.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition Spine5 = Spine4.addOrReplaceChild("Spine5", CubeListBuilder.create().texOffs(40, 18).addBox(
				-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition cube_r9 = Spine5
				.addOrReplaceChild("cube_r9",
						CubeListBuilder.create().texOffs(40, 2).addBox(0.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition Spine6 = Spine5.addOrReplaceChild("Spine6", CubeListBuilder.create().texOffs(40, 36).addBox(
				-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition cube_r10 = Spine6
				.addOrReplaceChild("cube_r10",
						CubeListBuilder.create().texOffs(16, 20).addBox(0.0F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r11 = Spine6
				.addOrReplaceChild("cube_r11",
						CubeListBuilder.create().texOffs(0, 20).addBox(0.0F, -0.5F, -0.5F, 7.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 2.8798F));

		PartDefinition ArmSpine = Spine6.addOrReplaceChild("ArmSpine",
				CubeListBuilder.create().texOffs(40, 30)
						.addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(48, 29)
						.addBox(-13.0F, 0.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition cube_r12 = ArmSpine
				.addOrReplaceChild("cube_r12",
						CubeListBuilder.create().texOffs(0, 18).addBox(0.0F, -0.5F, -0.5F, 12.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 2.8798F));

		PartDefinition RLArm = ArmSpine.addOrReplaceChild("RLArm", CubeListBuilder.create().texOffs(16, 22).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-12.0F, 2.0F, 0.0F));

		PartDefinition RLArm2 = RLArm.addOrReplaceChild("RLArm2", CubeListBuilder.create().texOffs(16, 22).addBox(-0.5F,
				0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition RLArm3 = RLArm2.addOrReplaceChild("RLArm3", CubeListBuilder.create().texOffs(16, 22).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition RLArm4 = RLArm3.addOrReplaceChild("RLArm4", CubeListBuilder.create().texOffs(16, 22).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition ArmSpine2 = ArmSpine.addOrReplaceChild("ArmSpine2",
				CubeListBuilder.create().texOffs(48, 33)
						.addBox(14.0F, 0.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 42)
						.addBox(-1.0F, -4.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(40, 48)
						.addBox(-16.0F, 0.5F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition cube_r13 = ArmSpine2
				.addOrReplaceChild("cube_r13",
						CubeListBuilder.create().texOffs(0, 14).addBox(0.0F, -0.5F, -0.5F, 15.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 0.2618F));

		PartDefinition cube_r14 = ArmSpine2
				.addOrReplaceChild("cube_r14",
						CubeListBuilder.create().texOffs(0, 12).addBox(0.0F, -0.5F, -0.5F, 15.0F, 1.0F, 1.0F,
								new CubeDeformation(0.0F)),
						PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 2.8798F));

		PartDefinition HeadThingIDFK = ArmSpine2.addOrReplaceChild("HeadThingIDFK",
				CubeListBuilder.create().texOffs(0, 50)
						.addBox(-0.5F, -6.0F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(48, 12)
						.addBox(-1.0F, -3.0F, -1.0F, 2.0F, 3.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -4.0F, 0.0F));

		PartDefinition cube_r15 = HeadThingIDFK.addOrReplaceChild("cube_r15",
				CubeListBuilder.create().texOffs(48, 49)
						.addBox(5.0F, 0.5F, -0.5F, 1.0F, 3.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 4)
						.addBox(0.0F, -0.5F, -0.5F, 6.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -2.0F, 0.0F, 0.0F, 0.0F, 2.618F));

		PartDefinition EyeThing = HeadThingIDFK.addOrReplaceChild("EyeThing", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-6.0F, -6.0F, 0.0F, 12.0F, 12.0F, 0.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -13.0F, 0.0F));

		PartDefinition Pupil = EyeThing.addOrReplaceChild("Pupil", CubeListBuilder.create().texOffs(4, 50).addBox(-1.0F,
				-1.0F, 0.0F, 2.0F, 2.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		PartDefinition RUArm = ArmSpine2.addOrReplaceChild("RUArm", CubeListBuilder.create().texOffs(16, 35).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-15.0F, 2.5F, 0.0F));

		PartDefinition RUArm2 = RUArm.addOrReplaceChild("RUArm2", CubeListBuilder.create().texOffs(16, 35).addBox(-0.5F,
				0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition RUArm3 = RUArm2.addOrReplaceChild("RUArm3", CubeListBuilder.create().texOffs(16, 35).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition RUArm4 = RUArm3.addOrReplaceChild("RUArm4", CubeListBuilder.create().texOffs(16, 35).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition LUArm = ArmSpine2.addOrReplaceChild("LUArm", CubeListBuilder.create().texOffs(16, 35).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(15.0F, 2.5F, 0.0F));

		PartDefinition LUArm2 = LUArm.addOrReplaceChild("LUArm2", CubeListBuilder.create().texOffs(16, 35).addBox(-0.5F,
				0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition LUArm3 = LUArm2.addOrReplaceChild("LUArm3", CubeListBuilder.create().texOffs(16, 35).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition LUArm4 = LUArm3.addOrReplaceChild("LUArm4", CubeListBuilder.create().texOffs(16, 35).addBox(
				-0.5F, 0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition RLeg = Hips.addOrReplaceChild("RLeg", CubeListBuilder.create().texOffs(36, 39).addBox(-0.5F,
				0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(-4.5F, 3.0F, 0.0F));

		PartDefinition RLeg2 = RLeg.addOrReplaceChild("RLeg2", CubeListBuilder.create().texOffs(36, 39).addBox(-0.5F,
				0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition RLeg3 = RLeg2.addOrReplaceChild("RLeg3", CubeListBuilder.create().texOffs(36, 39).addBox(-0.5F,
				0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition RLeg4 = RLeg3.addOrReplaceChild("RLeg4", CubeListBuilder.create().texOffs(36, 39).addBox(-0.5F,
				0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition LLeg = Hips.addOrReplaceChild("LLeg", CubeListBuilder.create().texOffs(36, 39).addBox(-0.5F,
				0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(4.5F, 3.0F, 0.0F));

		PartDefinition LLeg2 = LLeg.addOrReplaceChild("LLeg2", CubeListBuilder.create().texOffs(36, 39).addBox(-0.5F,
				0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition LLeg3 = LLeg2.addOrReplaceChild("LLeg3", CubeListBuilder.create().texOffs(36, 39).addBox(-0.5F,
				0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		PartDefinition LLeg4 = LLeg3.addOrReplaceChild("LLeg4", CubeListBuilder.create().texOffs(36, 39).addBox(-0.5F,
				0.0F, -0.5F, 1.0F, 12.0F, 1.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 12.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Hips.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}