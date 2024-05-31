import java.util.ArrayList;

public class theNames {

    public static void main(String[] args) {

        ArrayList<String> names = new ArrayList();

        names.add("Steve");
        names.add("Tracy");
        names.add("James");
        names.add("Elisa");
        names.add("Michelle");
        names.add("Jeremiah");

        // System.out.println(names);
        // System.out.println(names.indexOf(2));
        System.out.println("The list of names:");

        int largestSize = 0;
        int total = 0;
        for (int i = 0; i < names.size(); i++) {
            String currentName = names.get(i);
            if (currentName.length() > largestSize) {
                largestSize = currentName.length();
                // System.out.print(names.get(i));
                // System.out.println("(" + currentName.length() + ")");
                // System.out.println("max length");
                // total = total + currentName.length();

            } // else {
              // System.out.println(names.get(i));
              // total = total + currentName.length();
              // }
        }

        for (int i = 0; i < names.size(); i++) {
            String currentName = names.get(i);
            if (currentName.length() == largestSize) {
                System.out.print(names.get(i));
                System.out.print(" (" + currentName.length() + ")  ");
                System.out.println(" <= MAX LENGTH");
                total = total + currentName.length();
            } else {
                System.out.print(names.get(i));
                total = total + currentName.length();
                System.out.println(" (" + currentName.length() + ")  ");
            }
        }

        System.out.println("-----");
        System.out.println("The average name length is " + total / names.size() + " characters.");

    }
}