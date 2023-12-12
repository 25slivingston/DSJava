

package HW13PartA;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;



public class Hw13PartA {

    
 {
    /* public static Color flipColor(Color oldColor) {
        Color color; // define a color variable
        if (oldColor == Color.BLUE) {
            color = Color.RED;
        } else {
            color = Color.BLUE;
        }

        return color;
    } */

    /*
     * Change the following method to customize
     * what is drawn in the JFrame.
     */
    public static void draw(Graphics g) { // modify this draw method, can use graphic methods on slideshow
        // by default, this method draws a blue square.
        g.setColor(Color.yellow);
        g.fillOval(0, 0, 100, 100); // change how big the rectangle is
        g.setColor(Color.black);

        final int SQUARE_WIDTH = 100;
        Color c = (Color.BLUE);
        for (int j = 0; j < 4; j++){
        for (int i = 0; i < 4; i++){
            
            // set the color
            g.setColor(c);
            g.fillRect(i * SQUARE_WIDTH, j * SQUARE_WIDTH, SQUARE_WIDTH, SQUARE_WIDTH);

            // flip the color
        //    c = flipColor(c);
            
        
        }
      //  c = flipColor(c);
        }
    }

    public static enum OS {
        WIN, MAC, LINUX, OTHER

    }

    public static OS checkOS() {
        OS val;
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) {
            val = OS.WIN;
        } else if (name.indexOf("mac") >= 0) {
            val = OS.MAC;
        } else if (name.indexOf("nux") >= 0) {
            val = OS.LINUX;
        } else {
            val = OS.OTHER;
        }

        return val;
    }

    // Do not modify the code in the main method.
    // Your code will go into the draw method above.
    public static void main(String[] args) {
        // this is the desired dimensions of the content area
        // of our JFrame window.
        final int CONTENT_WIDTH = 400; // can change the size of the "canvas"
        final int CONTENT_HEIGHT = 400;

        // the values for border width and title bar height
        // depend on the operating system.
        int border_width = 0;
        int bar_height = 0;
        OS os = checkOS();
        switch (os) {
            case WIN:
                border_width = 7;
                bar_height = 30;
                break;
            case MAC:
                border_width = 0;
                bar_height = 28;
                break;
            case LINUX:
                // I don't know what the values are for Linux.
                break;
            case OTHER:
                break;
        }

        int frame_w