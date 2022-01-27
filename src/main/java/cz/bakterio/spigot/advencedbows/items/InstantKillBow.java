package cz.bakterio.spigot.advencedbows.items;

import cz.bakterio.spigot.advencedbows.AdvencedBows;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class InstantKillBow extends CustomItem {
    @Override
    public String getName() {
        return "InstantKill-bow";
    }

    @Override
    public ItemStack getItem() {
        ItemStack bow = new ItemStack(Material.BOW);
        setDisplayName(bow, "Instant-kill bow");
        bow.addEnchantment(Enchantment.ARROW_KNOCKBACK, 1);
        return bow;
    }

    @Override
    public ShapedRecipe getRecipe() {
        NamespacedKey key = new NamespacedKey(AdvencedBows.getPlugin(), "KillBow");
        ShapedRecipe recipe = new ShapedRecipe(key, getItem());

        recipe.shape("DDD", "DBD", "BDB");
        recipe.setIngredient('D', Material.DIAMOND_BLOCK);
        recipe.setIngredient('B', Material.BOW);
        recipe.setIngredient('B', Material.DEAD_BUSH);
        return recipe;
    }
}
