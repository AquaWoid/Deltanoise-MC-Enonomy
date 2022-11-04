package fortunewheel.fortunewheel;

import fortunewheel.fortunewheel.commands.*;
import fortunewheel.fortunewheel.handlers.ConversionHandler;
import fortunewheel.fortunewheel.staticvariables.WheelItems;
import org.bukkit.Bukkit;
import org.bukkit.plugin.java.JavaPlugin;

public final class FortuneWheel extends JavaPlugin {

    @Override
    public void onEnable() {
        // Plugin startup logic
        Bukkit.getLogger().info("Fortune Wheel Loaded");

      //  saveDefaultConfig();

        WheelItems wh = new WheelItems();
        wh.GetCfg(this);

new ConversionHandler(this);

    try {

        getCommand("lottery").setExecutor((new lottery()));
        getCommand("reloadconfig").setExecutor((new reloadconfig(this)));
        getCommand("buyvoucher").setExecutor((new buyvoucher()));
        getCommand("prizes").setExecutor((new prizes(this)));
        getCommand("sendgold").setExecutor(new sendgold());

    }catch (Exception e) {
        Bukkit.getLogger().info("Error:" + e);

    }




    }

    @Override
    public void onDisable() {
        // Plugin shutdown logic
        Bukkit.getLogger().info("Fortune Wheel Shut Down");
    }


    }
