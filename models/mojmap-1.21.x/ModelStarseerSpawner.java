// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelStarseerSpawner<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "starseerspawner"), "main");
	private final ModelPart Floor;

	public ModelStarseerSpawner(ModelPart root) {
		this.Floor = root.getChild("Floor");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Floor = partdefinition.addOrReplaceChild("Floor", CubeListBuilder.create().texOffs(0, 0)
				.addBox(-24.0F, 0.0F, -24.0F, 48.0F, 0.0F, 48.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 23.9375F, 0.0F));

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
	}
}