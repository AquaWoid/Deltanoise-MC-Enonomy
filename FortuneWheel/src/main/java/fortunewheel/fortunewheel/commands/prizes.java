package fortunewheel.fortunewheel.commands;

import fortunewheel.fortunewheel.FortuneWheel;
import fortunewheel.fortunewheel.staticvariables.WheelItems;
import org.bukkit.ChatColor;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;



public class prizes implements CommandExecutor {

FortuneWheel fw;
    public  prizes(FortuneWheel plugin) {

        fw = plugin;

    }


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String  [] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only Players can use this command");


            return true;
        }


        WheelItems wI = WheelItems.getInstance();

        Player player = (Player) sender;

        player.sendMessage(ChatColor.GREEN + "Common 1 = " + wI.getCommon1().name + " 25% Chance");
        player.sendMessage(ChatColor.GREEN + "Common 2 = " + wI.getCommon2().name + " 25% Chance");

        player.sendMessage(ChatColor.BLUE + "Uncommon 1 = " + wI.getUncommon1().name + " 10% Chance");
        player.sendMessage(ChatColor.BLUE + "Uncommon 2 = " + wI.getUncommon2().name + " 10% Chance");
        player.sendMessage(ChatColor.BLUE + "Uncommon 3 = " + wI.getUncommon3().name + " 10% Chance");
        player.sendMessage(ChatColor.BLUE + "Uncommon 4 = " + wI.getUncommon4().name + " 10% Chance");
        player.sendMessage(ChatColor.BLUE + "Uncommon 5 = " + wI.getUncommon5().name + " 10% Chance");

        player.sendMessage(ChatColor.DARK_PURPLE + "Rare 1 = " + wI.getRare1().name + " 4.5% Chance");
        player.sendMessage(ChatColor.DARK_PURPLE + "Rare 2 = " + wI.getRare2().name + " 4.5% Chance");
        player.sendMessage(ChatColor.DARK_PURPLE + "Rare 3 = " + wI.getRare3().name + " 4.5% Chance");
        player.sendMessage(ChatColor.DARK_PURPLE + "Rare 4 = " + wI.getRare4().name + " 4.5% Chance");

        player.sendMessage(ChatColor.GOLD + "Legendary 1 = " + wI.getLegend1().name + " 1% Chance");
        player.sendMessage(ChatColor.GOLD + "Legendary 2 = " + wI.getLegend2().name + " 1% Chance");
        player.sendMessage(ChatColor.GOLD + "Legendary 3 = " + wI.getLegend3().name + " 1% Chance");

        player.sendMessage(ChatColor.DARK_RED + "Mythic 1 = " + wI.getMythic1().name + " 0.5% Chance");
        player.sendMessage(ChatColor.DARK_RED + "Mythic 2 = " + wI.getMythic2().name + " 0.5% Chance");
        player.sendMessage(ChatColor.DARK_RED + "Mythic 3 = " + wI.getMythic3().name + " 0.5% Chance");


        return  true;
    }


}
