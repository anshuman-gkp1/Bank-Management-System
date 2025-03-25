import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

import javax.swing.*; // package for JFrame
public class Login extends JFrame implements ActionListener{
     JLabel label1, label2, label3; // globally declared
     JTextField textField2;  // for the card no.
     JPasswordField passwordField3; // for the pin
     JButton button1, button2, button3;


    Login(){   // Constructor
        super("Bank Management System"); // to address the name of the page at the top
           
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("Icon/bank.png")); // to get the image of the icon from the system memory
        Image i2 = i1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);  // to scale the image
        ImageIcon i3 = new ImageIcon(i2);  // to get the image on the frame but cant directly get the image so that we use
        JLabel image = new JLabel(i3); // to add the image to the frame
        image.setBounds(350,10,100,100);  // for the location of the image
        add(image);


        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("Icon/card.png")); // to get the image of the icon
        Image ii2 = ii1.getImage().getScaledInstance(100,100,Image.SCALE_DEFAULT);  // to scale the image
        ImageIcon ii3 = new ImageIcon(ii2);  // to get the image on the frame but cant directly get the image so that we use
        JLabel iimage = new JLabel(ii3); // to add the image to the frame
        iimage.setBounds(630,350,100,100);  // for the location of the image
        add(iimage);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.WHITE); // for text color
        label1.setFont(new Font("AvantGarde",Font.BOLD,38)); // for the text font
        label1.setBounds(230,125,450, 40); // for the location of the text
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway",Font.BOLD,28));
        label2.setForeground(Color.WHITE);
        label2.setBounds(150,190,375, 30);
        add(label2);


        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial",Font.BOLD,20));
        add(textField2);


        label3 = new JLabel("PIN: ");
        label3.setFont(new Font("Ralway",Font.BOLD,28));
        label3.setForeground(Color.WHITE);
        label3.setBounds(150,250,375, 30);
        add(label3);


        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325,250,230,30);
        passwordField3.setFont(new Font("Arial", Font.BOLD,14));
        add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial", Font.BOLD,14));
        button1.setForeground(Color.BLACK);
        button1.setBackground(Color.WHITE);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this);
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial", Font.BOLD,14));
        button2.setForeground(Color.BLACK);
        button2.setBackground(Color.WHITE);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);  // to add action listener to the button  // when the button is clicked it will call actionPerformed method.  // this method will be implemented in the class that implements ActionListener interface.  // in this case we are implementing it in the same class.  // to do this we need to implement the actionPerformed method.  // in this method we can write the code to perform the action when the button is clicked.  // in this case we will just print
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial", Font.BOLD,14));
        button3.setForeground(Color.BLACK);
        button3.setBackground(Color.WHITE);
        button3.setBounds(300,340,230,30);
        button3.addActionListener(this);  // to add action listener to the button  // when the button is clicked it will call actionPerformed method.  // this method will be implemented in the class that implements ActionListener interface.  // in this case we are implementing it in the same class.  // to do this we need to implement the actionPerformed method.  // in this method we can write the code to perform the action when the button is clicked.  // in this case we will just print
        add(button3);

        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("Icon/backbg.png")); // to get the image of the icon
        Image iii2 = iii1.getImage().getScaledInstance(850,480,Image.SCALE_DEFAULT);  // to scale the image
        ImageIcon iii3 = new ImageIcon(iii2);  // to get the image on the frame but cant directly get the image so that we use
        JLabel iiimage = new JLabel(iii3); // to add the image to the frame
        iiimage.setBounds(0,0,850,480);  // for the location of the image
        add(iiimage); 

        setLayout(null);  // set the layout
        setSize(850,480); //frame size
        setLocation(450,200); // to open the frame at the center
        setVisible(true); //now frame will be visible

    }

    @Override
    public void actionPerformed(ActionEvent e) { // ActionEvent get which button has clicked and according to that check and perform
        // TODO Auto-generated method stub
        try{
            // if(e.getSource()==button1){
            //     ConFile c=new ConFile();
            //     String cardno=textField2.getText();
            //     String pin=passwordField3.getText();
            //     String q="select * from login where cardno='"+card_no+"' and pin='"+pin+"'";
            //     ResultSet resultSet=c.statement.executeQuery(q);
            //     if(resultSet.next()){
            //         setVisible(false);
            //         new main_Class(pin);
            //     }else{
            //         JOptionPane.showMessageDialog(null, "Invalid Card Number or PIN");
            //     }

            // }
            // else if(e.getSource()==button2){
            //     textField2.setText(""); // text will be cleaned after clicking the button
            //     passwordField3.setText("");

            // }
            // else if(e.getSource()== button3){

            // }
        }
        catch(Exception E){
            E.printStackTrace(); // tells the error
        }
        
    }
   public static void main(String[] args) {
    new Login(); // Object
   } 
}
