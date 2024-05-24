import java.awt.EventQueue;
import animate.Application;
import javax.sound.sampled.LineUnavailableException;
import sound.ToneGenerator;
import sound.ToneGenerator.Note;

public class App {
    public static void main(String[] args) {

        /*
         * In Java, GUI related actions should be
         * performed in the AWT event thread
         * or it could cause severe problems with the GUI.
         * EventQueue.invokeLater() posts your GUI-related
         * actions in the AWT event queue to avoid causing
         * any problems with other GUI-related actions.
         */
        EventQueue.invokeLater(() -> {
            Application myApp = new Application("Title");
            myApp.setVisible(true);
        });

        ToneGenerator tg = new ToneGenerator();
        try {
            tg.init();
        } catch (LineUnavailableException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        tg.play(Note.C4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.C4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.A4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.A4, 200);
        tg.play(Note.REST, 50);
        tg.play(Note.G4, 400);
        tg.play(Note.REST, 50);
        tg.close();

    }
}