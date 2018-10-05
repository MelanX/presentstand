package de.melanx.presentstand.block.presentStand.color;

import de.melanx.presentstand.block.presentStand.PresentStandBase;
import net.minecraftforge.oredict.OreDictionary;

public class MagentaPresentStand extends PresentStandBase {

	public MagentaPresentStand() {
		super("magenta_present_stand");
	}

	public void initOreDict() {
		OreDictionary.registerOre("blockPresentStand", this);
	}

}