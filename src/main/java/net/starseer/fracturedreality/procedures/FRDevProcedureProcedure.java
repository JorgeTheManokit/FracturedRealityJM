package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;
import net.minecraft.network.chat.Component;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class FRDevProcedureProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments, Entity entity) {
		if (entity == null)
			return;
		if ((StringArgumentType.getString(arguments, "Command")).equals("help")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("List of commands for use in \"/fr_dev\":" + "\n" + "\n" + "\"help\" - lists available commands" + "\n" + "\"reset_shattered_variants\" - reset variants of Shattered mob" + "\n"
						+ "\"set_phase_1\" - sets the current phase to 1" + "\n" + "\"play_visual_hallucination\" - plays a visual hallucination" + "\n" + "\"play_audio_hallucination\" - plays a auditory hallucination" + "\n"
						+ "\"activate_gravity_flux\" - activates gravity fluctuations (once)" + "\n" + "\"set_phase_2\" - sets the current phase to 2")), false);
		} else if ((StringArgumentType.getString(arguments, "Command")).equals("reset_shattered_variants")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Resetted Shattered variants."), false);
			FracturedRealityModVariables.MapVariables.get(world).ShatteredClassicAlreadySpawned = false;
			FracturedRealityModVariables.MapVariables.get(world).ShatteredAlternateAlreadySpawned = false;
			FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((StringArgumentType.getString(arguments, "Command")).equals("set_phase_1")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Set the current phase to 1."), false);
			FracturedRealityModVariables.MapVariables.get(world).Phase = 1;
			FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((StringArgumentType.getString(arguments, "Command")).equals("set_phase_2")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Set the current phase to 2."), false);
			FracturedRealityModVariables.MapVariables.get(world).Phase = 2;
			FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((StringArgumentType.getString(arguments, "Command")).equals("set_phase_3")) {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal("Set the current phase to 3."), false);
			FracturedRealityModVariables.MapVariables.get(world).Phase = 3;
			FracturedRealityModVariables.MapVariables.get(world).markSyncDirty();
		} else if ((StringArgumentType.getString(arguments, "Command")).equals("play_visual_hallucination")) {
			DoRandomHalluVoiceProcedure.execute(entity);
		} else if ((StringArgumentType.getString(arguments, "Command")).equals("play_audio_hallucination")) {
			DoRandomHalluVisualProcedure.execute(world, entity);
		} else if ((StringArgumentType.getString(arguments, "Command")).equals("activate_gravity_flux")) {
			GravityFluxSetFluxDevProcedure.execute(world);
		} else {
			if (entity instanceof Player _player && !_player.level().isClientSide())
				_player.displayClientMessage(Component.literal(("Unknown command." + "\n" + "Use \"/fr_dev help\" to list available commands.")), false);
		}
	}
}