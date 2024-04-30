import org.derryfield.toys.Magic8Ball;

public class PlayBall {

    public static void main(String[] args) {
        Magic8Ball MyBall = new Magic8Ball();

        // System.out.print("would you like to do the magic 8 ball? y or n");
        // if(input.next == )
        MyBall.shake();
        System.out.print(MyBall.read());
    }
}
