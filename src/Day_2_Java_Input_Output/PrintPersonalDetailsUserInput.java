package Day_2_Java_Input_Output;

import java.util.Scanner;

public class PrintPersonalDetailsUserInput {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //Personal Details
        System.out.println("Enter Your Name: ");
        String name = input.nextLine();
        System.out.println("Enter Your Age: ");
        int age = input.nextInt();
        System.out.println("Enter the Company Name Where you are working currently: ");
        String company = input.next();
        System.out.println("Enter your current Salary: ");
        int salary = input.nextInt();
        input.nextLine();
        System.out.println("Enter the City Name: ");
        String city = input.nextLine();

        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
        System.out.println("Current Company: " + company);
        System.out.println("Salary: " + salary);
        System.out.println("City: " + city);
    }
}
