import java.util.Scanner;
import java.util.Random;

public class Room1 {

   public static void storyForRoomOne(){

       Scanner input = new Scanner(System.in);
       Random rand = new Random();

       int userChoice;
       int userHp = 15;
       int rand_pickAttack = rand.nextInt(5) + 1;
       int rand_pickDamage = rand.nextInt(5) + 1;

       System.out.println("You entered an old abandoned warehouse.. The windows are broken, glass is every where");
       System.out.println("You see a pipe on the ground, Should you pick it up or do you walk away?");
       System.out.println("1 - Yes Pick It Up \n2 - No Just Keep Walking");
       userChoice = input.nextInt();

       if (userChoice == 1){
           System.out.println("You pick up the pipe and started to explore again");
           System.out.println("As you continue to walk through the warehouse you hear something coming from the door down the hall");
           System.out.println("You open the door and a monster jumps at you, but you are prepared and you smack it in the " +
                   "\nmouth with the pipe you picked up back at the entrance of the warehouse ");
           System.out.println("That swing did " + rand_pickAttack + " damage to the monster, the monster swings back and scratches you.");
           System.out.println("The scratch did " + rand_pickDamage + " damage to you, you must protect yourself.");
           userHp = userHp - rand_pickDamage;
           System.out.println("YOU HEALTH IS NOW AT " + userHp + ".");
       }
       else if (userChoice == 2){
           System.out.println("You decided to walk past the pipe and explore with out protection");
           System.out.println("You find nothing and then you leave the warehouse empty handed :(");
       }
       else if (userHp <= 0){
           System.out.println("You open the door and a monster jumps at you, you don't have a weapon so hes getting closer and closer to your face..." +
                   "\n and finally it gets ya :(, you're now dead... Should've picked up the pipe when you had a chance.");
       }
   }
}
