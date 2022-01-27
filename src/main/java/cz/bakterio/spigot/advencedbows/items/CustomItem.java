package cz.bakterio.spigot.advencedbows.items;

import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public abstract class CustomItem {
    public abstract String getName();

    public abstract ItemStack getItem();

    public abstract ShapedRecipe getRecipe();

    protected void setDisplayName(ItemStack item, String name) {
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
    }
}
