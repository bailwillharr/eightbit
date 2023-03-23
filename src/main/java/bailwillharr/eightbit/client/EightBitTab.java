package bailwillharr.eightbit.client;

import bailwillharr.eightbit.EightBit;
import bailwillharr.eightbit.init.ModItems;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;

public class EightBitTab extends CreativeTabs{
	public EightBitTab() {
		super(EightBit.MODID);
	}
	
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModItems.CPU);
	}
}
