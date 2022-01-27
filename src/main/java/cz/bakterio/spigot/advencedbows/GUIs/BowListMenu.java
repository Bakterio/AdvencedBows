package cz.bakterio.spigot.advencedbows.GUIs;

import cz.bakterio.spigot.advencedbows.items.CustomItem;
import cz.bakterio.spigot.advencedbows.items.ItemsManager;
import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;

public class BowListMenu {
    public static Inventory getInv(Player p) {
        Inventory menu = Bukkit.createInventory(p, 54, "Bows");
        for (CustomItem item : ItemsManager.items) {
            menu.addItem(item.getItem());
        }
        return menu;
    }
}
