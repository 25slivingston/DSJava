class Counter {
    //this variable keeps track of how many counts we've made.
    private int count;

    public int getValue() {
        return count;
    }

    public void count() {
        count = count + 1;
    }

    public void reset() {
        count = 0;
    }
    

}

public class Lesson24 {

    public static void main(String[] args) {
        System.out.println("Hellow World");

        Counter myCounter = new Counter();
        int x = myCounter.getValue();
        System.out.print(x);

    }
}