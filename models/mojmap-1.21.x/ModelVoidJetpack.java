// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelVoidJetpack<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "voidjetpack"), "main");
	private final ModelPart Body;

	public ModelVoidJetpack(ModelPart root) {
		this.Body = root.getChild("Body");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Body = partdefinition.addOrReplaceChild("Body",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-4.0F, 0.0F, -2.0F, 8.0F, 12.0F, 4.0F, new CubeDeformation(0.1F)).texOffs(0, 16)
						.addBox(-2.0F, 2.0F, 2.0F, 4.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(0, 27)
						.addBox(-1.0F, 0.0F, 3.0F, 2.0F, 1.0F, 2.0F, new CubeDeformation(0.0F)).texOffs(24, 0)
						.addBox(-1.5F, 1.0F, 2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(24, 4)
						.addBox(-1.5F, 9.0F, 2.5F, 3.0F, 1.0F, 3.0F, new CubeDeformation(0.0F)).texOffs(16, 16)
						.addBox(-2.0F, 10.0F, 2.0F, 4.0F, 2.0F, 4.0F, new CubeDeformation(0.0F)).texOffs(24, 8)
						.addBox(-5.5F, 7.0F, 4.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(24, 22)
						.addBox(1.5F, 7.0F, 4.0F, 4.0F, 7.0F, 0.0F, new CubeDeformation(0.0F)).texOffs(16, 22)
						.addBox(0.0F, 7.0F, 5.5F, 0.0F, 7.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 64, 64);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Body.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
	}
}