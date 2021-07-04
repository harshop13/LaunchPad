package me.harsh.Listner;

import me.harsh.LobbyAddons;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;

public class PlayerMoveEvent implements Listener {
    private LobbyAddons plugin;

    public PlayerMoveEvent(LobbyAddons plugin) {
        this.plugin = plugin;
    }

    @EventHandler
    public void onPlayerMove(org.bukkit.event.player.PlayerMoveEvent event){
        Player p = event.getPlayer();
        Location blockUnder = p.getLocation();
        blockUnder.setY(blockUnder.getY() - 1);
        if (p.getLocation().getBlock().getType().equals(Material.valueOf(plugin.getConfig().getString("main-block"))) && blockUnder.getBlock().getType().equals(Material.valueOf(plugin.getConfig().getString("second-block")))){
            p.setVelocity(p.getLocation().getDirection().multiply(plugin.getConfig().getInt("speed")).setY(plugin.getConfig().getInt("height")));
            if (plugin.getConfig().getBoolean("enable-message")){
                p.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("player-message")));
            }

        }

    }
}
