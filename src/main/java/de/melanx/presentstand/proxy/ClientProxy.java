package de.melanx.presentstand.proxy;

import de.melanx.presentstand.PresentStand;
import de.melanx.presentstand.proxy.CommonProxy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
	
public class ClientProxy extends CommonProxy {
		
		@Override
		public void registerItemRenderer(Item item, int meta, String id) {
			ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(PresentStand.MODID + ":" + id, "inventory"));
		}

}
