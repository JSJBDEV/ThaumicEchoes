package uk.co.conclipsegames.thec.Items;

import net.minecraft.inventory.EntityEquipmentSlot;
import uk.co.conclipsegames.thec.Armour.ItemArmour;
import uk.co.conclipsegames.thec.thec;

import static uk.co.conclipsegames.thec.thec.ichoriumToolMaterial;

/**
 * Created by James on 06/08/2017.
 */
public class ModItems {
	public static ItemBase ichor = new ItemBase("ichor");
	public static ItemBase ichorium = new ItemBase("ichorium");
	public static ItemSword ichorSword = new ItemSword(ichoriumToolMaterial, "ichor_sword");
	public static ItemPickaxe ichorPickaxe = new ItemPickaxe(ichoriumToolMaterial, "ichor_pickaxe");
	public static ItemAxe ichorAxe = new ItemAxe(ichoriumToolMaterial, "ichor_axe");
	public static ItemShovel ichorShovel = new ItemShovel(ichoriumToolMaterial, "ichor_shovel");

	public static ItemBlackHoleCharm bhc = new ItemBlackHoleCharm("item_bhc");
	public static ItemBase ultraDenseGem = new ItemBase("ultradensegem");
	public static ItemBase capIchor = new ItemBase("ichor_cap");

	public static ItemBase ichorcloth = new ItemBase("ichor_cloth");
	public static ItemBase rodIchor = new ItemBase("ichor_rod");

	public static ItemSceptre sceptreDislocation = new ItemSceptre("sceptre_d");
	public static ItemSceptre sceptreUprising = new ItemSceptre("sceptre_u");
	public static ItemSceptre sceptreFreezing = new ItemSceptre("sceptre_f");
	public static ItemSceptre sceptreHellfire = new ItemSceptre("sceptre_h");

	public static ItemArmour ichorhelmet = new ItemArmour(thec.ichorclothArmorMaterial, EntityEquipmentSlot.HEAD, "ichor_helmet");
	public static ItemArmour ichorchest = new ItemArmour(thec.ichorclothArmorMaterial, EntityEquipmentSlot.CHEST, "ichor_chest");
	public static ItemArmour ichorleggings = new ItemArmour(thec.ichorclothArmorMaterial, EntityEquipmentSlot.LEGS, "ichor_leggings");
	public static ItemArmour ichorboots = new ItemArmour(thec.ichorclothArmorMaterial, EntityEquipmentSlot.FEET, "ichor_boots");

	public static ItemXPCharm xpcharm = new ItemXPCharm("xpcharm");
	public static ItemDeathTag deathTag = new ItemDeathTag("death_tag");
	//public static ItemRecord eastRecord = new ItemRecord("east_record", new SoundEvent(new ResourceLocation(modId+":sound/8bit")));
}