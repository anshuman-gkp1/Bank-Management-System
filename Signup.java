import java.awt.Color;
// import java.awt.Component;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.toedter.calendar.JDateChooser;
import java.util.Random;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Signup extends JFrame implements ActionListener {
    JTextField textName, textFname, textEmail, textMS,textAdd,textCity,textPinCode,textState;
    JDateChooser dateChooser;
    JRadioButton r1,r2,m1,m2,m3;
    JButton next;

    Random num = new Random();

    long first4 = (num.nextLong() % 9000L) + 1000L;
    String first = " " + Math.abs(first4);

    Signup() {
        super("SIGNUP FORM");

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100, 100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25, 10, 100, 100);
        add(image);

        JLabel l1 = new JLabel("APPLICATION FORM NO." + first);
        l1.setBounds(160, 20, 600, 40);
        l1.setFont(new Font("Raleway", Font.BOLD, 38));
        add(l1);

        JLabel l2 = new JLabel("Page 1");
        l2.setFont(new Font("Raleway", Font.BOLD, 22));
        l2.setBounds(330, 70, 600, 30);
        add(l2);

        JLabel l3 = new JLabel("Personal Details");
        l3.setFont(new Font("Raleway", Font.BOLD, 22));
        l3.setBounds(290, 90, 600, 30);
        add(l3);

        // name label
        JLabel lName = new JLabel("Name :");
        lName.setFont(new Font("Raleway", Font.BOLD, 20));
        lName.setBounds(100, 190, 100, 30);
        add(lName);

        // name textfield
        textName = new JTextField();
        textName.setFont(new Font("Raleway", Font.BOLD, 14));
        textName.setBounds(300, 190, 400, 30);
        add(textName);

        // father's name label
        JLabel lFname = new JLabel("Father's Name :");
        lFname.setFont(new Font("Raleway", Font.BOLD, 20));
        lFname.setBounds(100, 240, 200, 30);
        add(lFname);

        // father's name textfield
        textFname = new JTextField();
        textFname.setFont(new Font("Raleway", Font.BOLD, 14));
        textFname.setBounds(300, 240, 400, 30);
        add(textFname);

        // dob label
        JLabel DOB = new JLabel("Date of Birth :");
        DOB.setFont(new Font("Raleway", Font.BOLD, 20));
        DOB.setBounds(100, 290, 200, 30);
        add(DOB);

        // calender for dob
        dateChooser = new JDateChooser();
        dateChooser.setForeground(new Color(105, 105, 105));
        dateChooser.setBounds(300, 290, 400, 30);
        add(dateChooser);

        //gender
        JLabel lG=new JLabel("Gender");
        lG.setFont(new Font("Raleway", Font.BOLD, 20));
        lG.setBounds(100, 340, 200, 30);
        add(lG);

        //gender selector
        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Raleway", Font.BOLD,14));
        r1.setBackground(new Color(222,255,228));
        r1.setBounds(300,340,120,30);
        add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Raleway", Font.BOLD,14));
        r2.setBackground(new Color(222,255,228));
        r2.setBounds(450,340,120,30);
        add(r2);

        ButtonGroup buttonGroup= new ButtonGroup();
        buttonGroup.add(r1);
        buttonGroup.add(r2);    

        //email label
        JLabel lEmail = new JLabel("Email address :");
        lEmail.setFont(new Font("Raleway", Font.BOLD, 20));
        lEmail.setBounds(100, 390, 200, 30);
        add(lEmail);

        // email textfield
        textEmail = new JTextField();
        textEmail.setFont(new Font("Raleway", Font.BOLD, 14));
        textEmail.setBounds(300, 390, 400, 30);
        add(textEmail);

        //marrital status
        JLabel lMS = new JLabel("Marital Status :");
        lMS.setFont(new Font("Raleway", Font.BOLD, 20));
        lMS.setBounds(100, 440, 200, 30);
        add(lMS);

        m1 = new JRadioButton("Married");
        m1.setFont(new Font("Raleway", Font.BOLD,14));
        m1.setBackground(new Color(222,255,228));
        m1.setBounds(300,440,120,30);
        add(m1);

        m2 = new JRadioButton("Unmarried");
        m2.setFont(new Font("Raleway", Font.BOLD,14));
        m2.setBackground(new Color(222,255,228));
        m2.setBounds(450,440,120,30);
        add(m2);

        m3 = new JRadioButton("Other");
        m3.setFont(new Font("Raleway", Font.BOLD,14));
        m3.setBackground(new Color(222,255,228));
        m3.setBounds(635,440,120,30);
        add(m3);

        ButtonGroup buttonGroup1= new ButtonGroup();
        buttonGroup1.add(m1);
        buttonGroup1.add(m2);
        buttonGroup1.add(m3);  


        // marrital st textfield
        // textMS = new JTextField();
        // textMS.setFont(new Font("Raleway", Font.BOLD, 14));
        // textMS.setBounds(300, 440, 400, 30);
        // add(textMS);

        //address label
        JLabel lAddress = new JLabel("Address :");
        lAddress.setFont(new Font("Raleway", Font.BOLD, 20));
        lAddress.setBounds(100, 490, 200, 30);
        add(lAddress);

        //address textfield
        textAdd = new JTextField();
        textAdd.setFont(new Font("Raleway", Font.BOLD, 14));
        textAdd.setBounds(300, 490, 400, 30);
        add(textAdd);

        //city
        JLabel lCity = new JLabel("City :");
        lCity.setFont(new Font("Raleway", Font.BOLD, 20));
        lCity.setBounds(100, 540, 200, 30);
        add(lCity);

        //city textfield
        textCity = new JTextField();
        textCity.setFont(new Font("Raleway", Font.BOLD, 14));
        textCity.setBounds(300, 540, 400, 30);
        add(textCity);

        //pincode
        JLabel lPC= new JLabel("Pin Code :");
        lPC.setFont(new Font("Raleway", Font.BOLD, 20));
        lPC.setBounds(100, 590, 200, 30);
        add(lPC);

        //pincode textfield
        textPinCode = new JTextField();
        textPinCode.setFont(new Font("Raleway", Font.BOLD, 14));
        textPinCode.setBounds(300, 590, 400, 30);
        add(textPinCode);

        //State
        JLabel lState= new JLabel("State :");
        lState.setFont(new Font("Raleway", Font.BOLD, 20));
        lState.setBounds(100, 640, 200, 30);
        add(lState);

        //state textfield
        textState = new JTextField();
        textState.setFont(new Font("Raleway", Font.BOLD, 14));
        textState.setBounds(300, 640, 400, 30);
        add(textState);

        next=new JButton("Next");
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBackground(Color.BLACK);
        next.setForeground(Color.WHITE);
        next.setBounds(620,710, 80, 30);
        next.addActionListener(this);
        add(next);








        // setLayout(null);

        // container
        getContentPane().setBackground(new Color(222, 255, 228));
        setLayout(null);
        setSize(850, 800);
        setLocation(360, 40);
        setVisible(true);

    }

    public static void main(String[] args) {
        new Signup();

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        //throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
        String formno=first;
        String name=textName.getText();
        String fname=textFname.getText();
        String dob =((JTextField) dateChooser.getDateEditor().getUiComponent()).getText();
        String gender=null;
        if(r1.isSelected()){
            gender="Male";
        }else if(r2.isSelected()){
            gender="Female";
        }
        String email=textEmail.getText();
        String marital=null;
        if(m1.isSelected()){
            marital="Married";
        }else if(m2.isSelected()){
            marital="Unmarried";
        }else if(m3.isSelected()){
            marital="Other";
        }
        String address=textAdd.getText();
        String city=textCity.getText();
        String pincode=textPinCode.getText();
        String state=textState.getText();
        try {
            if(textName.getText().equals("")){
               JOptionPane.showMessageDialog(null, "Fill all the fields"); 
            }else{
                Con con1=new Con();
                String q="insert into signup values('"+formno+"','"+name+"','"+fname+"','"+dob+"','"+gender+"','"+email+"','"+marital+"','"+address+"','"+city+"','"+pincode+"','"+state+"')" ;
                con1.statement.executeUpdate(q);
                new Signup2();
                setVisible(false);
            }
            
        } catch (Exception E) {
            E.printStackTrace();
        }
    }
}
