package net.starseer.fracturedreality.client.renderer;

import net.starseer.fracturedreality.entity.StarcoreEntity;
import net.starseer.fracturedreality.client.model.animations.StarCoreAnimation;
import net.starseer.fracturedreality.client.model.ModelStarCore;

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

public class StarcoreRenderer extends MobRenderer<StarcoreEntity, ModelStarCore<StarcoreEntity>> {
	private final ResourceLocation entityTexture = ResourceLocation.parse("fractured_reality:textures/entities/star_core.png");

	public StarcoreRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelStarCore.LAYER_LOCATION)), 0f);
		this.addLayer(new RenderLayer<StarcoreEntity, ModelStarCore<StarcoreEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/star_core.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StarcoreEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(StarcoreEntity entity) {
		return entityTexture;
	}

	private static final class AnimatedModel extends ModelStarCore<StarcoreEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<StarcoreEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(StarcoreEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, StarCoreAnimation.Base, ageInTicks, 1f);
				this.animate(entity.animationState1, StarCoreAnimation.Idle, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(StarcoreEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}