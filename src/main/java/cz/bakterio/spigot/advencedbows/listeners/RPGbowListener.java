package cz.bakterio.spigot.advencedbows.listeners;

import cz.bakterio.spigot.advencedbows.items.RPGbow;
import org.bukkit.entity.Entity;
import org.bukkit.entity.Player;
import org.bukkit.entity.TNTPrimed;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

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
}
