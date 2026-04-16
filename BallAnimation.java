import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class BallAnimation extends JPanel implements ActionListener {

    int x = 0;
    int y = 0;
    int ballSize = 50;

    Timer timer = new Timer(25, this);

    public BallAnimation() {
        timer.start();
    }

    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, y, ballSize, ballSize);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        x = x + 1;
        y = y + 1;

        repaint();
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Diagonal Ball");
        BallAnimation panel = new BallAnimation();

        frame.add(panel);
        frame.setSize(720, 720);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
