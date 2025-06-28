package de.donut4gamer.blockpreventer;

import de.donut4gamer.blockpreventer.listeners.BlockListener;
import net.md_5.bungee.api.ChatColor;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

public class BlockPreventer extends JavaPlugin implements Listener {
    public void onEnable() {
        this.getServer().getPluginManager().registerEvents(new BlockListener(this), this);
        this.getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&6BlockPreventer &8× &7Plugin enabled &8- &7Version: &6v" + this.getDescription().getVersion()));
        this.getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&6BlockPreventer &8× &7Developed by &6Donut4GAMER"));
        loadConfig();
    }

    public void onDisable() {
        this.getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&6BlockPreventer &8× &7Plugin disabled"));
        this.getServer().getConsoleSender().sendMessage(ChatColor.translateAlternateColorCodes('&', "&6BlockPreventer &8× &7Developed by &6Donut4GAMER"));
    }

    public void loadConfig() {
        this.getConfig().options().copyDefaults(true);
        this.saveDefaultConfig();
    }
}
