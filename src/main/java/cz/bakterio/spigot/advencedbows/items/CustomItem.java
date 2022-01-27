package cz.bakterio.spigot.advencedbows.items;

import org.bukkit.Material;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

public abstract class CustomItem {
    public abstract String getName();

    public abstract ItemStack getItem();

    public abstract ShapedRecipe getRecipe();

    public abstract Material[][] getCraftingItems();

    public abstract String getDescription();

    protected void setDisplayName(ItemStack item, String name) {
        ItemMeta meta = item.getItemMeta();
        meta.setDisplayName(name);
        item.setItemMeta(meta);
    }
}
