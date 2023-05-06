package Exercise12;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class TwelveOne extends JFrame implements MouseMotionListener {
    JLabel l1, l2;

    TwelveOne() {
        addMouseMotionListener(this);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        l1 = new JLabel();

        l1.setBounds(100, 100, 100, 100);
        l2 = new JLabel();

        l2.setBounds(200, 100, 100, 100);

        setLayout(null);

        add(l1);
        add(l2);

    }

    public static void main(String[] args) {
        new TwelveOne();
    }

    public void mouseMoved(MouseEvent e) {
        l1.setText("X: " + e.getX());
        l2.setText("Y: " + e.getY());

    }

    public void mouseDragged(MouseEvent e) {
    }
}
