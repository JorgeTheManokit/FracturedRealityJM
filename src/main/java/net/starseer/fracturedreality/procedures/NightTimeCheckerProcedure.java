package net.starseer.fracturedreality.procedures;

import net.neoforged.neoforge.client.event.RenderLevelStageEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.client.Minecraft;

import javax.annotation.Nullable;

@EventBusSubscriber(Dist.CLIENT)
public class NightTimeCheckerProcedure {
	@SubscribeEvent
	public static void onSkyRendered(RenderLevelStageEvent event) {
		Minecraft mc = Minecraft.getInstance();
		if (event.getStage() == RenderLevelStageEvent.Stage.AFTER_SKY)
			execute(event, mc.player.level());
	}

	public static boolean execute(LevelAccessor world) {
		return execute(null, world);
	}

	private static boolean execute(@Nullable Event event, LevelAccessor world) {
		return world.dayTime() % 24000 >= 13000 && world.dayTime() % 24000 < 23000;
	}
}