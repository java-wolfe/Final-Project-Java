import java.util.Scanner;
import java.util.Random;

public class Room2 {
    public static void storyForRoom2 (){
        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int userDirection1Room2 = 0;
        int userInputStayOrGo;
        int zombie1HP = 10;
        int userHp = 15;
        int countPlayerDeath = 0;
        int yesNoRoom2Two;
        int yesNoRoom2One;
        int rand_pickAttack = rand.nextInt(5) + 1;
        int rand_pickDamage = rand.nextInt(5) + 1;


        /// Main intro dialog
        System.out.println("Going down the straight path you come across a hospital");
        System.out.println("You can either explore the hospital or you can return to the original fork and further explore your options" +
                "Enter \n1 - To explore the hospital \n2 - Return to the main fork");
        userInputStayOrGo = input.nextInt();

        if(userInputStayOrGo == 1){
            /// If You explore the hospital
            System.out.println("You decided to look around the hospital");
            System.out.println("As soon as you go in you realize you have two options, left or right");
            System.out.println("Enter \n1 - right \n2 - left");
            Graphics.defaultHospital();
            userDirection1Room2 = input.nextInt();
        }
        else if(userInputStayOrGo == 2){
            // If They return to the main fork in the road
            System.out.println("You have decided you will revisit the hospital later and head back to the main fork.");
           StartGame.displayStartGame(0);


        }
        if(userDirection1Room2 == 2){
            /// If you go left
            System.out.println("You decide to head to the left first, and notice that you are in some sort of office space.");
            System.out.println("Before you can do anything in here you have to take on the zombie waiting for you");
            System.out.println("(¬º-°)¬");
            while(zombie1HP > 0 && countPlayerDeath < 1)
                System.out.println("That swing did " + rand_pickAttack + " damage to the monster, the monster swings back and scratches you.");
                zombie1HP = zombie1HP - rand_pickAttack;
                System.out.println("The zombie now has " + zombie1HP + " health remaining ");
                System.out.println("The scratch did " + rand_pickDamage + " damage to you, you must protect yourself.");
                userHp = userHp - rand_pickDamage;
                if(userHp <= 0)
                    countPlayerDeath = countPlayerDeath + 1 ;
            System.out.println("Heading into this space you see a notice board with miscellaneous notices but one in particular stands out.");
            System.out.println("The note reads WHOEVER IS READING THIS YOU ARE OUR LAST HOPE, COME TO THE CDC AND RETRIEVE THE CURE.");
            System.out.println("You notice on the back of the notice is a map of the area with a specific road highlighted");


        }







        /// If left is first decision
        System.out.println("You think it would be wise to explore the rest of your options before heading to the CDC" +
                "and return to the entrance of the hospital and got down the right path");
        /// If you go right
        System.out.println("You head down the right path and you come into a medical ward");
        System.out.println("Before you can do anything in here you have to take on the zombie waiting for you");
        System.out.println("You find multiple rooms with dead patients in them and you are able to scrounge up some medical supplies");
        System.out.println("You use the medical supplies and you regain half of your max HP");






    }
}
