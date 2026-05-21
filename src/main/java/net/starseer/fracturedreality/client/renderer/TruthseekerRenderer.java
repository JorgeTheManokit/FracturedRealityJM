package net.starseer.fracturedreality.client.renderer;

import net.starseer.fracturedreality.entity.TruthseekerEntity;
import net.starseer.fracturedreality.client.model.animations.truthseekerAnimation;

import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.layers.HumanoidArmorLayer;
import net.minecraft.client.renderer.entity.HumanoidMobRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.geom.ModelLayers;
import net.minecraft.client.model.HumanoidModel;
import net.minecraft.client.model.HierarchicalModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class TruthseekerRenderer extends HumanoidMobRenderer<TruthseekerEntity, HumanoidModel<TruthseekerEntity>> {
	public TruthseekerRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelLayers.PLAYER)), 0.5f);
		this.addLayer(new HumanoidArmorLayer(this, new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_INNER_ARMOR)), new HumanoidModel(context.bakeLayer(ModelLayers.PLAYER_OUTER_ARMOR)), context.getModelManager()));
		this.addLayer(new RenderLayer<TruthseekerEntity, HumanoidModel<TruthseekerEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/truthseeker_glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, TruthseekerEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(TruthseekerEntity entity) {
		return ResourceLocation.parse("fractured_reality:textures/entities/truthseeker.png");
	}

	private static final class AnimatedModel extends HumanoidModel<TruthseekerEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<TruthseekerEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(TruthseekerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.animate(entity.animationState0, truthseekerAnimation.base, ageInTicks, 1f);
				this.animateWalk(truthseekerAnimation.walk, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(TruthseekerEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}