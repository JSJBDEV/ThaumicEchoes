package uk.co.conclipsegames.thec.thaum;

import com.pengu.lostthaumaturgy.api.fuser.RecipesFuser;
import com.pengu.lostthaumaturgy.api.fuser.recipes.ShapedFuserRecipe;
import com.pengu.lostthaumaturgy.items.ItemMultiMaterial;
import uk.co.conclipsegames.thec.Items.ModItems;

/**
 * Created by James on 07/08/2017.
 */
public class FuserTE {
    public static void RegisterRecipes()
    {
        RecipesFuser.getInstance().addRecipe(new ShapedFuserRecipe(ModItems.ichorPickaxe, "III", " S ", " G ",'G', ItemMultiMaterial.EnumMultiMaterialType.GLOWING_ELDRITCH_DEVICE.stack(), 'I', ModItems.ichorium, 'S', ItemMultiMaterial.EnumMultiMaterialType.ENCHANTED_SILVERWOOD.stack()).setVisUsage(100f, 100f));
        RecipesFuser.getInstance().addRecipe(new ShapedFuserRecipe(ModItems.ichorSword, " I ", " I ", "GS ",'G', ItemMultiMaterial.EnumMultiMaterialType.ANCIENT_SEAL.stack(), 'I', ModItems.ichorium, 'S', ItemMultiMaterial.EnumMultiMaterialType.ENCHANTED_SILVERWOOD.stack()).setVisUsage(100f, 100f));

    }

}