package uk.co.conclipsegames.thec.Items;

import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
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

        public static void init() {
            ichor = register(new ItemBase("ichor").setCreativeTab(thec.creativeTab));
            ichorium = register(new ItemBase("ichorium").setCreativeTab(thec.creativeTab));
            ichorSword = register(new ItemSword(ichoriumToolMaterial,"ichor_sword").setCreativeTab(thec.creativeTab));
            ichorAxe = register(new ItemAxe(ichoriumToolMaterial,"ichor_axe").setCreativeTab(thec.creativeTab));
            ichorPickaxe = register(new ItemPickaxe(ichoriumToolMaterial,"ichor_pickaxe").setCreativeTab(thec.creativeTab));
            ichorShovel = register(new ItemShovel(ichoriumToolMaterial,"ichor_shovel").setCreativeTab(thec.creativeTab));
            bhc = register(new ItemBlackHoleCharm("item_bhc").setCreativeTab(thec.creativeTab));
            ultraDenseGem = register(new ItemBase("ultradensegem").setCreativeTab(thec.creativeTab));
            capIchor = register(new ItemBase("ichor_cap").setCreativeTab(thec.creativeTab));
            ichorcloth = register(new ItemBase("ichor_cloth").setCreativeTab(thec.creativeTab));
            rodIchor = register(new ItemBase("ichor_rod").setCreativeTab(thec.creativeTab));
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

            return item;
        }

}