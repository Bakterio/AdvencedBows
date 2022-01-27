package cz.bakterio.spigot.advencedbows.listeners;

import cz.bakterio.spigot.advencedbows.GUIs.BowListMenu;
import cz.bakterio.spigot.advencedbows.items.ItemsManager;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;

import java.util.Objects;

public class MenuListener implements Listener {
    @EventHandler
    public void onMenuClicked(InventoryClickEvent e) {
        if (e.getView().getTitle().equalsIgnoreCase("Bows")) {
            e.setCancelled(true);
            Player p = (Player) e.getWhoClicked();
            p.openInventory(BowListMenu.customItemInv(Objects.requireNonNull(ItemsManager.findCustomItem(e.getCurrentItem())), p));
        } else if (e.getView().getTitle().endsWith("ow")) {
            e.setCancelled(true);
        }
    }
}
