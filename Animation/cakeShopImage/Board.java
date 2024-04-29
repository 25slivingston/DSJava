
package animate;

import java.awt.Color;
import java.awt.Dimension;

import javax.swing.JPanel;

public class Board extends JPanel {
    private static final int B_WIDTH = 350;
    private static final int B_HEIGHT = 350;

    // constructor

    public Board() {
        setBackground(Color.CYAN);
        setPreferredSize(new Dimension(B_WIDTH, B_HEIGHT));

    }
    // override the paintComponent method

    public void paintComponent(Graphics g) {

    }

}
