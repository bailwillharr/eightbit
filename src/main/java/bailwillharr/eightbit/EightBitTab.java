package bailwillharr.eightbit;

import bailwillharr.eightbit.init.ModBlocks;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;

public class EightBitTab extends CreativeTabs{
	public EightBitTab() {
		super(EightBit.MODID);
	}
	
	@SideOnly(Side.CLIENT)
	@Override
	public ItemStack getTabIconItem() {
		return new ItemStack(ModBlocks.COMPUTER);
	}
}
