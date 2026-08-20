package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.init.FracturedRealityModParticleTypes;
import net.starseer.fracturedreality.entity.LightningStrikerEntity;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.LightningBolt;
import net.minecraft.world.entity.EntityType;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

public class LightningStrikerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if (entity instanceof LightningStrikerEntity _datEntSetI)
			_datEntSetI.getEntityData().set(LightningStrikerEntity.DATA_Age, (int) ((entity instanceof LightningStrikerEntity _datEntI ? _datEntI.getEntityData().get(LightningStrikerEntity.DATA_Age) : 0) + 1));
		if ((entity instanceof LightningStrikerEntity _datEntI ? _datEntI.getEntityData().get(LightningStrikerEntity.DATA_Age) : 0) >= 20) {
			if (world instanceof ServerLevel _level) {
				LightningBolt entityToSpawn = EntityType.LIGHTNING_BOLT.create(_level);
				entityToSpawn.moveTo(Vec3.atBottomCenterOf(BlockPos.containing(entity.getX(), entity.getY(), entity.getZ())));;
				_level.addFreshEntity(entityToSpawn);
			}
			if (!entity.level().isClientSide())
				entity.discard();
		}
		if (world instanceof ServerLevel _level)
			_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.BLUE_SPARK.get()), x, (y + 0.125), z,
					(int) ((entity instanceof LightningStrikerEntity _datEntI ? _datEntI.getEntityData().get(LightningStrikerEntity.DATA_Age) : 0) * 5), 0, 0, 0,
					(2 / (entity instanceof LightningStrikerEntity _datEntI ? _datEntI.getEntityData().get(LightningStrikerEntity.DATA_Age) : 0)));
	}
}