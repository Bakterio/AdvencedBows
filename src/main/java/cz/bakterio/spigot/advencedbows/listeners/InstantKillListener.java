package cz.bakterio.spigot.advencedbows.listeners;

import cz.bakterio.spigot.advencedbows.items.InstantKillBow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class InstantKillListener implements Listener {
    @EventHandler
    public void onBowLanded(ProjectileHitEvent e) {
        if (!(e.getEntity().getShooter() instanceof Player p)) return;
        if (p.getInventory().getItemInMainHand().equals(new InstantKillBow().getItem())) {
            e.getHitEntity().remove();
        }
    }
}
