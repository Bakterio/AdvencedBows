package cz.bakterio.spigot.advencedbows;

import cz.bakterio.spigot.advencedbows.commands.CommandsManager;
import org.bukkit.plugin.java.JavaPlugin;

public final class AdvencedBows extends JavaPlugin {

    private static AdvencedBows plugin;

    @Override
    public void onEnable() {
        // Plugin startup logic
        plugin = this;
        getPlugin().getCommand("bows").setExecutor(new CommandsManager());
    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }

    public static AdvencedBows getPlugin() {
        return plugin;
    }
}
