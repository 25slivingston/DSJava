

import java.util.Scanner;
public class HW07partB {
    public enum DayOfWeek {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY}
    public enum Age {YOUNG, AVERAGE, OLD}
    
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");


        Scanner input = new Scanner(System.in);

        
        double cost = 0.00;
        double totalcost = 0.00;


        
        System.out.print("What day of the week is it: ");
        int numberDay = input.nextInt();
        System.out.print("what was the cost of the meal: ");
        cost = input.nextFloat();
        System.out.print("What was the customer's age: ");
        int numberAge = input.nextInt();
        double discount;
        DayOfWeek dayofweek;
        Age age;
        

        if (numberDay == 0) {
            dayofweek = DayOfWeek.SUNDAY;
        } else if (numberDay == 1) {
            dayofweek = DayOfWeek.MONDAY;
        } else if (numberDay == 2) {
            dayofweek = DayOfWeek.TUESDAY;
        } else if (numberDay == 3) {
            dayofweek = DayOfWeek.WEDNESDAY;
        } else if (numberDay == 4) {
            dayofweek = DayOfWeek.THURSDAY;
        } else if (numberDay == 5) {
            dayofweek = DayOfWeek.FRIDAY;
        } else {
            dayofweek = DayOfWeek.SATURDAY;
        }

        if (numberAge == 0) {
            age = Age.YOUNG;
        }
        else if (numberAge == 1) {
            age = Age.AVERAGE;
        }
        else if (numberAge == 2) {
            age = Age.OLD;
        }

        if (numberDay == 1) {
            if (age == 0) {
                discount = (cost / 100 * 7.5);
            } 
            else if (age == 2) {
                 discount = (cost / 100 * 15);
            }
            else {
                discount = (cost / 100 * 5);
            }
            } 
        else {
            if (age == 0) {
                discount = (cost / 100 * 5);
            } 
            else if (age == 2) {
                discount = (cost / 100 * 7.5);
            }
            else {
                discount = 0;
            }
            }

            totalcost = cost - discount;
            System.out.printf("$%.02f%n", totalcost);








        }

    }
