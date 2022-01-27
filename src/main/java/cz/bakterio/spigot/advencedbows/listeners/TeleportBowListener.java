package cz.bakterio.spigot.advencedbows.listeners;

import cz.bakterio.spigot.advencedbows.items.TeleportBow;
import org.bukkit.Location;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class TeleportBowListener implements Listener {
    @EventHandler
    public void onBowLanded(ProjectileHitEvent e) {
        if (!(e.getEntity().getShooter() instanceof Player p)) return;
        if (p.getInventory().getItemInMainHand().equals(new TeleportBow().getItem())) {
            Location loc = e.getHitBlock().getLocation();
            p.teleport(new Location(p.getWorld(), loc.getX(), loc.getY() + 1, loc.getZ()));
            p.sendMessage("woosh"); // TODO invent better message
        }
    }
}
