// Made with Blockbench 5.0.7
// Exported for Minecraft version 1.17 or later with Mojang mappings
// Paste this class into your mod and generate all required imports

public class ModelSummonedProjectileBeamer<T extends Entity> extends EntityModel<T> {
	// This layer location should be baked with EntityRendererProvider.Context in
	// the entity renderer and passed into this model's constructor
	public static final ModelLayerLocation LAYER_LOCATION = new ModelLayerLocation(
			new ResourceLocation("modid", "summonedprojectilebeamer"), "main");
	private final ModelPart Aimer;
	private final ModelPart Recoiler;

	public ModelSummonedProjectileBeamer(ModelPart root) {
		this.Aimer = root.getChild("Aimer");
		this.Recoiler = this.Aimer.getChild("Recoiler");
	}

	public static LayerDefinition createBodyLayer() {
		MeshDefinition meshdefinition = new MeshDefinition();
		PartDefinition partdefinition = meshdefinition.getRoot();

		PartDefinition Aimer = partdefinition.addOrReplaceChild("Aimer", CubeListBuilder.create(),
				PartPose.offset(0.0F, 24.0F, 0.0F));

		PartDefinition Recoiler = Aimer.addOrReplaceChild("Recoiler", CubeListBuilder.create().texOffs(0, 0).addBox(
				-4.0F, -4.0F, 0.0F, 8.0F, 8.0F, 0.0F, new CubeDeformation(0.0F)), PartPose.offset(0.0F, 0.0F, 0.0F));

		return LayerDefinition.create(meshdefinition, 16, 16);
	}

	@Override
	public void renderToBuffer(PoseStack poseStack, VertexConsumer vertexConsumer, int packedLight, int packedOverlay,
			float red, float green, float blue, float alpha) {
		Aimer.render(poseStack, vertexConsumer, packedLight, packedOverlay, red, green, blue, alpha);
	}

	public void setupAnim(T entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw,
			float headPitch) {
		this.Aimer.yRot = netHeadYaw / (180F / (float) Math.PI);
		this.Aimer.xRot = headPitch / (180F / (float) Math.PI);
	}
}