package practiceprograms;

import java.util.Scanner;

public class SumOfNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number up to which you want to calculate the sum: ");
        int num = input.nextInt();

        if (num >= 0){

            //Using Loop
            int sum = 0;

            for (int i = 0; i<=num; i++){
                sum += i;
            }
            System.out.println("The sum of numbers from 0 to " + num + "  is: " + sum);

            //Using arithmatic Operator
//            int sum = (num*(num+1))/2;
//            System.out.println("The sum of numbers from 0 to " + num + "  is: " + sum);

        }else {
            System.out.println("Invalid input! Number must be greater than or equal to 0.");
        }





        input.close();
    }
}
