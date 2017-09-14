package uk.co.conclipsegames.thec.thaum;

import com.pengu.lostthaumaturgy.api.RecipesInfuser;
import com.pengu.lostthaumaturgy.core.items.ItemMultiMaterial;
import com.pengu.lostthaumaturgy.init.BlocksLT;
import com.pengu.lostthaumaturgy.init.ItemsLT;
import net.minecraft.init.Blocks;
import net.minecraft.init.Items;
import net.minecraft.item.ItemStack;
import uk.co.conclipsegames.thec.Blocks.ModBlocks;
import uk.co.conclipsegames.thec.Items.ModItems;

/**
 * Created by James on 07/08/2017.
 */
public class InfuserTE {
    public static void RegisterInfuser()
    {
        RecipesInfuser.addInfusing(new ItemStack(ModItems.ichor),100,RecipesInfuser.createPredicateFromResearches("ichor"),new ItemStack(Items.NETHER_STAR),new ItemStack(Items.CHORUS_FRUIT_POPPED),ItemMultiMaterial.EnumMultiMaterialType.DARKNESS_SEED.stack(), ItemMultiMaterial.EnumMultiMaterialType.ENCHANTED_SILVERWOOD.stack(),ItemMultiMaterial.EnumMultiMaterialType.SOUL_FRAGMENT.stack(),new ItemStack(Items.DIAMOND));
        RecipesInfuser.addInfusing(new ItemStack(ModItems.ichorium),105,RecipesInfuser.createPredicateFromResearches("ichor"),new ItemStack(ModItems.ichor),ItemMultiMaterial.EnumMultiMaterialType.VOID_INGOT.stack(),new ItemStack(ItemsLT.SINGULARITY),ItemMultiMaterial.EnumMultiMaterialType.THAUMIUM_INGOT.stack());
        RecipesInfuser.addInfusing(new ItemStack(ModItems.ichorcloth),105,RecipesInfuser.createPredicateFromResearches("Ichor"),new ItemStack(ModItems.ichor),ItemMultiMaterial.EnumMultiMaterialType.ENCHANTED_FABRIC.stack(),new ItemStack(ItemsLT.SINGULARITY),new ItemStack(BlocksLT.SILVERWOOD_LEAVES));

        RecipesInfuser.addInfusing(new ItemStack(ModBlocks.blockELadder),30,RecipesInfuser.createPredicateFromResearches("Ichor"),ItemMultiMaterial.EnumMultiMaterialType.ENCHANTED_WOOD.stack(),new ItemStack(Items.REDSTONE),new ItemStack(Blocks.PISTON),ItemMultiMaterial.EnumMultiMaterialType.ENCHANTED_SILVERWOOD.stack());
        RecipesInfuser.addInfusing(new ItemStack(ModItems.bhc),50,RecipesInfuser.createPredicateFromResearches("ichor"),ItemMultiMaterial.EnumMultiMaterialType.VOID_INGOT.stack(),ItemMultiMaterial.EnumMultiMaterialType.DARKENED_CRYSTAL_EYE.stack(),new ItemStack(Items.CHORUS_FRUIT));
        RecipesInfuser.addInfusing(new ItemStack(ModItems.xpcharm),50,RecipesInfuser.createPredicateFromResearches("ichor"),ItemMultiMaterial.EnumMultiMaterialType.EXTRACT_PUREST_MAGIC.stack(),ItemMultiMaterial.EnumMultiMaterialType.INTACT_TAINTSPORE_POD.stack(),new ItemStack(Items.GLASS_BOTTLE));
        RecipesInfuser.addInfusing(new ItemStack(ModItems.deathTag),60,RecipesInfuser.createPredicateFromResearches("ichor"), ItemMultiMaterial.EnumMultiMaterialType.EXTRACT_PUREST_MAGIC.stack(),ItemMultiMaterial.EnumMultiMaterialType.ENCHANTED_SILVERWOOD.stack(),ItemMultiMaterial.EnumMultiMaterialType.TOME_FORBIDDEN_KNOWLEDGE.stack(),ItemMultiMaterial.EnumMultiMaterialType.INHUMAN_SKULL.stack(),ItemMultiMaterial.EnumMultiMaterialType.EXTRACT_FOULEST_TAINT.stack());


        RecipesInfuser.addInfusing(new ItemStack(ModItems.sceptreDislocation),50,RecipesInfuser.createPredicateFromResearches("ichor"),ItemMultiMaterial.EnumMultiMaterialType.ENCHANTED_SILVERWOOD.stack(),new ItemStack(ItemsLT.SINGULARITY),new ItemStack(ItemsLT.VOID_COMPASS),ItemMultiMaterial.EnumMultiMaterialType.TAINTED_BRANCH.stack(),ItemMultiMaterial.EnumMultiMaterialType.EXTRACT_PUREST_MAGIC.stack());
        RecipesInfuser.addInfusing(new ItemStack(ModItems.sceptreUprising),50,RecipesInfuser.createPredicateFromResearches("ichor"),ItemMultiMaterial.EnumMultiMaterialType.ENCHANTED_SILVERWOOD.stack(),new ItemStack(ItemsLT.SINGULARITY),new ItemStack(ItemsLT.ELEMENTAL_SWORD),ItemMultiMaterial.EnumMultiMaterialType.TAINTED_BRANCH.stack(),ItemMultiMaterial.EnumMultiMaterialType.EXTRACT_LIGHTEST_AIR.stack());
        RecipesInfuser.addInfusing(new ItemStack(ModItems.sceptreFreezing),50,RecipesInfuser.createPredicateFromResearches("ichor"),ItemMultiMaterial.EnumMultiMaterialType.ENCHANTED_SILVERWOOD.stack(),new ItemStack(ItemsLT.SINGULARITY),new ItemStack(Blocks.ICE),ItemMultiMaterial.EnumMultiMaterialType.TAINTED_BRANCH.stack(),ItemMultiMaterial.EnumMultiMaterialType.EXTRACT_COOLEST_WATER.stack());
        RecipesInfuser.addInfusing(new ItemStack(ModItems.sceptreHellfire),50,RecipesInfuser.createPredicateFromResearches("ichor"),ItemMultiMaterial.EnumMultiMaterialType.ENCHANTED_SILVERWOOD.stack(),new ItemStack(ItemsLT.SINGULARITY),new ItemStack(Blocks.MAGMA),ItemMultiMaterial.EnumMultiMaterialType.TAINTED_BRANCH.stack(),ItemMultiMaterial.EnumMultiMaterialType.EXTRACT_WARMEST_FIRE.stack());


    }
}
