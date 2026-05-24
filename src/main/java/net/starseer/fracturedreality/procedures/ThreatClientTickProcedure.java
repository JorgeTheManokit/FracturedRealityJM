package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;
import net.starseer.fracturedreality.FracturedRealityMod;

import net.neoforged.neoforge.event.tick.LevelTickEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.bus.api.Event;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.Vec2;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;
import net.minecraft.commands.CommandSource;

import javax.annotation.Nullable;

import java.util.ArrayList;

@EventBusSubscriber
public class ThreatClientTickProcedure {
	@SubscribeEvent
	public static void onWorldTick(LevelTickEvent.Post event) {
		execute(event, event.getLevel());
	}

	public static void execute(LevelAccessor world) {
		execute(null, world);
	}

	private static void execute(@Nullable Event event, LevelAccessor world) {
		double threatLevel = 0;
		for (Entity entityiterator : new ArrayList<>(world.players())) {
			threatLevel = GetThreatLevelProcedure.execute(world, entityiterator.getX(), entityiterator.getY(), entityiterator.getZ());
			FracturedRealityMod.LOGGER.info("playsound fractured_reality:fr.threat.phase1.severe hostile " + entityiterator.getDisplayName().getString() + " ~ ~ ~ 100 1");
			if (entityiterator.getData(FracturedRealityModVariables.PLAYER_VARIABLES).threatRepeatCooldown <= 0) {
				if (FracturedRealityModVariables.MapVariables.get(world).Phase == 1) {
					if (threatLevel == 5) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
											.withSuppressedOutput(),
									("playsound fractured_reality:fr.threat.phase1.severe hostile " + entityiterator.getDisplayName().getString() + " ~ ~ ~ 100 1"));
					} else if (threatLevel == 4) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
											.withSuppressedOutput(),
									("playsound fractured_reality:fr.threat.phase1.major hostile " + entityiterator.getDisplayName().getString() + " ~ ~ ~ 100 1"));
					} else if (threatLevel == 3) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
											.withSuppressedOutput(),
									("playsound fractured_reality:fr.threat.phase1.moderate hostile " + entityiterator.getDisplayName().getString() + " ~ ~ ~ 100 1"));
					} else if (threatLevel == 2) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
											.withSuppressedOutput(),
									("playsound fractured_reality:fr.threat.phase1.minor hostile " + entityiterator.getDisplayName().getString() + " ~ ~ ~ 100 1"));
					} else if (threatLevel == 1) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
											.withSuppressedOutput(),
									("playsound fractured_reality:fr.threat.phase1.negligible hostile " + entityiterator.getDisplayName().getString() + " ~ ~ ~ 100 1"));
					}
				} else if (FracturedRealityModVariables.MapVariables.get(world).Phase == 2) {
					if (threatLevel == 5) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
											.withSuppressedOutput(),
									("playsound fractured_reality:fr.threat.phase2.severe hostile " + entityiterator.getDisplayName().getString() + " ~ ~ ~ 100 1"));
					} else if (threatLevel == 4) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
											.withSuppressedOutput(),
									("playsound fractured_reality:fr.threat.phase2.major hostile " + entityiterator.getDisplayName().getString() + " ~ ~ ~ 100 1"));
					} else if (threatLevel == 3) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
											.withSuppressedOutput(),
									("playsound fractured_reality:fr.threat.phase2.moderate hostile " + entityiterator.getDisplayName().getString() + " ~ ~ ~ 100 1"));
					} else if (threatLevel == 2) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
											.withSuppressedOutput(),
									("playsound fractured_reality:fr.threat.phase2.minor hostile " + entityiterator.getDisplayName().getString() + " ~ ~ ~ 100 1"));
					} else if (threatLevel == 1) {
						if (world instanceof ServerLevel _level)
							_level.getServer().getCommands().performPrefixedCommand(
									new CommandSourceStack(CommandSource.NULL, new Vec3((entityiterator.getX()), (entityiterator.getY()), (entityiterator.getZ())), Vec2.ZERO, _level, 4, "", Component.literal(""), _level.getServer(), null)
											.withSuppressedOutput(),
									("playsound fractured_reality:fr.threat.phase2.negligible hostile " + entityiterator.getDisplayName().getString() + " ~ ~ ~ 100 1"));
					}
				}
			}
			if (threatLevel == 0) {
				{
					FracturedRealityModVariables.PlayerVariables _vars = entityiterator.getData(FracturedRealityModVariables.PLAYER_VARIABLES);
					_vars.threatRepeatCooldown = 1;
					_vars.markSyncDirty();
				}
			}
			{
				FracturedRealityModVariables.PlayerVariables _vars = entityiterator.getData(FracturedRealityModVariables.PLAYER_VARIABLES);
				_vars.threatRepeatCooldown = entityiterator.getData(FracturedRealityModVariables.PLAYER_VARIABLES).threatRepeatCooldown == 0 ? 240 : entityiterator.getData(FracturedRealityModVariables.PLAYER_VARIABLES).threatRepeatCooldown - 1;
				_vars.markSyncDirty();
			}
		}
	}
}