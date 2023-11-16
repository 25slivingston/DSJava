
import java.time.DayOfWeek;
import java.time.LocalDate;

public class ATLesson06 {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        LocalDate rightNow = LocalDate.now();
        System.out.println(rightNow);

        // get the day of the month for today.
        int today = rightNow.getDayOfMonth();
        System.out.println(today);

        // declare a variable called date of LocalDate type.
        // start at the beginning of the month.
        LocalDate day = rightNow.minusDays(today - 1); // represents the first day of the month
        System.out.println(day);

        // update date so it points to the next day on the calendar
        // day = day.plusDays(1);
        System.out.println("added one to the date: " + day);

        // find out what day of the week is for the date.
        DayOfWeek dayOfWeek = day.getDayOfWeek();
        int dayNumber = dayOfWeek.getValue();
        System.out.println("Day of the week from the date variable: " + dayOfWeek);
        System.out.println(dayNumber); // (1 for Monday, 2 for Tuesday, etc.)

        // ----------------------------------------------------------------------------------

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");

        int n = 1;
        while (n != dayNumber) {
            System.out.print("    ");
            n = n + 1;
        }

        int currMonth = day.getMonthValue();

        while (currMonth == day.getMonthValue()) {
            System.out.printf("%3d", day.getDayOfMonth());
            if (day.getDayOfMonth() == rightNow.getDayOfMonth()) {
                System.out.print("*");
            } else {
                System.out.print(" ");
            }

            if (dayNumber == 7) {
                System.out.println();
            }
            day = day.plusDays(1);// increase day by one
            dayOfWeek = day.getDayOfWeek(); // get the new day of the week
            dayNumber = dayOfWeek.getValue();

        }
        System.out.println();

    }
}