package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.entity.StarseerEntity;
import net.starseer.fracturedreality.entity.StarArmEntity;

import net.minecraft.world.phys.Vec3;
import net.minecraft.world.phys.AABB;
import net.minecraft.world.level.LevelAccessor;
import net.minecraft.world.entity.Entity;
import net.minecraft.world.damagesource.DamageTypes;
import net.minecraft.world.damagesource.DamageSource;

import java.util.Comparator;

public class StarArmOnEntityTickUpdateProcedure {
	public static void execute(LevelAccessor world, double x, double y, double z, Entity entity) {
		if (entity == null)
			return;
		if ((entity instanceof StarArmEntity _datEntI ? _datEntI.getEntityData().get(StarArmEntity.DATA_EndMe) : 0) >= 20) {
			if (!entity.level().isClientSide())
				entity.discard();
		} else if ((entity instanceof StarArmEntity _datEntI ? _datEntI.getEntityData().get(StarArmEntity.DATA_EndMe) : 0) == 10) {
			{
				final Vec3 _center = new Vec3(x, (y + 1.5), z);
				for (Entity entityiterator : world.getEntitiesOfClass(Entity.class, new AABB(_center, _center).inflate(3 / 2d), e -> true).stream().sorted(Comparator.comparingDouble(_entcnd -> _entcnd.distanceToSqr(_center))).toList()) {
					if (!(entityiterator instanceof StarArmEntity)) {
						entityiterator.hurt(new DamageSource(world.holderOrThrow(DamageTypes.GENERIC), (findEntityInWorldRange(world, StarseerEntity.class, x, y, z, 96))), 5);
					}
				}
			}
		}
		if (entity instanceof StarArmEntity _datEntSetI)
			_datEntSetI.getEntityData().set(StarArmEntity.DATA_EndMe, (int) ((entity instanceof StarArmEntity _datEntI ? _datEntI.getEntityData().get(StarArmEntity.DATA_EndMe) : 0) + 1));
	}

	private static Entity findEntityInWorldRange(LevelAccessor world, Class<? extends Entity> clazz, double x, double y, double z, double range) {
		return (Entity) world.getEntitiesOfClass(clazz, AABB.ofSize(new Vec3(x, y, z), range, range, range), e -> true).stream().sorted(Comparator.comparingDouble(e -> e.distanceToSqr(x, y, z))).findFirst().orElse(null);
	}
}