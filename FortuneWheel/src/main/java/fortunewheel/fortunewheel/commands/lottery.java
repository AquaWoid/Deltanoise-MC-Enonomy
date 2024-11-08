package fortunewheel.fortunewheel.commands;

import fortunewheel.fortunewheel.staticvariables.WheelItems;
import fortunewheel.fortunewheel.staticvariables.wItem;

import org.bukkit.ChatColor;
import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.Inventory;
import org.bukkit.inventory.ItemStack;
import org.bukkit.scoreboard.*;

public class lottery implements CommandExecutor {


    public lottery() {


    }



    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String  [] args)
    {
    if(!(sender instanceof Player)) {
    sender.sendMessage("Only Players can use this command");


        return true;
    }

    try {
        if(Integer.parseInt(args[0]) >= 1) {
            for (int i = 1; i <= Integer.parseInt(args[0]); i++) {
                wheelSpin(sender,Integer.parseInt(args[0]) );
            }
        }
    }catch (Exception e) {
        wheelSpin(sender, 1);
    }


        return true;
}

    Void wheelSpin(CommandSender sender, int tries) {



        WheelItems w_items = WheelItems.getInstance();

        int rnd = (int)(Math.random() * 200 + 1);

        Player player = (Player) sender;

       Inventory inv_a = player.getInventory();
       int free_item_slot_count = 0;

       for (ItemStack item: inv_a.getStorageContents()){
           if(item == null) {
               free_item_slot_count += 1;
           }
       }


       if(free_item_slot_count >= tries) {


           Scoreboard scoreboard = player.getScoreboard();

           if (scoreboard.getObjective("lotteryvoucher") == null) {

               scoreboard.registerNewObjective("lotteryvoucher", Criteria.DUMMY, "money", RenderType.INTEGER);
           }

           if (scoreboard.getObjective("money") == null) {
               scoreboard.registerNewObjective("money", Criteria.DUMMY, "money", RenderType.INTEGER);
           }

           Objective objective = scoreboard.getObjective("lotteryvoucher");
           Score lvScore = objective.getScore(player.getName());

           if (lvScore.getScore() <= 0) {

               player.sendMessage(ChatColor.RED + "Out of vouchers");

           }

           if (lvScore.getScore() >= 1) {

               if (rnd == 1) {
                    wItem item = w_items.getMythic1();
                   ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                Stack.setAmount(item.count);
                   player.getInventory().addItem(Stack);
                   player.sendMessage(ChatColor.DARK_RED + "Got " + item.count + " " + item.name +  " (0.5% Chance)");


               }
               if (rnd == 2) {
                   wItem item = w_items.getMythic2();
                   ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                Stack.setAmount(item.count);
                   player.getInventory().addItem(Stack);
                   player.sendMessage(ChatColor.DARK_RED + "Got " + item.count + " " + item.name +  " (0.5% Chance)");
               }
               if (rnd == 3) {
                wItem item = w_items.getMythic3();
                ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                Stack.setAmount(item.count);
                   player.getInventory().addItem(Stack);
                   player.sendMessage(ChatColor.DARK_RED +  "Got " + item.count + " " + item.name +  " (0.5% Chance)");
               }

               if (rnd == 4 || rnd == 5) {
                wItem item = w_items.getLegend1();
                ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                Stack.setAmount(item.count);
                   player.getInventory().addItem(Stack);
                   player.sendMessage(ChatColor.GOLD +  "Got " + item.count + " " + item.name +  " (1% Chance)");
               }
               if (rnd == 6 || rnd == 7) {
                wItem item = w_items.getLegend2();
                ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                Stack.setAmount(item.count);
                   player.getInventory().addItem(Stack);
                   player.sendMessage(ChatColor.GOLD +  "Got " + item.count + " " + item.name +  " (1% Chance)");
               }
               if (rnd == 8 || rnd == 9) {
                wItem item = w_items.getLegend3();
                ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                Stack.setAmount(item.count);
                   player.getInventory().addItem(Stack);
                   player.sendMessage(ChatColor.GOLD +  "Got " + item.count + " " + item.name +  " (1% Chance)");
               }


               if (rnd >= 10 && rnd < 20) {
                wItem item = w_items.getRare1();
                ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                Stack.setAmount(item.count);
                   player.getInventory().addItem(Stack);
                   player.sendMessage(ChatColor.DARK_PURPLE +  "Got " + item.count + " " + item.name +  " (4.5% Chance)");
               }

               if (rnd >= 20 && rnd < 30) {
                wItem item = w_items.getRare2();
                ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                Stack.setAmount(item.count);
                   player.getInventory().addItem(Stack);
                   player.sendMessage(ChatColor.DARK_PURPLE +  "Got " + item.count + " " + item.name +  " (4.5% Chance)");
               }

               if (rnd >= 30 && rnd < 40) {
                wItem item = w_items.getRare3();
                ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                Stack.setAmount(item.count);
                   player.getInventory().addItem(Stack);
                   player.sendMessage(ChatColor.DARK_PURPLE +  "Got " + item.count + " " + item.name +  " (4.5% Chance)");
               }

               if (rnd >= 40 && rnd < 50) {
                wItem item = w_items.getRare4();
                ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                Stack.setAmount(item.count);
                   player.getInventory().addItem(Stack);
                   player.sendMessage(ChatColor.DARK_PURPLE +  "Got " + item.count + " " + item.name +  " (4.5% Chance)");
               }

               if (rnd >= 50 && rnd < 60) {
                   wItem item = w_items.getUncommon1();
                   ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                   Stack.setAmount(item.count);

                   player.getInventory().addItem(Stack);


                   player.sendMessage(ChatColor.BLUE +  "Got " + item.count + " " + item.name +  " (10% Chance)");
               }

               if (rnd >= 60 && rnd < 70) {
                wItem item = w_items.getUncommon2();
                ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                Stack.setAmount(item.count);
                   player.getInventory().addItem(Stack);


                   player.sendMessage(ChatColor.BLUE +  "Got " + item.count + " " + item.name + " (10% Chance)");
               }

               if (rnd >= 70 && rnd < 80) {
                wItem item = w_items.getUncommon3();
                ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                Stack.setAmount(item.count);
                   player.getInventory().addItem(Stack);
                   player.sendMessage(ChatColor.BLUE +  "Got " + item.count + " " + item.name +  " (10% Chance)");
               }

               if (rnd >= 80 && rnd < 90) {
                wItem item = w_items.getUncommon4();
                ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                Stack.setAmount(item.count);
                   player.getInventory().addItem(Stack);
                   player.sendMessage(ChatColor.BLUE +  "Got " + item.count + " " + item.name + " (10% Chance)");
               }

               if (rnd >= 90 && rnd < 100) {
                   //wItem c5 = w_items.getCommon1Item();
                   wItem item = w_items.getUncommon5();
                   ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                   Stack.setAmount(item.count);
                   player.getInventory().addItem(Stack);
                   player.sendMessage(ChatColor.BLUE + "Got " + item.count + " " + item.name + " (10% Chance)");
               }

               if (rnd >= 100 && rnd < 150) {
                //wItem c5 = w_items.getCommon1Item();
                wItem item = w_items.getCommon1();
                ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                Stack.setAmount(item.count);
                player.getInventory().addItem(Stack);
                player.sendMessage(ChatColor.GREEN + "Got " + item.count + " " + item.name + " (25% Chance)");
            }

            /*
             * 
               if (rnd >= 100 && rnd < 150) {
                   //   player.getInventory().addItem(new ItemStack(Material.GRASS_BLOCK));
                   try {
                       player.getInventory().addItem(new ItemStack(Material.matchMaterial(w_items.getCommon1())));
                   } catch (Exception e) {

                       player.getInventory().addItem(new ItemStack(Material.GRASS_BLOCK));
                       player.sendMessage("Couldnt find common1");
                   }

                   player.sendMessage(ChatColor.GREEN + "Got 1 " + w_items.getCommon1() + " (50% Chance)");
               }


               if (rnd >= 150 && rnd <= 200) {


                   try {
                       player.getInventory().addItem(new ItemStack(Material.matchMaterial(w_items.getCommon2())));
                   } catch (Exception e) {

                       player.getInventory().addItem(new ItemStack(Material.NAME_TAG));
                       player.sendMessage("Couldnt find common2");

                   }
                   player.sendMessage(ChatColor.GREEN + "Got 1 " + w_items.getCommon2() + " (25% Chance)");
               }



             * 
             */

               if (rnd >= 150 && rnd <= 200) {

                wItem item = w_items.getCommon2();
                ItemStack Stack = new ItemStack(Material.matchMaterial(item.name));
                Stack.setAmount(item.count);
                player.getInventory().addItem(Stack);
                player.sendMessage(ChatColor.GREEN + "Got " + item.count + " " + item.name + " (25% Chance)");
               }


               int tempScore = lvScore.getScore();
               int fScore = (tempScore - 1);

               lvScore.setScore(fScore);
               //     player.sendMessage("Your number was: " + ChatColor.BLUE + rnd);
               player.sendMessage("Remaining Lottery Voucher(s): " + ChatColor.GOLD + lvScore.getScore());
           }
       }else {
           player.sendMessage(ChatColor.RED + "Not enough space, you have " +  free_item_slot_count + " free Slots. You still need " + (tries - free_item_slot_count) + " slots");
       }
        return null;

    }



}
