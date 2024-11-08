package fortunewheel.fortunewheel.staticvariables;

import fortunewheel.fortunewheel.FortuneWheel;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;





public class WheelItems {


    private static wItem mythic1;

    private static wItem mythic2;

    private static wItem mythic3;

    private static wItem legend1;
    private static wItem legend2;
    private static wItem legend3;

    private static wItem rare1;
    private static wItem rare2;
    private static wItem rare3;
    private static wItem rare4;

    private static wItem uncommon1;
    private static wItem uncommon2;
    private static wItem uncommon3;
    private static wItem uncommon4;
    private static wItem uncommon5;

    private static wItem common1;
    private static wItem common2;

    private static WheelItems instance;



public static WheelItems getInstance() {
    if(instance == null) {
        instance = new WheelItems();
    }
    return instance;
}


public void GetCfg(FortuneWheel fw) {



FileConfiguration config = fw.getConfig();



    mythic1  = new wItem (config.getString("mythical.mythic1.name"), config.getInt("mythical.mythic1.count"));
    Bukkit.getLogger().info("Mythic 1 = " + mythic1);
    mythic2 = new wItem (config.getString("mythical.mythic2.name"), config.getInt("mythical.mythic2.count"));
    mythic3  = new wItem (config.getString("mythical.mythic3.name"), config.getInt("mythical.mythic3.count"));
    Bukkit.getLogger().info("Mythic 2 = " + mythic2.name);
    Bukkit.getLogger().info("Mythic 3 = " + mythic3.name);
    Bukkit.getLogger().info("Mythic Config loaded");

    legend1  = new wItem (config.getString("legendary.legend1.name"), config.getInt("legendary.legend1.count"));
    legend2  = new wItem (config.getString("legendary.legend2.name"), config.getInt("legendary.legend2.count"));
    legend3  = new wItem (config.getString("legendary.legend3.name"), config.getInt("legendary.legend3.count"));
    Bukkit.getLogger().info("Legendary Config loaded");

    rare1  = new wItem (config.getString("rare.rare1.name"), config.getInt("rare.rare1.count"));
    rare2  = new wItem (config.getString("rare.rare2.name"), config.getInt("rare.rare2.count"));
    rare3  = new wItem (config.getString("rare.rare3.name"), config.getInt("rare.rare3.count"));
    rare4  = new wItem (config.getString("rare.rare4.name"), config.getInt("rare.rare4.count"));
    Bukkit.getLogger().info("Rare Config loaded");

    uncommon1  = new wItem (config.getString("uncommon.uncommon1.name"), config.getInt("uncommon.uncommon1.count"));
    uncommon2  = new wItem (config.getString("uncommon.uncommon2.name"), config.getInt("uncommon.uncommon2.count"));
    uncommon3  = new wItem (config.getString("uncommon.uncommon3.name"), config.getInt("uncommon.uncommon3.count"));
    uncommon4  = new wItem (config.getString("uncommon.uncommon4.name"), config.getInt("uncommon.uncommon4.count"));
    uncommon5  = new wItem (config.getString("uncommon.uncommon5.name"), config.getInt("uncommon.uncommon5.count"));
    Bukkit.getLogger().info("Uncommon Config loaded");

    common1 = new wItem (config.getString("common.common1.name"), config.getInt("common.common1.count"));
    Bukkit.getLogger().info("common 1 = " + common1);
    common2  = new wItem (config.getString("common.common2.name"), config.getInt("common.common2.count"));
    Bukkit.getLogger().info("common 2 = " + common2);
    Bukkit.getLogger().info("Common Config loaded");


}

    public wItem getMythic1() {
        return mythic1;
    }

    public wItem getMythic2() {
        return mythic2;
    }

    public wItem getMythic3() {
        return mythic3;
    }

    public wItem getLegend1() {
        return legend1;
    }

    public wItem getLegend2() {
        return legend2;
    }

    public wItem getLegend3() {
        return legend3;
    }

    public wItem getRare1() {
        return rare1;
    }

    public wItem getRare2() {
        return rare2;
    }

    public wItem getRare3() {
        return rare3;
    }

    public  wItem getRare4() {
        return rare4;
    }

    public wItem getUncommon1() {
        return uncommon1;
    }

    public wItem getUncommon2() {
        return uncommon2;
    }

    public wItem getUncommon3() {
        return uncommon3;
    }

    public wItem getUncommon4() {
        return uncommon4;
    }

    public wItem getUncommon5() {
        return uncommon5;
    }

    public wItem getCommon1() {return common1;}


    public  wItem getCommon2() {return common2;}



}
