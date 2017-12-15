package de.melanx.presentstand.proxy;

import de.melanx.presentstand.PresentStand;
import de.melanx.presentstand.block.presentStand.TESRPresentStand;
import de.melanx.presentstand.block.presentStand.TileEntityPresentStand;
import de.melanx.presentstand.proxy.CommonProxy;
import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.client.resources.I18n;
import net.minecraft.item.Item;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.client.registry.ClientRegistry;
	
public class ClientProxy extends CommonProxy {
		
		@Override
		public void registerItemRenderer(Item item, int meta, String id) {
			ModelLoader.setCustomModelResourceLocation(item, meta, new ModelResourceLocation(PresentStand.MODID + ":" + id, "inventory"));
		}
		
		@Override
		public String localize(String unlocalized, Object... args) {
			return I18n.format(unlocalized, args);
		}
		
		@Override
		public void registerRenderers() {
			ClientRegistry.bindTileEntitySpecialRenderer(TileEntityPresentStand.class, new TESRPresentStand());
		}

}
