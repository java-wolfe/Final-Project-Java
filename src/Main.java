import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        //This is the main for the project and we'll call the other ones here.

        Scanner input = new Scanner(System.in);
        int userDirection1;
        int userDirection2;
        int userDirection3;

        System.out.println("You wake up in a dark room, You get up and start to walk towards the door that is cracked open...");
        System.out.println("The sun hits your eyes and you can't see, after your eyes adjust to the light you start down the street.");
        System.out.println("Up a head you see an intersection now you have to choose with direction you want to go.");
        System.out.println("Enter \n1 - right \n2 - straight \n3 - left");
        userDirection1 = input.nextInt();

        if (userDirection1 == 1){
            System.out.println("You started to walk down the right path.");
        }
        else if (userDirection1 == 2){
            System.out.println("You started to walk straight down the path.");
        }
        else if (userDirection1 == 3){
            System.out.println("You start to walk down the right path.");
        }

    }

}
