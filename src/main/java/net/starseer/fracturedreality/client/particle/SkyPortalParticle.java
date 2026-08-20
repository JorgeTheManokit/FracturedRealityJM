package net.starseer.fracturedreality.client.particle;

import org.joml.Quaternionf;

import net.starseer.fracturedreality.procedures.AbyssPortalParticleOrientationProcedure;

import net.neoforged.api.distmarker.OnlyIn;
import net.neoforged.api.distmarker.Dist;

import net.minecraft.world.phys.Vec3;
import net.minecraft.core.particles.SimpleParticleType;
import net.minecraft.client.particle.TextureSheetParticle;
import net.minecraft.client.particle.SpriteSet;
import net.minecraft.client.particle.ParticleRenderType;
import net.minecraft.client.particle.ParticleProvider;
import net.minecraft.client.particle.Particle;
import net.minecraft.client.multiplayer.ClientLevel;
import net.minecraft.client.Camera;

import com.mojang.blaze3d.vertex.VertexConsumer;

@OnlyIn(Dist.CLIENT)
public class SkyPortalParticle extends TextureSheetParticle {
	public static SkyPortalParticleProvider provider(SpriteSet spriteSet) {
		return new SkyPortalParticleProvider(spriteSet);
	}

	public static class SkyPortalParticleProvider implements ParticleProvider<SimpleParticleType> {
		private final SpriteSet spriteSet;

		public SkyPortalParticleProvider(SpriteSet spriteSet) {
			this.spriteSet = spriteSet;
		}

		public Particle createParticle(SimpleParticleType typeIn, ClientLevel worldIn, double x, double y, double z, double xSpeed, double ySpeed, double zSpeed) {
			return new SkyPortalParticle(worldIn, x, y, z, xSpeed, ySpeed, zSpeed, this.spriteSet);
		}
	}

	private final SpriteSet spriteSet;

	protected SkyPortalParticle(ClientLevel world, double x, double y, double z, double vx, double vy, double vz, SpriteSet spriteSet) {
		super(world, x, y, z);
		this.spriteSet = spriteSet;
		this.setSize(0.2f, 0.2f);
		this.quadSize = 0.15f * 2f;
		this.lifetime = 36;
		this.gravity = 0f;
		this.hasPhysics = false;
		this.xd = vx * 0;
		this.yd = vy * 0;
		this.zd = vz * 0;
		this.setSpriteFromAge(spriteSet);
	}

	@Override
	public int getLightColor(float partialTick) {
		return 15728880;
	}

	@Override
	public ParticleRenderType getRenderType() {
		return ParticleRenderType.PARTICLE_SHEET_OPAQUE;
	}

	@Override
	public void render(VertexConsumer buffer, Camera camera, float partialTicks) {
		Vec3 vec = AbyssPortalParticleOrientationProcedure.execute();
		Quaternionf tilt = new Quaternionf().rotationXYZ((float) vec.x(), (float) vec.y(), (float) vec.z());
		this.renderRotatedQuad(buffer, camera, tilt, partialTicks);
		Quaternionf flippedTilt = new Quaternionf(tilt).mul(new Quaternionf().rotateY((float) Math.PI));
		this.renderRotatedQuad(buffer, camera, flippedTilt, partialTicks);
	}

	@Override
	public void tick() {
		super.tick();
		if (!this.removed) {
			this.setSprite(this.spriteSet.get((this.age / 4) % 9 + 1, 9));
		}
	}
}