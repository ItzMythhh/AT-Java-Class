import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class PartA {

    public static void draw(Graphics g) {

        // face
        g.setColor(Color.YELLOW);
        g.fillOval(50, 50, 300, 300);

        // eyes
        g.setColor(Color.BLACK);
        g.fillOval(130, 130, 30, 30);
        g.fillOval(240, 130, 30, 30);

        // mouth
        g.drawLine(120, 260, 280, 260);
    }

    // DO NOT MODIFY BELOW
    public static enum OS { WIN, MAC, LINUX, OTHER }

    public static OS checkOS() {
        String name = System.getProperty("os.name").toLowerCase();
        if (name.indexOf("win") >= 0) return OS.WIN;
        if (name.indexOf("mac") >= 0) return OS.MAC;
        if (name.indexOf("nux") >= 0) return OS.LINUX;
        return OS.OTHER;
    }

    public static void main(String[] args) {
        final int CONTENT_WIDTH = 400;
        final int CONTENT_HEIGHT = 400;
        int bw = 0, bh = 0;
        OS os = checkOS();
        if (os == OS.WIN) { bw = 7; bh = 30; }
        if (os == OS.MAC) { bw = 0; bh = 28; }

        JFrame frame = new JFrame();
        frame.setSize(CONTENT_WIDTH + 2*bw, CONTENT_HEIGHT + bh + bw);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(new JComponent() {
            public void paintComponent(Graphics g) {
                draw(g);
            }
        });
        frame.setVisible(true);
    }
}
