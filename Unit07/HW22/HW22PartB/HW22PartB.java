import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

public class HW22PartB {
    public static void main(String[] args) {

        String check = " ";
        Scanner in = new Scanner(System.in);

        while (true) {
            System.out.println("What file do you want to open, or # to quit.");
            check = in.next();
            if (check.equals("#")) {
                System.out.print("goodbye");
                break;
            }

            try {
                File inputFile = new File(check);
                Scanner infile = new Scanner(inputFile);
                infile.useDelimiter("[,\\n]+"); //use a delimiter for ',' and new line
                while (infile.hasNextLine()) {
                    String name = infile.next().trim();
            
                    String year = infile.next().trim();

                    year = year.replaceAll(",", "");
                    year = year.replaceAll("\\$", "");


                    int yearInt;
                    try {
                        //yearInt = Double.parseDouble(year);
                        yearInt = Integer.valueOf(year);
                    } catch (NumberFormatException exception) {
                        yearInt = 0;
                    }

                    //yearInt = Double.valueOf(year);
                    if (yearInt == 0.0){
                        System.out.println("I don't know what year " + name + " was born in");
                    }else {
                    
                    System.out.printf("%-15s  birthyear: %d %n", name, yearInt); //%d for ints %f for doubles
                    /* String word = infile.next().trim(); // also trims it usint .trim() !!!
                    System.out.println(word); */
                    }
                    
                }
                
                
                infile.close();
                in.close();
            } catch (FileNotFoundException exception) {
                System.out.println("File not found!  Exiting main method.");
                return;
            }
        }
    }
}