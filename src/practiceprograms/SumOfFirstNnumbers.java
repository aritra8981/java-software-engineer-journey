package practiceprograms;

import java.util.Scanner;

public class SumOfFirstNnumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter a number to calculate the sum: ");
        int num = input.nextInt();
        int sum = 0;

        if (num <= 0){
            System.out.println("Please enter a positive integer greater than 0.");
        } else {
            for (int i = 1; i<=num; i++){
                sum +=i;
            }
            System.out.println("Sum of first " + num + " natural numbers = " + sum);
        }
        input.close();
    }
}
