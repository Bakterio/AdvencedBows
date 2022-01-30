package cz.bakterio.spigot.advencedbows.items;

import cz.bakterio.spigot.advencedbows.AdvencedBows;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class RPGbow extends CustomItem {
    @Override
    public String getName() {
        return "RPG";
    }

    @Override
    public ItemStack getItem() {
        ItemStack rpg = new ItemStack(Material.BOW);
        setDisplayName(rpg, "RPG");
        return rpg;
    }

    @Override
    public ShapedRecipe getRecipe() {
        NamespacedKey key = new NamespacedKey(AdvencedBows.getPlugin(), "RPGbow");
        ShapedRecipe recipe = new ShapedRecipe(key, getItem());
        recipe.shape("IDI", "IBI", "ETE");
        recipe.setIngredient('I', Material.IRON_BLOCK);
        recipe.setIngredient('T', Material.TNT);
        recipe.setIngredient('D', Material.DIAMOND_BLOCK);
        recipe.setIngredient('E', Material.EMERALD_BLOCK);
        recipe.setIngredient('B', Material.BOW);
        return recipe;

    }

    @Override
    public Material[][] getCraftingItems() {
        return new Material[][] {
                {Material.IRON_BLOCK, Material.DIAMOND_BLOCK, Material.IRON_BLOCK},
                {Material.IRON_BLOCK, Material.BOW, Material.IRON_BLOCK},
                {Material.EMERALD_BLOCK, Material.TNT, Material.EMERALD_BLOCK}
        };
    }

    @Override
    public String getDescription() {
        return "Shoots grenades.";
    }
}
