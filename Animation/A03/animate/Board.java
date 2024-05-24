
package animate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.io.File;
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Shape;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import sound.SoundClip;

public class Board extends JPanel {
    private static final int B_WIDTH = 600;
    private static final int B_HEIGHT = 600; // change the origional size of the board
    private final int DIAMETER = 20;
    private final int SIDE_LEN = 150;
    private int x_t;
    private int y_t;

    private BufferedImage img;

    private SoundClip sitarMusic;

    private Timer timer;
    private final int INITIAL_DELAY = 100; // msec
    private final int PERIOD_INTERVAL = 25; // msec
    private int xSpeed = 2;
    private int ySpeed = 2;

    private double angle = 0; // angle in degrees to rotate the image
    private double rotateSpeed = 5; // rotates 5 degrees

    private class UpdateAnimation extends TimerTask {
        /*
         * Override the run() method.
         * Update the position of our ball here.
         */
        public void run() {
            x_t += xSpeed;
            if (x_t > B_WIDTH) {
                x_t = 0;
            }
            y_t += ySpeed;
            if (y_t > B_HEIGHT) {
                y_t = 0;
            }
            // update angle
            angle = angle + rotateSpeed;
            if (angle > 360) {
                angle = angle - 360;
            }
            repaint();
        }
    }

    // constructor

    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        // initialise the position of the ball
        x_t = 0;
        y_t = 0;

        // attempt to load the image.
        try {
            File imageFile = new File("media/Andy.png");
            img = ImageIO.read(imageFile);
            // setPreferredSize(new Dimension(img.getWidth(), img.getHeight())); // board
            // will be these dimansions of the
            // image we're loading
            System.out.println("image sucsessfully read");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

        sitarMusic = new SoundClip("Media/sitar.wav");
        sitarMusic.open();
        sitarMusic.setLoop(true);
        sitarMusic.play();

        // create a new timer object
        timer = new Timer();
        timer.scheduleAtFixedRate(new UpdateAnimation(),
                INITIAL_DELAY, PERIOD_INTERVAL);

    }

    public void paintComponent(Graphics g) {
        // call the parent class method.
        super.paintComponent(g);

        // cast our Graphics object to a Graphics2D object.
        Graphics2D g2d = (Graphics2D) g;

        // set color.
        g2d.setColor(Color.MAGENTA);

        // create an affine transform
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.translate(x_t - img.getWidth() / 2, y_t - img.getHeight() / 2);
        affineTransform.rotate(Math.toRadians(angle), img.getWidth() / 2, img.getHeight() / 2);

        g2d.drawImage(img, affineTransform, null);

    }

}
