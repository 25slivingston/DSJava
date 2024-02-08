import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TestPrep {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("gdp_extract.txt");
        Scanner in = new Scanner(inputFile);

        // read in line by line.
        while (in.hasNextLine()) {
            String line = in.nextLine();

            // use a scanner to process tokens in the current line.
            Scanner lineScanner = new Scanner(line);

            // use semicolon and newline as delimiters.
            lineScanner.useDelimiter("[;]+");

            // get the country name, which is the first word in a line.
            // don't forget to trim any leading or trailing spaces (if any).
            String name = lineScanner.next().trim();

            // get the next word and trim it.
            String word = lineScanner.next().trim();

            // remove the commas.
            word = word.replaceAll(",", "");

            // convert to a number.
            double gdp = Double.valueOf(word);

            // do the same for ranking, except it's an integer.
            word = lineScanner.next().trim();
            int rank = Integer.valueOf(word);

            // get region.
            String region = lineScanner.next().trim();

            // display info.
            System.out.printf("#%03d | %-14s | $%,22.2f | %-24s%n", rank, name, gdp, region);
        }
    }
}