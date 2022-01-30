package cz.bakterio.spigot.advencedbows.listeners;

import cz.bakterio.spigot.advencedbows.items.CanonItem;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.block.BlockDispenseEvent;
import org.bukkit.event.block.BlockPlaceEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.util.Vector;

public class CanonListener implements Listener {
    @EventHandler
    public void onCanonShoot(BlockDispenseEvent e) {
        if (e.getItem().equals(new CanonItem().getItem())) {
            e.setVelocity(new Vector(10, 1, 10));
        }
    }

    @EventHandler
    public void onCanonPlaced(BlockPlaceEvent e) {
        final ItemStack block = e.getItemInHand();
        block.setAmount(1);
        if (block.equals(new CanonItem().getItem())) {

        }
    }
}
