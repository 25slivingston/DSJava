import sound.SoundClip;

public class SoundDemo {
    static void delay(int msec) {
        try {
            Thread.sleep(msec);
        } catch (InterruptedException e) {
            System.err.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        SoundClip boing = new SoundClip("Media/boing.wav");
        boing.open();
        boing.play(true);
        delay(2000); // my code is a little funky and needs this thing so it can play fully

        SoundClip zitar = new SoundClip("");
        zitar.open();
        zitar.setLoop(true);
        zitar.play(true);

    }

}
