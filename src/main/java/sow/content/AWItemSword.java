package sow.content;

import net.minecraft.world.item.SwordItem;
import net.minecraft.world.item.Tiers;

public class AWItemSword extends SwordItem {
	public AWItemSword() {
		super(Tiers.DIAMOND, 3, -2.4F, new Properties().tab(AWCreativeTabs.TAB_SOW));
	}
}