package cz.bakterio.spigot.advencedbows.commands;

import org.bukkit.entity.Player;

import java.util.LinkedList;
import java.util.List;

public abstract class SubCommand {
    public abstract String getName();

    public abstract LinkedList<String> getAliases();

    public abstract LinkedList<String> getPerms();

    public abstract String getDescription();

    public abstract String getSyntax();

    public abstract List<String> getTabCompletion();

    public abstract void invoke(Player p, String[] args);
}
