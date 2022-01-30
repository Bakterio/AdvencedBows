package cz.bakterio.spigot.advencedbows.items;

import cz.bakterio.spigot.advencedbows.AdvencedBows;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class CanonItem extends CustomItem {
    @Override
    public String getName() {
        return "canon";
    }

    @Override
    public ItemStack getItem() {
        ItemStack canon = new ItemStack(Material.DISPENSER);
        setDisplayName(canon, "Canon");
        return canon;
    }

    @Override
    public ShapedRecipe getRecipe() {
        NamespacedKey key = new NamespacedKey(AdvencedBows.getPlugin(), "canon");
        ShapedRecipe recipe = new ShapedRecipe(key, getItem());

        recipe.shape("TTT", "TDT", "TTT");
        recipe.setIngredient('T', Material.TNT);
        recipe.setIngredient('D', Material.DISPENSER);

        return recipe;
    }

    @Override
    public Material[][] getCraftingItems() {
        return new Material[][] {
                {Material.TNT, Material.TNT, Material.TNT},
                {Material.TNT, Material.DISPENSER, Material.TNT},
                {Material.TNT, Material.TNT, Material.TNT}
        };
    }

    @Override
    public String getDescription() {
        return "Big boom boom.";
    }
}
