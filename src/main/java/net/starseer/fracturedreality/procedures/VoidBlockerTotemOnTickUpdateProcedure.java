package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.network.FracturedRealityModVariables;
import net.starseer.fracturedreality.init.FracturedRealityModParticleTypes;
import net.starseer.fracturedreality.init.FracturedRealityModBlocks;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.block.state.properties.IntegerProperty;
import net.minecraft.world.level.block.state.BlockState;
import net.minecraft.world.level.block.Blocks;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.level.Level;
import net.minecraft.world.entity.Entity;
import net.minecraft.tags.TagKey;
import net.minecraft.sounds.SoundSource;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.core.registries.Registries;
import net.minecraft.core.registries.BuiltInRegistries;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.core.BlockPos;

import java.util.Comparator;

public class VoidBlockerTotemOnTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z) {
		double effectSize = 0;
		if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.EMERALD_BLOCK) {
			{
				int _value = 3;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("power_level") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
			effectSize = 256;
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.DIAMOND_BLOCK) {
			{
				int _value = 2;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("power_level") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
			effectSize = 128;
		} else if ((world.getBlockState(BlockPos.containing(x, y + 1, z))).getBlock() == Blocks.IRON_BLOCK) {
			{
				int _value = 1;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("power_level") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
			effectSize = 64;
		} else {
			{
				int _value = 0;
				BlockPos _pos = BlockPos.containing(x, y, z);
				BlockState _bs = world.getBlockState(_pos);
				if (_bs.getBlock().getStateDefinition().getProperty("power_level") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
					world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
			}
			effectSize = 0;
		}
		if (FracturedRealityModVariables.MapVariables.get(world).Phase == 2) {
			if (!((world.getBlockState(BlockPos.containing(x, y - 1, z))).getBlock() == FracturedRealityModBlocks.VOID_GENERATOR.get())) {
				{
					int _value = 0;
					BlockPos _pos = BlockPos.containing(x, y, z);
					BlockState _bs = world.getBlockState(_pos);
					if (_bs.getBlock().getStateDefinition().getProperty("power_level") instanceof IntegerProperty _integerProp && _integerProp.getPossibleValues().contains(_value))
						world.setBlock(_pos, _bs.setValue(_integerProp, _value), 3);
				}
				effectSize = 0;
			}
		}
		{
			final Vec3 _center = new Vec3(x, y, z);
			for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(effectSize / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
				if (entityiterator.getType().is(TagKey.create(Registries.ENTITY_TYPE, ResourceLocation.parse("fractured_reality:voidbeings")))) {
					if (!entityiterator.level().isClientSide())
						entityiterator.discard();
					if (world instanceof ServerLevel _level)
						_level.sendParticles((SimpleParticleType) (FracturedRealityModParticleTypes.VOID_DRIP.get()), (entityiterator.getX()), (entityiterator.getY() + entityiterator.getBbHeight() / 2d), (entityiterator.getZ()), 512,
								(entityiterator.getBbWidth() / 8d + 0.125), (entityiterator.getBbHeight() / 8d + 0.125), (entityiterator.getBbWidth() / 8d + 0.125), 1);
					if (world instanceof Level _level) {
						if (!_level.isClientSide()) {
							_level.playSound(null, BlockPos.containing(entityiterator.getX(), entityiterator.getY() + entityiterator.getBbHeight() / 2d, entityiterator.getZ()),
									BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wither.break_block")), SoundSource.HOSTILE, 1, 1);
						} else {
							_level.playLocalSound((entityiterator.getX()), (entityiterator.getY() + entityiterator.getBbHeight() / 2d), (entityiterator.getZ()), BuiltInRegistries.SOUND_EVENT.get(ResourceLocation.parse("entity.wither.break_block")),
									SoundSource.HOSTILE, 1, 1, false);
						}
					}
				}
			}
		}
	}
}