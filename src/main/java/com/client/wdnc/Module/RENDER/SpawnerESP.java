package com.client.wdnc.Module.RENDER;

import com.client.wdnc.Module.Module;
import com.client.wdnc.Utils.RenderUtils;
import net.minecraft.tileentity.TileEntityChest;
import net.minecraft.tileentity.TileEntityMobSpawner;
import net.minecraftforge.client.event.RenderWorldLastEvent;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import org.lwjgl.input.Keyboard;

public class SpawnerESP extends Module {
    public SpawnerESP() {
        super("SpawnerESP", Keyboard.KEY_NONE, Category.RENDER);
    }

    @SubscribeEvent
    public void onRender(RenderWorldLastEvent e) {
        for (Object c : mc.world.loadedTileEntityList) {
            if (c instanceof TileEntityMobSpawner) {
                RenderUtils.blockESP(((TileEntityMobSpawner) c).getPos());
            }
        }
    }
}
