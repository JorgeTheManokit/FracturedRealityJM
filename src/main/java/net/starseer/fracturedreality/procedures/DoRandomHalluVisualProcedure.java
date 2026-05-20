package net.starseer.fracturedreality.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

public class DoRandomHalluVisualProcedure {
	public static void execute(LevelAccessor world, Entity Entity) {
		if (Entity == null)
			return;
		double randX = 0;
		double randZ = 0;
		randX = Entity.getX() + Mth.nextDouble(RandomSource.create(), -5, 5);
		randZ = Entity.getZ() + Mth.nextDouble(RandomSource.create(), -5, 5);
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(randX, Entity.getY(), randZ), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:hallucination_voices")), SoundSource.HOSTILE, (float) 0.25, 1);
			} else {
				_level.playLocalSound(randX, (Entity.getY()), randZ, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:hallucination_voices")), SoundSource.HOSTILE, (float) 0.25, 1, false);
			}
		}
	}
}