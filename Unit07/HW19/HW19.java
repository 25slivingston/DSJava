import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
import java.util.ArrayList;


public class HW19 {
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("temps.txt");
        Scanner in = new Scanner(inputFile);

        File outputFile = new File("scoresFormatted.txt");
        PrintWriter out = new PrintWriter(outputFile);

        ArrayList <Integer> values = new ArrayList<>(); //create a new arraylist of integers called values
        int lowest = 0;
        while (in.hasNext()) { //while next has input
            //read in values as intergers
            int score = in.nextInt();
            values.add(score);

            
            //find the lowest
            if (values.size() == 1) { //adds the first element as the lowest
                lowest = score;
            } else if (score < lowest) { // if its lower than the current lowest make it the new lowest
                lowest = score;
            }
        }
        for (int i = 0; i < values.size(); i++) {
            System.out.printf("%6d", values.get(i));//use values.get because arraylist is a method.
            if (values.get(i) == lowest) {
                System.out.print(" <- Lowest");
            }
            System.out.println("");
        }
        

        in.close();
        out.close();
    }
}