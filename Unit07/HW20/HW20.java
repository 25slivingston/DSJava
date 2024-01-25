import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HW20 {
   public static void main(String[] args) throws FileNotFoundException {
       File inputFile = new File("new.txt");
       Scanner in = new Scanner(inputFile);
       in.useDelimiter("[,.\\s\\t\\n]+"); 
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
       in.close();
   }
}