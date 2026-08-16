package net.starseer.fracturedreality.configuration;

import net.neoforged.neoforge.common.ModConfigSpec;

public class FracturedRealityServerConfigConfiguration {
	public static final ModConfigSpec.Builder BUILDER = new ModConfigSpec.Builder();
	public static final ModConfigSpec SPEC;
	public static final ModConfigSpec.ConfigValue<Double> PREP_TIME;
	public static final ModConfigSpec.ConfigValue<Double> TIME_SCALE;
	public static final ModConfigSpec.ConfigValue<Boolean> VOID_GRIEFING;
	public static final ModConfigSpec.ConfigValue<Boolean> VSARMOR_RNG_BASED;
	static {
		BUILDER.push("main");
		PREP_TIME = BUILDER.comment("[Default: 10] Preparation time in days. Change this to a higher value to give the player(s) more time to prepare. This is also the number of days before anything unusual starts happening.")
				.define("preparationtime", (double) 10);
		TIME_SCALE = BUILDER.comment("[Default: 1] Change this to a higher number to have main events happen further apart and take longer.").define("timescale", (double) 1);
		VOID_GRIEFING = BUILDER.comment("Enables the moonbreaker breaking blocks.").define("do_griefing", true);
		VSARMOR_RNG_BASED = BUILDER.comment("If true, each Void Steel armor piece uses a 20% chance to negate damage dealt by void beings. If false, uses a 20% damage decrease.").define("userandomchancesfor_void_steel_armor", false);
		BUILDER.pop();

		SPEC = BUILDER.build();
	}

}