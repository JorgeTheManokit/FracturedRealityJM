// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelLaunchPad<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "launchpad"), "main");
	private final ModelPart Base;
	private final ModelPart Head;

	public ModelLaunchPad(ModelPart root) {
		this.Base = root.getChild("Base");
		this.Head = root.getChild("Head");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Base = partdefinition.addOrReplaceChild("Base",
				CubeListBuilder.create().texOffs(44, 20)
						.addBox(5.0F, -12.0F, -8.0F, 6.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(0, 48)
						.addBox(1.0F, -12.0F, -8.0F, 4.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(20, 48)
						.addBox(1.0F, -12.0F, 2.0F, 4.0F, 12.0F, 6.0F, new CubeDeformation(0.0F)).texOffs(0, 20)
						.addBox(-5.0F, -12.0F, -8.0F, 6.0F, 12.0F, 16.0F, new CubeDeformation(0.0F)),
				PartPose.offset(-3.0F, 24.0F, 0.0F));

		PartDefinition Head = partdefinition.addOrReplaceChild("Head",
				CubeListBuilder.create().texOffs(0, 0)
						.addBox(-8.0F, -16.0F, -8.0F, 16.0F, 4.0F, 16.0F, new CubeDeformation(0.0F)).texOffs(40, 48)
						.addBox(-2.0F, -12.0F, -2.0F, 4.0F, 12.0F, 4.0F, new CubeDeformation(0.0F)),
				PartPose.offset(0.0F, 24.0F, 0.0F));

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
		Head.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}
}