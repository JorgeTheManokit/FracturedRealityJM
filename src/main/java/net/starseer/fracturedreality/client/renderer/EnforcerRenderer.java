package net.starseer.fracturedreality.client.renderer;

import net.starseer.fracturedreality.entity.EnforcerEntity;
import net.starseer.fracturedreality.client.model.animations.EnforcerAnimation;
import net.starseer.fracturedreality.client.model.ModelEnforcer;

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

public class EnforcerRenderer extends MobRenderer<EnforcerEntity, ModelEnforcer<EnforcerEntity>> {
	public EnforcerRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelEnforcer.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<EnforcerEntity, ModelEnforcer<EnforcerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/presenter_glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, EnforcerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(EnforcerEntity entity) {
		return ResourceLocation.parse("fractured_reality:textures/entities/enforcer.png");
	}

	private static final class AnimatedModel extends ModelEnforcer<EnforcerEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<EnforcerEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(EnforcerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, EnforcerAnimation.base, ageInTicks, 1f);
				this.animate(entity.animationState1, EnforcerAnimation.callStrike, ageInTicks, 2f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(EnforcerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}