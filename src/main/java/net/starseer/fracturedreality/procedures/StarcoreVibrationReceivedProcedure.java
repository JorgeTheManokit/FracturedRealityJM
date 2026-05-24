package net.starseer.fracturedreality.procedures;

import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;

public class StarcoreVibrationReceivedProcedure {
	public static void execute(Entity entity, double vibrationX, double vibrationY, double vibrationZ) {
		if (entity == null)
			return;
		if (!(entity instanceof Mob _mob ? _mob.isAggressive() : false)) {
			if (entity instanceof Mob _entity)
				_entity.getNavigation().moveTo(vibrationX, vibrationY, vibrationZ, 1.5);
		}
	}
}