package uk.co.conclipsegames.thec;

/**
 * Created by James on 06/08/2017.
 */

import com.pengu.hammercore.common.SimpleRegistration;
import net.minecraft.init.SoundEvents;
import net.minecraft.item.Item;
import net.minecraft.item.ItemArmor;
import net.minecraftforge.common.util.EnumHelper;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import uk.co.conclipsegames.thec.Blocks.ModBlocks;
import uk.co.conclipsegames.thec.Items.ModItems;
import uk.co.conclipsegames.thec.proxy.CommonProxy;
import uk.co.conclipsegames.thec.thaum.FuserTE;
import uk.co.conclipsegames.thec.thaum.InfuserTE;
import uk.co.conclipsegames.thec.thaum.ResearchesTE;
import uk.co.conclipsegames.thec.thaum.WandsTE;
import uk.co.conclipsegames.thec.util.Helper;

@Mod(modid = thec.modId, name = thec.name, version = thec.version, acceptedMinecraftVersions = "[1.12]", dependencies = "required-after:lostthaumaturgy;required-after:hammercore")
public class thec {

    public static final String modId = "thec";
    public static final String name = "Thaumic Echoes";
    public static final String version = "1.0.0";

    @Mod.Instance(modId)
    public static thec instance;
    
    @SidedProxy(serverSide = "uk.co.conclipsegames.thec.proxy.CommonProxy", clientSide = "uk.co.conclipsegames.thec.proxy.ClientProxy")
    public static CommonProxy proxy;

    public static final thecTab creativeTab = new thecTab();

    @Mod.EventHandler
    public void preInit(FMLPreInitializationEvent event) {
        Helper.info(name + " is loading!");
        SimpleRegistration.registerFieldItemsFrom(ModItems.class, modId, creativeTab);
        SimpleRegistration.registerFieldBlocksFrom(ModBlocks.class, modId, creativeTab);
        ResearchesTE.registerResearches();
        Helper.info("Successfully injected some Researches before initialisation!");
        WandsTE.init();
        Helper.info("....And here's some wand parts!");
    }

    @Mod.EventHandler
    public void init(FMLInitializationEvent event) {
        InfuserTE.RegisterInfuser();
        Helper.info("Successfully injected Infuser recipes, init!");
        FuserTE.RegisterRecipes();
        Helper.info("I have to do Fuser Recipes in init now?");
    }

    @Mod.EventHandler
    public void postInit(FMLPostInitializationEvent event) {

    }

    public static final Item.ToolMaterial ichoriumToolMaterial = EnumHelper.addToolMaterial("ICHORIUM", 20, 9999, 10, 20, 30);
    public static final ItemArmor.ArmorMaterial ichorclothArmorMaterial = EnumHelper.addArmorMaterial("ICHORCLOTH", modId + ":ichor", 1500, new int[]{6, 10, 15, 6}, 20, SoundEvents.ITEM_ARMOR_EQUIP_IRON, 5.0F);
}