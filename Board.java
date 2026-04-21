import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.applet.AudioClip;

public class Board extends JPanel implements MouseListener, KeyListener
{
    int x;
    int y;

    AudioClip blip;
    AudioClip blop;

    public Board()
    {
        x = 200;
        y = 200;

        blip = Toolkit.getDefaultToolkit().getAudioClip(getClass().getResource("blip.wav"));
        blop = Toolkit.getDefaultToolkit().getAudioClip(getClass().getResource("blop.wav"));

        addMouseListener(this);
        addKeyListener(this);
        setFocusable(true);
    }

    public void paintComponent(Graphics g)
    {
        super.paintComponent(g);
        g.setColor(Color.MAGENTA);
        g.fillOval(x - 10, y - 10, 20, 20);
    }

    public void mousePressed(MouseEvent e)
    {
        x = e.getX();
        y = e.getY();
        repaint();
        blip.play();
        requestFocusInWindow();
    }

    public void keyPressed(KeyEvent e)
    {
        if (e.getKeyCode() == KeyEvent.VK_SPACE)
        {
            x = getWidth() / 2;
            y = getHeight() / 2;
            repaint();
            blop.play();
        }
    }

    public void mouseClicked(MouseEvent e) {}
    public void mouseReleased(MouseEvent e) {}
    public void mouseEntered(MouseEvent e) {}
    public void mouseExited(MouseEvent e) {}

    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
}
