
package animate;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.Rectangle;
import java.awt.geom.AffineTransform;
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
    }

    public void paintComponent(Graphics g) {
        // call the parent class method.
        super.paintComponent(g);

        // cast our Graphics object to a Graphics2D object.
        Graphics2D g2d = (Graphics2D) g;

        // set color.
        g2d.setColor(Color.MAGENTA);

        // translate in the x and y directions.
        int x_t = B_WIDTH / 2;
        int y_t = B_HEIGHT / 2;
        x_t = x_t - SIDE_LEN / 2;
        y_t = y_t - SIDE_LEN / 2;
        AffineTransform affineTransform = new AffineTransform();
        affineTransform.translate(x_t, y_t);
        affineTransform.rotate(Math.toRadians(22.5), SIDE_LEN / 2, SIDE_LEN / 2); // ROTATE IT

        // get the transformed shape.
        Rectangle rect = new Rectangle(0, 0, SIDE_LEN, SIDE_LEN);
        Shape transformedShape = affineTransform.createTransformedShape(rect);

        // draw the transformed shape on the screen.
        g2d.setColor(Color.MAGENTA);
        g2d.fill(transformedShape);
        g2d.setColor(Color.BLUE); // add text or words color
        g2d.drawString("hello world", 40, 40); // place the words

    }

}
