import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("InputData.txt");
        Scanner in = new Scanner(inputFile);

        
        while (in.hasNextLine()) {
            String line = in.nextLine();

           
            Scanner lineScanner = new Scanner(line);

            
            lineScanner.useDelimiter("[;]+");

           
            String name = lineScanner.next().trim();

            
            String word = lineScanner.next().trim();

            
            word = word.replaceAll(",", "");
            word = word.replaceAll("\\$", "");

            
            double money = Double.valueOf(word);

            
            /* word = lineScanner.next().trim();
            int rank = Integer.valueOf(word); */

            
            String country = lineScanner.next().trim();

            double tax = money*.03;

            
            System.out.printf("%-15s  : $%,19.2f | $%,17.2f | %-24s%n", name, money, tax, country);
        }
    }
}