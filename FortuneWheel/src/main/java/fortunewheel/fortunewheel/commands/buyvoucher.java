package fortunewheel.fortunewheel.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

public class buyvoucher implements CommandExecutor {

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String  [] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only Players can use this command");


            return true;
        }

        Player player = (Player) sender;

        Scoreboard scoreboard = player.getScoreboard();

        if(scoreboard.getObjective("lotteryvoucher") == null) {

            scoreboard.registerNewObjective("lotteryvoucher", "dummy");
        }

        if (scoreboard.getObjective("money") == null) {
            scoreboard.registerNewObjective("money", "dummy");
        }

        Objective objective = scoreboard.getObjective("money");
        Score mScore = objective.getScore(player.getName());

        Objective lvObj = scoreboard.getObjective("lotteryvoucher");
        Score lvScore = lvObj.getScore(player.getName());

        int f = 0;


        int quantity =  1;

        try {
            quantity = Integer.parseInt(args[0]);
        }catch (Exception e) {
            quantity = 1;
        }

        if(mScore.getScore() >= (2500 * quantity)) {

            int tmp = lvScore.getScore();

        try {
            if(quantity == 0) {
                f = tmp + 1;
            }
        }catch (Exception e) {
           player.sendMessage(ChatColor.RED + "Please enter an amount");
        }

            if(quantity >= 1) {
                f = tmp + quantity;
            }


            int tmpm = mScore.getScore();
            int fm = tmpm - (2500 * quantity);

            lvScore.setScore(f);
            mScore.setScore(fm);

            player.sendMessage("Bought " + quantity + " Lottery Voucher for: " + ChatColor.GOLD + (2500 * quantity));
            player.sendMessage("Remaining Money: " + ChatColor.GOLD + fm);
        }else {
            player.sendMessage(ChatColor.RED + "Not enough money " + ChatColor.WHITE + quantity + " Voucher = " + ChatColor.GOLD + (2500 * quantity));
        }

        return true;
    }
}
