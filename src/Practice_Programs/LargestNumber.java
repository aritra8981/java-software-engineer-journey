package Practice_Programs;

import java.util.Scanner;

public class LargestNumber {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the First Number: ");
        int firstNumber = input.nextInt();
        System.out.println("Enter the second Number: ");
        int secondNumber = input.nextInt();
        System.out.println("Enter the third Number: ");
        int thirdNumber = input.nextInt();

        if (firstNumber > secondNumber) {
            if (firstNumber > thirdNumber) {
                System.out.println("First Number: " + firstNumber + " is the Largest Number.");
            } else {
                System.out.println("Third Number: " + thirdNumber + " is the Largest Number.");
            }
        } else if (secondNumber > thirdNumber) {
            System.out.println("Second Number: " + secondNumber + " is the Largest Number.");
        } else {
            System.out.println("Third Number: " + thirdNumber + " is the Largest Number.");
        }
        input.close();
    }
}
