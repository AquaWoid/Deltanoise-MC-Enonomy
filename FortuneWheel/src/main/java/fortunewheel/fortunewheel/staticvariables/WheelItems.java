package fortunewheel.fortunewheel.staticvariables;

import fortunewheel.fortunewheel.FortuneWheel;
import org.bukkit.Bukkit;
import org.bukkit.configuration.file.FileConfiguration;


class wItem {
    String name;
    int count;

    public wItem(String name, int count) {
        this.name = name;
        this.count = count;
    }
}



public class WheelItems {


    private static wItem m1;
    private static wItem c1;

    private static String mythic1;

    private static String mythic2;

    private static String mythic3;

    private static String legend1;
    private static String legend2;
    private static String legend3;

    private static String rare1;
    private static String rare2;
    private static String rare3;
    private static String rare4;

    private static String uncommon1;
    private static String uncommon2;
    private static String uncommon3;
    private static String uncommon4;
    private static String uncommon5;

    private static String common1;
    private static String common2;

    private static WheelItems instance;



public static WheelItems getInstance() {
    if(instance == null) {
        instance = new WheelItems();
    }
    return instance;
}


public void GetCfg(FortuneWheel fw) {



FileConfiguration config = fw.getConfig();

    m1 = new wItem (config.getString("mythical.mythic1"), config.getInt(String.format("mythical.mythic1.%s", config.getString("mythical.mythic1"))));
    c1 = new wItem (config.getString("common.common1"), config.getInt(String.format("common.common1.%s", config.getString("common.common1"))));

    m1.name = config.getString("mythical.mythic1");
    m1.count = config.getInt("counts.m1");

    mythic1  = config.getString("mythical.mythic1");
    Bukkit.getLogger().info("Mythic 1 = " + mythic1);
    mythic2 = config.getString("mythical.mythic2");
    mythic3  = config.getString("mythical.mythic3");
    Bukkit.getLogger().info("Mythic Config loaded");

    legend1  = config.getString("legendary.legend1");
    legend2  = config.getString("legendary.legend2");
    legend3  = config.getString("legendary.legend3");
    Bukkit.getLogger().info("Legendary Config loaded");

    rare1  = config.getString("rare.rare1");
    rare2  = config.getString("rare.rare2");
    rare3  = config.getString("rare.rare3");
    rare4  = config.getString("rare.rare4");
    Bukkit.getLogger().info("Rare Config loaded");

    uncommon1  = config.getString("uncommon.uncommon1");
    uncommon2  = config.getString("uncommon.uncommon2");
    uncommon3  = config.getString("uncommon.uncommon3");
    uncommon4  = config.getString("uncommon.uncommon4");
    uncommon5  = config.getString("uncommon.uncommon5");
    Bukkit.getLogger().info("Uncommon Config loaded");

    common1 = config.getString("common.common1");
    Bukkit.getLogger().info("common 1 = " + common1);
    common2  = config.getString("common.common2");
    Bukkit.getLogger().info("common 2 = " + common2);
    Bukkit.getLogger().info("Common Config loaded");


}

    public String getMythic1() {
        return mythic1;
    }

    public String getMythic2() {
        return mythic2;
    }

    public String getMythic3() {
        return mythic3;
    }

    public String getLegend1() {
        return legend1;
    }

    public String getLegend2() {
        return legend2;
    }

    public String getLegend3() {
        return legend3;
    }

    public String getRare1() {
        return rare1;
    }

    public String getRare2() {
        return rare2;
    }

    public String getRare3() {
        return rare3;
    }

    public  String getRare4() {
        return rare4;
    }

    public String getUncommon1() {
        return uncommon1;
    }

    public String getUncommon2() {
        return uncommon2;
    }

    public String getUncommon3() {
        return uncommon3;
    }

    public String getUncommon4() {
        return uncommon4;
    }

    public String getUncommon5() {
        return uncommon5;
    }

    public String getCommon1() {return common1;}


    public  String getCommon2() {return common2;}

    public wItem getCommon1Item() {
        return c1;
    }

}
