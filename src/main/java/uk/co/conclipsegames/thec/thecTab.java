package uk.co.conclipsegames.thec;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import uk.co.conclipsegames.thec.Items.ModItems;

/**
 * Created by James on 06/08/2017.
 */
public class thecTab extends CreativeTabs {
    public thecTab() {
        super(thec.modId);
    }

    @Override
    public ItemStack getTabIconItem() {
        return new ItemStack(ModItems.ichor);
    }


}
