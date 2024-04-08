//package RameshSir;
import java.awt.*;
import javax.swing.*;
class G1 extends JFrame
{
	Container cn;
	JLabel gen;
	JRadioButton m,f;
	ButtonGroup bg;
	G1()
	{
		cn=getContentPane();
		setTitle("Welcome");
		setLayout(null);
		gen=new JLabel("Gender");
		gen.setBounds(50,100,90,30);
		cn.add(gen);
		m=new JRadioButton("Male");
		m.setBounds(150,100,90,30);
		cn.add(m);
		f=new JRadioButton("Female");
		f.setBounds(250,100,90,30);
		cn.add(f);
		// bg=new ButtonGroup();
		// bg.add(m);
		// bg.add(f);
		setSize(1000,1200);
		setVisible(true);
		
		
	}
	
	public static void main(String args[])
	{
		
		new G1();
	}
}




