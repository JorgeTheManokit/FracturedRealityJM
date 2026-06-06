package net.starseer.fracturedreality.fluid.types;

import org.joml.Vector3f;

import net.starseer.fracturedreality.init.FracturedRealityModFluidTypes;

import net.neoforged.neoforge.fluids.FluidType;
import net.neoforged.neoforge.common.SoundActions;
import net.neoforged.neoforge.client.extensions.common.RegisterClientExtensionsEvent;
import net.neoforged.neoforge.client.extensions.common.IClientFluidTypeExtensions;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;

import net.minecraft.world.level.pathfinder.PathType;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundEvents;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Camera;

import com.mojang.blaze3d.systems.RenderSystem;
import com.mojang.blaze3d.shaders.FogShape;

@EventBusSubscriber
public class SoulLavaFluidType extends FluidType {
	public SoulLavaFluidType() {
		super(FluidType.Properties.create().canSwim(false).canDrown(false).pathType(PathType.LAVA).adjacentPathType(null).motionScale(0.007D).canConvertToSource(true).sound(SoundActions.BUCKET_FILL, SoundEvents.BUCKET_FILL)
				.sound(SoundActions.BUCKET_EMPTY, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("item.bucket.empty_lava"))).sound(SoundActions.FLUID_VAPORIZE, SoundEvents.FIRE_EXTINGUISH));
	}

	@SubscribeEvent
	public static void registerFluidTypeExtensions(RegisterClientExtensionsEvent event) {
		event.registerFluidType(new IClientFluidTypeExtensions() {
			private static final ResourceLocation STILL_TEXTURE = ResourceLocation.parse("fractured_reality:block/soul_lava_still");
			private static final ResourceLocation FLOWING_TEXTURE = ResourceLocation.parse("fractured_reality:block/soul_lava_flow");

			@Override
			public ResourceLocation getStillTexture() {
				return STILL_TEXTURE;
			}

			@Override
			public ResourceLocation getFlowingTexture() {
				return FLOWING_TEXTURE;
			}

			@Override
			public Vector3f modifyFogColor(Camera camera, float partialTick, ClientLevel level, int renderDistance, float darkenWorldAmount, Vector3f fluidFogColor) {
				return new Vector3f(0f, 1f, 1f);
			}

			@Override
			public void modifyFogRender(Camera camera, FogRenderer.FogMode mode, float renderDistance, float partialTick, float nearDistance, float farDistance, FogShape shape) {
				Entity entity = camera.getEntity();
				Level world = entity.level();
				RenderSystem.setShaderFogShape(FogShape.SPHERE);
				RenderSystem.setShaderFogStart(0f);
				RenderSystem.setShaderFogEnd(2f);
			}
		}, FracturedRealityModFluidTypes.SOUL_LAVA_TYPE.get());
	}
}