package fortunewheel.fortunewheel.commands;

import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.Objective;
import org.bukkit.scoreboard.Score;
import org.bukkit.scoreboard.Scoreboard;

import fortunewheel.fortunewheel.staticvariables.WheelItems;

public class buyvoucher implements CommandExecutor {



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String  [] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only Players can use this command");


            return true;
        }

        Player player = (Player) sender;

        Scoreboard scoreboard = player.getScoreboard();

        /*
         * 
        if(scoreboard.getObjective("lotteryvoucher") == null) {

            scoreboard.registerNewObjective("lotteryvoucher", "dummy","lotteryvoucher");
        }

        if (scoreboard.getObjective("money") == null) {
            scoreboard.registerNewObjective("money", "dummy");
        }
         * 
         */


        //Get scoreboard objective "money"
        Objective objective = scoreboard.getObjective("money");
        //Player Money Init
        Score money = objective.getScore(player.getName());

        //Lottery Voucher Objective init
        Objective lvObj = scoreboard.getObjective("lotteryvoucher");
        Score lvScore = lvObj.getScore(player.getName());

        int f = 0;
        int prize = WheelItems.getInstance().getPrize();

        int quantity =  WheelItems.getInstance().getPrize();

        try {
            quantity = Integer.parseInt(args[0]);
        }catch (Exception e) {
            quantity = 1;
        }

        if(money.getScore() >= (prize * quantity)) {

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


            int tmpm = money.getScore();
            int fm = tmpm - (prize * quantity);

            lvScore.setScore(f);
            money.setScore(fm);

            player.sendMessage("Bought " + quantity + " Lottery Voucher for: " + ChatColor.GOLD + (prize * quantity));
            player.sendMessage("Remaining Money: " + ChatColor.GOLD + fm);
        }else {
            player.sendMessage(ChatColor.RED + "Not enough money " + ChatColor.WHITE + quantity + " Voucher = " + ChatColor.GOLD + (prize * quantity));
        }

        return true;
    }
}
