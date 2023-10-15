import java.util.Scanner;
public class Unit02ProgrammingProject {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        Scanner in = new Scanner(System.in);
        System.out.print("Please enter a value of seconds between 0 and 3999: "); //gets the number of seconds altogether
        int yournumber = in.nextInt();
        //System.out.println(yournumber);

        int hours = yournumber / 3600; //this number will be used as the HH in the final output (3600 secs per hour)
        int hoursremainder = yournumber % 3600; //gets the remainder, which will be used to calculate mins and secs
        //System.out.println("hrs =" + hours);
        //System.out.println(hoursremainder);

        int minutes = hoursremainder / 60; // divides by 60 to find the number of mins (60 secs per min) MM
        int seconds = hoursremainder % 60; // gets the remainder which is how many secs are left over for SS
        //System.out.println("mins =" + minutes);
        //System.out.println("secs = " + seconds);

        // format specifier gives 2 spaces for each number and pads the unused spaces with 0s.
        System.out.printf("The time in HH:MM:SS is %02d:%02d:%02d", hours, minutes, seconds);





    }
}