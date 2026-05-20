package net.starseer.fracturedreality.client.renderer;

import net.starseer.fracturedreality.entity.SummonedProjectileBeamerEntity;
import net.starseer.fracturedreality.client.model.animations.SummonedProjectileBeamerAnimation;
import net.starseer.fracturedreality.client.model.ModelSummonedProjectileBeamer;

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

public class SummonedProjectileBeamerRenderer extends MobRenderer<SummonedProjectileBeamerEntity, ModelSummonedProjectileBeamer<SummonedProjectileBeamerEntity>> {
	public SummonedProjectileBeamerRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelSummonedProjectileBeamer.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<SummonedProjectileBeamerEntity, ModelSummonedProjectileBeamer<SummonedProjectileBeamerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/summoned_projectile_beamer.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, SummonedProjectileBeamerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(SummonedProjectileBeamerEntity entity) {
		return ResourceLocation.parse("fractured_reality:textures/entities/summoned_projectile_beamer.png");
	}

	private static final class AnimatedModel extends ModelSummonedProjectileBeamer<SummonedProjectileBeamerEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<SummonedProjectileBeamerEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(SummonedProjectileBeamerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, SummonedProjectileBeamerAnimation.Spawn, ageInTicks, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(SummonedProjectileBeamerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}