package cz.bakterio.spigot.advencedbows.GUIs;

import cz.bakterio.spigot.advencedbows.items.CustomItem;
import cz.bakterio.spigot.advencedbows.items.ItemsManager;
import org.bukkit.Bukkit;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class BowListMenu {
    public static Inventory getInv(Player p) {
        Inventory menu = Bukkit.createInventory(p, 54, "Bows");
        for (CustomItem item : ItemsManager.items) {
            menu.addItem(item.getItem());
        }
        return menu;
    }

    public static Inventory customItemInv(CustomItem item, Player p) {
        Inventory menu = Bukkit.createInventory(p, 27, item.getName());

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                menu.setItem(i + j*9, makeItem(item.getCraftingItems()[j][i]));
            }
        }

        return menu;
    }

    static ItemStack makeItem(Material m) {
        if (m == null) return new ItemStack(Material.LIGHT_GRAY_STAINED_GLASS_PANE);
        return new ItemStack(m);
    }
}
