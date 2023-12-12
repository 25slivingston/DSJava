import java.util.Scanner;
public class Lesson14 {
    public static void main(String[] args) {

Scanner input = new Scanner(System.in);

int[] values = new int[5];

//use largest to keep track of the largest number
int largest = 0;

//loop thru the array and add values to the array
for(int i = 0; i < values.length; i++) {
    //prompt user for an interger
    System.out.print("enter an interger: ");
    values[i] = input.nextInt();

    /* set largest equal to the new value if 
     * the new value is greater than the largest
     * or if this is the first piece of data
     * we receive
    */
    if(values[i] > largest || i == 0) {
        largest = values[i];
    }
}



//print the list of numbers, marking the largest valuse with an arrow
for (int i = 0; i< values.length; i++) {
    //print the current value
    System.out.print(values[i]);

    if (values[i] == largest) {
        System.out.println(" <== largest");
    }
    else {
        System.out.println();
    }
}



    }
}