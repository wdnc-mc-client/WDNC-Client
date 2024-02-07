package com.client.wdnc.Module.CLIENT;

import com.client.wdnc.ExampleMod;
import com.client.wdnc.Module.Module;
import org.lwjgl.input.Keyboard;
import yea.bushroot.clickgui.Setting;

public class ClickGUI extends Module {
    public ClickGUI() {
        super("ClickGUI", Keyboard.KEY_NONE, Category.CLIENT);

        ExampleMod.instance.settingsManager.rSetting(new Setting("Rainbow", this, false));
    }
}
