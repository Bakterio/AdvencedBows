package cz.bakterio.spigot.advencedbows.items;

import org.bukkit.Material;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class TeleportBow extends CustomItem {

    @Override
    public String getName() {
        return "Teleport Bow";
    }

    @Override
    public ItemStack getItem() {
        ItemStack bow = new ItemStack(Material.BOW);
        setDisplayName(bow, "Teleport bow");
        bow.addEnchantment(Enchantment.LUCK, 1);
        return bow;
    }

    @Override
    public ShapedRecipe getRecipe() {
        ShapedRecipe recipe = new ShapedRecipe();
        recipe.setIngredient();
        return null;
    }
}