package net.starseer.fracturedreality.client.renderer;

import net.starseer.fracturedreality.procedures.ShatteredDisplayMimicProcedure;
import net.starseer.fracturedreality.procedures.ShatteredDisplayClassicProcedure;
import net.starseer.fracturedreality.procedures.ShatteredDisplayAlternateProcedure;
import net.starseer.fracturedreality.entity.ShatteredEntity;
import net.starseer.fracturedreality.client.model.animations.ShatteredAnimation;
import net.starseer.fracturedreality.client.model.ModelStarseer;

import net.minecraft.world.level.Level;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.client.renderer.texture.OverlayTexture;
import net.minecraft.client.renderer.entity.layers.RenderLayer;
import net.minecraft.client.renderer.entity.MobRenderer;
import net.minecraft.client.renderer.entity.LivingEntityRenderer;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

public class ShatteredRenderer extends MobRenderer<ShatteredEntity, ModelStarseer<ShatteredEntity>> {
	public ShatteredRenderer(EntityRendererProvider.Context context) {
		super(context, new AnimatedModel(context.bakeLayer(ModelStarseer.LAYER_LOCATION)), 0.5f);
		this.addLayer(new RenderLayer<ShatteredEntity, ModelStarseer<ShatteredEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/shattered_mimic.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ShatteredEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ShatteredDisplayMimicProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<ShatteredEntity, ModelStarseer<ShatteredEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/shattered_mimic_glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ShatteredEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ShatteredDisplayMimicProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
				}
			}
		});
		this.addLayer(new RenderLayer<ShatteredEntity, ModelStarseer<ShatteredEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/shattered_alt.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ShatteredEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ShatteredDisplayAlternateProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<ShatteredEntity, ModelStarseer<ShatteredEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/shattered_alt_glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ShatteredEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ShatteredDisplayAlternateProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
				}
			}
		});
		this.addLayer(new RenderLayer<ShatteredEntity, ModelStarseer<ShatteredEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/shattered.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ShatteredEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ShatteredDisplayClassicProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.entityCutoutNoCull(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, LivingEntityRenderer.getOverlayCoords(entity, 0));
				}
			}
		});
		this.addLayer(new RenderLayer<ShatteredEntity, ModelStarseer<ShatteredEntity>>(this) {
			final ResourceLocation LAYER_TEXTURE = ResourceLocation.parse("fractured_reality:textures/entities/shattered_glow.png");

			@Override
			public void render(PoseStack poseStack, MultiBufferSource bufferSource, int light, ShatteredEntity entity, float limbSwing, float limbSwingAmount, float partialTicks, float ageInTicks, float netHeadYaw, float headPitch) {
				Level world = entity.level();
				double x = entity.getX();
				double y = entity.getY();
				double z = entity.getZ();
				if (ShatteredDisplayClassicProcedure.execute(entity)) {
					VertexConsumer vertexConsumer = bufferSource.getBuffer(RenderType.eyes(LAYER_TEXTURE));
					this.getParentModel().renderToBuffer(poseStack, vertexConsumer, light, OverlayTexture.NO_OVERLAY);
				}
			}
		});
	}

	@Override
	public ResourceLocation getTextureLocation(ShatteredEntity entity) {
		return ResourceLocation.parse("fractured_reality:textures/entities/empty.png");
	}

	private static final class AnimatedModel extends ModelStarseer<ShatteredEntity> {
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
				this.animate(entity.animationState2, ShatteredAnimation.Attack, ageInTicks, 1f);
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