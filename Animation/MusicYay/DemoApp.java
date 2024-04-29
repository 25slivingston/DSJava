import javax.sound.sampled.LineUnavailableException;
import sound.ToneGenerator.Note;

import sound.ToneGenerator;

public class DemoApp {
    public static void main(String[] args) {
        ToneGenerator tg = new ToneGenerator();
        try {
            tg.init();
        } catch (LineUnavailableException e) {
            System.err.println("unable to open audio line (big sad)");
        }

        tg.play(Note.A3, 1000);

        tg.close();
    }

}
