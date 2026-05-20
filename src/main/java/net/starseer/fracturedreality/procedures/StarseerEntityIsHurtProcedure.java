package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.FracturedRealityMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

public class StarseerEntityIsHurtProcedure {
	public static void execute(LevelAccessor world, DamageSource damagesource, Entity entity) {
		if (damagesource == null || entity == null)
			return;
		if (damagesource.is(DamageTypes.EXPLOSION)) {
			FracturedRealityMod.queueServerWork(1, () -> {
				entity.setDeltaMovement(new Vec3(0, 0, 0));
			});
		}
	}
}