import animals.Animal;

public class App {
    public static void main(String[] args) {

        Animal chip = new Animal("Chip", 1);
        Animal dale = new Animal("Dale", 1);

        if (dale.compareTo(chip) == -1) {
            System.out.println("dale weighs less");
        } else if (dale.compareTo(chip) == 1) {
            System.out.println("Dale weighsmore than chip");
        } else {
            System.out.println("same weight");
        }

    }
}
