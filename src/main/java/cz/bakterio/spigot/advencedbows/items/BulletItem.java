package cz.bakterio.spigot.advencedbows.items;

import cz.bakterio.spigot.advencedbows.AdvencedBows;
import org.bukkit.Material;
import org.bukkit.NamespacedKey;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;

public class BulletItem extends CustomItem {
    @Override
    public String getName() {
        return "BulletForBow";
    }

    @Override
    public ItemStack getItem() {
        ItemStack bullet = new ItemStack(Material.LIGHTNING_ROD);
        setDisplayName(bullet, "Bullet");
        return bullet;
    }

    @Override
    public ShapedRecipe getRecipe() {
        NamespacedKey key = new NamespacedKey(AdvencedBows.getPlugin(), getName());
        ShapedRecipe recipe = new ShapedRecipe(key, getItem());

        recipe.shape("N", "G");
        recipe.setIngredient('N', Material.IRON_INGOT);
        recipe.setIngredient('G', Material.GUNPOWDER);

        return recipe;
    }

    @Override
    public Material[][] getCraftingItems() {
        return new Material[][] {
                {null, null, null},
                {null, Material.IRON_INGOT, null},
                {null, Material.GUNPOWDER, null}
        };
    }

    @Override
    public String getDescription() {
        return "Can hit you, such a pain.";
    }
}
