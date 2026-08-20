package net.starseer.fracturedreality.client.renderer;

import net.starseer.fracturedreality.entity.FollowerMinionEntity;
import net.starseer.fracturedreality.client.model.animations.PresenterAnimation;
import net.starseer.fracturedreality.client.model.ModelPresenter;

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

public class FollowerMinionRenderer extends MobRenderer<FollowerMinionEntity, ModelPresenter<FollowerMinionEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("fractured_reality:textures/entities/follower.png");

	public FollowerMinionRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelPresenter.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<FollowerMinionEntity, ModelPresenter<FollowerMinionEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/follower_glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, FollowerMinionEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
			}
		});
	}

	@Override
	protected void scale(FollowerMinionEntity entity, PoseStack poseStack, float f) {
		poseStack.scale(0.7f, 0.7f, 0.7f);
	}

	@Override
	public ResourceLocation getTextureLocation(FollowerMinionEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends ModelPresenter<FollowerMinionEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<FollowerMinionEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(FollowerMinionEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, PresenterAnimation.base, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(FollowerMinionEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}