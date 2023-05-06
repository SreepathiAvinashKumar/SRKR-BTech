package Exercise12;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class RadioGUI extends JFrame implements ActionListener {
    JRadioButton rb1, rb2;
    JLabel l1;
    JButton b1;

    RadioGUI() {
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        setLayout(new FlowLayout(FlowLayout.LEFT));
        l1 = new JLabel("Selected");

        ButtonGroup bg = new ButtonGroup();
        rb1 = new JRadioButton("Male");
        rb2 = new JRadioButton("Female");

        bg.add(rb1);
        bg.add(rb2);

        b1 = new JButton("Click");
        b1.addActionListener(this);

        add(l1);
        add(rb1);
        add(rb2);
        add(b1);
    }

    public void actionPerformed(ActionEvent e) {
        if (rb1.isSelected()) {
            System.out.println("Male is selected");
            l1.setText("Male is selected");
        }
        if (rb2.isSelected()) {
            System.out.println("Female is selected");
            l1.setText("Female is selected");
        }

    }

    public static void main(String[] args) {
        new RadioGUI();
    }
}
