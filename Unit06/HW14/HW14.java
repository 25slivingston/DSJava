






//Problem #1) b

// Problem #2) c would give an error because althouh there are 5 elements, they are numbered 0 to 4.

//Problem #3) b because the values got swapped and it starts at 0



public class HW14 {

     public static void main(String[] args) {
    double[] numbers = {  2.2, 1.0, 3.7, 4.1, 88.0};
    double total = 0;
    for(double x : numbers) {
        total = total + x;
        System.out.println(x);
    }
}
}