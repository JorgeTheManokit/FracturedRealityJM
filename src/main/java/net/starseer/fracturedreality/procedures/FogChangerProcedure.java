package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;

import net.neoforged.neoforge.client.event.ViewportEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.Mth;
import net.minecraft.client.renderer.FogRenderer;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

@EventBusSubscriber(Dist.CLIENT)
public class FogChangerProcedure {
	@SubscribeEvent
	public static void onSkyRendered(ViewportEvent.RenderFog event) {
		if (event.getMode() == FogRenderer.FogMode.FOG_TERRAIN) {
			Minecraft mc = Minecraft.getInstance();
			execute(event, mc.player.level(), mc.player, event);
		}
	}

	public static void execute(LevelAccessor world, Entity entity, ViewportEvent.RenderFog fogRenderEvent) {
		execute(null, world, entity, fogRenderEvent);
	}

	private static void execute(@Nullable Event event, LevelAccessor world, Entity entity, ViewportEvent.RenderFog fogRenderEvent) {
		if (entity == null || fogRenderEvent == null)
			return;
		double CalculatedDistance = 0;
		if ((entity.level().dimension()) == Level.OVERWORLD && !entity.isUnderWater()) {
			if (FracturedRealityModVariables.MapVariables.get(world).SkyPhase == 5) {
				if (FracturedRealityModVariables.MapVariables.get(world).FogFluxMinDistance != 200) {
					if (world.dayTime() % 24000 >= 12000 && world.dayTime() % 24000 < 13000) {
						CalculatedDistance = 200 - ((world.dayTime() % 24000 - 12000) / 1000d) * (200 - FracturedRealityModVariables.MapVariables.get(world).FogFluxMinDistance);
					} else if (world.dayTime() % 24000 >= 23000 && world.dayTime() % 24000 < 24000) {
						CalculatedDistance = FracturedRealityModVariables.MapVariables.get(world).FogFluxMinDistance + ((world.dayTime() % 24000 - 23000) / 1000d) * (200 - FracturedRealityModVariables.MapVariables.get(world).FogFluxMinDistance);
					} else if (NightTimeCheckerProcedure.execute(world)) {
						CalculatedDistance = FracturedRealityModVariables.MapVariables.get(world).FogFluxMinDistance;
					} else {
						CalculatedDistance = 200;
					}
					fogColor = 0x180006;
					fogRenderEvent.setNearPlaneDistance((float) CalculatedDistance);
					fogRenderEvent.setFarPlaneDistance((float) (CalculatedDistance * 3));
					if (!fogRenderEvent.isCanceled()) {
						fogRenderEvent.setCanceled(true);
					}
				}
			}
		}
	}

	private static int fogColor = -1;

	@SubscribeEvent
	public static void setFogColor(ViewportEvent.ComputeFogColor event) {
		if (fogColor != -1) {
			event.setRed(Mth.clamp(Mth.lerp(0.5F, Mth.clamp(event.getRed(), 0.0F, 1.0F), (fogColor >> 16 & 255) / 255.0F), 0.0F, 1.0F));
			event.setGreen(Mth.clamp(Mth.lerp(0.5F, Mth.clamp(event.getGreen(), 0.0F, 1.0F), (fogColor >> 8 & 255) / 255.0F), 0.0F, 1.0F));
			event.setBlue(Mth.clamp(Mth.lerp(0.5F, Mth.clamp(event.getBlue(), 0.0F, 1.0F), (fogColor & 255) / 255.0F), 0.0F, 1.0F));
			fogColor = -1;
		}
	}
}