package de.donut4gamer.blockpreventer;

import org.bukkit.GameMode;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockBreakEvent;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockPreventer extends JavaPlugin implements Listener {
   public void onEnable() {
      this.getServer().getPluginManager().registerEvents(this, this);
      this.getLogger().info("BlockPreventer Plugin activated!");
   }

   public void onDisable() {
      this.getLogger().info("BlockPreventer Plugin disabled.");
   }

   @EventHandler
   public void onBlockBreak(BlockBreakEvent event) {
      Player player = event.getPlayer();
      if (player.getGameMode().equals(GameMode.SURVIVAL)) {
         event.setCancelled(true);
      }

   }
}
    
