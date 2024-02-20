import java.util.Scanner;

public class HW23PartA {
   public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
       try {
           int score = getScore(in);
           System.out.println("your score is = " + score);
       } catch (Exception e) {
           System.err.println("an error occurred!");
           System.out.println(e.getMessage());
       }

   }
   public static int getScore(Scanner in) {
       System.out.print("What is your test score: ");
       int score = in.nextInt();
       if (score <= -1 || score >= 101) {
           throw new ArithmeticException("The test score must be 0-100");
       } else {
           return score;
       }
   }
}
