// Made with Blockbench 5.1.3
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelStarArm<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "stararm"), "main");
	private final ModelPart Floor;
	private final ModelPart Arm;
	private final ModelPart Hand;
	private final ModelPart Finger;
	private final ModelPart Finger2;
	private final ModelPart Finger3;
	private final ModelPart Finger4;
	private final ModelPart Finger5;
	private final ModelPart Finger6;
	private final ModelPart Finger7;
	private final ModelPart Finger8;
	private final ModelPart Finger9;
	private final ModelPart Thumb;
	private final ModelPart Thumb2;
	private final ModelPart Thumb3;

	public ModelStarArm(ModelPart root) {
		this.Floor = root.getChild("Floor");
		this.Arm = root.getChild("Arm");
		this.Hand = this.Arm.getChild("Hand");
		this.Finger = this.Hand.getChild("Finger");
		this.Finger2 = this.Finger.getChild("Finger2");
		this.Finger3 = this.Finger2.getChild("Finger3");
		this.Finger4 = this.Hand.getChild("Finger4");
		this.Finger5 = this.Finger4.getChild("Finger5");
		this.Finger6 = this.Finger5.getChild("Finger6");
		this.Finger7 = this.Hand.getChild("Finger7");
		this.Finger8 = this.Finger7.getChild("Finger8");
		this.Finger9 = this.Finger8.getChild("Finger9");
		this.Thumb = this.Hand.getChild("Thumb");
		this.Thumb2 = this.Thumb.getChild("Thumb2");
		this.Thumb3 = this.Thumb2.getChild("Thumb3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Floor = partdefinition.addOrReplaceChild("Floor", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-24.0F, 0.0F, -24.0F, 48.0F, 0.0F, 48.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.9375F, 0.0F));

		PartDefinition Arm = partdefinition.addOrReplaceChild("Arm",
				CubeListBuilder.create().texOffs(96, 48)
						.addBox(-9.0F, -48.0F, -9.0F, 18.0F, 16.0F, 18.0F, new CubeDeformation(0.0F)).texOffs(80, 96)
						.addBox(-8.0F, -64.0F, -8.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 96)
						.addBox(-10.0F, -32.0F, -10.0F, 20.0F, 32.0F, 20.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 179.0F, 0.0F));

		PartDefinition Hand = Arm.addOrReplaceChild("Hand", CubeListBuilder.create().texOffs(0, 48).addBox(-18.0F,
				-36.0F, -6.0F, 36.0F, 36.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, -64.0F, 0.0F));

		PartDefinition Finger = Hand.addOrReplaceChild("Finger", CubeListBuilder.create().texOffs(144, 152)
				.addBox(-6.0F, -17.0F, -12.0F, 12.0F, 17.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-12.0F, -36.0F, 6.0F));

		PartDefinition Finger2 = Finger.addOrReplaceChild("Finger2", CubeListBuilder.create().texOffs(168, 48)
				.addBox(-6.0F, -17.0F, -12.0F, 12.0F, 17.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -17.0F, 0.0F));

		PartDefinition Finger3 = Finger2.addOrReplaceChild("Finger3", CubeListBuilder.create().texOffs(0, 178)
				.addBox(-6.0F, -17.0F, -12.0F, 12.0F, 17.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -17.0F, 0.0F));

		PartDefinition Finger4 = Hand.addOrReplaceChild("Finger4", CubeListBuilder.create().texOffs(0, 148)
				.addBox(-6.0F, -18.0F, -12.0F, 12.0F, 18.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -36.0F, 6.0F));

		PartDefinition Finger5 = Finger4.addOrReplaceChild("Finger5", CubeListBuilder.create().texOffs(48, 152)
				.addBox(-6.0F, -18.0F, -12.0F, 12.0F, 18.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -18.0F, 0.0F));

		PartDefinition Finger6 = Finger5.addOrReplaceChild("Finger6", CubeListBuilder.create().texOffs(96, 152)
				.addBox(-6.0F, -18.0F, -12.0F, 12.0F, 18.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -18.0F, 0.0F));

		PartDefinition Finger7 = Hand.addOrReplaceChild("Finger7", CubeListBuilder.create().texOffs(144, 181)
				.addBox(-6.0F, -16.0F, -12.0F, 12.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(12.0F, -36.0F, 6.0F));

		PartDefinition Finger8 = Finger7.addOrReplaceChild("Finger8", CubeListBuilder.create().texOffs(48, 182)
				.addBox(-6.0F, -16.0F, -12.0F, 12.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -16.0F, 0.0F));

		PartDefinition Finger9 = Finger8.addOrReplaceChild("Finger9", CubeListBuilder.create().texOffs(96, 182)
				.addBox(-6.0F, -16.0F, -12.0F, 12.0F, 16.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, -16.0F, 0.0F));

		PartDefinition Thumb = Hand.addOrReplaceChild("Thumb", CubeListBuilder.create().texOffs(80, 128).addBox(-17.0F,
				-12.0F, -6.0F, 17.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)), PartPose.offset(-18.0F, 0.0F, 0.0F));

		PartDefinition Thumb2 = Thumb.addOrReplaceChild("Thumb2", CubeListBuilder.create().texOffs(138, 128)
				.addBox(-17.0F, -12.0F, -6.0F, 17.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-17.0F, 0.0F, 0.0F));

		PartDefinition Thumb3 = Thumb2.addOrReplaceChild("Thumb3", CubeListBuilder.create().texOffs(144, 82)
				.addBox(-17.0F, -12.0F, -6.0F, 17.0F, 12.0F, 12.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-17.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 256, 256);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Floor.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Arm.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}