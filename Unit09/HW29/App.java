public class App {
    public static void main(String[] args) throws Exception {
        Bicycle b = new Bicycle();
        System.out.printf("Speed = %d%n", b.getClass());
        b.pedal();
        b.pedal();
        System.out.printf("Speed (after pedaling) = %d%n", b.getSpeed());
        b.brake();
        System.out.printf("speed (after breaking) = %d%n", b.getSpeed());

        GearedBicycle gb = new GearedBicycle();
        gb.pedal();
        gb.pedal();

    }
}