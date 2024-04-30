import java.util.ArrayList;

public class PartD {
    public static void swap(ArrayList<Integer> list, int i, int j) { // i and j are indexes
        int temp = list.get(i);
        list.set(i, list.get(j));
        list.set(j, temp);

    }

    public static void main(String[] args) {

        // create an arraylist of integers
        ArrayList<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            numbers.add(i);
        }
        // print the initial list before swapping
        System.out.println(numbers); // convert to a string

        swap(numbers, 4, 8);
        System.out.println(numbers);

    }

}
