package practiceprograms;

import java.util.Scanner;

public class SwappingNumbersWithoutThirdVariable {
    static void main() {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter first Number: ");
        int firstnum = input.nextInt();
        System.out.println("Enter second Number: ");
        int secondnum = input.nextInt();

        firstnum = firstnum + secondnum;
        secondnum = firstnum - secondnum;
        firstnum = firstnum - secondnum;

        System.out.println("First Number: "+ firstnum);
        System.out.println("Second Number: " + secondnum);
        input.close();
    }
}
