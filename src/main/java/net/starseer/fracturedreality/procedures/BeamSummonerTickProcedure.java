package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.init.FracturedRealityModEntities;
import net.starseer.fracturedreality.entity.BeamSummonerEntity;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.MobSpawnType;
import net.minecraft.world.entity.Entity;
import net.minecraft.util.RandomSource;
import net.minecraft.util.Mth;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.BlockPos;

public class BeamSummonerTickProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		SummonerSoundsProcedure.execute(world, x, y, z);
		if ((entity instanceof BeamSummonerEntity _datEntI ? _datEntI.getEntityData().get(BeamSummonerEntity.DATA_attackCoolDown) : 0) == 0) {
			if (world instanceof ServerLevel _level) {
				Entity entityToSpawn = FracturedRealityModEntities.SUMMONED_PROJECTILE_BEAMER.get().spawn(_level,
						BlockPos.containing(Mth.nextDouble(RandomSource.create(), -5, 5) + x, Mth.nextDouble(RandomSource.create(), 4.5, 7) + y, Mth.nextDouble(RandomSource.create(), -5, 5) + z), MobSpawnType.MOB_SUMMONED);
				if (entityToSpawn != null) {
					entityToSpawn.setDeltaMovement(0, 0, 0);
				}
			}
			if (entity instanceof BeamSummonerEntity _datEntSetI)
				_datEntSetI.getEntityData().set(BeamSummonerEntity.DATA_attackCoolDown, Mth.nextInt(RandomSource.create(), 105, 120));
		}
		if (entity instanceof BeamSummonerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(BeamSummonerEntity.DATA_attackCoolDown, (int) Math.max((entity instanceof BeamSummonerEntity _datEntI ? _datEntI.getEntityData().get(BeamSummonerEntity.DATA_attackCoolDown) : 0) - 1, 0));
	}
}