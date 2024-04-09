import zoo.*;

public class Zoo {
    public static double totalAnimaWeight = 0;
    public static double hayConsumed = 0;
    public static double fishConsumed = 0;

    public static void trackAnimalWeight(Mammal mammal) {
        totalAnimaWeight = totalAnimaWeight + mammal.getWeight();
    }

    public static void resetAnimalWeight() {
        totalAnimaWeight = 0;
    }

}
