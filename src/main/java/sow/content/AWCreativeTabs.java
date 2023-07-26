package sow.content;

import net.minecraft.world.item.CreativeModeTab;
import net.minecraft.world.item.ItemStack;
import sow.AW;

public class AWCreativeTabs {
	public static final CreativeModeTab TAB_SOW = new CreativeModeTab("sowtab") {
		@Override
		public ItemStack makeIcon() {
			return new ItemStack(AW.DAGGER_JALKAR.get());
		}
	};
}