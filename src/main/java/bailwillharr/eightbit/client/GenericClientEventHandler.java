package bailwillharr.eightbit.client;

import net.minecraft.client.Minecraft;
import net.minecraftforge.client.event.ClientChatReceivedEvent;
import net.minecraftforge.fml.common.Mod.EventBusSubscriber;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.relauncher.Side;

@EventBusSubscriber(value = Side.CLIENT)
public class GenericClientEventHandler {
	
	@SubscribeEvent
	public static void onChat(ClientChatReceivedEvent event) {
	    String message = event.getMessage().getUnformattedText();
        if(message.contains("hi")) {
                 Minecraft.getMinecraft().player.sendChatMessage("!ih");
        }
	}
	
}
