package cz.bakterio.spigot.advencedbows.commands.subcomands;

import cz.bakterio.spigot.advencedbows.commands.SubCommand;
import cz.bakterio.spigot.advencedbows.items.CustomItem;
import cz.bakterio.spigot.advencedbows.items.ItemsManager;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class GiveCommand extends SubCommand {
    @Override
    public String getName() {
        return "give";
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
        return "Gives you a bow";
    }

    @Override
    public String getSyntax() {
        return "/bows give";
    }

    @Override
    public List<String> getTabCompletion() {
        List<String> out = new ArrayList<>();
        out.add("bow");
        out.add("crossbow");
        for (CustomItem item : ItemsManager.items) {
            out.add(item.getName());
        }
        return out;
    }

    @Override
    public void invoke(Player p, String[] args) {
        if (args[1].equalsIgnoreCase("bow")) {
            ItemStack bow = new ItemStack(Material.BOW);
            ItemMeta meta = bow.getItemMeta();
            meta.setDisplayName("Super bow");
            bow.setItemMeta(meta);

            p.getInventory().addItem(bow);
            p.sendMessage(meta.getDisplayName() + " has been added to your inventory.");
        } else if (args[1].equalsIgnoreCase("crossbow")) {
            ItemStack crossbow = new ItemStack(Material.CROSSBOW);
            ItemMeta meta = crossbow.getItemMeta();
            meta.setDisplayName("Super crossbow");
            crossbow.setItemMeta(meta);

            p.getInventory().addItem(crossbow);
            p.sendMessage(meta.getDisplayName() + " has been added to your inventory.");
        } else if (getTabCompletion().contains(args[1])) {
            for (CustomItem item : ItemsManager.items) {
                if (item.getName().equalsIgnoreCase(args[1])) p.getInventory().addItem(item.getItem());
            }
        }
    }
}
