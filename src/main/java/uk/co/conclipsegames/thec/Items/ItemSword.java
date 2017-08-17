package uk.co.conclipsegames.thec.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import uk.co.conclipsegames.thec.thec;

/**
 * Created by James on 06/08/2017.
 */
public class ItemSword extends net.minecraft.item.ItemSword {
    private String name;

    public ItemSword(ToolMaterial material, String name) {
        super(material);
        setUnlocalizedName(name);
        this.name = name;
    }
}
