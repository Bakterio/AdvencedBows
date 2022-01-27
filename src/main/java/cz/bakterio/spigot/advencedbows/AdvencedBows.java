package cz.bakterio.spigot.advencedbows;

import cz.bakterio.spigot.advencedbows.GUIs.BowListMenu;
import cz.bakterio.spigot.advencedbows.commands.CommandsManager;
import cz.bakterio.spigot.advencedbows.items.ItemsManager;
import cz.bakterio.spigot.advencedbows.listeners.GlowBowListener;
import cz.bakterio.spigot.advencedbows.listeners.InstantKillListener;
import cz.bakterio.spigot.advencedbows.listeners.MenuListener;
import cz.bakterio.spigot.advencedbows.listeners.TeleportBowListener;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdvencedBows extends JavaPlugin {

    private static AdvencedBows plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        getPlugin().getCommand("bows").setExecutor(new CommandsManager());
        ItemsManager.manage();

        getServer().getPluginManager().registerEvents(new TeleportBowListener(), this);
        getServer().getPluginManager().registerEvents(new GlowBowListener(), this);
        getServer().getPluginManager().registerEvents(new InstantKillListener(), this);
        getServer().getPluginManager().registerEvents(new MenuListener(), this);
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static AdvencedBows getPlugin() {
        return plugin;
    }
}
