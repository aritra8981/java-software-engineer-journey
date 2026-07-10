package Day_3_Java_Conditionals;

import java.util.Scanner;

public class CheckEvenOdd {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the Number to check: ");
        int num = input.nextInt();
        input.nextLine();
        if (num % 2 == 0){
            System.out.println("The number " + num + " is Even Number.");
        }else {
            System.out.println("The number " + num + " is Odd Number.");
        }
    }
}
