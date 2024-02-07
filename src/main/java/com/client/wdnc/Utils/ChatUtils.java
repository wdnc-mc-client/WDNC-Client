package com.client.wdnc.Utils;

import com.client.wdnc.Client;
import net.minecraft.client.Minecraft;
import net.minecraft.util.text.TextComponentString;

public class ChatUtils {
    private static final String prefix = "[" + Client.cName + "§f] ";

    public static void sendMessage(String msg) {
        Minecraft.getMinecraft().player.sendMessage(new TextComponentString(prefix + msg));
    }
}
