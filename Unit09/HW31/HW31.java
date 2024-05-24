public class HW31 {
    public static void main(String[] args) {

        BaseballCard hideki = new BaseballCard("hideki", 2000);
        System.out.println(hideki);
        BaseballCard wade = new BaseballCard("wade", 1986);
        BaseballCard david = new BaseballCard("david", 2007);
        BaseballCard matsui = new BaseballCard("hideki", 2000);

        if (wade.equals(david)) {
            System.out.println("dup");
        } else {
            System.out.println("youre chill");
        }

        if (hideki.equals(matsui)) {
            System.out.println("dup");
        } else {
            System.out.println("ur chill");
        }

    }
}