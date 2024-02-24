import java.util.ArrayList;
import java.util.Scanner;
public class HW18PartB{
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<Integer>(); //create a new array list
        
        Scanner in = new Scanner(System.in);
        int aScore;
        int counter = 0;
        int total = 0;
        while(true){
            System.out.println("what is your score or q to quit");
            if (in.hasNext("q")) {
                // skip over the "q".
                in.next();

                // break from the loop.
                break;
            }
            aScore = in.nextInt();


            scores.add(aScore);
            total = total + aScore;
            //System.out.println(scores.get(counter));
            counter = counter + 1;
        }

        for (int i = 0; i < scores.size(); i++){
            System.out.println(scores.get(i));
        }

        System.out.println();
        System.out.println(scores);
        System.out.println("Total: " + total);
        System.out.println("Average: " + total/counter);



        /* for(int i = 0; i < scores.size(); i++) {
            System.out.println(scores.get(i));
        } */

       // System.out.println(scores);
       // scores.add(20); //call the add function
       // System.out.println(scores);
        //scores.add(90);
       // System.out.println(scores);
       // scores.add(44);
       // System.out.println(scores);
       // scores.add(100);
       // System.out.println(scores);

        /*  */

        //scores points to a place in memory where the array is stored
        //reference the google slideshow for a list of functions that the array list can use

        //can only operate on non-primitive data types, so int becomes Interger
       /*  ArrayList<Integer> values = new ArrayList<Integer> (); //wrapper class, basically the same as using an int.
        values.add(1);
        values.add(42);
        System.out.println(values); */
        



 }
}
