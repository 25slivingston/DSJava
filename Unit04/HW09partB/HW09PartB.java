import java.util.Scanner;
public class HW09PartB {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner input = new Scanner(System.in);
        
        
        System.out.print("enter a string: ");
        String string = input.nextLine(); //nextLine makes it so that it gets all the next words, not the next word only

        // String ey = "e";
        // char e = ey.charAt(0);

        int count = 0;
    for (int i = 0; i < string.length(); i++) {
        char ch = string.charAt(i);
        if (ch == 'e') {
            count++;
        }
    }

    System.out.print(count);



    }
}