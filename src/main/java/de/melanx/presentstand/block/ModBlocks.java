package de.melanx.presentstand.block;

import de.melanx.presentstand.block.presentStand.color.*;
import net.minecraft.block.Block;
import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.Item;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.registries.IForgeRegistry;

public class ModBlocks {
	
	public static WhitePresentStand whitePresentStand = new WhitePresentStand();
	public static OrangePresentStand orangePresentStand = new OrangePresentStand();
	public static MagentaPresentStand magentaPresentStand = new MagentaPresentStand();
	public static LightBluePresentStand lightbluePresentStand = new LightBluePresentStand();
	public static YellowPresentStand yellowPresentStand = new YellowPresentStand();
	public static LimePresentStand limePresentStand = new LimePresentStand();
	public static PinkPresentStand pinkPresentStand = new PinkPresentStand();
	public static GrayPresentStand grayPresentStand = new GrayPresentStand();
	public static LightGrayPresentStand lightgrayPresentStand = new LightGrayPresentStand();
	public static CyanPresentStand cyanPresentStand = new CyanPresentStand();
	public static PurplePresentStand purplePresentStand = new PurplePresentStand();
	public static BluePresentStand bluePresentStand = new BluePresentStand();
	public static BrownPresentStand brownPresentStand = new BrownPresentStand();
	public static GreenPresentStand greenPresentStand = new GreenPresentStand();
	public static RedPresentStand redPresentStand = new RedPresentStand();
	public static BlackPresentStand blackPresentStand = new BlackPresentStand();
	
	public static void register(IForgeRegistry<Block> registry) {
		registry.registerAll(
				whitePresentStand,
				orangePresentStand,
				magentaPresentStand,
				lightbluePresentStand,
				yellowPresentStand,
				limePresentStand,
				pinkPresentStand,
				grayPresentStand,
				lightgrayPresentStand,
				cyanPresentStand,
				purplePresentStand,
				bluePresentStand,
				brownPresentStand,
				greenPresentStand,
				redPresentStand,
				blackPresentStand
		);
		
		GameRegistry.registerTileEntity(blackPresentStand.getTileEntityClass(), blackPresentStand.getRegistryName().toString());
	}

	public static void registerItemBlocks(IForgeRegistry<Item> registry) {
		registry.registerAll(
				whitePresentStand.createItemBlock(),
				orangePresentStand.createItemBlock(),
				magentaPresentStand.createItemBlock(),
				lightbluePresentStand.createItemBlock(),
				yellowPresentStand.createItemBlock(),
				limePresentStand.createItemBlock(),
				pinkPresentStand.createItemBlock(),
				grayPresentStand.createItemBlock(),
				lightgrayPresentStand.createItemBlock(),
				cyanPresentStand.createItemBlock(),
				purplePresentStand.createItemBlock(),
				bluePresentStand.createItemBlock(),
				brownPresentStand.createItemBlock(),
				greenPresentStand.createItemBlock(),
				redPresentStand.createItemBlock(),
				blackPresentStand.createItemBlock()
		);
	}

	public static void registerModels() {
		whitePresentStand.registerItemModel(Item.getItemFromBlock(whitePresentStand));
		orangePresentStand.registerItemModel(Item.getItemFromBlock(orangePresentStand));
		magentaPresentStand.registerItemModel(Item.getItemFromBlock(magentaPresentStand));
		lightbluePresentStand.registerItemModel(Item.getItemFromBlock(lightbluePresentStand));
		yellowPresentStand.registerItemModel(Item.getItemFromBlock(yellowPresentStand));
		limePresentStand.registerItemModel(Item.getItemFromBlock(limePresentStand));
		pinkPresentStand.registerItemModel(Item.getItemFromBlock(pinkPresentStand));
		grayPresentStand.registerItemModel(Item.getItemFromBlock(grayPresentStand));
		lightgrayPresentStand.registerItemModel(Item.getItemFromBlock(lightgrayPresentStand));
		cyanPresentStand.registerItemModel(Item.getItemFromBlock(cyanPresentStand));
		purplePresentStand.registerItemModel(Item.getItemFromBlock(purplePresentStand));
		bluePresentStand.registerItemModel(Item.getItemFromBlock(bluePresentStand));
		brownPresentStand.registerItemModel(Item.getItemFromBlock(brownPresentStand));
		greenPresentStand.registerItemModel(Item.getItemFromBlock(greenPresentStand));
		redPresentStand.registerItemModel(Item.getItemFromBlock(redPresentStand));
		blackPresentStand.registerItemModel(Item.getItemFromBlock(blackPresentStand));
	}

}
