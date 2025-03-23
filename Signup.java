import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Signup extends JFrame {
    Signup() {
        super("SIGNUP FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel l1 = new JLabel("APPLICATION FORM NO.");
        l1.setBounds(160,20,600, 40);
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(l1);



        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Signup();

    }
}