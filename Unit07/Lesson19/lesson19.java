import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class lesson19 {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("scores.txt");
        Scanner in = new Scanner(inputFile);

        while (in.hasNext()) {
            double score = in.nextDouble();
            System.out.printf("%6.2f%n", score);
        }
        in.close();

    }
}