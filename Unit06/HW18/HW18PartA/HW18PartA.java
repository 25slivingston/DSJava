import java.util.ArrayList;
public class HW18PartA{
    public static void main(String[] args) {

        ArrayList<String> names= new ArrayList<String>(); //create a new array list
        names.add("Emily");
        System.out.println(names);
        names.add("James"); //call the add function
        System.out.println(names);
        names.add("Lillianna");
        System.out.println(names);
        names.add("Ashwini");
        System.out.println(names);
        names.add("Erica");
        System.out.println(names);

        for(int i = 0; i < ArrayList.size(names); i++) {
            System.out.println(names[i]);
        }

        //names points to a place in memory where the array is stored
        //reference the google slideshow for a list of functions that the array list can use

        //can only operate on non-primitive data types, so int becomes Interger
       /*  ArrayList<Integer> values = new ArrayList<Integer> (); //wrapper class, basically the same as using an int.
        values.add(1);
        values.add(42);
        System.out.println(values); */



 }
}
