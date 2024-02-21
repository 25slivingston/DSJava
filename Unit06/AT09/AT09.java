import java.time.LocalDate;
import java.time.LocalTime;
import org.derryfield.math.Geometry;

public class AT09 {
    public static void main(String[] args){
        System.out.println("the curret date is: " + LocalDate.now());
        System.out.println("the curret date is: " + LocalTime.now());

        double r = 2.5;
        System.out.printf("volume of sphere with radius of 2.5 is %.1f%n", Geometry.getVolSphere(r));
        System.out.printf("surface area of sphere with radius of 2.5 is %.1f%n", Geometry.getAreaSphere(r));


    }

    
}