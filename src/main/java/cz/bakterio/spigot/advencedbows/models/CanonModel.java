package cz.bakterio.spigot.advencedbows.models;

import java.util.UUID;

public class CanonModel {
    private UUID player;
    private int[] location;
    private String world;

    public UUID getPlayer() {
        return player;
    }

    public void setPlayer(UUID player) {
        this.player = player;
    }

    public int[] getLocation() {
        return location;
    }

    public void setLocation(int[] location) {
        this.location = location;
    }

    public String getWorld() {
        return world;
    }

    public void setWorld(String world) {
        this.world = world;
    }

    public CanonModel(UUID player, int[] location, String world) {
        this.player = player;
        this.location = location;
        this.world = world;
    }
}
