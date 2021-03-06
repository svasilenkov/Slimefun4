package io.github.thebusybiscuit.slimefun4.implementation.items.electric.gadgets;

import org.bukkit.inventory.ItemStack;

import me.mrCookieSlime.Slimefun.Lists.RecipeType;
import me.mrCookieSlime.Slimefun.Objects.Category;
import me.mrCookieSlime.Slimefun.Objects.SlimefunItem.ChargableItem;
import me.mrCookieSlime.Slimefun.api.SlimefunItemStack;

public class JetBoots extends ChargableItem {

    private final double speed;

    public JetBoots(Category category, SlimefunItemStack item, ItemStack[] recipe, double speed) {
        super(category, item, RecipeType.ENHANCED_CRAFTING_TABLE, recipe);

        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

}
