package bailwillharr.eightbit;

import bailwillharr.eightbit.init.ModBlocks;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.item.Item;
import net.minecraft.item.ItemBlock;
import net.minecraftforge.event.RegistryEvent.Register;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;

@EventBusSubscriber
public class RegistrationHandler {
	
	@SubscribeEvent
	public static void registerItems(Register<Item> event) {
		final Item[] items = {
				setItemName(new Item(), "cpu")
					.setCreativeTab(EightBit.EIGHTBIT_TAB)
		};
		final Item[] itemBlocks = {
			new ItemBlock(ModBlocks.COMPUTER).setRegistryName(ModBlocks.COMPUTER.getRegistryName()),
			new ItemBlock(ModBlocks.MONITOR).setRegistryName(ModBlocks.MONITOR.getRegistryName())
		};
		event.getRegistry().registerAll(items);
		event.getRegistry().registerAll(itemBlocks);
	}
	
	private static Item setItemName(Item item, String name) {
		item.setRegistryName(EightBit.MODID, name);
		item.setUnlocalizedName(EightBit.MODID + "." + name);
		return item;
	}
	
	@SubscribeEvent
	public static void registerBlocks(Register<Block> event) {
		final Block[] blocks = {
			setBlockName(new Block(Material.IRON), "computer")
				.setCreativeTab(EightBit.EIGHTBIT_TAB)
				.setHardness(1.5f)
				.setLightLevel(1f),
			setBlockName(new Block(Material.IRON), "monitor")
				.setCreativeTab(EightBit.EIGHTBIT_TAB)
				.setHardness(1.5f)
		};
		event.getRegistry().registerAll(blocks);
	}
	
	private static Block setBlockName(Block block, String name) {
		block.setRegistryName(EightBit.MODID, name);
		block.setUnlocalizedName(EightBit.MODID + "." + name);
		return block;
	}
	
}
