import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;



/*Part B:
Write a program that reads in this file and prints its contents character by character.  
After reading in all of the data, the program displays how many characters were scanned in.  
The program also displays how many letters were scanned in and how many digits were scanned in.

The 5 quick brown foxes jumped over the 42 lazy dogs.
Mary had 57 little lambs.
count = 80
letters = 57
digits = 5
 */
public class HW20part2 {
   public static void main(String[] args) throws FileNotFoundException {
       File inputFile = new File("new.txt");
       Scanner in = new Scanner(inputFile);
       in.useDelimiter(""); 
       //anytime you these characters, one word ends and another begins 
       //\\space \\tab \\newline + means any combination of them. 
       //if you use ^, it means anything other than inside the brackets. 
       //if delimiter is blank, then every character is its own word.
       int count = 0;
       int letterCount = 0;
       int digitCount = 0;

       while (in.hasNext()) {
           char c = in.next().charAt(0);
           System.out.print(c);
           count++;
           if(Character.isDigit(c)) {
            digitCount++;
           }
           
       }

       System.out.printf("%d words were scanned in.%n", count);
       System.out.print()
       in.close();
   }
}