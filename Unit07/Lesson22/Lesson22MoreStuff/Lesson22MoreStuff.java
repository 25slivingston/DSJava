import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class Lesson22MoreStuff {

    public static void main(String[] args) {
        try {
            File inputFile = new File("Data.txt");
            Scanner in = new Scanner(inputFile);
            while (in.hasNextLine()) {
                String last = in.next();
                String first = in.next();
                String word = in.next();
                double balance;
                try {
                    balance = Double.parseDouble(word);
                } catch (NumberFormatException exception) {
                    balance = 0;
                }


            }
            in.close();
            System.out.println("Googbye");
        } catch (FileNotFoundException e) { //e is the object (variable) of the file not found exception
            System.out.println("you stink, the file was not found. :<");
            System.out.println(e.getMessage()); //prints the error message using the variable e
            System.out.println("Byeeeeeeeeeeeeeeeeeeeeeeeee");


        }
    }
}