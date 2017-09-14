package uk.co.conclipsegames.thec.Items;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import uk.co.conclipsegames.thec.thec;

/**
 * Created by James on 06/08/2017.
 */
public class ItemBase extends Item {
	protected String name;

	public ItemBase(String name) {
		this.name = name;
		setUnlocalizedName(name);
	}
}