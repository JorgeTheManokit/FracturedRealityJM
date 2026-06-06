package net.starseer.fracturedreality.client.renderer.block;

import net.starseer.fracturedreality.init.FracturedRealityModBlockEntities;
import net.starseer.fracturedreality.client.model.animations.StarCoreAnimation;
import net.starseer.fracturedreality.client.model.ModelStarCore;
import net.starseer.fracturedreality.block.entity.StarCoreDecorativeBlockEntity;
import net.starseer.fracturedreality.block.StarCoreDecorativeBlock;

import net.neoforged.neoforge.client.event.EntityRenderersEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.phys.Vec3;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.BlockPos;
import net.minecraft.client.renderer.blockentity.BlockEntityRendererProvider;
import net.minecraft.client.renderer.blockentity.BlockEntityRenderer;
import net.minecraft.client.renderer.RenderType;
import net.minecraft.client.renderer.MultiBufferSource;
import net.minecraft.client.model.geom.ModelPart;
import net.minecraft.client.model.HierarchicalModel;

import com.mojang.math.Axis;
import com.mojang.blaze3d.vertex.VertexConsumer;
import com.mojang.blaze3d.vertex.PoseStack;

import java.util.Comparator;

@EventBusSubscriber(Dist.CLIENT)
public class StarCoreDecorativeRenderer implements BlockEntityRenderer<StarCoreDecorativeBlockEntity> {
	private final CustomHierarchicalModel model;
	private final ResourceLocation texture;

	StarCoreDecorativeRenderer(BlockEntityRendererProvider.Context context) {
		this.model = new CustomHierarchicalModel(context.bakeLayer(ModelStarCore.LAYER_LOCATION));
		this.texture = ResourceLocation.parse("fractured_reality:textures/block/star_core.png");
	}

	private void updateRenderState(StarCoreDecorativeBlockEntity blockEntity) {
		int tickCount = (int) blockEntity.getLevel().getGameTime();
		blockEntity.animationState0.animateWhen(true, tickCount);
		blockEntity.animationState1.animateWhen(true, tickCount);
	}

	@Override
	public void render(StarCoreDecorativeBlockEntity blockEntity, float partialTick, PoseStack poseStack, MultiBufferSource renderer, int light, int overlayLight) {
		updateRenderState(blockEntity);
		BlockState state = blockEntity.getBlockState();

		float yawDeg;
		float pitchDeg;

		if (state.getValue(StarCoreDecorativeBlock.AUTO_ROTATE)) {
			Vec3 blockCenter = Vec3.atCenterOf(blockEntity.getBlockPos());

			Player nearest = blockEntity.getLevel().players().stream()
				.min(Comparator.comparingDouble(p -> p.distanceToSqr(blockCenter.x, blockCenter.y, blockCenter.z)))
				.orElse(null);

			if (nearest != null) {
				Vec3 playerEye = nearest.getEyePosition(partialTick);
				double dx = playerEye.x - blockCenter.x;
				double dy = playerEye.y - blockCenter.y;
				double dz = playerEye.z - blockCenter.z;
				double horizontalDist = Math.sqrt(dx * dx + dz * dz);

				yawDeg = (float) Math.toDegrees(Math.atan2(dx, dz)) + 180f;
				pitchDeg = (float) Math.toDegrees(Math.atan2(dy, horizontalDist));
			} else {
				yawDeg = 0;
				pitchDeg = 0;
			}
		} else {
			yawDeg = state.getValue(StarCoreDecorativeBlock.YAW) * 45f;
			pitchDeg = state.getValue(StarCoreDecorativeBlock.PITCH) * 45f;
		}

		poseStack.pushPose();
		poseStack.scale(-1, -1, 1);
		poseStack.translate(-0.5, -0.5, 0.5);
		// Rotate first, before the downward translate, so the pivot is at the block center
		poseStack.mulPose(Axis.YP.rotationDegrees(-yawDeg));
		poseStack.mulPose(Axis.XN.rotationDegrees(pitchDeg));
		poseStack.translate(0, -1, 0);
		VertexConsumer builder = renderer.getBuffer(RenderType.entityCutout(texture));
		model.setupBlockEntityAnim(blockEntity, blockEntity.getLevel().getGameTime() + partialTick);
		model.renderToBuffer(poseStack, builder, light, overlayLight);
		poseStack.popPose();
	}

	@SubscribeEvent
	public static void registerBlockEntityRenderers(EntityRenderersEvent.RegisterRenderers event) {
		event.registerBlockEntityRenderer(FracturedRealityModBlockEntities.STAR_CORE_DECORATIVE.get(), StarCoreDecorativeRenderer::new);
	}

	private static final class CustomHierarchicalModel extends ModelStarCore {
		private final ModelPart root;
		private final BlockEntityHierarchicalModel animator = new BlockEntityHierarchicalModel();

		public CustomHierarchicalModel(ModelPart root) {
			super(root);
			this.root = root;
		}

		public void setupBlockEntityAnim(StarCoreDecorativeBlockEntity blockEntity, float ageInTicks) {
			animator.setupBlockEntityAnim(blockEntity, ageInTicks);
			super.setupAnim(null, 0, 0, ageInTicks, 0, 0);
		}

		private class BlockEntityHierarchicalModel extends HierarchicalModel<Entity> {
			@Override
			public ModelPart root() {
				return root;
			}

			@Override
			public void setupAnim(Entity entity, float limbSwing, float limbSwingAmount, float ageInTicks, float netHeadYaw, float headPitch) {
			}

			public void setupBlockEntityAnim(StarCoreDecorativeBlockEntity blockEntity, float ageInTicks) {
				animator.root().getAllParts().forEach(ModelPart::resetPose);
				animator.animate(blockEntity.animationState0, StarCoreAnimation.Base, ageInTicks, 1f);
				animator.animate(blockEntity.animationState1, StarCoreAnimation.Idle, ageInTicks, 1f);
			}
		}
	}
}