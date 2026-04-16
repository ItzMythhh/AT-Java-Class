import javax.swing.*;
import java.awt.*;

public class ImagePanel extends JPanel {

    private Image myImage;

    public ImagePanel() {
        ImageIcon icon = new ImageIcon("ramen.jpg"); // put your image file here
        myImage = icon.getImage();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);

        int panelWidth = getWidth();
        int panelHeight = getHeight();

        int imageWidth = panelWidth / 2;
        int imageHeight = panelHeight / 2;

        int x = panelWidth - imageWidth;
        int y = panelHeight - imageHeight;

        g.drawImage(myImage, x, y, imageWidth, imageHeight, this);
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Homework A02");
        ImagePanel panel = new ImagePanel();

        frame.add(panel);
        frame.setSize(800, 600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
