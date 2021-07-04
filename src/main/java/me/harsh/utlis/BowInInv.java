package me.harsh.utlis;

import me.harsh.LobbyAddons;
import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.OfflinePlayer;
import org.bukkit.enchantments.Enchantment;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.ItemMeta;

import java.util.Arrays;

public class BowInInv {
    private LobbyAddons plugin;
    public void giveBow(){

        plugin.getServer().getOnlinePlayers().forEach(this::addBow);

    }
    public void addBow(Player player){
        ItemStack bow = new ItemStack(Material.BOW);
        ItemMeta bowMeta = bow.getItemMeta();
        bowMeta.addEnchant(Enchantment.ARROW_INFINITE, 100, true);
        bowMeta.setDisplayName(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("bow-name")));
        bow.setItemMeta(bowMeta);
        player.getInventory().addItem(bow);

    }
}
