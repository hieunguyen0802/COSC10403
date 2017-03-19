/***************************************************************/ 

/*   Program Name:     Lab 3                                   */ 

/*                                                             */ 

/*   Student Name:     Hieu Nguyen 	                           */ 

/*   Semester:         Spring		                           */ 

/*   Class-Section:    CoSc10403-015                           */ 

/*   Instructor:       James Comer                             */ 

/*                                                             */ 

/*   Program Overview:                                         */ 

/*     This program creates a simple Java applet with one      */ 

/*     label and two buttons.                                  */ 

/*                                                             */ 

/*   Input:                                                    */ 

/*     There is no user input to this program.                 */ 

/*                                                             */ 

/*   Output:                                                   */ 

/*     An applet displaying a GUI with a label and 2 buttons.  */ 

/*                                                             */ 

/*   Program Limitations:                                      */ 

/*     The buttons are inactive.                               */ 

/*                                                             */ 

/*   Significant Program Variables:                            */ 

/*     lblPress - a label displaying "Press One"               */ 

/*     btnStop - an inactive STOP button                       */ 

/*     btnGo - an inactive GO button                           */ 

/*                                                             */

/***************************************************************/  
import java.awt.*; 

import javax.swing.*;  


public class Lab3 extends JApplet
{
	
	Image img1, img2;
	ImageIcon ic1, ic2;
	JLabel label1, label2, label3, label4, label5, label6, label7, label8;
	JRadioButton on, off;
	ButtonGroup group;
	JCheckBox cb;
	JTextField name, weight;
	JComboBox feet, inches, gender;
	JButton button1, button2, button3, button4, button5;
	public void init()
	{
		setLayout(new FlowLayout());
		setBackground(Color.magenta);
     	setSize(1000,500);
		img1 = getImage (getCodeBase (), "BMI1.jpeg");
		ic1 = new ImageIcon (img1);
		label1 = new JLabel(ic1,JLabel.LEFT);
		label2 = new JLabel("<HTML><CENTER><FONT SIZE = +2 COLOR = RED> Let's Calculate Your Body Mass Index</FONT><BR><BR> _________________________________________________________________<BR><I>The Body Mass Index (BMI measures the weight status of your body in relation <BR> to the fat. It is a simple tool that helps to calculate the amount of excess <BR> body fat and the associated risks of caring this extra weight. It can be applied <BR> to both men and women </I></CENTER>",JLabel.CENTER);
		img2 = getImage (getCodeBase (), "BMI2.png");
		ic2 = new ImageIcon (img2);
		label3 = new JLabel (ic2, JLabel.RIGHT);
		label4 = new JLabel("Select to show pictures or not:");
		on = new JRadioButton("On");
		off = new JRadioButton ("Off");
		group = new ButtonGroup();
		group.add(on);
		group.add(off);
		cb = new JCheckBox ("Sounds on");
		label5 = new JLabel("<HTML><CENTER><FONT COLOR = RED><I> Select 'Show Pictures On' or 'Show Pictures Off </I> </FONT> </CENTER>");
		label6 = new JLabel("Your name");
		name = new JTextField (20);
		label7 = new JLabel("Your Gender");
		gender = new JComboBox ();
		gender.addItem ("Select");
		gender.addItem ("Male");
		gender.addItem ("Female");
		gender.setEnabled(false);
		feet = new JComboBox ();
		feet.addItem ("Select Feet");
		feet.addItem ("4");
		feet.addItem ("5");
		feet.addItem ("6");
		feet.addItem ("7");
		feet.addItem ("8");
		feet.setEnabled(false);
		inches = new JComboBox ();
		inches.addItem("Select Inches");
		inches.addItem("0");
		inches.addItem("1");
		inches.addItem("2");
		inches.addItem("3");
		inches.addItem("4");
		inches.addItem("5");
		inches.addItem("6");
		inches.addItem("7");
		inches.addItem("8");
		inches.addItem("9");
		inches.addItem("10");
		inches.addItem("11");
		inches.setEnabled(false);
		label8 = new JLabel ("Your Weight");
		label8.setEnabled(false);
		weight = new JTextField (7);
		weight.setEnabled(false);
		button1 = new JButton ("Calculate BMI");
		button1.setEnabled(false);
		button2 = new JButton ("Clear");
		button2.setEnabled(false);
		button3 = new JButton ("Reset Applet");
		button3.setEnabled(false);
		button4 = new JButton ("Display Stats");
		button4.setEnabled(false);
		button5 = new JButton ("Clear Stats");
		button5.setEnabled(false);
		add (label1);
		add (label2);
		add (label3);
		add (label4);
		add (on);
		add (off);
		add (cb);
		add (label5);
		add (label6);
		add (name);
		add (label7);
		add (gender);
		add (feet);
		add (inches);
		add (label8);
		add (weight);
		add (button1);
		add (button2);
		add (button3);
		add (button4);
		add (button5);
	}
}

