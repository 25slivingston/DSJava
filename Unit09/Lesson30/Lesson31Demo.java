import java.awt.Rectangle;
public class Lesson31Demo {
    
    public static void main(String[] args) {
        Rectangle box = new Rectangle(5, 10, 20, 30);
        System.out.println(box);
    }

    Employee steve = new Employee("Steve Young", 75000);
    Employee mryoung = new Employee("Steve Young", 75000);

    if(steve ==mryoung) {
        System.out.println("We have a duplicate");
    } else {
        System.out.println("no dups found");
    }

    
}
