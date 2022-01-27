package cz.bakterio.spigot.advencedbows.items;

import cz.bakterio.spigot.advencedbows.AdvencedBows;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.ArrayList;

public class KalashnikovBow extends CustomItem {
    @Override
    public String getName() {
        return "Kalashnikov-bow";
    }

    @Override
    public ItemStack getItem() {
        ItemStack ak = new ItemStack(Material.BOW);
        ak.addEnchantment(Enchantment.ARROW_INFINITE, 1);
        ItemMeta meta = ak.getItemMeta();
        meta.setDisplayName("Kalashnikov");
        ArrayList<String> lore = new ArrayList<>();
        lore.add("Best assout rifle");
        lore.add("FOR THE MOTHER LAND");
        meta.setLore(lore);
        ak.setItemMeta(meta);
        return ak;
    }

    @Override
    public ShapedRecipe getRecipe() {
        NamespacedKey key = new NamespacedKey(AdvencedBows.getPlugin(), "KalashnikovBow");
        ShapedRecipe recipe = new ShapedRecipe(key, getItem());

        recipe.shape("DsD", "RBI", "DID");
        recipe.setIngredient('D', Material.DIAMOND_BLOCK);
        recipe.setIngredient('B', Material.BOW);
        recipe.setIngredient('s', Material.SPYGLASS);
        recipe.setIngredient('R', Material.REPEATER);
        recipe.setIngredient('I', Material.IRON_INGOT);
        return recipe;
    }

    @Override
    public Material[][] getCraftingItems() {
        return new Material[][] {
                {Material.DIAMOND_BLOCK, Material.SPYGLASS, Material.DIAMOND_BLOCK},
                {Material.REPEATER, Material.BOW, Material.IRON_INGOT},
                {Material.DIAMOND_BLOCK, Material.IRON_INGOT, Material.DIAMOND_BLOCK}
        };
    }

    @Override
    public String getDescription() {
        return "The best gun mankind have ever made.";
    }
}
