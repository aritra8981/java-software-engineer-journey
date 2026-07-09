package Day_4_Java_Loops;

public class NestedLoops {
    static void main() {
        System.out.println("Star Printing");
        //First Nested For Loop
        for(int i = 1; i<=4; i++){
            for(int j = 1; j<=4; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        //Second Nested For Loop
        System.out.println("Printing Row and Columns");
        for (int i = 1; i <=3; i++){
            for (int j=1; j <= 3; j++){
                System.out.println("i = " + i + ", j = " + j);
            }
        }
        System.out.println();
        // First Nested while
        System.out.println("Printing Row and Columns");
        int i = 1;  //Initialization

        while (i <= 2){ //Condition for outer loop
            int j = 1; // Important: reset for each row

            while (j <= 3){ //Condition for inner loop
                System.out.println("i = " + i + ", j = " + j);
                j++;       // Update
            }
            i++;           //Condition for outer loop
        }
    }
}
