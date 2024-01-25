import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Lesson20 {
   public static void main(String[] args) throws FileNotFoundException {
       File inputFile = new File("poem.txt");
       Scanner in = new Scanner(inputFile);
       in.useDelimiter("[,.\\s\\t\\n]+"); 
       //anytime you these characters, one word ends and another begins 
       //\\space \\tab \\newline + means any combination of them. 
       //if you use ^, it means anything other than inside the brackets. 
       //if delimiter is blank, then every character is its own word.
       int count = 0;
       while (in.hasNext()) {
           String word = in.next();
           System.out.println(word);
           count++;
       }
       System.out.printf("%d words were scanned in.%n", count);
       in.close();
   }
}
