package uk.co.conclipsegames.thec.Items;

import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import uk.co.conclipsegames.thec.Armour.ItemArmour;
import uk.co.conclipsegames.thec.thec;

import static uk.co.conclipsegames.thec.thec.ichoriumToolMaterial;

/**
 * Created by James on 06/08/2017.
 */
public class ModItems {

        public static ItemBase ichor;
        public static ItemBase ichorium;
        public static ItemSword ichorSword;
        public static ItemPickaxe ichorPickaxe;
        public static ItemAxe ichorAxe;
        public static ItemShovel ichorShovel;
        public static ItemBlackHoleCharm bhc;
        public static ItemBase ultraDenseGem;
        public static ItemBase capIchor;
        public static ItemBase ichorcloth;
        public static ItemBase rodIchor;
        public static ItemSceptre sceptreDislocation;
        public static ItemSceptre sceptreUprising;
        public static ItemSceptre sceptreFreezing;
        public static ItemArmour ichorhelmet;
        public static ItemArmour ichorchest;
        public static ItemArmour ichorleggings;
        public static ItemArmour ichorboots;
        public static ItemXPCharm xpcharm;


        public static void init() {
            ichor = register(new ItemBase("ichor").setCreativeTab(thec.creativeTab));
            ichorium = register(new ItemBase("ichorium").setCreativeTab(thec.creativeTab));
            ichorSword = register(new ItemSword(ichoriumToolMaterial,"ichor_sword").setCreativeTab(thec.creativeTab));
            ichorAxe = register(new ItemAxe(ichoriumToolMaterial,"ichor_axe").setCreativeTab(thec.creativeTab));
            ichorPickaxe = register(new ItemPickaxe(ichoriumToolMaterial,"ichor_pickaxe").setCreativeTab(thec.creativeTab));
            ichorShovel = register(new ItemShovel(ichoriumToolMaterial,"ichor_shovel").setCreativeTab(thec.creativeTab));

            bhc = register(new ItemBlackHoleCharm("item_bhc").setCreativeTab(thec.creativeTab));
            ultraDenseGem = register(new ItemBase("ultradensegem").setCreativeTab(thec.creativeTab));

            xpcharm = register(new ItemXPCharm("xpcharm").setCreativeTab(thec.creativeTab));

            capIchor = register(new ItemBase("ichor_cap").setCreativeTab(thec.creativeTab));
            ichorcloth = register(new ItemBase("ichor_cloth").setCreativeTab(thec.creativeTab));
            rodIchor = register(new ItemBase("ichor_rod").setCreativeTab(thec.creativeTab));

            sceptreDislocation = register(new ItemSceptre("sceptre_d").setCreativeTab(thec.creativeTab));
            sceptreUprising = register(new ItemSceptre("sceptre_u").setCreativeTab(thec.creativeTab));
            sceptreFreezing = register(new ItemSceptre("sceptre_f").setCreativeTab(thec.creativeTab));

            ichorhelmet = register(new ItemArmour(thec.ichorclothArmorMaterial, EntityEquipmentSlot.HEAD,"ichor_helmet").setCreativeTab(thec.creativeTab));
            ichorchest = register(new ItemArmour(thec.ichorclothArmorMaterial, EntityEquipmentSlot.CHEST,"ichor_chest").setCreativeTab(thec.creativeTab));
            ichorleggings = register(new ItemArmour(thec.ichorclothArmorMaterial, EntityEquipmentSlot.LEGS,"ichor_leggings").setCreativeTab(thec.creativeTab));
            ichorboots = register(new ItemArmour(thec.ichorclothArmorMaterial, EntityEquipmentSlot.FEET,"ichor_boots").setCreativeTab(thec.creativeTab));
        }


        private static <T extends Item> T register(T item) {
            GameRegistry.register(item);

            if (item instanceof ItemBase) {
                ((ItemBase)item).registerItemModel(item);
            }
            if (item instanceof ItemPickaxe) {
                ((ItemPickaxe)item).registerItemModel(item);
            }
            if (item instanceof ItemSword) {
                ((ItemSword)item).registerItemModel(item);
            }
            if (item instanceof ItemShovel) {
                ((ItemShovel)item).registerItemModel(item);
            }
            if (item instanceof ItemAxe) {
                ((ItemAxe)item).registerItemModel(item);
            }
            if (item instanceof ItemBlackHoleCharm) {
                ((ItemBlackHoleCharm)item).registerItemModel(item);
            }
            if (item instanceof ItemSceptre) {
                ((ItemSceptre)item).registerItemModel(item);
            }
            if (item instanceof ItemArmour) {
                ((ItemArmour)item).registerItemModel(item);
            }
            if (item instanceof ItemXPCharm) {
                ((ItemXPCharm)item).registerItemModel(item);
            }

            return item;
        }

}