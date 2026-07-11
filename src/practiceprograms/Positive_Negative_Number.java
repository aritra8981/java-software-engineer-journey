package practiceprograms;

//Problem is to find out whether the number is a positive number or a negative number or zero
//So I am using conditional statemets here

import java.util.Scanner;

public class Positive_Negative_Number {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the number you want to check: ");
        int number = input.nextInt();
        
        if (number > 0){
            System.out.println("The Number is Positive.");
        } else if (number < 0) {
            System.out.println("The Number is Negative.");
        }else {
            System.out.println("The Number is Zero");
        }
    }
}
