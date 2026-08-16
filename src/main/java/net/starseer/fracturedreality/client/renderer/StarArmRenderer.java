package net.starseer.fracturedreality.client.renderer;

import net.starseer.fracturedreality.entity.StarArmEntity;
import net.starseer.fracturedreality.client.model.animations.StarArmAnimation;
import net.starseer.fracturedreality.client.model.ModelStarArm;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class StarArmRenderer extends MobRenderer<StarArmEntity, ModelStarArm<StarArmEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("fractured_reality:textures/entities/star_arm.png");

	public StarArmRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelStarArm.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<StarArmEntity, ModelStarArm<StarArmEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/star_arm_glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StarArmEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(StarArmEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends ModelStarArm<StarArmEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<StarArmEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(StarArmEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, StarArmAnimation.Grasp, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(StarArmEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}