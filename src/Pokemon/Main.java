package Pokemon;

import java.util.Random;
import java.util.Scanner;

public class Main
{
    public void start(){
        assignPokemon();
    }

    Scanner scanner = new Scanner(System.in);
    Random generator = new Random();

 public static void main(String[] args) {
     Main x = new Main();
     x.start();
 }
 // ASSIGN THE SPECIFIC POKEMON
 public void  assignPokemon() {
     int round;
     Pokemon p1 = null;
     Pokemon p2 = null;

     Users u1 = new Users(p1);
     Users u2 = new Users(p2);
     System.out.println("enter odd numbers of round");
     round = Integer.parseInt(scanner.nextLine());
     System.out.println();
     for (int i = 1; i <= round; i++) {
         System.out.printf("rounds %d\n", i);
         System.out.println("Player 1 enter the stats for pokemon");
         p1 = createPokemon();
         System.out.println("Player 2 enter the stats for pokemon");
         p2 = createPokemon();
         System.out.println();
         //BATTLE PART
         while (p1.hitPoints > 0 && p2.hitPoints > 0) {
             if (p1.speed > p2.speed) {
                 p2.setHitPoints(p2.getHitPoints() - p1.getHitPower());
                 //System.out.printf("%s used %s on %s", p1.name, p1.moveName, p2.name);
                 if (p2.hitPoints < 0) {
                     System.out.printf("player 1's %s win's this round\n", p1.getName());
                     p1.addWins();
                 }
                 p1.setHitPoints(p1.getHitPoints() - p2.getHitPower());
                 if (p1.hitPoints < 0) {
                     System.out.printf("player 2's %s win's this round\n", p2.getName());
                     p2.addWins();
                 }
             } else if (p2.speed > p1.speed)
             {
                 p1.setHitPoints(p1.getHitPoints() - p2.getHitPower());
                 if (p1.hitPoints < 0) {
                     System.out.printf("player 2's %s win's this round\n", p2.getName());
                     p2.addWins();
                 }
                 p2.setHitPoints(p2.getHitPoints() - p1.getHitPower());
                 if (p2.hitPoints < 0) {
                     System.out.printf("player 1's %s win's this round\n", p1.getName());
                     p1.addWins();
                 }
             }
             else {
                 int num = generator.nextInt(2);
                 if (num == 1) {
                     p2.setHitPoints(p2.getHitPoints() - p1.getHitPower());
                     if (p2.hitPoints < 0) {
                         System.out.printf("player 2's %s win's this round\n", p1.getName());
                         p1.addWins();
                     }
                     p1.setHitPoints(p1.getHitPoints() - p2.getHitPower());
                     if (p1.hitPoints < 0) {
                         System.out.printf("player 2's %s win's this round\n", p2.getName());
                         p2.addWins();
                     }
                 } else {
                     p1.setHitPoints(p1.getHitPoints() - p2.getHitPower());
                     if (p1.hitPoints < 0) {
                         System.out.printf("player 2's %s win's this round\n", p2.getName());
                         p2.addWins();
                     }
                     p2.setHitPoints(p2.getHitPoints() - p1.getHitPower());
                     if (p2.hitPoints < 0) {
                         System.out.printf("player 1's %s win's this round\n", p1.getName());
                         p1.addWins();
                     }
                 }
             }
         }
         if (i == round) {
             System.out.println("Final score");
             System.out.println("-----------");
         } else {
             System.out.println("\n wins");
             System.out.println("=============");
         }
         u1.addsWins(p1.getPokeWins());
         u2.addsWins(p2.getPokeWins());

         System.out.printf("player 1: %d\nplayer 2:%d\n\n", u1.getWins(), u2.getWins());
     }
     if (p1.getPokeWins() > p2.getPokeWins()) {
         System.out.println("player 1 wins the game (good shit)");
     } else {
         System.out.println("player 2 wins the game (never doubted you for a second)");
     }
 }
     //END OF ASSIGN FUNCTION

// CREATE  IT
              public Pokemon createPokemon ()
              {
                  System.out.println("Name:");
                  String name = scanner.nextLine();

                  System.out.println("HitPoints:");
                  int hitPoints = Integer.parseInt(scanner.nextLine());

                  System.out.println("HitPower:");
                  int hitPower = Integer.parseInt(scanner.nextLine());

                  System.out.println("Speed:");
                  int speed = Integer.parseInt(scanner.nextLine());

                  System.out.println("Move Name:");
                  String moveName = scanner.nextLine();


                  Pokemon Poke = new Pokemon(name, hitPoints, hitPower, speed, moveName);
                  return Poke;

              }

}