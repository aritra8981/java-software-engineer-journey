package practiceprograms;

import java.util.Scanner;

public class SimpleCalculator {
    static void main() {
        Scanner input = new Scanner(System.in);

        System.out.println("What operation do you want to perform, select the Number: ");
        System.out.println("1   ------>    Addition");
        System.out.println("2   ------>    Substraction");
        System.out.println("3   ------>    Multiplication");
        System.out.println("4   ------>    Division");

        int option = input.nextInt();
        input.nextLine();

        switch (option){
            case 1: {
                System.out.println("Enter First Number: ");
                int firstNumber = input.nextInt();
                System.out.println("Enter Second Number: ");
                int secondNumber = input.nextInt();
                int sum = firstNumber + secondNumber;
                System.out.println("Addition of First Number and Second Number is: " + sum);
                break;
            }
            case 2: {
                System.out.println("Enter First Number: ");
                int firstNumber = input.nextInt();
                System.out.println("Enter Second Number: ");
                int secondNumber = input.nextInt();
                int diff = firstNumber - secondNumber;
                System.out.println("Difference of First Number and Second Number is: " + diff);
                break;
            }
            case 3: {
                System.out.println("Enter First Number: ");
                int firstNumber = input.nextInt();
                System.out.println("Enter Second Number: ");
                int secondNumber = input.nextInt();
                int prod = firstNumber * secondNumber;
                System.out.println("Product of First Number and Second Number is: " + prod);
                break;
            }
            case 4: {
                System.out.println("Enter First Number: ");
                int firstNumber = input.nextInt();
                System.out.println("Enter Second Number, the Number should be greater than 0: ");
                int secondNumber = input.nextInt();
                if (secondNumber == 0){
                    System.out.println("Invalid Response, Please Retry. Thank you! ");
                    break;
                }
                int div = firstNumber / secondNumber;
                System.out.println("Division of First Number and Second Number is: " + div);
                break;
            }
        }
        input.close();  //Best Practice
    }
}
