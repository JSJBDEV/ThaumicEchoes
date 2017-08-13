package uk.co.conclipsegames.thec;

/**
 * Created by James on 06/08/2017.
 */

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.co.conclipsegames.thec.Blocks.ModBlocks;
import uk.co.conclipsegames.thec.Items.ModItems;
import uk.co.conclipsegames.thec.proxy.CommonProxy;
import uk.co.conclipsegames.thec.recipe.ModRecipes;
import uk.co.conclipsegames.thec.thaum.FuserTE;
import uk.co.conclipsegames.thec.thaum.InfuserTE;
import uk.co.conclipsegames.thec.thaum.ResearchesTE;
import uk.co.conclipsegames.thec.thaum.WandsTE;
import uk.co.conclipsegames.thec.util.Helper;

@Mod(modid = thec.modId, name = thec.name, version = thec.version, acceptedMinecraftVersions = "[1.11.2]")
public class thec {

    public static final String modId = "thec";
    public static final String name = "Thaumic Echoes";
    public static final String version = "1.0.0";

    @Mod.Instance(modId)
    public static thec instance;

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Helper.info(name + " is loading!");
        ModItems.init();
        ModBlocks.init();
        ResearchesTE.registerResearches();
        Helper.info("Successfully injected some Researches before initialisation!");
        WandsTE.init();
        Helper.info("....And here's some wand parts!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        ModRecipes.init();
        InfuserTE.RegisterInfuser();
        Helper.info("Successfully injected Infuser recipes, init!");


    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {
        FuserTE.RegisterRecipes();
        Helper.info("Sneakily injected the Arcane Table recipes.. in postInit!");




    }
    @SidedProxy(serverSide = "uk.co.conclipsegames.thec.proxy.CommonProxy", clientSide = "uk.co.conclipsegames.thec.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static final thecTab creativeTab = new thecTab();

    public static final Item.ToolMaterial ichoriumToolMaterial = EnumHelper.addToolMaterial("ICHORIUM", 20, 9999, 200, 20, 30);
    //public static final ItemArmor.ArmorMaterial ichorclothArmorMaterial = EnumHelper.addArmorMaterial("ICHORCLOTH", modId + ":ichor_cloth", 1500, new int[]{6, 10, 15, 6}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
}