import java.awt.Color;
import java.awt.Graphics;
import javax.swing.*;

public class PartB {

    public static void draw(Graphics g) {

        for (int row = 0; row < 4; row++) {
            for (int col = 0; col < 4; col++) {

                if ((row + col) % 2 == 0)
                    g.setColor(Color.BLUE);
                else
                    g.setColor(Color.RED);

                g.fillRect(col * 100, row * 100, 100, 100);
            }
        }
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
