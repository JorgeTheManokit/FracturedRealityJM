package net.starseer.fracturedreality.procedures;

import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.commands.arguments.EntityArgument;
import net.minecraft.commands.CommandSourceStack;

import com.mojang.brigadier.exceptions.CommandSyntaxException;
import com.mojang.brigadier.context.CommandContext;
import com.mojang.brigadier.arguments.StringArgumentType;

public class RunDevCommandProcedure {
	public static void execute(LevelAccessor world, CommandContext<CommandSourceStack> arguments) {
		double randX = 0;
		double randZ = 0;
		if (((StringArgumentType.getString(arguments, "Type")).toLowerCase()).equals("auditory_hallucination")) {
			DoRandomHalluVisualProcedure.execute(world, commandParameterEntity(arguments, "Entity"));
		} else if (((StringArgumentType.getString(arguments, "Type")).toLowerCase()).equals("visual_hallucination")) {
			DoRandomHalluVoiceProcedure.execute(commandParameterEntity(arguments, "Entity"));
		}
	}

	private static Entity commandParameterEntity(CommandContext<CommandSourceStack> arguments, String parameter) {
		try {
			return EntityArgument.getEntity(arguments, parameter);
		} catch (CommandSyntaxException e) {
			e.printStackTrace();
			return null;
		}
	}
}