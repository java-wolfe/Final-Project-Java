import java.util.Random;
import java.util.Scanner;

public class RandomNumber {

    public static void main(String[] args){

        Scanner input = new Scanner(System.in);
        Random rand = new Random();
        int choice = 999;
        int counter = 0;
        int rand_pick = rand.nextInt(50) + 1;
        while (choice != rand_pick) {
            System.out.println("Please pick a number between 1 and 100 >>>");
            choice = input.nextInt();

            if (choice == rand_pick) {
                System.out.println();
            } else if (choice > rand_pick) {
                System.out.println("Nope, it was lower. ");
            } else if (choice < rand_pick) {
                System.out.println("Nope, it was higher. ");
            }
            counter = counter + 1;

        }
        System.out.println("It took you " + counter + " chances");
    }
}