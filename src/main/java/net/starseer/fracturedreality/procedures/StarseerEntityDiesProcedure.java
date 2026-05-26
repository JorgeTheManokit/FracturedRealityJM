package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;
import net.starseer.fracturedreality.init.FracturedRealityModParticleTypes;
import net.starseer.fracturedreality.FracturedRealityMod;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.effect.MobEffectInstance;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerPlayer;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.resources.ResourceKey;
import net.minecraft.network.protocol.game.ClientboundUpdateMobEffectPacket;
import net.minecraft.network.protocol.game.ClientboundPlayerAbilitiesPacket;
import net.minecraft.network.protocol.game.ClientboundLevelEventPacket;
import net.minecraft.network.protocol.game.ClientboundGameEventPacket;
import net.minecraft.network.chat.Component;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;
import net.minecraft.advancements.AdvancementProgress;
import net.minecraft.advancements.AdvancementHolder;

import java.util.ArrayList;

public class StarseerEntityDiesProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		FracturedRealityModVariables.MapVariables.get(world).StarseerDefeated = true;
		FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			if (entityiterator instanceof ServerPlayer _player) {
				AdvancementHolder _adv = _player.server.getAdvancements().get(ResourceLocation.parse("fractured_reality:adv_supernova"));
				if (_adv != null) {
					AdvancementProgress _ap = _player.getAdvancements().getOrStartProgress(_adv);
					if (!_ap.isDone()) {
						for (String criteria : _ap.getRemainingCriteria())
							_player.getAdvancements().award(_adv, criteria);
					}
				}
			}
		}
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"stopsound fractured_reality:fr.supernova.middle1 @a");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"stopsound fractured_reality:fr.supernova.middle2 @a");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"stopsound fractured_reality:fr.supernova.middle3 @a");
		if (world instanceof ServerLevel _level)
			_level.getServer().getCommands().performPrefixedCommand(new CommandSourceStack(CommandSource.NULL, new Vec3(x, y, z), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null).withSuppressedOutput(),
					"stopsound fractured_reality:fr.supernova.middle4 @a");
		if (world instanceof Level _level) {
			if (!_level.isClientSide()) {
				_level.playSound(null, BlockPos.containing(x, y, z), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.supernova.outro")), SoundSource.HOSTILE, 100, 1);
			} else {
				_level.playLocalSound(x, y, z, BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("fractured_reality:fr.supernova.outro")), SoundSource.HOSTILE, 100, 1, false);
			}
		}
		FracturedRealityMod.queueServerWork(1, () -> {
			if (world instanceof ServerLevel _level)
				_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.WHITE_SPARK.get()), x, y, z, 256, 0, 0, 0, 1);
			FracturedRealityMod.queueServerWork(1, () -> {
				if (world instanceof ServerLevel _level)
					_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.WHITE_SPARK.get()), x, y, z, 256, 0, 0, 0, 1);
				FracturedRealityMod.queueServerWork(1, () -> {
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.WHITE_SPARK.get()), x, y, z, 256, 0, 0, 0, 1);
					FracturedRealityMod.queueServerWork(1, () -> {
						if (world instanceof ServerLevel _level)
							_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.WHITE_SPARK.get()), x, y, z, 256, 0, 0, 0, 1);
						FracturedRealityMod.queueServerWork(1, () -> {
							if (world instanceof ServerLevel _level)
								_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.WHITE_SPARK.get()), x, y, z, 256, 0, 0, 0, 1);
							FracturedRealityMod.queueServerWork(1, () -> {
								if (world instanceof ServerLevel _level)
									_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.WHITE_SPARK.get()), x, y, z, 256, 0, 0, 0, 1);
								FracturedRealityMod.queueServerWork(1, () -> {
									if (world instanceof ServerLevel _level)
										_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.WHITE_SPARK.get()), x, y, z, 256, 0, 0, 0, 1);
									FracturedRealityMod.queueServerWork(1, () -> {
										if (world instanceof ServerLevel _level)
											_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.WHITE_SPARK.get()), x, y, z, 256, 0, 0, 0, 1);
										FracturedRealityMod.queueServerWork(1, () -> {
											if (world instanceof ServerLevel _level)
												_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.WHITE_SPARK.get()), x, y, z, 256, 0, 0, 0, 1);
											FracturedRealityMod.queueServerWork(1, () -> {
												if (world instanceof ServerLevel _level)
													_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.WHITE_SPARK.get()), x, y, z, 256, 0, 0, 0, 1);
												FracturedRealityMod.queueServerWork(1, () -> {
													if (world instanceof ServerLevel _level)
														_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.WHITE_SPARK.get()), x, y, z, 256, 0, 0, 0, 1);
													FracturedRealityMod.queueServerWork(1, () -> {
														if (world instanceof ServerLevel _level)
															_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.WHITE_SPARK.get()), x, y, z, 256, 0, 0, 0, 1);
														FracturedRealityMod.queueServerWork(1, () -> {
															if (world instanceof ServerLevel _level)
																_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.WHITE_SPARK.get()), x, y, z, 256, 0, 0, 0, 1);
															FracturedRealityMod.queueServerWork(1, () -> {
																if (world instanceof ServerLevel _level)
																	_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.WHITE_SPARK.get()), x, y, z, 256, 0, 0, 0, 1);
																FracturedRealityMod.queueServerWork(1, () -> {
																	if (world instanceof ServerLevel _level)
																		_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.WHITE_SPARK.get()), x, y, z, 256, 0, 0, 0, 1);
																	FracturedRealityMod.queueServerWork(1, () -> {
																		if (world instanceof ServerLevel _level)
																			_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.WHITE_SPARK.get()), x, y, z, 256, 0, 0, 0, 1);
																	});
																});
															});
														});
													});
												});
											});
										});
									});
								});
							});
						});
					});
				});
			});
		});
		FracturedRealityMod.queueServerWork(120, () -> {
			for (Entity entityiterator : new ArrayList<>(world.players())) {
				if ((entityiterator.level().dimension()) == ResourceKey.create(Registries.DIMENSION, ResourceLocation.parse("fractured_reality:reality_edge"))) {
					if (entityiterator instanceof ServerPlayer _player && !_player.level().isClientSide()) {
						ResourceKey<Level> destinationType = Level.OVERWORLD;
						if (_player.level().dimension() == destinationType)
							return;
						ServerLevel nextLevel = _player.server.getLevel(destinationType);
						if (nextLevel != null) {
							_player.connection.send(new ClientboundGameEventPacket(ClientboundGameEventPacket.WIN_GAME, 0));
							_player.teleportTo(nextLevel, _player.getX(), _player.getY(), _player.getZ(), _player.getYRot(), _player.getXRot());
							_player.connection.send(new ClientboundPlayerAbilitiesPacket(_player.getAbilities()));
							for (MobEffectInstance _effectinstance : _player.getActiveEffects())
								_player.connection.send(new ClientboundUpdateMobEffectPacket(_player.getId(), _effectinstance, false));
							_player.connection.send(new ClientboundLevelEventPacket(1032, BlockPos.ZERO, 0, false));
						}
					}
					{
						Entity _ent = entityiterator;
						_ent.teleportTo(
								((entityiterator instanceof ServerPlayer _player && !_player.level().isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level().getLevelData().getSpawnPos().getX())
										: 0),
								((entityiterator instanceof ServerPlayer _player && !_player.level().isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level().getLevelData().getSpawnPos().getY())
										: 0),
								((entityiterator instanceof ServerPlayer _player && !_player.level().isClientSide())
										? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level().getLevelData().getSpawnPos().getZ())
										: 0));
						if (_ent instanceof ServerPlayer _serverPlayer)
							_serverPlayer.connection.teleport(
									((entityiterator instanceof ServerPlayer _player && !_player.level().isClientSide())
											? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getX() : _player.level().getLevelData().getSpawnPos().getX())
											: 0),
									((entityiterator instanceof ServerPlayer _player && !_player.level().isClientSide())
											? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getY() : _player.level().getLevelData().getSpawnPos().getY())
											: 0),
									((entityiterator instanceof ServerPlayer _player && !_player.level().isClientSide())
											? ((_player.getRespawnDimension().equals(_player.level().dimension()) && _player.getRespawnPosition() != null) ? _player.getRespawnPosition().getZ() : _player.level().getLevelData().getSpawnPos().getZ())
											: 0),
									_ent.getYRot(), _ent.getXRot());
					}
				}
			}
		});
	}
}