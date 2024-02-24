import java.util.ArrayList;
import java.util.Scanner;
public class HW18PartC{
    public static void main(String[] args) {

        ArrayList<Integer> scores = new ArrayList<Integer>(); //create a new array list
        
        Scanner in = new Scanner(System.in);
        int aScore;
        int lowest = Integer.MAX_VALUE;
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
            if (aScore < lowest) {
                lowest = aScore;
            }

            scores.add(aScore);
            //total = total + aScore;
            //System.out.println(scores.get(counter));
            
        }

        for (int i = 0; i < scores.size(); i++){
            System.out.print(scores.get(i));
            if(scores.get(i) == lowest){
                System.out.print("<- lowest");
            }
            System.out.println();
        }

        System.out.println();
        
        
        
    }
}