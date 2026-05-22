package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.configuration.FracturedRealityServerConfigConfiguration;

import net.minecraft.world.level.block.Block;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Mob;
import net.minecraft.world.entity.Entity;
import net.minecraft.core.BlockPos;

public class MoonBreakerOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		Entity target = null;
		double sx = 0;
		double sy = 0;
		double sz = 0;
		MoonbreakerSoundsProcedure.execute(world, x, y, z);
		target = entity instanceof Mob _mobEnt ? (Entity) _mobEnt.getTarget() : null;
		if (!(target == null)) {
			if (FracturedRealityServerConfigConfiguration.VOID_GRIEFING.get()) {
				if (y == target.getY()) {
					sx = -2;
					for (int index0 = 0; index0 < 4; index0++) {
						sy = 0;
						for (int index1 = 0; index1 < 7; index1++) {
							sz = -2;
							for (int index2 = 0; index2 < 4; index2++) {
								if (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)).getDestroySpeed(world, BlockPos.containing(x + sx, y + sy, z + sz)) < 150) {
									world.levelEvent(2001, BlockPos.containing(x + sx, y + sy, z + sz), Block.getId((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)))));
									{
										BlockPos _pos = BlockPos.containing(x + sx, y + sy, z + sz);
										Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + sx, y + sy, z + sz), null);
										world.destroyBlock(_pos, false);
									}
								}
								sz = sz + 1;
							}
							sy = sy + 1;
						}
						sx = sx + 1;
					}
				} else if (y < target.getY() && !(target.getY() - y >= 5)) {
					sx = -2;
					for (int index3 = 0; index3 < 4; index3++) {
						sy = 1;
						for (int index4 = 0; index4 < 7; index4++) {
							sz = -2;
							for (int index5 = 0; index5 < 4; index5++) {
								if (world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)).getDestroySpeed(world, BlockPos.containing(x + sx, y + sy, z + sz)) < 150) {
									world.levelEvent(2001, BlockPos.containing(x + sx, y + sy, z + sz), Block.getId((world.getBlockState(BlockPos.containing(x + sx, y + sy, z + sz)))));
									{
										BlockPos _pos = BlockPos.containing(x + sx, y + sy, z + sz);
										Block.dropResources(world.getBlockState(_pos), world, BlockPos.containing(x + sx, y + sy, z + sz), null);
										world.destroyBlock(_pos, false);
									}
								}
								sz = sz + 1;
							}
							sy = sy + 1;
						}
						sx = sx + 1;
					}
				}
			}
		}
	}
}