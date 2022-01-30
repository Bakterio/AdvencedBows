package cz.bakterio.spigot.advencedbows.items;

import cz.bakterio.spigot.advencedbows.AdvencedBows;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class GrenadeItem extends CustomItem {
    @Override
    public String getName() {
        return "grande";
    }

    @Override
    public ItemStack getItem() {
        ItemStack grenade = new ItemStack(Material.SNOWBALL);
        setDisplayName(grenade, "Grenade");
        return grenade;
    }

    @Override
    public ShapedRecipe getRecipe() {
        NamespacedKey key = new NamespacedKey(AdvencedBows.getPlugin(), "grenade");
        ShapedRecipe recipe = new ShapedRecipe(key, getItem());
        recipe.shape("I", "T");
        recipe.setIngredient('I', Material.IRON_INGOT);
        recipe.setIngredient('T', Material.TNT);
        return recipe;
    }

    @Override
    public Material[][] getCraftingItems() {
        return new Material[][]{
                {null, null, null},
                {null, Material.IRON_INGOT, null},
                {null, Material.TNT, null}
        };
    }

    @Override
    public String getDescription() {
        return "Basically grenade.";
    }
}
