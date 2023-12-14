import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class Hw13PartA {
    /*
     * Change the following method to customize
     * what is drawn in the JFrame.
     */
    public static void draw(Graphics g) {
        // by default, this method draws a blue square.
        g.setColor(Color.BLUE);
        final int STEPS = 1000;
        double delta = 2.0 * Math.PI / STEPS; //2pi/1000

        for (int i = 0; i < STEPS; i++) {

        //calc theta
        double theta = i * delta;

        //find radius
        double r = Math.cos(2.0 * theta);
        r = 150* r; //scale r u doofus

        //convert to whatever
        double x = r * Math.cos(theta);
        double y = r * Math.sin(theta);

        //convert the coords to intergers
        int plotX = (int)x + 199; //gets the orgin to the center also
        int plotY = (int)y + 199;

        //plot x
        g.fillRect(plotX, plotY, 1, 1); //plot a rectangle with 1 width and 1 height which is a DOT
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
        final int CONTENT_WIDTH = 400;
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

        int frame_width = CONTENT_WIDTH + 2 * border_width;
        int frame_height = CONTENT_HEIGHT + bar_height + border_width;
        JFrame frame = new JFrame();
        frame.setSize(frame_width, frame_height);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JComponent component = new JComponent() {
            public void paintComponent(Graphics graph) {
                draw(graph);
            }
        };

        frame.add(component);
        frame.setVisible(true);

        System.out.println("Frame Size   : " + frame.getSize());
        System.out.println("Frame Insets : " + frame.getInsets());
        System.out.println("Content Size : " + frame.getContentPane().getSize());
    }

}