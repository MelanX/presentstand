package de.melanx.presentstand;

import de.melanx.presentstand.block.ModBlocks;
import de.melanx.presentstand.network.PacketRequestUpdatePresentStand;
import de.melanx.presentstand.network.PacketUpdatePresentStand;
import de.melanx.presentstand.proxy.CommonProxy;
import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.client.event.ModelRegistryEvent;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.FMLInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPostInitializationEvent;
import net.minecraftforge.fml.common.event.FMLPreInitializationEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.network.NetworkRegistry;
import net.minecraftforge.fml.common.network.simpleimpl.SimpleNetworkWrapper;
import net.minecraftforge.fml.relauncher.Side;

@Mod(modid = PresentStand.MODID, version = PresentStand.version, name = "Present Stand")

public class PresentStand {
	
	public static final String MODID = "presentstand";
	public static final String name = "Present Stand";
	public static final String version = "r-1.1";
	
	@SidedProxy(serverSide = "de.melanx.presentstand.proxy.CommonProxy", clientSide = "de.melanx.presentstand.proxy.ClientProxy")
	public static CommonProxy proxy;
	
	@Mod.Instance(MODID)
	public static PresentStand instance;
	
	public static SimpleNetworkWrapper network;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		System.out.println(name + " is loading!");

		network = NetworkRegistry.INSTANCE.newSimpleChannel(MODID);
		network.registerMessage(new PacketUpdatePresentStand.Handler(), PacketUpdatePresentStand.class, 0, Side.CLIENT);
		network.registerMessage(new PacketRequestUpdatePresentStand.Handler(), PacketRequestUpdatePresentStand.class, 1, Side.SERVER);
		
		proxy.registerRenderers();
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent event) {		
		OreDict.init();		
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent event) {

	}
	
	@Mod.EventBusSubscriber
	public static class RegistrationHandler {
		
		@SubscribeEvent
		public static void registerBlocks(RegistryEvent.Register<Block> event) {
			ModBlocks.register(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerItems(RegistryEvent.Register<Item> event) {
			ModBlocks.registerItemBlocks(event.getRegistry());
		}
		
		@SubscribeEvent
		public static void registerModels(ModelRegistryEvent event) {
			ModBlocks.registerModels();
		}
	}

}