package cz.bakterio.spigot.advencedbows.items;

import org.bukkit.Bukkit;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class ItemsManager {
    public static final ArrayList<CustomItem> items = new ArrayList<>();

    private static void addItems() {
        items.add(new TeleportBow());
        items.add(new GlowBow());
        items.add(new InstantKillBow());
    }

    public static void manage() {
        addItems();

        for (CustomItem item : items) {
            Bukkit.addRecipe(item.getRecipe());
        }
    }

    public static CustomItem findCustomItem(ItemStack item) {
        for (CustomItem i : items) {
            if (i.getItem().equals(item)) return i;
        }
        return null;
    }
}
