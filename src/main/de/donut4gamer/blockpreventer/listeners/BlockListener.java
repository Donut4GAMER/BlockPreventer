package de.donut4gamer.blockpreventer.listeners;

import de.donut4gamer.blockpreventer.BlockPreventer;
import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;

public class BlockListener implements Listener {
    private BlockPreventer plugin;
    public BlockListener(BlockPreventer blockPreventer) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onBlockBreak(BlockBreakEvent event) {
        Player player = event.getPlayer();
        String GM = this.plugin.getConfig().getString("Gamemode");
        if (player.getGameMode().equals(GameMode.valueOf(GM))) {
            event.setCancelled(true);
        }
    }
}
