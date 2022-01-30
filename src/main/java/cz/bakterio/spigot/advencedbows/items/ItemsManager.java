package cz.bakterio.spigot.advencedbows.items;

import org.bukkit.Bukkit;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

import java.util.ArrayList;

public class ItemsManager {
    public static final ArrayList<CustomItem> items = new ArrayList<>();

    private static void addItems() {
        items.add(new TeleportBow());
        items.add(new GlowBow());
        items.add(new InstantKillBow());
        items.add(new KalashnikovBow());
        items.add(new BulletItem());
        items.add(new GrenadeItem());
        items.add(new RPGbow());
        items.add(new CanonItem());
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

    public static int isItemInInventory(Player p, CustomItem item) {
        /*
        If is specific CustomItem in player's inventory, return item's index, else return -1;
         */
        Inventory inv = p.getInventory();
        int index = inv.first(item.getItem().getType());
        if (index == -1) return -1;
        ItemStack i = inv.getItem(index).clone();
        i.setAmount(1);
        if (i.equals(item.getItem()))
            return index;
        else
            return -1;
    }
}
