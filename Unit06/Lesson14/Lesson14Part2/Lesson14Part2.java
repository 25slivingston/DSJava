import java.util.Scanner;
public class Lesson14Part2 {
    public static void main(String[] args) {



//declare array and initialise it to hold up to SIZE doubles
final int SIZE = 10;
double[] values = new double[SIZE];

//create a companion variable to track how many values have been read in
int numberOfScores = 0;

//declare and initialise a scanner object to get input from the user
Scanner input = new Scanner(System.in);

//loop to get test scores
boolean doLoop = true;
while(doLoop == true) {
    //prompt user for data
    System.out.print("enter a a score or q to quit: ");

    if (input.hasNext("q") || input.hasNext("Q")) {
        doLoop = false;
    } else { 
        if (numberOfScores < values.length) {
            values[numberOfScores] = input.nextDouble();
            numberOfScores = numberOfScores + 1;
            } else { 
                System.out.println("there's no more space, cant input more scores.");
                doLoop = false;

            }
        }
    }

double total = 0;

for (int i = 0; i < numberOfScores; i++); {
    total = total + values[i];
    System.out.printf("test # %3d: %.2f", i + 1, values[i]);
}

double average = total/ numberOfScores;
System.out.printf("average score = %.2f %n", average);



    }
}