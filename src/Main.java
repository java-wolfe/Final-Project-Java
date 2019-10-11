import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        //This is the main for the project and we'll call the other ones here.

        Scanner input = new Scanner(System.in);
        int userDirection1;
        int yesNo;
        int yesNoOne;
        int quitChoice = 999;

        do {
            System.out.println("You wake up in a dark room, You get up and start to walk towards the door that is cracked open...");
            System.out.println("The sun hits your eyes and you can't see, after your eyes adjust to the light you start down the street.");
            System.out.println("Up a head you see an intersection now you have to choose with direction you want to go.");
            System.out.println("Enter \n1 - right \n2 - straight \n3 - left \n999 - Quit the game");
            Graphics.defaultStart();
            userDirection1 = input.nextInt();

            if (userDirection1 == 1) {
                System.out.println("You started to walk down the right path.");
                Graphics.directionRight();
                System.out.println("You come across an old warehouse, with a sign that reads Johns Construction!");
                System.out.println("Do you want to explore the warehouse? \n1 - Yes \n2 - No");
                yesNo = input.nextInt();

                if (yesNo == 1) {
                    System.out.println("You make your way into the warehouse and see a lot of dust and comb webs... " +
                            "\nOn the ground next to an old machine you find a lead pipe, do you want to pick it up \n1 - yes \n2 - no");
                    yesNoOne = input.nextInt();

                    if (yesNoOne == 1){
                        System.out.println("You pick up the lead pipe and keep walking, you find nothing in the warehouse... So you leave");
                        System.out.println("You come back to the 3 directions and now have to choice again");
                    }

                } else if (yesNo == 2) {
                    System.out.println("You walk back to the intersection to explore some more.");
                }

            }
            else if (userDirection1 == 2) {
                System.out.println("You started to walk straight down the path.");
                Graphics.directionStraight();

            }
            else if (userDirection1 == 3) {
                System.out.println("You start to walk down the left path.");
                Graphics.directionLeft();
            }

        }while (quitChoice != 999);

    }
}
