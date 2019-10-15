import java.util.Scanner;
import java.util.Random;

public class Room1 {

   public static void storyForRoomOne(){

       Scanner input = new Scanner(System.in);
       Random rand = new Random();

       int userChoice;
       int rand_pick = rand.nextInt(5) + 1;

       System.out.println("You entered an old abandoned warehouse.. The windows are broken, glass is every where");
       System.out.println("You see a pipe on the ground, Should you pick it up or do you walk away?");
       System.out.println("1 - Yes Pick It Up \n2 - No Just Keep Walking");
       userChoice = input.nextInt();

       if (userChoice == 1){
           System.out.println("You pick up the pipe and started to explore again");
           System.out.println("As you continue to walk through the warehouse you hear something coming from the door down the hall");
           System.out.println("You open the door and a monster jumps at you, but you are prepared and you smack it in the " +
                   "\nmouth with the pipe you picked up back at the entrance of the warehouse ");
           System.out.println("That swing did " + rand_pick + " damage to the monster, the monster swings back and scratches you.");
       }
       else if (userChoice == 2){
           System.out.println("You decided to walk past the pipe and explore with out");
           System.out.println("As you continue to walk through the warehouse you hear something coming from the door down the hall");
           System.out.println("You open the door and a monster jumps at you, you don't have a weapon so hes getting closer and closer to your face..." +
                   "\n and finally it gets ya :(, you're now dead... Should've picked up the pipe when you had a chance.");

       }

   }

}
