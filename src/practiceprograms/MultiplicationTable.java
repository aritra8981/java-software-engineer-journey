package practiceprograms;

import java.util.Scanner;

public class MultiplicationTable {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int number = input.nextInt();

        System.out.println("============================");
        System.out.println("   Multiplication Table");
        System.out.println("============================");

        for (int i = 1; i <= 10; i++){
            int prod = number * i;
            System.out.println(number + " x " + i + " = " + prod);
        }
        input.close();
        System.out.println("============================");
    }
}
