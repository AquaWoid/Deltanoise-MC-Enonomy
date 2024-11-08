package fortunewheel.fortunewheel.commands;


import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.scoreboard.*;

public class sendgold implements CommandExecutor {


   // public sendgold() {}

    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String  [] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only Players can use this command");


            return true;
        }

        Player player_sender = (Player) sender;

        Scoreboard scoreboard = player_sender.getScoreboard();


        if (scoreboard.getObjective("money") == null) {
            scoreboard.registerNewObjective("money", Criteria.DUMMY, "money", RenderType.INTEGER);
        }

        Objective objective = scoreboard.getObjective("money");
        Score sender_Score = objective.getScore(player_sender.getName());


        //for (Player p : Bukkit.getOnlinePlayers()){}


        Player player_receiver = Bukkit.getPlayerExact(args[0]);

        Scoreboard scoreboard_receiver = player_receiver.getScoreboard();
        Objective objective_receiver = scoreboard_receiver.getObjective("money");
        Score receiver_Score = objective_receiver.getScore(player_receiver.getName());


        if(args[1] != null && sender_Score.getScore() >= Integer.parseInt(args[1])) {

            int sender_temp = sender_Score.getScore();
            int receiver_temp = receiver_Score.getScore();

            sender_temp -=  Integer.parseInt(args[1]);
            receiver_temp +=  Integer.parseInt(args[1]);

            sender_Score.setScore(sender_temp);
            receiver_Score.setScore(receiver_temp);

            player_receiver.sendMessage(ChatColor.GOLD + "Received: " + args[1] + " Money from " + player_sender.getName());

        }else {

            player_sender.sendMessage("Something Wrong");

        }



        return true;
    }
}

