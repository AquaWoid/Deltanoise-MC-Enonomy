package fortunewheel.fortunewheel.handlers;

import fortunewheel.fortunewheel.FortuneWheel;
import org.bukkit.Bukkit;
import org.bukkit.ChatColor;
import org.bukkit.entity.EntityType;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.entity.EntityDeathEvent;
import org.bukkit.scoreboard.*;


public class ConversionHandler implements Listener {

public ConversionHandler(FortuneWheel plugin) {

    Bukkit.getPluginManager().registerEvents(this, plugin);

}


@EventHandler
    public void onZombieDeath(EntityDeathEvent zEvent){
/// NERF ZONE ///
    int rnd = (int)(Math.random() * 200 + 1);
    int rnd_bonus = (int)(Math.random() * 600 + 200);
/// NERF ZONE ///


    if(zEvent.getEntityType() == EntityType.ZOMBIE) {
   Player player = (Player) zEvent.getEntity().getKiller();

   if(player != null) {

       Scoreboard scoreboard = player.getScoreboard();


       if (scoreboard.getObjective("money") == null) {
           scoreboard.registerNewObjective("money", Criteria.DUMMY, "money", RenderType.INTEGER);
       }

       Objective objective = scoreboard.getObjective("money");
       Score mScore = objective.getScore(player.getName());

       int tmp = mScore.getScore();
       int f = tmp + rnd;

       player.sendMessage(ChatColor.RED + "Looted " + rnd + " Money from Zombie");

       if(rnd >= 10 && rnd <= 20) {
           f += rnd_bonus;
           player.sendMessage(ChatColor.GOLD + "Got " + (rnd_bonus) + " Bonus money");
       }
       mScore.setScore(f);


   }

    }

    if(zEvent.getEntityType() == EntityType.DROWNED) {

        Player player = (Player) zEvent.getEntity().getKiller();

        if (player != null) {

            Scoreboard scoreboard = player.getScoreboard();
            Objective objective = scoreboard.getObjective("money");
            Score mScore = objective.getScore(player.getName());

            int tmp = mScore.getScore();
            int f = tmp + rnd;
            player.sendMessage(ChatColor.RED + "Looted " + rnd + " Money from Drowned");
            if(rnd >= 10 && rnd <= 20) {
                f += rnd_bonus;
                player.sendMessage(ChatColor.GOLD + "Got " + (rnd_bonus) + " Bonus money");
            }
            mScore.setScore(f);

        }


    }

    if(zEvent.getEntityType() == EntityType.SKELETON) {

        Player player = (Player) zEvent.getEntity().getKiller();

        if (player != null) {

            Scoreboard scoreboard = player.getScoreboard();
            Objective objective = scoreboard.getObjective("money");
            Score mScore = objective.getScore(player.getName());

            int tmp = mScore.getScore();
            int f = tmp + rnd;
            player.sendMessage(ChatColor.RED + "Looted " + rnd + " Money from Skeleton");
            if(rnd >= 10 && rnd <= 20) {
                f += rnd_bonus;
                player.sendMessage(ChatColor.GOLD + "Got " + (rnd_bonus) + " Bonus money");
            }
            mScore.setScore(f);

        }


    }

    if(zEvent.getEntityType() == EntityType.SPIDER) {

        Player player = (Player) zEvent.getEntity().getKiller();

        if (player != null) {

            Scoreboard scoreboard = player.getScoreboard();
            Objective objective = scoreboard.getObjective("money");
            Score mScore = objective.getScore(player.getName());

            int tmp = mScore.getScore();
            int f = tmp + rnd;
            player.sendMessage(ChatColor.RED + "Looted " + rnd + " Money from Spider");
            if(rnd >= 10 && rnd <= 20) {
                f += rnd_bonus;
                player.sendMessage(ChatColor.GOLD + "Got " + (rnd_bonus) + " Bonus money");
            }
            mScore.setScore(f);

        }


    }

    if(zEvent.getEntityType() == EntityType.CREEPER) {

        Player player = (Player) zEvent.getEntity().getKiller();

        if (player != null) {

            Scoreboard scoreboard = player.getScoreboard();
            Objective objective = scoreboard.getObjective("money");
            Score mScore = objective.getScore(player.getName());

            int tmp = mScore.getScore();
            int f = tmp + (100 +(rnd * 2));
            player.sendMessage(ChatColor.RED + "Looted " + (100 +(rnd * 2)) + " Money from Creeper");
            if(rnd >= 10 && rnd <= 20) {
                f += rnd_bonus;
                player.sendMessage(ChatColor.GOLD + "Got " + (rnd_bonus) + " Bonus money");
            }
            mScore.setScore(f);

        }


    }

    if(zEvent.getEntityType() == EntityType.PIGLIN) {

        Player player = (Player) zEvent.getEntity().getKiller();

        if (player != null) {

            Scoreboard scoreboard = player.getScoreboard();
            Objective objective = scoreboard.getObjective("money");
            Score mScore = objective.getScore(player.getName());

            int tmp = mScore.getScore();
            int f = tmp + rnd;
            player.sendMessage(ChatColor.RED + "Looted " + rnd + " Money from Piglin");
            if(rnd >= 10 && rnd <= 20) {
                f += rnd_bonus;
                player.sendMessage(ChatColor.GOLD + "Got " + (rnd_bonus) + " Bonus money");
            }
            mScore.setScore(f);

        }


    }

    if(zEvent.getEntityType() == EntityType.PILLAGER) {

        Player player = (Player) zEvent.getEntity().getKiller();

        if (player != null) {

            Scoreboard scoreboard = player.getScoreboard();
            Objective objective = scoreboard.getObjective("money");
            Score mScore = objective.getScore(player.getName());

            int tmp = mScore.getScore();
            int f = tmp + rnd;
            player.sendMessage(ChatColor.RED + "Looted " + rnd + " Money from Pillager");
            if(rnd >= 10 && rnd <= 20) {
                f += rnd_bonus;
                player.sendMessage(ChatColor.GOLD + "Got " + (rnd_bonus) + " Bonus money");
            }
            mScore.setScore(f);

        }


    }

    if(zEvent.getEntityType() == EntityType.ZOMBIE_VILLAGER) {

        Player player = (Player) zEvent.getEntity().getKiller();

        if (player != null) {

            Scoreboard scoreboard = player.getScoreboard();
            Objective objective = scoreboard.getObjective("money");
            Score mScore = objective.getScore(player.getName());

            int tmp = mScore.getScore();
            int f = tmp + rnd;
            player.sendMessage(ChatColor.RED + "Looted " + rnd + " Money from Zombie Villager");
            if(rnd >= 10 && rnd <= 20) {
                f += rnd_bonus;
                player.sendMessage(ChatColor.GOLD + "Got " + (rnd_bonus) + " Bonus money");
            }
            mScore.setScore(f);

        }


    }

    if(zEvent.getEntityType() == EntityType.PHANTOM) {

        Player player = (Player) zEvent.getEntity().getKiller();

        if (player != null) {

            Scoreboard scoreboard = player.getScoreboard();
            Objective objective = scoreboard.getObjective("money");
            Score mScore = objective.getScore(player.getName());

            int tmp = mScore.getScore();
            int f = tmp + (100 + (rnd * 2));
            player.sendMessage(ChatColor.RED + "Looted " + (100 + (rnd * 2)) + " Money from Phantom");
            if(rnd >= 10 && rnd <= 20) {
                f += rnd_bonus;
                player.sendMessage(ChatColor.GOLD + "Got " + (rnd_bonus) + " Bonus money");
            }
            mScore.setScore(f);

        }


    }

    if(zEvent.getEntityType() == EntityType.WITCH) {

        Player player = (Player) zEvent.getEntity().getKiller();

        if (player != null) {

            Scoreboard scoreboard = player.getScoreboard();
            Objective objective = scoreboard.getObjective("money");
            Score mScore = objective.getScore(player.getName());

            int tmp = mScore.getScore();
            int f = tmp + (100 + (rnd * 3));
            player.sendMessage(ChatColor.RED + "Looted " + (100 + (rnd * 3)) + " Money from Witch");
            if(rnd >= 10 && rnd <= 20) {
                f += rnd_bonus;
                player.sendMessage(ChatColor.GOLD + "Got " + (rnd_bonus) + " Bonus money");
            }
            mScore.setScore(f);

        }


    }

    if(zEvent.getEntityType() == EntityType.ENDERMAN) {

        Player player = (Player) zEvent.getEntity().getKiller();

        if (player != null) {

            Scoreboard scoreboard = player.getScoreboard();
            Objective objective = scoreboard.getObjective("money");
            Score mScore = objective.getScore(player.getName());

            int tmp = mScore.getScore();
            int f = tmp + (100 + (rnd * 3));
            player.sendMessage(ChatColor.RED + "Looted " + (100 + (rnd * 3)) + " Money from Enderman");
            if(rnd >= 10 && rnd <= 20) {
                f += rnd_bonus;
                player.sendMessage(ChatColor.GOLD + "Got " + (rnd_bonus) + " Bonus money");
            }
            mScore.setScore(f);

        }


    }
/// NERF ZONE ///
    if(zEvent.getEntityType() == EntityType.ZOMBIFIED_PIGLIN) {

        Player player = (Player) zEvent.getEntity().getKiller();

        if (player != null) {

            Scoreboard scoreboard = player.getScoreboard();
            Objective objective = scoreboard.getObjective("money");
            Score mScore = objective.getScore(player.getName());

            int tmp = mScore.getScore();
            int f = tmp + (100 + (rnd * 2));
            player.sendMessage(ChatColor.RED + "Looted " + (100 + (rnd * 2)) + " Money from Zombified Piglin");
            if(rnd >= 10 && rnd <= 20) {
                f += rnd_bonus;
                player.sendMessage(ChatColor.GOLD + "Got " + (rnd_bonus) + " Bonus money");
            }
            mScore.setScore(f);

        }
/// NERF ZONE ///

    }

    if(zEvent.getEntityType() == EntityType.MAGMA_CUBE) {

        Player player = (Player) zEvent.getEntity().getKiller();

        if (player != null) {

            Scoreboard scoreboard = player.getScoreboard();
            Objective objective = scoreboard.getObjective("money");
            Score mScore = objective.getScore(player.getName());

            int tmp = mScore.getScore();
            int f = tmp + (100 + (rnd * 1));
            player.sendMessage(ChatColor.RED + "Looted " + (100 + (rnd * 1)) + " Money from Magma Cube");
            if(rnd >= 10 && rnd <= 20) {
                f += rnd_bonus;
                player.sendMessage(ChatColor.GOLD + "Got " + (rnd_bonus) + " Bonus money");
            }
            mScore.setScore(f);

        }


    }

    if(zEvent.getEntityType() == EntityType.BLAZE) {

        Player player = (Player) zEvent.getEntity().getKiller();

        if (player != null) {

            Scoreboard scoreboard = player.getScoreboard();
            Objective objective = scoreboard.getObjective("money");
            Score mScore = objective.getScore(player.getName());

            int tmp = mScore.getScore();
            int f = tmp + (100 + (rnd * 2));
            player.sendMessage(ChatColor.RED + "Looted " + (100 + (rnd * 2)) + " Money from Blaze");
            if(rnd >= 10 && rnd <= 20) {
                f += rnd_bonus;
                player.sendMessage(ChatColor.GOLD + "Got  " + (rnd_bonus) + " Bonus money");
            }
            mScore.setScore(f);

        }


    }

    if(zEvent.getEntityType() == EntityType.WITHER_SKELETON) {

        Player player = (Player) zEvent.getEntity().getKiller();

        if (player != null) {

            Scoreboard scoreboard = player.getScoreboard();
            Objective objective = scoreboard.getObjective("money");
            Score mScore = objective.getScore(player.getName());

            int tmp = mScore.getScore();
            int f = tmp + (100 + (rnd * 2));
            player.sendMessage(ChatColor.RED + "Looted " + (100 + (rnd * 2)) + " Money from Wither Skeleton");
            if(rnd >= 10 && rnd <= 20) {
                f += rnd_bonus;
                player.sendMessage(ChatColor.GOLD + "Got  " + (rnd_bonus) + " Bonus money");
            }
            mScore.setScore(f);

        }


    }

    if(zEvent.getEntityType() == EntityType.GHAST) {

        Player player = (Player) zEvent.getEntity().getKiller();

        if (player != null) {

            Scoreboard scoreboard = player.getScoreboard();
            Objective objective = scoreboard.getObjective("money");
            Score mScore = objective.getScore(player.getName());

            int tmp = mScore.getScore();
            int f = tmp + (100 + (rnd * 3));
            player.sendMessage(ChatColor.RED + "Looted " + (100 + (rnd * 3)) + " Money from Ghast");
            if(rnd >= 10 && rnd <= 20) {
                f += rnd_bonus;
                player.sendMessage(ChatColor.GOLD + "Got  " + (rnd_bonus) + " Bonus money");
            }
            mScore.setScore(f);

        }


    }

    if(zEvent.getEntityType() == EntityType.WARDEN) {

        Player player = (Player) zEvent.getEntity().getKiller();

        if (player != null) {

            Scoreboard scoreboard = player.getScoreboard();
            Objective objective = scoreboard.getObjective("money");
            Score mScore = objective.getScore(player.getName());

            int tmp = mScore.getScore();
            int f = tmp + (2500 + (rnd * 10));
            player.sendMessage(ChatColor.RED + "Looted " + (2500 + (rnd * 10)) + " Money from Warden");
            if(rnd >= 10 && rnd <= 20) {
                f += rnd_bonus;
                player.sendMessage(ChatColor.GOLD + "Got " + (rnd_bonus) + " Bonus money");
            }
            mScore.setScore(f);

        }


    }



    }
}



