 
 
//  THIS PROGRAM ONLY WORKS WHEN ACTIVATED IN THE TERMINAL java .\Lesson21.java

 import java.io.File;
 import java.io.FileNotFoundException;
 import java.util.Scanner;


 public class Lesson21 {
 
    public static void main(String[] args) throws FileNotFoundException {

        File inputFile = new File("Top5Population.txt");
        Scanner in = new Scanner(inputFile);


        while (in.hasNextLine()) {
           String line = in.nextLine(); //line is a string
           int i = 0;
           while (Character.isDigit(line.charAt(i)) == false) { //if it's not a diget, keep looping. (until it gets to a number)
               i++; //increase the index
           }
           String name = line.substring(0, i); //gets the first half, which is the country name
           name = name.trim();
           int population = Integer.valueOf(line.substring(i).trim()); //gets the population as an interger
           System.out.printf("%16s: %,16d%n", name, population);
       }



    }
 }
 //find the first diget of each line!!!
 
