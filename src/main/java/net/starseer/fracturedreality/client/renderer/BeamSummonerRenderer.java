package net.starseer.fracturedreality.client.renderer;

import net.starseer.fracturedreality.entity.BeamSummonerEntity;
import net.starseer.fracturedreality.client.model.animations.BeamSummonerAnimation;
import net.starseer.fracturedreality.client.model.ModelBeamSummoner;

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

public class BeamSummonerRenderer extends MobRenderer<BeamSummonerEntity, ModelBeamSummoner<BeamSummonerEntity>> {
	public BeamSummonerRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelBeamSummoner.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<BeamSummonerEntity, ModelBeamSummoner<BeamSummonerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/summoner_glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, BeamSummonerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(BeamSummonerEntity entity) {
		return ResourceLocation.parse("fractured_reality:textures/entities/summoner.png");
	}

	private static final class AnimatedModel extends ModelBeamSummoner<BeamSummonerEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<BeamSummonerEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(BeamSummonerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, BeamSummonerAnimation.constant, ageInTicks, 1f);
				this.animateWalk(BeamSummonerAnimation.walk, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(BeamSummonerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}