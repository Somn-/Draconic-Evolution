package com.brandon3055.draconicevolution.client.gui.manual;

import net.minecraft.client.Minecraft;

/**
 * Created by Brandon on 17/09/2014.
 */
public class TitledPage extends BasePage {
	private String title;
	public boolean drawTitle = true;
	private int colour;

	public TitledPage(String name, boolean showInMenue, PageCollection collection, String unlocalizedTitle, int colour) {
		super(name, showInMenue, collection);
		this.title = unlocalizedTitle;
		this.colour = colour;
	}

	@Override
	public void renderOverlayComponents(Minecraft minecraft, int offsetX, int offsetY, int mouseX, int mouseY) {
		if (title == null) title = INDEX_NAME;
		if (drawTitle)drawCenteredString(minecraft.fontRenderer, ttl(title), offsetX + 128, offsetY + 5, colour);
	}
}
