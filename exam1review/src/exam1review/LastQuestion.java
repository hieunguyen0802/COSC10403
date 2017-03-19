package exam1review;

import javax.swing.*;
import java.awt.*;

public class LastQuestion extends JApplet {
	
	JPanel pan = new JPanel(new BorderLayout());
	JPanel pan1 = new JPanel(new FlowLayout());
	JPanel pan2 = new JPanel(new BorderLayout());
	JPanel pan3 = new JPanel();
	JPanel pan4 = new JPanel(new GridLayout(2, 1));

	JLabel lb = new JLabel("Enter Name:");
	JTextField tf = new JTextField("", 20);
	JComboBox cbb = new JComboBox();
	JCheckBox cb = new JCheckBox("ROTC");
	JCheckBox cb1 = new JCheckBox("Band");
	JButton save = new JButton("Save");

	public void init() {

		setSize(700, 300);
		setLayout(new FlowLayout());

		cbb.addItem("**Select**");
		cbb.addItem("Undergrad");
		cbb.addItem("Graduate");
		cb.setSelected(true);
		
		add(pan);
		pan.add("North", pan1);
		pan1.add(lb);
		pan1.add(tf);
		pan.add("Center", pan2);
		pan2.add("Center", pan3);
		pan3.add(cbb);
		pan2.add("East", pan4);
		pan4.add(cb);
		pan4.add(cb1);
		pan2.add("South", save);
		cb.setSelected(false);  

	}
}
