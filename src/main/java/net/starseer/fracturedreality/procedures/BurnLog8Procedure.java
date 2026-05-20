package net.starseer.fracturedreality.procedures;

import net.starseer.fracturedreality.init.FracturedRealityModMenus;
import net.starseer.fracturedreality.init.FracturedRealityModItems;

import net.minecraft.world.item.ItemStack;
import net.minecraft.world.entity.player.Player;
import net.minecraft.world.entity.Entity;

public class BurnLog8Procedure {
	public static void execute(Entity entity) {
		if (entity == null)
			return;
		if ((getAmountInGUISlot(entity, 0) != 0) == (getAmountInGUISlot(entity, 1) == 0)) {
			if (entity instanceof Player _player && _player.containerMenu instanceof FracturedRealityModMenus.MenuAccessor _menu) {
				_menu.getSlots().get(0).set(ItemStack.EMPTY);
				ItemStack _setstack3 = new ItemStack(FracturedRealityModItems.DISK_2374.get()).copy();
				_setstack3.setCount(1);
				_menu.getSlots().get(1).set(_setstack3);
				_player.containerMenu.broadcastChanges();
			}
		}
	}

	private static int getAmountInGUISlot(Entity entity, int sltid) {
		if (entity instanceof Player player && player.containerMenu instanceof FracturedRealityModMenus.MenuAccessor menuAccessor) {
			ItemStack stack = menuAccessor.getSlots().get(sltid).getItem();
			if (stack != null)
				return stack.getCount();
		}
		return 0;
	}
}