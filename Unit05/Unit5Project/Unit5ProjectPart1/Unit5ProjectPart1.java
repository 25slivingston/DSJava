import java.util.Scanner;

public class Unit5ProjectPart1 {

    public static String whoIsFirst(String section1, String section2) {
        String work1 = section1; // creates a working copy that we are able to modify
        String work2 = section2;

        while (true) { // create a loop
            int n1 = leadingNumber(work1); // calls leading number function
            int n2 = leadingNumber(work2);

            if (n1 < n2) {
                return (section1); // compares the first number
            } else if (n1 > n2) {
                return (section2);
            } else { // truncates the first number of both of them (strips it away)
                work1 = truncateSection(work1);
                work2 = truncateSection(work2);
                if (work1.isEmpty()) {
                    return section1;
                } else if (work2.isEmpty()) {
                    return section2;
                }
            }

        }
    }

    // The method leadingNumber() should take the String "1.13.2"
    // as an argument and return the integer value of 1.

    public static int leadingNumber(String section) { // returns an int that takes string inputs
        int index = section.indexOf("."); // returns the index of where the period is
        if (index < 0) {// if it couldnt find it
            return Integer.valueOf(section); // returns the whole number

        } else if (index > 0) {
            return Integer.valueOf(section.substring(0, index)); // goes from 0 up to but not including the index

        } else {
            return 0;
        }

    }

    // The method truncateSection() should take the String
    // "1.13.2" as an argument and return a truncated string of "13.2".

    public static String truncateSection(String section) {
        int index = section.indexOf("."); // returns the index of where the period is
        if (index < 0) {// if it couldnt find it
            return (""); // returns empty string

        } else {
            return section.substring(index + 1); // goes from 0 up to but not including the index

        }

    }

    public static void main(String[] args) {

        // get the two numbers
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number ex 1.13.2: ");
        String section1 = input.nextLine();
        System.out.print("enter a second number ex 1.13.2: ");
        String section2 = input.nextLine();

        // calls function who its first
        String first = whoIsFirst(section1, section2);

        System.out.println("the first section is " + first);

    }
}
