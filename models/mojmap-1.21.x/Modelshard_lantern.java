// Made with Blockbench 5.1.6
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class Modelshard_lantern<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "shard_lantern"), "main");
	private final ModelPart Frame;
	private final ModelPart Shard;

	public Modelshard_lantern(ModelPart root) {
		this.Frame = root.getChild("Frame");
		this.Shard = this.Frame.getChild("Shard");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Frame = partdefinition.addOrReplaceChild("Frame", CubeListBuilder.create().texOffs(0, 4)
				.addBox(-3.0F, -3.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
				.addBox(-3.0F, -3.0F, 13.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
				.addBox(-16.0F, -3.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
				.addBox(-16.0F, -3.0F, 13.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
				.addBox(-3.0F, -16.0F, 13.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
				.addBox(-3.0F, -16.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
				.addBox(-16.0F, -16.0F, 13.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(0, 4)
				.addBox(-16.0F, -16.0F, 0.0F, 3.0F, 3.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
				.addBox(-2.5F, -13.0F, 0.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
				.addBox(-2.5F, -13.0F, 13.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-13.0F, -2.5F, 13.5F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-13.0F, -2.5F, 0.5F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-13.0F, -15.5F, 0.5F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(0, 0)
				.addBox(-13.0F, -15.5F, 13.5F, 10.0F, 2.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(42, 0).mirror()
				.addBox(-15.5F, -13.0F, 0.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)).mirror(false).texOffs(2, 4)
				.addBox(-2.5F, -2.375F, 3.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(2, 4)
				.addBox(-15.5F, -2.375F, 3.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(2, 4)
				.addBox(-15.5F, -15.5F, 3.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(2, 4)
				.addBox(-2.5F, -15.5F, 3.0F, 2.0F, 2.0F, 10.0F, new CubeDeformation(0.0F)).texOffs(42, 0)
				.addBox(-15.5F, -13.0F, 13.5F, 2.0F, 10.0F, 2.0F, new CubeDeformation(0.0F)),
				PartPose.offset(8.0F, 24.0F, -8.0F));

		PartDefinition Shard = Frame.addOrReplaceChild("Shard", CubeListBuilder.create().texOffs(18, 0).addBox(-3.0F,
				-3.0F, -3.0F, 6.0F, 6.0F, 6.0F, new CubeDeformation(0.0F)), PartPose.offset(-8.0F, -8.0F, 8.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {

	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Frame.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}