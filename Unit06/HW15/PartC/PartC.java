import java.util.Arrays;
import java.util.Scanner;

public class PartC {

    public static int linearSearch(int[] numbers, int tgt) {
        int index = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == tgt) {
                index = i;
                break; // jump out of the loop and return index bc it found the tgt number. if it
                       // didn't find it, it will teturn -1
            }
        }
        return index;
    }

    public static void main(String[] args) {
        final int SIZE = 10000000;

        Scanner input = new Scanner(System.in);

        int[] numbers = new int[SIZE]; // this is what the array is called numbers
        //System.out.println("here is your array: ");

        for (int i = 0; i < numbers.length; i++) {
            double ran = SIZE * Math.random();
            int val = (int) ran + 1; // getting the random numer from 1 to SIZE
            numbers[i] = val;

        }

        //System.out.println(Arrays.toString(numbers));

        System.out.print("pick a number between one and " + SIZE + ": ");
        int tgt =input.nextInt();

        long stop  = 0;
        long start = System.currentTimeMillis();

        int index = linearSearch(numbers, tgt);

        stop = System.currentTimeMillis();

        if (index < 0) {
            System.out.println("index was not found");
        } else {
            System.out.println("tgt was found at " + index);
        }


        System.out.println("it took " + (stop - start) + " miliseconds to get the information");

        int[]numbersSorted = Arrays.copyOf(numbers, SIZE);
        Arrays.sort(numbersSorted);

        start = System.currentTimeMillis();
        index = Arrays.binarySearch(numbersSorted, tgt);
        stop = System.currentTimeMillis();
        
        System.out.println("it took " + (stop - start) + " miliseconds to get the information using a binary search"); //this should usually take shorted to sorth thru because its all sorted yk
    }   
}
