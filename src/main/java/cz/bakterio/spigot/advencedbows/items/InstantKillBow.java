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

        recipe.shape("DDD", "DBD", "bDb");
        recipe.setIngredient('D', Material.DIAMOND_BLOCK);
        recipe.setIngredient('B', Material.BOW);
        recipe.setIngredient('b', Material.DEAD_BUSH);
        return recipe;
    }

    @Override
    public Material[][] getCraftingItems() {
        return new Material[][] {
                {Material.DIAMOND, Material.DIAMOND, Material.DIAMOND},
                {Material.DIAMOND, Material.BOW, Material.DIAMOND},
                {Material.DEAD_BUSH, Material.DIAMOND, Material.DEAD_BUSH}
        };
    }

    @Override
    public String getDescription() {
        return "Instantly kill hitted entity. !!!NO DROP!!!";
    }
}
