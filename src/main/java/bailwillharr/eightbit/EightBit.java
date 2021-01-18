package bailwillharr.eightbit;

import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EightBit.MODID, useMetadata = true)
@Mod.EventBusSubscriber
public class EightBit {
	
	public static final String MODID = "eightbit";
	
	public static final CreativeTabs EIGHTBIT_TAB = new EightBitTab();
	
	public static Logger logger;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	logger = event.getModLog();
    	logger.info("hi!");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	
    }
    
}