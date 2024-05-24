package animate;

import java.io.File;
import java.nio.file.StandardCopyOption;

import javax.imageio.ImageIO;
import sound.SoundClip;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class CannonBall {
    public enum STATE {
        IDLE, // inside the cannon
        FLYING, // moving thru air and we need to update it
        EXPLODING // draw flames
    }

    private double x, y, vx, vy, ax, ay;
    private double timescale;
    private double ground;
    private BufferedImage flame;

    private STATE currentState = STATE.IDLE; // start in the idle position

    public CannonBall(double ax, double ay, double ground) {
        // public constructor for CannonBall class.
        // takes the acceleration rates (x and y) and the location of the ground (as a
        // double)
        // as arguments
        this.ax = ax;
        this.ay = ay;
        this.ground = ground;

        try {
            File imageFile = new File("Media/flame01.png");
            flame = ImageIO.read(imageFile);

        } catch (Exception e) {
            System.err.println("could not find flame image");
            System.err.println(e.getMessage());
            flame = null;
        }
    }

    public STATE getCurrentState() {
        return currentState;
    }

    public void setCurrentState(STATE newState) {
        currentState = newState;
    }

    /*
     * private BufferedImage loadImage(String path) {
     * // loads a buffered image (for the flame animation).
     * }
     */

    /*
     * The draw method is called by the Board object
     * and is used to paint the current location and state of the ball.
     * If the ball is flying through the air, the ball is drawn as a red
     * filled in circle. If the ball is in the exploded state, a flame image is
     * drawn. If the ball is idle, then the ball is not drawn at all
     * (since we assume the ball is hidden inside the cannon).
     */
    public void draw(Graphics2D g2d) {
        if (currentState == STATE.FLYING) {
            g2d.fillOval((int) (x - 5), (int) (y - 5), 10, 10);
        } else if (currentState == STATE.EXPLODING) {
            double flameWidth = flame.getWidth();
            double flameHeight = flame.getHeight();
            AffineTransform af = new AffineTransform();
            af.translate(x - flameWidth / 2.0, y - flameHeight / 2.0);

            g2d.drawImage(flame, af, null);

        }
    }

    /*
     * The updateBall() method uses the constant acceleration equations
     * to update the velocity and position of the ball each timer interval.
     * note that when calculating the new velocity, the acceleration term is divided
     * by the
     * time scale in case the user wants to slow down the animation.
     * Similarly, when calculating the new position, the velocity term is divided by
     * the time scale
     * in case the user wants to slow down the animation.
     */
    public void updateBall() {
        if (currentState == STATE.FLYING) {
            vx = vx + ax; // new velosity is equal to old velocity plus the acceleration.
            vy = vy + ay;
            x = x + vx;
            y = y + vy;
            if (y > ground) {
                currentState = STATE.EXPLODING; // set the state to exploding
            }
        }
    }

    /*
     * If the ball is not flying through the air, the launch() method
     * will change the state to FLYING and start the ball moving from position (x,y)
     * with the inital velocity of (vx, vy).
     */
    public void launch(double x, double y, double vx, double vy) {
        if (currentState != STATE.FLYING) {
            // reset it to the position of the cannon
            // reset it to the normal velocity
            this.x = x;
            this.y = y;
            this.vx = vx;
            this.vy = vy;
            currentState = STATE.FLYING;
        }
    }

    /*
     * Get/set methods for the private member variables.
     */

    public double getX() { // x coord of the ball currently (center)
        return x;
    }

    public double getY() {// y coord of the ball currenty (center)
        return y;
    }

    public double getVX() {
        return vx;
    }

    public double getVY() {
        return vy;
    }

    public double getAX() {
        return ax;
    }

    public double getAY() {
        return ay;
    }

    public double getTimeScale() {
        return timescale;
    }

    public double getGround() {
        return ground;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setVX(double vx) {
        this.vx = vx;
    }

    public void setVY(double vy) {
        this.vy = vy;
    }

    public void setAX(double ax) {
        this.ax = ax;
    }

    public void setAY(double ay) {
        this.ay = ay;
    }

    public void setTimeScale(double timeScale) {
        this.timescale = timeScale;
    }

    public void changeTimeScale(double delta) {
    }

    public void setGround(double ground) {
        this.ground = ground;
    }

}