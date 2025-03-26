import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class BalanceEnquiry extends JFrame implements ActionListener {

    String pin;
    JButton b1;
    JLabel label2;
    BalanceEnquiry(String pin){
        this.pin=pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1550, 830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0, 0, 1550, 830);
        add(l3);

        JLabel label1 = new JLabel("CURRENT AVAILABLE BALANCE IS RS.");
        label1.setForeground(Color.WHITE);
        label1.setFont(new Font("System", Font.BOLD, 16));
        label1.setBounds(460, 180, 700, 35);
        l3.add(label1);

        label2 = new JLabel("");
        label2.setForeground(Color.WHITE);
        label2.setFont(new Font("System", Font.BOLD, 16));
        label2.setBounds(460, 220, 400, 35);
        l3.add(label2);


        b1 = new JButton("BACK");
        b1.setBounds(700, 406, 150, 35);
        b1.setBackground(new Color(191, 191, 191));
        b1.setFont(new Font("Arial", Font.BOLD, 16));
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        l3.add(b1);

    
        int balance = 0;
        try {
            ConFile c=new ConFile();
            ResultSet resultSet=c.statement.executeQuery("Select * from bank where pin='"+pin+"'");
            while (resultSet.next()) {
                if(resultSet.getString("type").equals("Deposit")){
                    balance+=Integer.parseInt(resultSet.getString("amount"));
                }else{
                    balance-=Integer.parseInt(resultSet.getString("amount"));
                }
            }
        } catch (Exception e) {
            e.printStackTrace();

        }

        label2.setText(""+balance);

        setLayout(null);
        setSize(1500, 1000);
        setLocation(0, 0);
        setVisible(true);

    };
    public static void main(String[] args) {
        new BalanceEnquiry("");
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        setVisible(false);
        new main_Class(pin); 
    }
}
