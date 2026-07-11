package Practice_Programs;

//Problem Statement: Swapping numbers using third variable
//Using Assignment operator

import java.util.Scanner;

public class SwappingNumbers {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int firstnum = input.nextInt();
        System.out.println("Enter second Number: ");
        int secondnum = input.nextInt();

        int thirdnum = secondnum;
        secondnum = firstnum;
        firstnum = thirdnum;

        System.out.println("First Number: "+ firstnum);
        System.out.println("Second Number: " + secondnum);
        input.close();
    }
}
