 
 


 import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Scanner;


 public class obesity {
 
    public static void main(String[] args) throws FileNotFoundException {
        File inputFile = new File("C:\\Users\\Steph\\Documents\\GitHub\\DSJava\\Unit07\\Lesson21\\obesity\\Top5Obesity.txt");
        Scanner in = new Scanner(inputFile);
          

       while (in.hasNextLine()) {
           String line = in.nextLine();
           Scanner lineScanner = new Scanner(line); //create a scanner object using lines
           lineScanner.useDelimiter("[,\\n]+");//comma and newline as a delimiter (or any combination (+))
           //get the name as a string
           String name = lineScanner.next().trim();//get the name
           //get the percent obesity as a double
           String nextWord = lineScanner.next().trim(); //remove the leading and final white spaces
           double percentage = Double.valueOf(nextWord); //make the percet obesity into a double
           //get ranking as an interger
           nextWord = lineScanner.next().trim();
           int rank = Integer.valueOf(nextWord); //get rank as an interger
           //get the region as a string
           String region = lineScanner.next().trim();

           System.out.printf("Ranked #%3d: %16s, %6.2f%%, %20s%n",
                   rank, name, percentage, region);
       }


    }
 }
 //find the first diget of each line!!!
 

 
 
 
 
 
