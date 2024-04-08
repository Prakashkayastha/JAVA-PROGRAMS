//package RameshSir;
import java.awt.*;
import javax.swing.*;
public class G3 extends JFrame {
    
    Container cn;
    JLabel ad;
    TextArea t;
    G3()
    {
        cn=getContentPane();
        setTitle("WelCome");
        setLayout(null);
        ad=new JLabel("Address");
        ad.setBounds(50,100,90,30);
        cn.add(ad);
        t=new TextArea("Enter your corresponding Address");
        t.setBounds(150,100,200,300);
        cn.add(t);
        setSize(1000,1200);
        setVisible(true);

    }
    public static void main(String args[])
    {
        new G3();
    }
}
