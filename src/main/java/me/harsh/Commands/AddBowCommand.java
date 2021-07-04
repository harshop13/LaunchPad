package me.harsh.Commands;

import me.harsh.utlis.BowInInv;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.jetbrains.annotations.NotNull;

public class AddBowCommand implements CommandExecutor {
    private BowInInv bow;

    public AddBowCommand(BowInInv bow) {
        this.bow = bow;
    }

    @Override
    public boolean onCommand(@NotNull CommandSender sender, @NotNull Command command, @NotNull String label, @NotNull String[] args) {
        if (sender instanceof Player){
            Player player = (Player) sender;
            if (player.hasPermission("LaunchPad.admin")){
                bow.giveBow();
            }
        }





        return true;
    }
}
