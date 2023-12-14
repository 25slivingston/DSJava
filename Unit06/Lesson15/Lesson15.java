import java.util.Arrays;
public class Lesson15 {
    /*
     * Change the following method to customize
     * what is drawn in the JFrame.
     */
    /* public static void main(String[] args) {

        //declare and initialise an array of ints
        int[] original = { 7, 3, 2, 5, 1 };

        //print the orig order
        System.out.println("original: " + Arrays.toString(original));

        //sort the array
        Arrays.sort(original);

        //print the sorted array
        System.out.println("sorted:   " + Arrays.toString(original));

    } */




    public static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }

    public static void main(String[] args) { //this program will not work on purpose
        int x = 99;
        int y = 1;
        System.out.printf("x = %d, y = %d %n", x, y);
        // swap() will not actually swap values.
        swap(x, y);
        System.out.printf("x = %d, y = %d %n", x, y);
    }
}
