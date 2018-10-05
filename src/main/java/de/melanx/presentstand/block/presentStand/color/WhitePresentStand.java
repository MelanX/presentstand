package de.melanx.presentstand.block.presentStand.color;

import de.melanx.presentstand.block.presentStand.PresentStandBase;
import net.minecraftforge.oredict.OreDictionary;

public class WhitePresentStand extends PresentStandBase {

	public WhitePresentStand() {
		super("white_present_stand");
	}

	public void initOreDict() {
		OreDictionary.registerOre("blockPresentStand", this);
	}

}