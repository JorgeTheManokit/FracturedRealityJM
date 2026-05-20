package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.entity.StarseerEntity;
import net.starseer.fracturedreality.FracturedRealityMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.sounds.SoundSource;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.BlockPos;

import java.util.Comparator;

public class StarseerOnInitialEntitySpawnProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		double playerCount = 0;
		playerCount = 0;
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(64 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (entityiterator instanceof Player) {
					playerCount = playerCount + 1;
				}
			}
		}
		if (playerCount == 1) {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.starseer.start_monologue_1p")), SoundSource.VOICE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.starseer.start_monologue_1p")), SoundSource.VOICE, 1, 1, false);
				}
			}
			FracturedRealityMod.queueServerWork(183, () -> {
				if (entity instanceof StarseerEntity _datEntSetL)
					_datEntSetL.getEntityData().set(StarseerEntity.DATA_DoingMonologue, false);
			});
		} else {
			if (world instanceof Level _level) {
				if (!_level.isClientSide()) {
					_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.starseer.start_monologue_mp")), SoundSource.VOICE, 1, 1);
				} else {
					_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.starseer.start_monologue_mp")), SoundSource.VOICE, 1, 1, false);
				}
			}
			FracturedRealityMod.queueServerWork(314, () -> {
				if (entity instanceof StarseerEntity _datEntSetL)
					_datEntSetL.getEntityData().set(StarseerEntity.DATA_DoingMonologue, false);
			});
		}
	}
}