package net.starseer.fracturedreality.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class FacelessSoundsProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		if (Math.random() < (1) / ((float) 1000)) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.faceless.whisper")), SoundSource.NEUTRAL, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.faceless.whisper")), SoundSource.NEUTRAL, 1, 1, false);
				}
			}
		}
	}
}