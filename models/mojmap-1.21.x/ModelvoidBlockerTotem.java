// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelvoidBlockerTotem<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "voidblockertotem"), "main");
	private final ModelPart Base;
	private final ModelPart Ring1;
	private final ModelPart Ring2;
	private final ModelPart Ring3;

	public ModelvoidBlockerTotem(ModelPart root) {
		this.Base = root.getChild("Base");
		this.Ring1 = root.getChild("Ring1");
		this.Ring2 = root.getChild("Ring2");
		this.Ring3 = root.getChild("Ring3");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Base = partdefinition.addOrReplaceChild("Base",
				CubeListBuilder.create().texOffs(0, 32)
						.addBox(-16.0F, -4.0F, 0.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(64, 48)
						.addBox(-12.0F, -12.0F, 4.0F, 8.0F, 8.0F, 8.0F, new CubeDeformation(0.0F)).texOffs(0, 52)
						.addBox(-16.0F, -16.0F, 0.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
						.addBox(-16.0F, -32.0F, 0.0F, 16.0F, 16.0F, 16.0F, new CubeDeformation(0.1F)),
				PartPose.offset(8.0F, 24.0F, -8.0F));

		PartDefinition Ring1 = partdefinition.addOrReplaceChild("Ring1", CubeListBuilder.create().texOffs(64, 0).addBox(
				-8.0F, 0.0F, -8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 18.0F, 0.0F));

		PartDefinition Ring2 = partdefinition.addOrReplaceChild("Ring2", CubeListBuilder.create().texOffs(64, 16)
				.addBox(-8.0F, 0.0F, -8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 16.0F, 0.0F));

		PartDefinition Ring3 = partdefinition.addOrReplaceChild("Ring3", CubeListBuilder.create().texOffs(64, 32)
				.addBox(-8.0F, 0.0F, -8.0F, 16.0F, 0.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 14.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 128, 128);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Base.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring1.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring2.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
		Ring3.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}