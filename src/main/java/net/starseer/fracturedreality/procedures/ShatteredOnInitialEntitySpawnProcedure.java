package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;
import net.starseer.fracturedreality.entity.ShatteredEntity;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;

public class ShatteredOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		if (!FracturedRealityModVariables.MapVariables.get(world).ShatteredClassicAlreadySpawned) {
			if (entity instanceof ShatteredEntity _datEntSetI)
				_datEntSetI.getEntityData().set(ShatteredEntity.DATA_Variant, 1);
			FracturedRealityModVariables.MapVariables.get(world).ShatteredClassicAlreadySpawned = true;
			FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
		} else if (!FracturedRealityModVariables.MapVariables.get(world).ShatteredAlternateAlreadySpawned) {
			if (entity instanceof ShatteredEntity _datEntSetI)
				_datEntSetI.getEntityData().set(ShatteredEntity.DATA_Variant, 2);
			FracturedRealityModVariables.MapVariables.get(world).ShatteredAlternateAlreadySpawned = true;
			FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
		}
	}
}