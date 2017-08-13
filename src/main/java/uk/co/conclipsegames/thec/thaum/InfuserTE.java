package uk.co.conclipsegames.thec.thaum;

import com.pengu.lostthaumaturgy.api.RecipesInfuser;
import com.pengu.lostthaumaturgy.init.BlocksLT;
import com.pengu.lostthaumaturgy.init.ItemsLT;
import com.pengu.lostthaumaturgy.items.ItemMultiMaterial;
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
        RecipesInfuser.addInfusing(new ItemStack(ModItems.ichor),100,RecipesInfuser.createPredicateFromResearches(ResearchesTE.ichor),new ItemStack(Items.NETHER_STAR),new ItemStack(Items.CHORUS_FRUIT_POPPED),ItemMultiMaterial.EnumMultiMaterialType.DARKNESS_SEED.stack(), ItemMultiMaterial.EnumMultiMaterialType.ENCHANTED_SILVERWOOD.stack(),ItemMultiMaterial.EnumMultiMaterialType.SOUL_FRAGMENT.stack(),new ItemStack(Items.DIAMOND));
        RecipesInfuser.addInfusing(new ItemStack(ModItems.ichorium),105,RecipesInfuser.createPredicateFromResearches(ResearchesTE.ichorium),new ItemStack(ModItems.ichor),ItemMultiMaterial.EnumMultiMaterialType.VOID_INGOT.stack(),new ItemStack(ItemsLT.SINGULARITY),ItemMultiMaterial.EnumMultiMaterialType.THAUMIUM_INGOT.stack());
        RecipesInfuser.addInfusing(new ItemStack(ModItems.ichorcloth),105,RecipesInfuser.createPredicateFromResearches(ResearchesTE.ichorcloth),new ItemStack(ModItems.ichor),ItemMultiMaterial.EnumMultiMaterialType.ENCHANTED_FABRIC.stack(),new ItemStack(ItemsLT.SINGULARITY),new ItemStack(BlocksLT.SILVERWOOD_LEAVES));
        RecipesInfuser.addInfusing(new ItemStack(ModBlocks.blockELadder),30,RecipesInfuser.createPredicateFromResearches(ResearchesTE.eladder),ItemMultiMaterial.EnumMultiMaterialType.ENCHANTED_WOOD.stack(),new ItemStack(Items.REDSTONE),new ItemStack(Blocks.PISTON),ItemMultiMaterial.EnumMultiMaterialType.ENCHANTED_SILVERWOOD.stack());
        RecipesInfuser.addInfusing(new ItemStack(ModItems.bhc),50,RecipesInfuser.createPredicateFromResearches(ResearchesTE.blackhole),ItemMultiMaterial.EnumMultiMaterialType.VOID_INGOT.stack(),ItemMultiMaterial.EnumMultiMaterialType.DARKENED_CRYSTAL_EYE.stack(),new ItemStack(Items.CHORUS_FRUIT));
    }
}
