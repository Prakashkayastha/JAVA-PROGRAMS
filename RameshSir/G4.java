
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
class G4 extends JFrame implements ActionListener
{
	Container cn;
	JButton r,g,b;
	G4()
	{
		cn=getContentPane();
		setTitle("Color Identifier");
		setLayout(null);
		r=new JButton("RED");
		r.setBounds(50,100,90,30);
		cn.add(r);
		g=new JButton("GREEN");
		g.setBounds(150,100,90,30);
		cn.add(g);
		b=new JButton("BLUE");
		b.setBounds(250,100,90,30);
		cn.add(b);
		r.addActionListener(this);
		g.addActionListener(this);
		b.addActionListener(this);
		setSize(1000,1200);
		setVisible(true);
		
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource() == r)
		cn.setBackground(Color.RED);
		if(ae.getSource() == g)
		cn.setBackground(Color.GREEN);
		if(ae.getSource() == b)
		cn.setBackground(Color.BLUE);
		
	}
	public static void main(String args[])
	{
		new G4();
	}
	
}
