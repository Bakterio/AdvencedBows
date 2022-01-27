package cz.bakterio.spigot.advencedbows.listeners;

import cz.bakterio.spigot.advencedbows.items.GlowBow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class GlowBowListener implements Listener {
    @EventHandler
    public void onBowLanded(ProjectileHitEvent e) {
        if (!(e.getEntity().getShooter() instanceof Player p)) return;
        if (p.getInventory().getItemInMainHand().equals(new GlowBow().getItem())) {
            e.setCancelled(true);
            e.getHitEntity().setGlowing(!e.getHitEntity().isGlowing());
        }
    }
}
