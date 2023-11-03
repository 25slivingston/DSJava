import java.util.Scanner;
public class HW09partA {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner in = new Scanner(System.in);

        double total = 0;
        double testscores = 0; 

        boolean loopFlag = true;
        do {
            System.out.print("enter in interger more than 0: ");
            testscores = in.nextDouble();
            if (testscores > 0) { //this would eject us from the do and skip total = (total + money), so we don't add any negative values to our money total.
                total = (total + testscores);
            } else{
                    loopFlag = false;
                }
            }
             while (loopFlag); //used to say money >= 0, but replacing it with the boolean is cleaner
         System.out.println(total);












    }
}