package cz.bakterio.spigot.advencedbows.commands;

import cz.bakterio.spigot.advencedbows.AdvencedBows;
import cz.bakterio.spigot.advencedbows.commands.subcomands.*;
import org.bukkit.command.*;
import org.bukkit.entity.Player;

import java.util.ArrayList;
import java.util.List;

public class CommandsManager implements TabExecutor {

    public static final ArrayList<SubCommand> subCommands = new ArrayList<>();

    public CommandsManager() {
        subCommands.add(new GiveCommand());
        subCommands.add(new HelpCommand());
    }

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (!(sender instanceof Player p)) {
            sender.sendMessage("You cant execute commands from console.");
            return true;
        } else if (args.length == 1) {
            p.sendMessage("You have to specify subcommand.");
        } else if (!AdvencedBows.getPlugin().getConfig().getBoolean("enabled")) {
            p.sendMessage("Plugin is disabled");
        }

        for (SubCommand i : subCommands) {
            if (i.getName().equalsIgnoreCase(args[0])) i.invoke(p, args);
        }

        return true;
    }

    @Override
    public List<String> onTabComplete(CommandSender sender, Command command, String alias, String[] args) {
        if (args.length == 1) {
            List<String> cmds = new ArrayList<>();
            for (SubCommand i : subCommands) {
                cmds.add(i.getName());
            }
            return cmds;
        } else if (args.length == 2) {
            for (SubCommand i : subCommands) {
                if (args[0].equalsIgnoreCase(i.getName())) return i.getTabCompletion();
            }
        }
        return null;
    }
}