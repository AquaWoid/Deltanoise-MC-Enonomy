package fortunewheel.fortunewheel.commands;

import fortunewheel.fortunewheel.FortuneWheel;
import fortunewheel.fortunewheel.staticvariables.WheelItems;
import org.bukkit.Bukkit;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;

public class reloadconfig implements CommandExecutor {


    FortuneWheel fw;

public  reloadconfig(FortuneWheel plugin) {
    fw = plugin;
    Bukkit.getLogger().info("Plugin = " + plugin.getName());
}


    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String  [] args) {
        if (!(sender instanceof Player)) {
            sender.sendMessage("Only Players can use this command");


            return true;
        }

       // if(sender.hasPermission("FortuneWheel.command.reloadconfig")) {        }

        fw.reloadConfig();

        WheelItems wI = WheelItems.getInstance();
        wI.GetCfg(fw);

        Bukkit.getLogger().info("DEBUG: common 1 = " + wI.getCommon1());

        Player player = (Player) sender;

        player.sendMessage("Fortune Wheel Config Reloaded");
        player.sendMessage("DEBUG: common 1 = " + wI.getCommon1());




return true;
    }
}
