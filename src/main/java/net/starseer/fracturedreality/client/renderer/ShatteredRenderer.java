package net.starseer.fracturedreality.client.renderer;

import net.starseer.fracturedreality.entity.ShatteredEntity;
import net.starseer.fracturedreality.client.model.animations.ShatteredAnimation;
import net.starseer.fracturedreality.client.model.ModelShattered;

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

public class ShatteredRenderer extends MobRenderer<ShatteredEntity, ModelShattered<ShatteredEntity>> {
	public ShatteredRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelShattered.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<ShatteredEntity, ModelShattered<ShatteredEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/shattered_mimic_glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ShatteredEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
				this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ShatteredEntity entity) {
		return ResourceLocation.parse("fractured_reality:textures/entities/shattered_mimic.png");
	}

	private static final class AnimatedModel extends ModelShattered<ShatteredEntity> {
		private final ModelPart root;
		private final HierarchicalModel animator = new HierarchicalModel<ShatteredEntity>() {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(ShatteredEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
				this.root().getAllParts().forEach(ModelPart::resetPose);
				this.animate(entity.animationState0, ShatteredAnimation.Base, ageInTicks, 1f);
				this.animateWalk(ShatteredAnimation.Walk, limbSwing, limbSwingAmount, 1f, 1f);
			}
		};

		public AnimatedModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		@Override
		public void setupAnim(ShatteredEntity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			animator.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
			super.setupAnim(entity, limbSwing, limbSwingAmount, ageInTicks, netHeadYaw, headPitch);
		}
	}
}