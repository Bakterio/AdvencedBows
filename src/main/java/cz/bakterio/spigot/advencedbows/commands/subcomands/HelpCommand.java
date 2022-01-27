package cz.bakterio.spigot.advencedbows.commands.subcomands;

import cz.bakterio.spigot.advencedbows.commands.CommandsManager;
import cz.bakterio.spigot.advencedbows.commands.SubCommand;
import org.bukkit.ChatColor;
import org.bukkit.entity.Player;

import java.util.LinkedList;
import java.util.List;

public class HelpCommand extends SubCommand {
    @Override
    public String getName() {
        return "help";
    }

    @Override
    public LinkedList<String> getAliases() {
        LinkedList<String> out = new LinkedList<>();
        out.add("info");
        return out;
    }

    @Override
    public LinkedList<String> getPerms() {
        return null;
    }

    @Override
    public String getDescription() {
        return "Shows this help";
    }

    @Override
    public String getSyntax() {
        return "/bows help";
    }

    @Override
    public List<String> getTabCompletion() {
        return null;
    }

    @Override
    public void invoke(Player p, String[] args) {
        StringBuilder message = new StringBuilder(ChatColor.RED + "AdvancedBows commands:\n" + ChatColor.RESET);
        for (SubCommand command : CommandsManager.subCommands) {
            message.append(ChatColor.YELLOW + command.getName() + "\n  Des: " + ChatColor.RESET + command.getDescription() +
                    ChatColor.YELLOW + "\n  Usage: " + ChatColor.RESET + command.getSyntax() + "\n");
        }
        p.sendMessage(message.toString());
    }
}
