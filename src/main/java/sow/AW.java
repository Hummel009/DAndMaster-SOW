package sow;

import net.minecraft.world.entity.EquipmentSlot;
import net.minecraft.world.item.Item;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.DistExecutor;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;
import net.minecraftforge.registries.RegistryObject;
import sow.content.AWCreativeTabs;
import sow.content.AWItemArmor;
import sow.content.AWItemSword;
import sow.content.AWMaterial;
import sow.proxy.AWClientProxy;
import sow.proxy.AWCommonProxy;

import java.util.ArrayList;
import java.util.List;

@Mod("sow")
public class AW {
	public static final String DISABLE_CURSEFORGE_DUPLICATE_NOTICE = "213313062023";

	public static final AWCommonProxy PROXY = DistExecutor.safeRunForDist(() -> AWClientProxy::new, () -> AWCommonProxy::new);

	public static final List<Item> CONTENT = new ArrayList<>();

	public static final DeferredRegister<Item> ITEMS = DeferredRegister.create(ForgeRegistries.ITEMS, "sow");

	public static final RegistryObject<Item> CROWN_ENDER = ITEMS.register("crown_ender", () -> new AWItemArmor(AWMaterial.ENDERCROWN, EquipmentSlot.HEAD));
	public static final RegistryObject<Item> CROWN_NETHER = ITEMS.register("crown_nether", () -> new AWItemArmor(AWMaterial.NETHERCROWN, EquipmentSlot.HEAD));
	public static final RegistryObject<Item> ENDER_HELMET = ITEMS.register("ender_helmet", () -> new AWItemArmor(AWMaterial.ENDER, EquipmentSlot.HEAD));
	public static final RegistryObject<Item> ENDER_CHESTPLATE = ITEMS.register("ender_chestplate", () -> new AWItemArmor(AWMaterial.ENDER, EquipmentSlot.CHEST));
	public static final RegistryObject<Item> ENDER_LEGGINGS = ITEMS.register("ender_leggings", () -> new AWItemArmor(AWMaterial.ENDER, EquipmentSlot.LEGS));
	public static final RegistryObject<Item> ENDER_BOOTS = ITEMS.register("ender_boots", () -> new AWItemArmor(AWMaterial.ENDER, EquipmentSlot.FEET));
	public static final RegistryObject<Item> CROWNPEAK_HELMET = ITEMS.register("crownpeak_helmet", () -> new AWItemArmor(AWMaterial.CROWNPEAK, EquipmentSlot.HEAD));
	public static final RegistryObject<Item> CROWNPEAK_CHESTPLATE = ITEMS.register("crownpeak_chestplate", () -> new AWItemArmor(AWMaterial.CROWNPEAK, EquipmentSlot.CHEST));
	public static final RegistryObject<Item> CROWNPEAK_LEGGINGS = ITEMS.register("crownpeak_leggings", () -> new AWItemArmor(AWMaterial.CROWNPEAK, EquipmentSlot.LEGS));
	public static final RegistryObject<Item> CROWNPEAK_BOOTS = ITEMS.register("crownpeak_boots", () -> new AWItemArmor(AWMaterial.CROWNPEAK, EquipmentSlot.FEET));
	public static final RegistryObject<Item> CONCHORD_HELMET = ITEMS.register("conchord_helmet", () -> new AWItemArmor(AWMaterial.CONCHORD, EquipmentSlot.HEAD));
	public static final RegistryObject<Item> CONCHORD_CHESTPLATE = ITEMS.register("conchord_chestplate", () -> new AWItemArmor(AWMaterial.CONCHORD, EquipmentSlot.CHEST));
	public static final RegistryObject<Item> CONCHORD_LEGGINGS = ITEMS.register("conchord_leggings", () -> new AWItemArmor(AWMaterial.CONCHORD, EquipmentSlot.LEGS));
	public static final RegistryObject<Item> CONCHORD_BOOTS = ITEMS.register("conchord_boots", () -> new AWItemArmor(AWMaterial.CONCHORD, EquipmentSlot.FEET));
	public static final RegistryObject<Item> CYDONIA_HELMET = ITEMS.register("cydonia_helmet", () -> new AWItemArmor(AWMaterial.CYDONIA, EquipmentSlot.HEAD));
	public static final RegistryObject<Item> CYDONIA_CHESTPLATE = ITEMS.register("cydonia_chestplate", () -> new AWItemArmor(AWMaterial.CYDONIA, EquipmentSlot.CHEST));
	public static final RegistryObject<Item> CYDONIA_LEGGINGS = ITEMS.register("cydonia_leggings", () -> new AWItemArmor(AWMaterial.CYDONIA, EquipmentSlot.LEGS));
	public static final RegistryObject<Item> CYDONIA_BOOTS = ITEMS.register("cydonia_boots", () -> new AWItemArmor(AWMaterial.CYDONIA, EquipmentSlot.FEET));
	public static final RegistryObject<Item> ETHEREA_HELMET = ITEMS.register("etherea_helmet", () -> new AWItemArmor(AWMaterial.ETHEREA, EquipmentSlot.HEAD));
	public static final RegistryObject<Item> ETHEREA_CHESTPLATE = ITEMS.register("etherea_chestplate", () -> new AWItemArmor(AWMaterial.ETHEREA, EquipmentSlot.CHEST));
	public static final RegistryObject<Item> ETHEREA_LEGGINGS = ITEMS.register("etherea_leggings", () -> new AWItemArmor(AWMaterial.ETHEREA, EquipmentSlot.LEGS));
	public static final RegistryObject<Item> ETHEREA_BOOTS = ITEMS.register("etherea_boots", () -> new AWItemArmor(AWMaterial.ETHEREA, EquipmentSlot.FEET));
	public static final RegistryObject<Item> FELDEN_CHESTPLATE = ITEMS.register("felden_chestplate", () -> new AWItemArmor(AWMaterial.FELDEN, EquipmentSlot.CHEST));
	public static final RegistryObject<Item> FELDEN_LEGGINGS = ITEMS.register("felden_leggings", () -> new AWItemArmor(AWMaterial.FELDEN, EquipmentSlot.LEGS));
	public static final RegistryObject<Item> FELDEN_BOOTS = ITEMS.register("felden_boots", () -> new AWItemArmor(AWMaterial.FELDEN, EquipmentSlot.FEET));
	public static final RegistryObject<Item> HYDRAPHEL_HELMET = ITEMS.register("hydraphel_helmet", () -> new AWItemArmor(AWMaterial.HYDRAPHEL, EquipmentSlot.HEAD));
	public static final RegistryObject<Item> HYDRAPHEL_CHESTPLATE = ITEMS.register("hydraphel_chestplate", () -> new AWItemArmor(AWMaterial.HYDRAPHEL, EquipmentSlot.CHEST));
	public static final RegistryObject<Item> HYDRAPHEL_LEGGINGS = ITEMS.register("hydraphel_leggings", () -> new AWItemArmor(AWMaterial.HYDRAPHEL, EquipmentSlot.LEGS));
	public static final RegistryObject<Item> HYDRAPHEL_BOOTS = ITEMS.register("hydraphel_boots", () -> new AWItemArmor(AWMaterial.HYDRAPHEL, EquipmentSlot.FEET));
	public static final RegistryObject<Item> KARTHEN_CHESTPLATE = ITEMS.register("karthen_chestplate", () -> new AWItemArmor(AWMaterial.KARTHEN, EquipmentSlot.CHEST));
	public static final RegistryObject<Item> KARTHEN_LEGGINGS = ITEMS.register("karthen_leggings", () -> new AWItemArmor(AWMaterial.KARTHEN, EquipmentSlot.LEGS));
	public static final RegistryObject<Item> KARTHEN_BOOTS = ITEMS.register("karthen_boots", () -> new AWItemArmor(AWMaterial.KARTHEN, EquipmentSlot.FEET));
	public static final RegistryObject<Item> NORTHWIND_HELMET = ITEMS.register("northwind_helmet", () -> new AWItemArmor(AWMaterial.NORTHWIND, EquipmentSlot.HEAD));
	public static final RegistryObject<Item> NORTHWIND_CHESTPLATE = ITEMS.register("northwind_chestplate", () -> new AWItemArmor(AWMaterial.NORTHWIND, EquipmentSlot.CHEST));
	public static final RegistryObject<Item> NORTHWIND_LEGGINGS = ITEMS.register("northwind_leggings", () -> new AWItemArmor(AWMaterial.NORTHWIND, EquipmentSlot.LEGS));
	public static final RegistryObject<Item> NORTHWIND_BOOTS = ITEMS.register("northwind_boots", () -> new AWItemArmor(AWMaterial.NORTHWIND, EquipmentSlot.FEET));
	public static final RegistryObject<Item> NECROMANCER_HELMET = ITEMS.register("necromancer_helmet", () -> new AWItemArmor(AWMaterial.NECROMANCER, EquipmentSlot.HEAD));
	public static final RegistryObject<Item> NECROMANCER_CHESTPLATE = ITEMS.register("necromancer_chestplate", () -> new AWItemArmor(AWMaterial.NECROMANCER, EquipmentSlot.CHEST));
	public static final RegistryObject<Item> NECROMANCER_LEGGINGS = ITEMS.register("necromancer_leggings", () -> new AWItemArmor(AWMaterial.NECROMANCER, EquipmentSlot.LEGS));
	public static final RegistryObject<Item> NECROMANCER_BOOTS = ITEMS.register("necromancer_boots", () -> new AWItemArmor(AWMaterial.NECROMANCER, EquipmentSlot.FEET));
	public static final RegistryObject<Item> LEGION_HELMET = ITEMS.register("legion_helmet", () -> new AWItemArmor(AWMaterial.LEGION, EquipmentSlot.HEAD));
	public static final RegistryObject<Item> LEGION_CHESTPLATE = ITEMS.register("legion_chestplate", () -> new AWItemArmor(AWMaterial.LEGION, EquipmentSlot.CHEST));
	public static final RegistryObject<Item> LEGION_LEGGINGS = ITEMS.register("legion_leggings", () -> new AWItemArmor(AWMaterial.LEGION, EquipmentSlot.LEGS));
	public static final RegistryObject<Item> LEGION_BOOTS = ITEMS.register("legion_boots", () -> new AWItemArmor(AWMaterial.LEGION, EquipmentSlot.FEET));

