package me.harsh.Listner;

import me.harsh.LobbyAddons;
import org.bukkit.ChatColor;
import org.bukkit.Location;
import org.bukkit.entity.Arrow;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.ProjectileHitEvent;

public class TeleportTheArrow implements Listener {
    private LobbyAddons plugin;
    @EventHandler
    public void onArrowLand(ProjectileHitEvent event){
        if (event.getEntity() instanceof Arrow) {
            Location loc = event.getHitBlock().getLocation();
            Player player = (Player) event.getEntity().getShooter();
            player.teleport(loc);
            player.sendMessage(ChatColor.translateAlternateColorCodes('&', plugin.getConfig().getString("message")));
        }
    }
}
