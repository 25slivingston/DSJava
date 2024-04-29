
package animate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Image;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

public class Board extends JPanel {
    private static final int B_WIDTH = 350;
    private static final int B_HEIGHT = 350;
    private int x = 0;
    private int y = 0;
    private final int DIAMETER = 20;

    private Timer timer;
    private final int INITIAL_DELAY = 100; // msec
    private final int PERIOD_INTERVAL = 25; // msec
    private int xSpeed = 2;

    private class UpdateAnimation extends TimerTask {
        public void run() {
            // use velocity to update the position of the ball
            x = x + xSpeed;
            // if(){

            // }
        }
    }

    // constructor

    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        // initialise the position of the ball
        x = 0;
        y = B_HEIGHT / 2;

        // //add a timer
        // timer = new Timer();
        // timer.scheduleAtFixedRate(new, null, PERIOD_INTERVAL);

        // override the paint component

        // attempt to load image file
        try {
            File imgFile = new File("media/cakes.jpg");
            img = ImageIO.read(imgFile);
            setPreferredSize(new Dimension(img.getWidth(), img.getHeight()));

        } catch (Exception e) {
            System.err.println("unable to open the image file.");
            System.err.println(e.getMessage());
        }

    }
    // override the paintComponent method

    public void paintComponent(Graphics g) {

    }

}
