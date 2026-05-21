package net.starseer.fracturedreality.client.renderer;

import net.starseer.fracturedreality.entity.StarseerEntity;
import net.starseer.fracturedreality.client.model.animations.StarseerAnimation;
import net.starseer.fracturedreality.client.model.ModelStarseer;

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

public class StarseerRenderer extends MobRenderer<StarseerEntity, ModelStarseer<StarseerEntity>> {
	public StarseerRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelStarseer.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<StarseerEntity, ModelStarseer<StarseerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/starseer_glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, StarseerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(StarseerEntity entity) {
		return ResourceLocation.parse("fractured_reality:textures/entities/starseer.png");
	}

	private static final class AnimatedModel extends ModelStarseer<StarseerEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<StarseerEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(StarseerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, StarseerAnimation.Base, ageInTicks, 1f);
				this.animateWalk(StarseerAnimation.Walk, limbSwing, limbSwingAmount, 1f, 1f);
				this.animate(entity.animationState2, StarseerAnimation.Attack, ageInTicks, 2f);
				this.animate(entity.animationState3, StarseerAnimation.Smash, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(StarseerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}