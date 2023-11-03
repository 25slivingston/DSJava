import java.util.Scanner;
public class Lesson08pt2 {
    public static void main(String[] args) throws Exception {

        int a = 4;
                                        // if you declare a variable inside the main function, you can use it anywhere
        for (int i = 1; i < 6; i++) {
            System.out.println("i =" + i); //you can only use the variable i inside this for statement
            System.out.println("a and i =" + i + a);
        }
    
    }
}