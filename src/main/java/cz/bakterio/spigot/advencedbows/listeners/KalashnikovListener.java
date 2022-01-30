package cz.bakterio.spigot.advencedbows.listeners;

import cz.bakterio.spigot.advencedbows.items.BulletItem;
import cz.bakterio.spigot.advencedbows.items.ItemsManager;
import cz.bakterio.spigot.advencedbows.items.KalashnikovBow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class KalashnikovListener implements Listener {
    @EventHandler
    public void onAKShoot(ProjectileLaunchEvent e) {
        if (!(e.getEntity().getShooter() instanceof Player p)) return;
        if (p.getInventory().getItemInMainHand().equals(new KalashnikovBow().getItem())) {
            int index = ItemsManager.isItemInInventory(p, new BulletItem());
            if (index != -1) {
                Inventory inv = p.getInventory();
                ItemStack b = inv.getItem(index);
                b.setAmount(b.getAmount() - 1);
                inv.setItem(index, b);
                e.getEntity().setBounce(false);
                e.getEntity().setVelocity(e.getEntity().getVelocity().multiply(3));
            } else {
                p.sendMessage("No bullets in magazine...");
                e.setCancelled(true);
            }
        }
    }

    @EventHandler
    public void onAKBulletHit(ProjectileLaunchEvent e) {

    }
}
