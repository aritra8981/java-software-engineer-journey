package Day_4_Java_Loops;

public class BreakContinue {
    static void main() {
        //Break Keyword
        for (int i = 1; i<=10; i++){
            if(i==10){
                break;
            }
            System.out.println(i);
        }

        //Continue Keyword
        for (int i = 1; i<=10; i++){
            if(i==5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
