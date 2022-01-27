package cz.bakterio.spigot.advencedbows.items;

import java.util.ArrayList;

public class ItemsManager {
    private static final ArrayList<CustomItem> items = new ArrayList<>();

    private static void addItems() {
        items.add(new TeleportBow());
    }

    public static void manage() {
        addItems();
    }
}
