package de.melanx.presentstand.block;

import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static PresentStand presentStand = new PresentStand("present_stand").setCreativeTab(CreativeTabs.DECORATIONS);
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				presentStand
		);
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
