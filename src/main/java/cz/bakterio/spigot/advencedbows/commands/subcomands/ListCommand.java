package cz.bakterio.spigot.advencedbows.commands.subcomands;

import cz.bakterio.spigot.advencedbows.commands.SubCommand;
import org.bukkit.entity.Player;

import java.util.LinkedList;
import java.util.List;

public class ListCommand extends SubCommand {
    @Override
    public String getName() {
        return "list";
    }

    @Override
    public LinkedList<String> getAliases() {
        return null;
    }

    @Override
    public LinkedList<String> getPerms() {
        return null;
    }

    @Override
    public String getDescription() {
        return "Shows available bows";
    }

    @Override
    public String getSyntax() {
        return "/bows list";
    }

    @Override
    public List<String> getTabCompletion() {
        return null;
    }

    @Override
    public void invoke(Player p, String[] args) {
        p.sendMessage("temp");
    }
}
