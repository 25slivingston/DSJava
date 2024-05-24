package animate;

import java.io.File;
import javax.imageio.ImageIO;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;

public class Cannon {

    private double x = 0;
    private double y = 0;
    private double angle = 0; // in degrees
    private BufferedImage img;
    private double pivot_x = 0;
    private double pivot_y = 0;
    public static final double PIVOT_OFFSET_X = 15;

    public Cannon(double x, double y, double angle) {
        this.x = x;
        this.y = y;
        this.angle = angle;

        try {
            File imageFile = new File("Media/sm_cannon.png");
            img = ImageIO.read(imageFile);
            System.out.println("image sucsessfully read");
            pivot_x = PIVOT_OFFSET_X;
            pivot_y = img.getHeight() / 2.0;
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }

    }

    public void draw(Graphics2D g2d) {
        AffineTransform af = new AffineTransform();
        af.translate(x - pivot_x, y - pivot_y);
        g2d.drawImage(img, af, null);
        g2d.setColor(Color.PINK);
        int[] xCoordsTriangle = { (int) x, (int) x - 20, (int) x + 20 }; // x coords for each point
        int[] yCoordsTriangle = { (int) y, (int) y + 40, (int) y + 40 }; // y coords for each point
        g2d.fillPolygon(xCoordsTriangle, yCoordsTriangle, 3); // use x and y coords along with number of points
        g2d.setColor(Color.BLACK);
        g2d.drawPolygon(xCoordsTriangle, yCoordsTriangle, 3);

        g2d.setColor(Color.BLUE);
        g2d.fillOval((int) (x - 5), (int) (y - 5), 10, 10);

    }

}