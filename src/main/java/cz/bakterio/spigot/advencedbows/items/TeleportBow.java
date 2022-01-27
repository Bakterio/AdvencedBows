package cz.bakterio.spigot.advencedbows.items;

import cz.bakterio.spigot.advencedbows.AdvencedBows;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class TeleportBow extends CustomItem {

    @Override
    public String getName() {
        return "Teleport-bow";
    }

    @Override
    public ItemStack getItem() {
        ItemStack bow = new ItemStack(Material.BOW);
        setDisplayName(bow, "Teleport bow");
        bow.addEnchantment(Enchantment.ARROW_INFINITE, 1);
        return bow;
    }

    @Override
    public ShapedRecipe getRecipe() {
        NamespacedKey key = new NamespacedKey(AdvencedBows.getPlugin(), "teleport-bow");
        ShapedRecipe recipe = new ShapedRecipe(key, getItem());
        recipe.shape(" P ", "PBP", " P ");
        recipe.setIngredient('P', Material.ENDER_PEARL);
        recipe.setIngredient('B', Material.BOW);
        return recipe;
    }

    @Override
    public Material[][] getCraftingItems() {
        return new Material[][] {
                {null, Material.ENDER_PEARL, null},
                {Material.ENDER_PEARL, Material.BOW, Material.ENDER_PEARL},
                {null, Material.ENDER_PEARL, null}
        };
    }
}