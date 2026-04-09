import java.awt.*;
import javax.swing.*;

public class grapphix {

    public static void draw(Graphics g) {
        // sky
        g.setColor(Color.CYAN);
        g.fillRect(0, 0, 800, 600);

        // grass
        g.setColor(Color.GREEN);
        g.fillRect(0, 400, 800, 200);

        // sun
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 100, 100);

        // face
        g.setColor(Color.ORANGE);
        g.fillOval(300, 150, 200, 200);

        // eyes
        g.setColor(Color.BLACK);
        g.fillOval(350, 220, 20, 20);
        g.fillOval(430, 220, 20, 20);

        // smile
        g.drawArc(360, 250, 80, 50, 180, 180);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Custom 2D Drawing");

        JComponent component = new JComponent() {
            public void paintComponent(Graphics g) {
                draw(g);
            }
        };

        frame.add(component);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
