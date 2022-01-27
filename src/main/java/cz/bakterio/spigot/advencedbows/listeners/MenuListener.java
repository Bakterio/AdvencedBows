package cz.bakterio.spigot.advencedbows.listeners;

import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.inventory.InventoryClickEvent;
import org.bukkit.inventory.ItemStack;

public class MenuListener implements Listener {
    @EventHandler
    public void onMenuClicked(InventoryClickEvent e) {
        if (e.getView().getTitle().equalsIgnoreCase("Bows")) {
            e.setCancelled(true);
            ItemStack item = e.getCurrentItem();

        }
    }
}
