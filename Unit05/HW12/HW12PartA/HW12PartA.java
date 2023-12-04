import java.util.Scanner;
public class HW12PartA
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);
      System.out.print("What is your first name? ");
      String input = in.next();
      System.out.println("Hello, " + input);
      System.out.print("How old are you? ");
      int inputInt = in.nextInt();
      inputInt++;
      System.out.println("Next year, you will be " + inputInt);
   }
}

/* the problem with the code is that the variable input was defined twice, as two different data  types.
 * I changed input to inputInt to make a different variable.
 */
