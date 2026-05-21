// Made with Blockbench 5.1.4
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelEnforcer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "enforcer"), "main");
	private final ModelPart Hips;
	private final ModelPart Waist;
	private final ModelPart Chest;
	private final ModelPart RArmU;
	private final ModelPart RArmL;
	private final ModelPart LArmU;
	private final ModelPart LArmL;
	private final ModelPart Neck;
	private final ModelPart Head;
	private final ModelPart Eyes;
	private final ModelPart MidEye;
	private final ModelPart RightEye;
	private final ModelPart LeftEye;
	private final ModelPart LLegT;
	private final ModelPart LLegM;
	private final ModelPart LLegB;
	private final ModelPart RLegT;
	private final ModelPart RLegM;
	private final ModelPart RLegB;

	public ModelEnforcer(ModelPart root) {
		this.Hips = root.getChild("Hips");
		this.Waist = this.Hips.getChild("Waist");
		this.Chest = this.Waist.getChild("Chest");
		this.RArmU = this.Chest.getChild("RArmU");
		this.RArmL = this.RArmU.getChild("RArmL");
		this.LArmU = this.Chest.getChild("LArmU");
		this.LArmL = this.LArmU.getChild("LArmL");
		this.Neck = this.Chest.getChild("Neck");
		this.Head = this.Neck.getChild("Head");
		this.Eyes = this.Head.getChild("Eyes");
		this.MidEye = this.Eyes.getChild("MidEye");
		this.RightEye = this.Eyes.getChild("RightEye");
		this.LeftEye = this.Eyes.getChild("LeftEye");
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

		PartDefinition Hips = partdefinition.addOrReplaceChild("Hips", CubeListBuilder.create().texOffs(0, 11)
				.addBox(-3.5F, -1.0F, -1.0F, 8.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-0.5F, -2.0F, -0.5F));

		PartDefinition Waist = Hips.addOrReplaceChild("Waist", CubeListBuilder.create().texOffs(8, 31).addBox(-1.5F,
				-5.0F, -1.5F, 3.0F, 5.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(0.5F, -1.0F, 0.5F));

		PartDefinition Chest = Waist.addOrReplaceChild("Chest", CubeListBuilder.create().texOffs(0, 0).addBox(-3.5F,
				-7.0F, -2.5F, 7.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -5.0F, 0.0F));

		PartDefinition RArmU = Chest.addOrReplaceChild("RArmU", CubeListBuilder.create().texOffs(12, 17).addBox(-1.5F,
				-1.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-5.0F, -5.5F, -0.5F));

		PartDefinition RArmL = RArmU.addOrReplaceChild("RArmL",
				CubeListBuilder.create().texOffs(0, 31)
						.addBox(-1.0F, -1.0F, -1.0F, 2.0F, 4.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(12, 52)
						.addBox(-1.0F, 5.0F, -1.0F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 43)
						.addBox(-1.5F, 3.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 55)
						.addBox(-1.5F, 10.0F, -1.5F, 3.0F, 2.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(-1, 43)
						.addBox(-0.5F, 15.025F, -0.5F, 1.0F, 0.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(10, 50)
						.addBox(-0.5F, 5.0F, -1.025F, 1.0F, 5.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(-1.5F, 5.0F, -0.5F, 3.0F, 5.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(9, 43)
						.addBox(-1.5F, 2.0F, -0.5F, 3.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 9.5F, 0.0F));

		PartDefinition LArmU = Chest.addOrReplaceChild("LArmU", CubeListBuilder.create().texOffs(0, 17).addBox(-1.5F,
				-1.5F, -1.5F, 3.0F, 11.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(5.0F, -5.5F, -0.5F));

		PartDefinition LArmL = LArmU.addOrReplaceChild("LArmL", CubeListBuilder.create().texOffs(24, 27).addBox(-1.0F,
				-1.0F, -1.0F, 2.0F, 11.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 9.5F, 0.0F));

		PartDefinition Neck = Chest.addOrReplaceChild("Neck", CubeListBuilder.create().texOffs(8, 39).addBox(-1.0F,
				-2.0F, -1.0F, 2.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -7.0F, 0.0F));

		PartDefinition Head = Neck.addOrReplaceChild("Head", CubeListBuilder.create(),
				PartPose.offset(0.0F, -2.0F, 0.0F));

		PartDefinition cube_r1 = Head.addOrReplaceChild("cube_r1",
				CubeListBuilder.create().texOffs(17, 40)
						.addBox(-5.0F, -0.5F, 1.0F, 1.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(16, 39)
						.addBox(-4.0F, -0.5F, -1.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 39)
						.addBox(-3.0F, -0.5F, -2.0F, 1.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(15, 38)
						.addBox(-2.0F, -0.5F, -3.0F, 1.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(40, 27)
						.addBox(-3.0F, -0.5F, 4.0F, 2.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 27)
						.addBox(-1.0F, -0.5F, 2.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 27)
						.addBox(-1.0F, -0.5F, 1.0F, 4.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(40, 27)
						.addBox(-2.0F, -0.5F, 3.0F, 3.0F, 1.0F, 1.0F, new CubeDeformation(0.0F)).texOffs(24, 22)
						.addBox(-1.0F, -0.5F, -3.0F, 4.0F, 1.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, -0.5F, 0.0F, 0.0F, 0.7854F, 0.0F));

		PartDefinition Eyes = Head.addOrReplaceChild("Eyes", CubeListBuilder.create(),
				PartPose.offset(0.0F, -0.525F, -1.6213F));

		PartDefinition MidEye = Eyes.addOrReplaceChild("MidEye", CubeListBuilder.create(),
				PartPose.offset(0.0F, 0.0F, 1.375F));

		PartDefinition cube_r2 = MidEye.addOrReplaceChild("cube_r2",
				CubeListBuilder.create().texOffs(20, 31).addBox(1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 2.1213F, 0.0F, 0.7854F, 0.0F));

		PartDefinition RightEye = Eyes.addOrReplaceChild("RightEye", CubeListBuilder.create(),
				PartPose.offset(-1.125F, 0.0F, 0.25F));

		PartDefinition cube_r3 = RightEye.addOrReplaceChild("cube_r3",
				CubeListBuilder.create().texOffs(20, 31).addBox(1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 2.1213F, 0.0F, 0.7854F, 0.0F));

		PartDefinition LeftEye = Eyes.addOrReplaceChild("LeftEye", CubeListBuilder.create(),
				PartPose.offset(1.125F, 0.0F, 0.25F));

		PartDefinition cube_r4 = LeftEye.addOrReplaceChild("cube_r4",
				CubeListBuilder.create().texOffs(20, 31).addBox(1.0F, -1.0F, -2.0F, 1.0F, 1.0F, 1.0F,
						new CubeDeformation(0.0F)),
				PartPose.offsetAndRotation(0.0F, 0.5F, 2.1213F, 0.0F, 0.7854F, 0.0F));

		PartDefinition LLegT = Hips.addOrReplaceChild("LLegT", CubeListBuilder.create().texOffs(24, 11).addBox(-1.5F,
				0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(3.0F, 2.0F, 0.5F));

		PartDefinition LLegM = LLegT.addOrReplaceChild("LLegM", CubeListBuilder.create().texOffs(36, 10).addBox(-1.0F,
				0.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, -1.5F));

		PartDefinition LLegB = LLegM.addOrReplaceChild("LLegB", CubeListBuilder.create().texOffs(32, 37).addBox(-1.0F,
				0.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 2.0F));

		PartDefinition RLegT = Hips.addOrReplaceChild("RLegT", CubeListBuilder.create().texOffs(22, 0).addBox(-1.5F,
				0.0F, -1.5F, 3.0F, 8.0F, 3.0F, new CubeDeformation(0.0F)), PartPose.offset(-2.0F, 2.0F, 0.5F));

		PartDefinition RLegM = RLegT.addOrReplaceChild("RLegM", CubeListBuilder.create().texOffs(34, 0).addBox(-1.0F,
				0.0F, 0.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, -1.5F));

		PartDefinition RLegB = RLegM.addOrReplaceChild("RLegB", CubeListBuilder.create().texOffs(32, 27).addBox(-1.0F,
				0.0F, -2.0F, 2.0F, 8.0F, 2.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 8.0F, 2.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Hips.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.LLegT.xRot = Mth.cos(limbSwing * 1.0F) * -1.0F * limbSwingAmount;
		this.RArmU.xRot = Mth.cos(limbSwing * 0.6662F + (float) Math.PI) * limbSwingAmount;
		this.LArmU.xRot = Mth.cos(limbSwing * 0.6662F) * limbSwingAmount;
		this.RLegT.xRot = Mth.cos(limbSwing * 1.0F) * 1.0F * limbSwingAmount;
	}
}