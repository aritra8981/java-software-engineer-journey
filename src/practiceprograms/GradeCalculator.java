package practiceprograms;
import java.util.Scanner;

public class GradeCalculator {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Enter Your Marks: ");
        int marks = input.nextInt();

        if (marks >= 91 && marks <= 100 ){
            System.out.println("Outstanding! Your Grade is A+.");
        } else if (marks >= 81 && marks <=90 ){
            System.out.println("Excellent! Your Grade is A.");
        } else if (marks >= 71 && marks <=80) {
            System.out.println("Very Good! Your Grade is B.");
        } else if (marks >= 61 && marks <=70) {
            System.out.println("Good! Your Grade is C.");
        } else if (marks >= 51 && marks <=60) {
            System.out.println("Average! Your Grade is D.");
        } else if (marks >= 35 && marks <=50) {
            System.out.println("Needs Improvement! Your Grade is E.");
        }else if(marks >= 0 && marks <=34){
            System.out.println("Fail! Your Grade is F.");
        }else{
            System.out.println("Invalid Marks!");
        }
        input.close();
    }
}
