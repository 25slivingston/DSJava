import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class readwritedemo {
    public static void main(String[] args) throws FileNotFoundException { //we dont care if we cant find it so we throw it away
        File inputFile = new File("scores.txt");
        Scanner in = new Scanner(inputFile);

        File outputFile = new File("scoresFormatted.txt");
        PrintWriter out = new PrintWriter(outputFile);

        while (in.hasNext()) {
            double score = in.nextDouble();
            out.printf("%6.2f%n", score); //this out is of printwriter type
        }
        in.close();
        out.close();
    }
}