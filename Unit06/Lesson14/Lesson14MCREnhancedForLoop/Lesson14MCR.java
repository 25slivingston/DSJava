package Lesson14MCREnhancedForLoop;

public class Lesson14MCR {
     public static void main(String[] args) {
    double[] numbers = { 8, 6, 7, 5, 3, 0, 9,};
    double total = 0;
    for(double x : numbers) {
        total = total + x;
        System.out.println(x);
    }
    


//calculate the average
double average = total/ numbers.length;
System.out.printf("your average is %.2f %n", average);
}
}