	public static final RegistryObject<Item> ENDERBLADE = ITEMS.register("enderblade", AWItemSword::new);
	public static final RegistryObject<Item> NETHERBLADE = ITEMS.register("netherblade", AWItemSword::new);
	public static final RegistryObject<Item> ARMBLADE = ITEMS.register("armblade", AWItemSword::new);
	public static final RegistryObject<Item> BATTLEAXE_DIAMOND = ITEMS.register("battleaxe_diamond", AWItemSword::new);
	public static final RegistryObject<Item> BATTLEAXE_IRON = ITEMS.register("battleaxe_iron", AWItemSword::new);
	public static final RegistryObject<Item> BATTLEAXE_SAXON = ITEMS.register("battleaxe_saxon", AWItemSword::new);
	public static final RegistryObject<Item> BATTLESTAFF_0 = ITEMS.register("battlestaff_0", AWItemSword::new);
	public static final RegistryObject<Item> BATTLESTAFF_1 = ITEMS.register("battlestaff_1", AWItemSword::new);
	public static final RegistryObject<Item> BATTLESTAFF_2 = ITEMS.register("battlestaff_2", AWItemSword::new);
	public static final RegistryObject<Item> BATTLESTAFF_3 = ITEMS.register("battlestaff_3", AWItemSword::new);
	public static final RegistryObject<Item> BATTLESTAFF_4 = ITEMS.register("battlestaff_4", AWItemSword::new);
	public static final RegistryObject<Item> BATTLESTAFF_5 = ITEMS.register("battlestaff_5", AWItemSword::new);
	public static final RegistryObject<Item> BATTLESTAFF_6 = ITEMS.register("battlestaff_6", AWItemSword::new);
	public static final RegistryObject<Item> BATTLESTAFF_7 = ITEMS.register("battlestaff_7", AWItemSword::new);
	public static final RegistryObject<Item> BATTLESTAFF_8 = ITEMS.register("battlestaff_8", AWItemSword::new);
	public static final RegistryObject<Item> BATTLESTAFF_9 = ITEMS.register("battlestaff_9", AWItemSword::new);
	public static final RegistryObject<Item> BATTLESTAFF_10 = ITEMS.register("battlestaff_10", AWItemSword::new);
	public static final RegistryObject<Item> BLADE_DIAMOND = ITEMS.register("blade_diamond", AWItemSword::new);
	public static final RegistryObject<Item> BLADE_IRON = ITEMS.register("blade_iron", AWItemSword::new);
	public static final RegistryObject<Item> BLADESTAFF_DIAMOND = ITEMS.register("bladestaff_diamond", AWItemSword::new);
	public static final RegistryObject<Item> BLADESTAFF_IRON = ITEMS.register("bladestaff_iron", AWItemSword::new);
	public static final RegistryObject<Item> BLAZER = ITEMS.register("blazer", AWItemSword::new);
	public static final RegistryObject<Item> BLAZERSPEAR_DIAMOND = ITEMS.register("blazerspear_diamond", AWItemSword::new);
	public static final RegistryObject<Item> BLAZERSPEAR_IRON = ITEMS.register("blazerspear_iron", AWItemSword::new);
	public static final RegistryObject<Item> CLAW = ITEMS.register("claw", AWItemSword::new);
	public static final RegistryObject<Item> DAGGER_DIAMOND = ITEMS.register("dagger_diamond", AWItemSword::new);
	public static final RegistryObject<Item> DAGGER_IRON = ITEMS.register("dagger_iron", AWItemSword::new);
	public static final RegistryObject<Item> DAGGER_STONE = ITEMS.register("dagger_stone", AWItemSword::new);
	public static final RegistryObject<Item> DAGGER_JALKAR = ITEMS.register("dagger_jalkar", AWItemSword::new);
	public static final RegistryObject<Item> GREATSWORD_DIAMOND = ITEMS.register("greatsword_diamond", AWItemSword::new);
	public static final RegistryObject<Item> GREATSWORD_IRON = ITEMS.register("greatsword_iron", AWItemSword::new);
	public static final RegistryObject<Item> GREATSWORD_IRON_1 = ITEMS.register("greatsword_iron_1", AWItemSword::new);
	public static final RegistryObject<Item> GREATSWORD_IRON_2 = ITEMS.register("greatsword_iron_2", AWItemSword::new);
	public static final RegistryObject<Item> GREATAXE_IRON = ITEMS.register("greataxe_iron", AWItemSword::new);
	public static final RegistryObject<Item> HALBERD_PYTHUS = ITEMS.register("halberd_pythus", AWItemSword::new);
	public static final RegistryObject<Item> HALBERD_DIAMOND = ITEMS.register("halberd_diamond", AWItemSword::new);
	public static final RegistryObject<Item> HALBERD_DIAMOND_2 = ITEMS.register("halberd_diamond_2", AWItemSword::new);
	public static final RegistryObject<Item> HALBERD_DIAMOND_DOUBLE = ITEMS.register("halberd_diamond_double", AWItemSword::new);
	public static final RegistryObject<Item> HALBERD_IRON = ITEMS.register("halberd_iron", AWItemSword::new);
	public static final RegistryObject<Item> HALBERD_IRON_2 = ITEMS.register("halberd_iron_2", AWItemSword::new);
	public static final RegistryObject<Item> HALBERD_IRON_DOUBLE = ITEMS.register("halberd_iron_double", AWItemSword::new);
	public static final RegistryObject<Item> HALBERD_STONE = ITEMS.register("halberd_stone", AWItemSword::new);
	public static final RegistryObject<Item> HAMMER_DIAMOND = ITEMS.register("hammer_diamond", AWItemSword::new);
	public static final RegistryObject<Item> HAMMER_IRON = ITEMS.register("hammer_iron", AWItemSword::new);
	public static final RegistryObject<Item> HATCHET_DIAMOND = ITEMS.register("hatchet_diamond", AWItemSword::new);
	public static final RegistryObject<Item> HATCHET_IRON = ITEMS.register("hatchet_iron", AWItemSword::new);
	public static final RegistryObject<Item> HATCHET_DIAMOND_2 = ITEMS.register("hatchet_diamond_2", AWItemSword::new);
	public static final RegistryObject<Item> HATCHET_IRON_2 = ITEMS.register("hatchet_iron_2", AWItemSword::new);
	public static final RegistryObject<Item> KATANA_DIAMOND = ITEMS.register("katana_diamond", AWItemSword::new);
	public static final RegistryObject<Item> KATANA_IRON = ITEMS.register("katana_iron", AWItemSword::new);
	public static final RegistryObject<Item> KNIFE_STONE = ITEMS.register("knife_stone", AWItemSword::new);
	public static final RegistryObject<Item> LONGSWORD_THALLEOUS = ITEMS.register("longsword_thalleous", AWItemSword::new);
	public static final RegistryObject<Item> LONGSWORD_DEATHSINGER = ITEMS.register("longsword_deathsinger", AWItemSword::new);
	public static final RegistryObject<Item> LONGSWORD_VULCANNUS = ITEMS.register("longsword_vulcannus", AWItemSword::new);
	public static final RegistryObject<Item> LONGSWORD_DIAMOND = ITEMS.register("longsword_diamond", AWItemSword::new);
	public static final RegistryObject<Item> LONGSWORD_IRON = ITEMS.register("longsword_iron", AWItemSword::new);
	public static final RegistryObject<Item> MACE_IRON = ITEMS.register("mace_iron", AWItemSword::new);
	public static final RegistryObject<Item> SPIKEMACE_DIAMOND = ITEMS.register("spikemace_diamond", AWItemSword::new);
	public static final RegistryObject<Item> SPIKEMACE_IRON = ITEMS.register("spikemace_iron", AWItemSword::new);
	public static final RegistryObject<Item> SPIKEMACE_STONE = ITEMS.register("spikemace_stone", AWItemSword::new);
	public static final RegistryObject<Item> MAROON = ITEMS.register("maroon", AWItemSword::new);
	public static final RegistryObject<Item> RAPIER = ITEMS.register("rapier", AWItemSword::new);
	public static final RegistryObject<Item> SCYTHE_DIAMOND = ITEMS.register("scythe_diamond", AWItemSword::new);
	public static final RegistryObject<Item> SCYTHE_IRON = ITEMS.register("scythe_iron", AWItemSword::new);
	public static final RegistryObject<Item> SICKLE_IRON = ITEMS.register("sickle_iron", AWItemSword::new);
	public static final RegistryObject<Item> SOULSEEKER = ITEMS.register("soulseeker", AWItemSword::new);
	public static final RegistryObject<Item> SOULSEEKER_DOUBLE = ITEMS.register("soulseeker_double", AWItemSword::new);
	public static final RegistryObject<Item> SPEAR_ARDONI = ITEMS.register("spear_ardoni", AWItemSword::new);
	public static final RegistryObject<Item> SPEAR_BLADE = ITEMS.register("spear_blade", AWItemSword::new);
	public static final RegistryObject<Item> SPEAR_RIA = ITEMS.register("spear_ria", AWItemSword::new);
	public static final RegistryObject<Item> SPEAR_XARIA = ITEMS.register("spear_xaria", AWItemSword::new);
	public static final RegistryObject<Item> SPEAR_DIAMOND = ITEMS.register("spear_diamond", AWItemSword::new);
	public static final RegistryObject<Item> SPEAR_IRON = ITEMS.register("spear_iron", AWItemSword::new);
	public static final RegistryObject<Item> SPEAR_DIAMOND_2 = ITEMS.register("spear_diamond_2", AWItemSword::new);
	public static final RegistryObject<Item> SPEAR_IRON_2 = ITEMS.register("spear_iron_2", AWItemSword::new);
	public static final RegistryObject<Item> SPEARHEAVY_DIAMOND = ITEMS.register("spearheavy_diamond", AWItemSword::new);
	public static final RegistryObject<Item> SPEARHEAVY_IRON = ITEMS.register("spearheavy_iron", AWItemSword::new);
	public static final RegistryObject<Item> STAFF_TIDESINGER = ITEMS.register("staff_tidesinger", AWItemSword::new);
	public static final RegistryObject<Item> STAFF_KALTARIS = ITEMS.register("staff_kaltaris", AWItemSword::new);
	public static final RegistryObject<Item> STAFF_MENDORIS = ITEMS.register("staff_mendoris", AWItemSword::new);
	public static final RegistryObject<Item> STAFF_NESTORIS = ITEMS.register("staff_nestoris", AWItemSword::new);
	public static final RegistryObject<Item> STAFF_SENDARIS = ITEMS.register("staff_sendaris", AWItemSword::new);
	public static final RegistryObject<Item> STAFF_VOLTARIS = ITEMS.register("staff_voltaris", AWItemSword::new);
	public static final RegistryObject<Item> STAFF_VOLTAR = ITEMS.register("staff_voltar", AWItemSword::new);
	public static final RegistryObject<Item> STAFFARDONI_DIAMOND = ITEMS.register("staffardoni_diamond", AWItemSword::new);
	public static final RegistryObject<Item> STAFFARDONI_IRON = ITEMS.register("staffardoni_iron", AWItemSword::new);
	public static final RegistryObject<Item> STAFFHONOR_DIAMOND = ITEMS.register("staffhonor_diamond", AWItemSword::new);
	public static final RegistryObject<Item> STAFFHONOR_IRON = ITEMS.register("staffhonor_iron", AWItemSword::new);
	public static final RegistryObject<Item> STAFFHONOR_GOLD = ITEMS.register("staffhonor_gold", AWItemSword::new);
	public static final RegistryObject<Item> SWORD_ALLISTER = ITEMS.register("sword_allister", AWItemSword::new);
	public static final RegistryObject<Item> SWORD_DENNY = ITEMS.register("sword_denny", AWItemSword::new);
	public static final RegistryObject<Item> SWORD_SENN = ITEMS.register("sword_senn", AWItemSword::new);
	public static final RegistryObject<Item> SWORD_SENN_1 = ITEMS.register("sword_senn_1", AWItemSword::new);
	public static final RegistryObject<Item> SWORD_TYGREN = ITEMS.register("sword_tygren", AWItemSword::new);
	public static final RegistryObject<Item> SWORD_SKORCH = ITEMS.register("sword_skorch", AWItemSword::new);
	public static final RegistryObject<Item> SWORD_HEROBRINE = ITEMS.register("sword_herobrine", AWItemSword::new);
	public static final RegistryObject<Item> SWORD_HERO_DIAMOND = ITEMS.register("sword_hero_diamond", AWItemSword::new);
	public static final RegistryObject<Item> SWORD_HERO_IRON = ITEMS.register("sword_hero_iron", AWItemSword::new);
	public static final RegistryObject<Item> SWORD_IRON_1 = ITEMS.register("sword_iron_1", AWItemSword::new);
	public static final RegistryObject<Item> SWORD_IRON_2 = ITEMS.register("sword_iron_2", AWItemSword::new);
	public static final RegistryObject<Item> SWORD_IRON_3 = ITEMS.register("sword_iron_3", AWItemSword::new);
	public static final RegistryObject<Item> SWORD_SPIKED_DIAMOND = ITEMS.register("sword_spiked_diamond", AWItemSword::new);
	public static final RegistryObject<Item> SWORD_SPIKED_IRON = ITEMS.register("sword_spiked_iron", AWItemSword::new);
	public static final RegistryObject<Item> THIN_DIAMOND = ITEMS.register("thin_diamond", AWItemSword::new);
	public static final RegistryObject<Item> THIN_IRON = ITEMS.register("thin_iron", AWItemSword::new);
	public static final RegistryObject<Item> XARIAXE_DIAMOND = ITEMS.register("xariaxe_diamond", AWItemSword::new);
	public static final RegistryObject<Item> XARIAXE_IRON = ITEMS.register("xariaxe_iron", AWItemSword::new);
	public static final RegistryObject<Item> ZERUHALBERD_DIAMOND = ITEMS.register("zeruhalberd_diamond", AWItemSword::new);
	public static final RegistryObject<Item> ZERUHALBERD_IRON = ITEMS.register("zeruhalberd_iron", AWItemSword::new);
	public static final RegistryObject<Item> ZERUSPEAR_DIAMOND = ITEMS.register("zeruspear_diamond", AWItemSword::new);
	public static final RegistryObject<Item> ZERUSPEAR_IRON = ITEMS.register("zeruspear_iron", AWItemSword::new);
	public static final RegistryObject<Item> ZERUSWORD_DIAMOND = ITEMS.register("zerusword_diamond", AWItemSword::new);
	public static final RegistryObject<Item> ZERUSWORD_IRON = ITEMS.register("zerusword_iron", AWItemSword::new);

	public AW() {
		IEventBus fmlBus = FMLJavaModLoadingContext.get().getModEventBus();
		fmlBus.register(PROXY);
		ITEMS.register(fmlBus);
	}
}