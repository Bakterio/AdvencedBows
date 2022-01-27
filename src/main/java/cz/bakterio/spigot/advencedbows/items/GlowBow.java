package cz.bakterio.spigot.advencedbows.items;

import cz.bakterio.spigot.advencedbows.AdvencedBows;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class GlowBow extends CustomItem {
    @Override
    public String getName() {
        return "GlowBow";
    }

    @Override
    public ItemStack getItem() {
        ItemStack bow = new ItemStack(Material.BOW);
        setDisplayName(bow, "GlowBow");
        bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
        return bow;
    }

    @Override
    public ShapedRecipe getRecipe() {
        NamespacedKey key = new NamespacedKey(AdvencedBows.getPlugin(), "GlowBow");
        ShapedRecipe recipe = new ShapedRecipe(key, getItem());
        recipe.shape("GGG", "DBD", "DED");
        recipe.setIngredient('B', Material.BOW);
        recipe.setIngredient('E', Material.EMERALD_BLOCK);
        recipe.setIngredient('G', Material.GLOWSTONE);
        recipe.setIngredient('D', Material.GLOWSTONE_DUST);
        return recipe;
    }

    @Override
    public Material[][] getCraftingItems() {
        return new Material[][] {
                {Material.GLOWSTONE, Material.GLOWSTONE, Material.GLOWSTONE},
                {Material.GLOWSTONE_DUST, Material.BOW, Material.GLOWSTONE_DUST},
                {Material.GLOWSTONE, Material.EMERALD_BLOCK, Material.GLOWSTONE}
        };
    }

    @Override
    public String getDescription() {
        return "Hitted entity will glow.";
    }
}
