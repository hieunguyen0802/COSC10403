import java.awt.*;
import javax.swing.*;

public class lab4inClassWork extends JApplet
{
	JButton b1 = new JButton("Front");
	JButton b2 = new JButton("Left");
	JButton b3 = new JButton("Top");
	JButton b4 = new JButton("Back");
	JButton b5 = new JButton("Right");
	JButton b6 = new JButton("Bottom");
	
	JPanel p1 = new JPanel(new GridLayout(2,2));
	JPanel p2 = new JPanel(new FlowLayout());
	JPanel p4 = new JPanel();
	JPanel p3 = new JPanel();

	JTextArea ta = new JTextArea(3,8);
	JTextField tf = new JTextField(20);

	public void init() 
	{
		setLayout(new FlowLayout());
		setSize(500,500);
		
		add(p2);
		p2.add(p1);
			p1.add(b4);
			p2.add(p3);
			p3.add(ta);
		p2.add(p4);
			p4.add(tf);
		
	}
}
