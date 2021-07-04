package me.harsh;

import me.harsh.Commands.AddBowCommand;
import me.harsh.Listner.PlayerMoveEvent;
import me.harsh.Listner.TeleportTheArrow;
import me.harsh.utlis.BowInInv;
import org.bukkit.plugin.java.JavaPlugin;

public final class LobbyAddons extends JavaPlugin {
    private BowInInv inInv;

    @Override
    public void onEnable() {
        getConfig().options().copyDefaults();
        saveDefaultConfig();
        getServer().getPluginManager().registerEvents(new PlayerMoveEvent(this), this);
        getServer().getPluginManager().registerEvents(new TeleportTheArrow(),this);
        getCommand("tpbow").setExecutor(new AddBowCommand(inInv));

    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
    }
}
