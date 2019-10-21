import java.util.Random;
import java.util.Scanner;

public class Room3 {

    public static void StoryForRoom3(){

        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int userChoice;
        int userHp = 15;
        int rand_pickAttack = rand.nextInt(5) + 1;
        int rand_pickDamage = rand.nextInt(5) + 1;

        System.out.println("you walk across an abandoned store, Should you go in or walk past it?");
        System.out.println("1 - Yes Go Into The Store \n2 - No Just Keep Walking");
        userChoice = input.nextInt();

        if (userChoice == 1){
            System.out.println("You go into the store for supplies you might need");
            System.out.println("As you walk in the store you see a metal bat on the ground");
            System.out.println("So you decided to pick up the bat and start to explore again");
            System.out.println("Suddenly you hear something that is only a couple feet away");
            System.out.println("You go to see what it is and a monster jumps at you, but you are prepared and hit it with the bat");
            System.out.println("That swing did " + rand_pickAttack + " damage to the monster, the monster swings back and scratches you.");
            System.out.println("The scratch did " + rand_pickDamage + " damage to you, you must protect yourself.");
            userHp = userHp - rand_pickDamage;
            System.out.println("YOU HEALTH IS NOW AT " + userHp + ".");
        }
        else if (userChoice == 2){
            System.out.println("You decide to walk past the store and walk empty handed");
        }
    }
}
