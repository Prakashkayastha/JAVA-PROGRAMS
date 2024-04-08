//package RameshSir;
import java.awt.*;
import javax.swing.*;

class G2 extends JFrame {
    
    Container cn;
    JLabel stm;
    JComboBox jc;
    G2()
    {
        cn=getContentPane();
        setTitle("WelCome");
        setLayout(null);
        stm=new JLabel("Stream");
        stm.setBounds(50,100,90,30);
        cn.add(stm);
        jc=new JComboBox();
        jc.addItem("MCA");
        jc.addItem("B.Tech");
        jc.addItem("M.Tech");
        jc.addItem("Phd");
        jc.addItem("DEEploma");
        jc.setBounds(150,100,90,30);
        cn.add(jc);
        setSize(1000,1200);
        setVisible(true);
    }

    public static void main(String args[])
    {
        new G2();
    }
}
