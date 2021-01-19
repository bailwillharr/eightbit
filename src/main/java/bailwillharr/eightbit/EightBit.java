package bailwillharr.eightbit;

import org.apache.logging.log4j.Logger;

import bailwillharr.eightbit.client.EightBitTab;
import bailwillharr.eightbit.proxy.IProxy;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.Mod.EventHandler;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;

@Mod(modid = EightBit.MODID, useMetadata = true)
@Mod.EventBusSubscriber
public class EightBit {
	
	public static final String MODID = "eightbit";
	
	public static final String CLIENT = "bailwillharr.eightbit.proxy.ClientProxy";
	public static final String SERVER = "bailwillharr.eightbit.proxy.ServerProxy";
	
	public static Logger logger;
	
	public static final CreativeTabs EIGHTBIT_TAB = new EightBitTab();
	
	@SidedProxy(modId = MODID, clientSide=CLIENT, serverSide=SERVER)
	public static IProxy proxy;
	
    @EventHandler
    public void preInit(FMLPreInitializationEvent event) {
    	logger = event.getModLog();
    	logger.info("Pre-init");
    }
    
    @EventHandler
    public void init(FMLInitializationEvent event) {
    	logger.info("Init");
    }
    
}