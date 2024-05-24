
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
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.imageio.ImageIO;
import javax.swing.JPanel;

import sound.SoundClip;

public class Board extends JPanel implements KeyListener {
    private static final int B_WIDTH = (int) (1600 * .7);
    private static final int B_HEIGHT = (int) (900 * .7); // change the origional size of the board
    private static final int FLOOR = B_HEIGHT - 25;

    private Timer timer;
    private final int INITIAL_DELAY = 100; // msec
    private final int PERIOD_INTERVAL = 25; // msec

    Cannon cannon = new Cannon(60, FLOOR - 30, 45); // this sets x and y and the angle

    private class UpdateAnimation extends TimerTask {
        /*
         * Override the run() method.
         * Update the position of our ball here.
         */
        public void run() {

        }
    }

    // constructor

    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

        // create a new timer object
        timer = new Timer();
        timer.scheduleAtFixedRate(new UpdateAnimation(),
                INITIAL_DELAY, PERIOD_INTERVAL);

        this.setFocusable(true);
        this.addKeyListener(this); // now you can pass yourself as a keylistener
    }

    public void paintComponent(Graphics g) {
        // call the parent class method.
        super.paintComponent(g);

        // cast our Graphics object to a Graphics2D object.
        Graphics2D g2d = (Graphics2D) g;

        // set color.
        g2d.setColor(Color.GREEN);

        // draw floor
        g2d.fillRect(0, FLOOR, B_WIDTH, B_HEIGHT - FLOOR);

        // set color
        g2d.setColor(Color.BLACK);

        // draw line
        g2d.drawLine(0, FLOOR, B_WIDTH, FLOOR);

        cannon.draw(g2d);

    }

    @Override
    public void keyTyped(KeyEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyTyped'");
    }

    @Override
    public void keyPressed(KeyEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method 'keyPressed'");
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            System.out.println("left key presse");
            cannon.rotateCounterClockWise();
            this.repaint();
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            System.out.println("right key pressed");
            cannon.rotateClockWise();
            this.repaint();
        } else if (e.getKeyCode() == KeyEvent.VK_UP) {
            System.out.println("up key pressed");
        } else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
            System.out.println("down key pressed");
        } else if (e.getKeyCode() == KeyEvent.VK_SPACE) {
            System.out.println("space key lol");
            cannon.fire();
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        // TODO Auto-generated method stub
        // throw new UnsupportedOperationException("Unimplemented method
        // 'keyReleased'");
    }

}
