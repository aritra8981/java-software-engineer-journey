package practiceprograms;

import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Eligibility to vote");
        System.out.println("Enter your age: ");
        int age = input.nextInt();

        if (age >=18){
            System.out.println("You are eligible to vote");
        } else if (age >=1 && age < 18){
            System.out.println("You are not eligible to vote");
        }else {
            System.out.println("Invalid Age");
        }
        input.close();
    }
}
