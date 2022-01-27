package cz.bakterio.spigot.advencedbows.items;

import org.bukkit.Bukkit;

import java.util.ArrayList;

public class ItemsManager {
    public static final ArrayList<CustomItem> items = new ArrayList<>();

    private static void addItems() {
        items.add(new TeleportBow());
    }

    public static void manage() {
        addItems();

        for (CustomItem item : items) {
            Bukkit.addRecipe(item.getRecipe());
        }
    }
}
