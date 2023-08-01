package sow.content;

import net.minecraft.world.entity.Entity;
import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.ArmorItem;
import net.minecraft.world.item.ArmorMaterial;
import net.minecraft.world.item.ItemStack;

public class AWItemArmor extends ArmorItem {
	private final String materialName;

	public AWItemArmor(ArmorMaterial material, EquipmentSlot slot) {
		super(material, slot, new Properties().tab(AWCreativeTabs.TAB_SOW));
		materialName = material.getName();
	}

	@Override
	public String getArmorTexture(ItemStack itemstack, Entity entity, EquipmentSlot slot, String layer) {
		if (slot == EquipmentSlot.LEGS) {
			return "sow:armor/armor_" + materialName + "_2.png";
		}
		return "sow:armor/armor_" + materialName + "_1.png";
	}
}