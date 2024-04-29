import sound.SoundClip;

public class boing {
    public static void main(String[] args) {
        SoundClip boing = new SoundClip("boing.wav");
        boing.open();
        boing.play();
        boing.play();
        try {
            Thread.sleep(2000);
        } catch (Exception e) {

        }
        boing.close();
    }

}
