package com.client.wdnc;

import com.client.wdnc.Module.CLIENT.ClickGUI;
import com.client.wdnc.Module.CLIENT.Panic;
import com.client.wdnc.Module.COMBAT.*;
import com.client.wdnc.Module.EXPLOIT.HackerDetector;
import com.client.wdnc.Module.MOVEMENT.*;
import com.client.wdnc.Module.Module;
import com.client.wdnc.Module.PLAYER.BlockReach;
import com.client.wdnc.Module.EXPLOIT.FakeCreative;
import com.client.wdnc.Module.RENDER.*;
import font.FontUtils;
import net.minecraft.client.Minecraft;
import org.lwjgl.opengl.Display;
import yea.bushroot.clickgui.ClickGuiManager;

import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class Client {
    public static String name = "WDNC CLIENT | User: " + Minecraft.getMinecraft().getSession().getUsername();
    public static String cName = "WDNC§aCLIENT §fB§a1.0";
    public static CopyOnWriteArrayList<Module> modules = new CopyOnWriteArrayList<Module>();

    public static ClickGuiManager clickGuiManager;

    public static void startup() {
        Display.setTitle(name);

        modules.add(new ClickGUI());
        modules.add(new HackerDetector());
        modules.add(new InvWalk());
        modules.add(new FakePlayer());
        modules.add(new Velocity());
        modules.add(new ItemsESP());
        modules.add(new NameTags());
        modules.add(new FakeCreative());
        modules.add(new BlockReach());
        modules.add(new TriggerBot());
        modules.add(new AttackTrace());
        modules.add(new FullBright());
        modules.add(new ViewModel());
        modules.add(new KillAura());
        modules.add(new TargetHUD());
        modules.add(new ChestESP());
        modules.add(new GlowESP());
        modules.add(new Tracers());
        modules.add(new BoatFly());
        modules.add(new AntiBot());
        modules.add(new BoxESP());
        modules.add(new Sprint());
        modules.add(new HitBox());
        modules.add(new Spider());
        modules.add(new Jesus());
        modules.add(new Fly());
        modules.add(new AimBot());
        modules.add(new Particles());
        modules.add(new PlayerEntity());
        modules.add(new SpawnerESP());
        modules.add(new Speed());
        modules.add(new Panic());

        clickGuiManager = new ClickGuiManager();

        FontUtils.bootstrap();
    }

    public static ArrayList<Module> getModulesInCategory(Module.Category c) {
        ArrayList<Module> mods = new ArrayList<Module>();
        for (Module m : modules) {
            if (m.getCategory().name().equalsIgnoreCase(c.name())) {
                mods.add(m);
            }
        }
        return mods;
    }

    public static void keyPress(int key) {
        for (Module m : modules) {
            if (m.getKey() == key) {
                m.toggle();
            }
        }
    }
}
