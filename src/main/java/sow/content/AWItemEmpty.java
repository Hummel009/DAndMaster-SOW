package sow.content;

import net.minecraft.world.item.Item;

public class AWItemEmpty extends Item {
	public AWItemEmpty() {
		super(new Properties().stacksTo(1).tab(AWCreativeTabs.TAB_SOW));
	}
}