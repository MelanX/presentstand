package de.melanx.presentstand.block;

import de.melanx.presentstand.block.presentStand.BlockPresentStand;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static BlockPresentStand presentStand = new BlockPresentStand();
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				presentStand
		);
		
		GameRegistry.registerTileEntity(presentStand.getTileEntityClass(), presentStand.getRegistryName().toString());
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				presentStand.createItemBlock()
		);
	}

	public static void registerModels() {
		presentStand.registerItemModel(Item.getItemFromBlock(presentStand));
	}

}
