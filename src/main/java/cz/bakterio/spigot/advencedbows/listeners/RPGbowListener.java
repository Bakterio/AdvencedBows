package cz.bakterio.spigot.advencedbows.listeners;

import cz.bakterio.spigot.advencedbows.items.*;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;
import org.bukkit.event.entity.ProjectileLaunchEvent;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;

public class RPGbowListener implements Listener {
    @EventHandler
    public void onGrenadeLanded(ProjectileHitEvent e) {
        if (!(e.getEntity().getShooter() instanceof Player p)) return;
        if (p.getInventory().getItemInMainHand().equals(new RPGbow().getItem())) {  // TODO add grenade
            e.setCancelled(true);
            Entity tnt = p.getWorld().spawn(e.getHitBlock().getLocation(), TNTPrimed.class);
            ((TNTPrimed)tnt).setFuseTicks(0);
            e.getEntity().remove();
        }
    }

    @EventHandler
    public void onGrenadeShoot(ProjectileLaunchEvent e) {
        if (!(e.getEntity().getShooter() instanceof Player p)) return;
        if (p.getInventory().getItemInMainHand().equals(new RPGbow().getItem())) {
            int index = ItemsManager.isItemInInventory(p, new GrenadeItem());
            if (index != -1) {
                Inventory inv = p.getInventory();
                ItemStack b = inv.getItem(index);
                b.setAmount(b.getAmount() - 1);
                inv.setItem(index, b);
                e.getEntity().setBounce(false);
            } else {
                p.sendMessage("No grenades in inventory...");
                e.setCancelled(true);
            }
        }
    }
}
