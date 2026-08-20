package net.starseer.fracturedreality.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerPlayer;

public class AbyssPlayerEntersDimensionProcedure {
	public static void execute(LevelAccessor world, Entity entity) {
		if (entity == null)
			return;
		{
			Entity _ent = entity;
			_ent.teleportTo(0.5, 64, 0.5);
			if (_ent instanceof ServerPlayer _serverPlayer)
				_serverPlayer.connection.teleport(0.5, 64, 0.5, _ent.getYRot(), _ent.getXRot());
		}
		LoadAbyssStructuresProcedure.execute(world);
		entity.fallDistance = 0;
	}
}