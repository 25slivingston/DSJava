
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

public class Board extends JPanel {
    private static final int B_WIDTH = 350;
    private static final int B_HEIGHT = 350;
    private int x = 0;
    private int y = 0;
    private final int DIAMETER = 20;
    private final int SIDE_LEN = 150;

    private BufferedImage img;

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

        // attempt to load the image.
        try {
            File imageFile = new File("media/TherapyInForest.jpg");
            img = ImageIO.read(imageFile);
            setPreferredSize(new Dimension(img.getWidth(), img.getHeight())); // board will be these dimansions of the
                                                                              // image we're loading
            System.out.println("image sucsessfully read");
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public void paintComponent(Graphics g) {
        // call the parent class method.
        super.paintComponent(g);

        // cast our Graphics object to a Graphics2D object.
        Graphics2D g2d = (Graphics2D) g;

        // set color.
        g2d.setColor(Color.MAGENTA);

        // translate in the x and y directions.
        int x_t = getWidth() / 2;
        int y_t = getHeight() / 2;

        // create an affine transform
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.translate(x_t, y_t);
        affineTransform.scale(0.5, 0.5); // make it half smaller

        g2d.drawImage(img, affineTransform, null);

    }

}
