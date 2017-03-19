/***************************************************************/ 
  /*   Program Name:     Lab 4                                   */ 
  /*                                                             */ 
  /*   Student Name:     Hieu Nguyen	                         */ 
  /*   Semester:         Spring 2017                             */ 
  /*   Class-Section:    CoSc10403-015     					     */ 
  /*   Instructor:       James Comer        			         */ 
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

public class lab4 extends JApplet {

	Font myFont = new Font("Times", Font.ITALIC, 30);

	JLabel title = new JLabel("Schnellwich");
	JLabel total = new JLabel("TOTAL", JLabel.CENTER);

	DefaultListModel sandwich = new DefaultListModel();
	JList list1 = new JList(sandwich);

	DefaultListModel drinks = new DefaultListModel();
	JList list2 = new JList(drinks);

	DefaultListModel sideOrders = new DefaultListModel();
	JList list3 = new JList(sideOrders);

	JComboBox size = new JComboBox();

	Image img1, img2, img3, img4;
	ImageIcon ic1, ic2, ic3, ic4;
	JLabel firstImage, secondImage;

	JCheckBox image = new JCheckBox("Animation");
	JCheckBox sound = new JCheckBox("Sounds");
	JCheckBox grilled = new JCheckBox("Grilled?");

	JTextArea prices = new JTextArea("Small - $5.50 \n" + "Medium - $7.00 \n " + "Large - $8.50 \n" + "XLarge - $9.50",
			5, 5);

	
	JButton placeOrder1;
	JButton cancel1;

	JTextArea hours = new JTextArea("Open 8AM till Midnight");
	
	JLabel sandwichlbl = new JLabel("Sandwiches", JLabel.CENTER);
	JLabel drinklbl = new JLabel("Drinks", JLabel.CENTER);
	JLabel sidelbl = new JLabel("Side Orders", JLabel.CENTER);
	
	JScrollPane sandwichsp = new JScrollPane(list1);
	JScrollPane drinksp = new JScrollPane(list2);
	JScrollPane sidesp = new JScrollPane(list3);
	
	
	JPanel p1 = new JPanel(new BorderLayout());
	JPanel p2 = new JPanel(new FlowLayout());
	JPanel p3 = new JPanel(new GridLayout(1, 4));
	JPanel p4 = new JPanel(new GridLayout(1, 3));
	JPanel p5 = new JPanel(new BorderLayout());
	JPanel p6 = new JPanel(new BorderLayout());
	JPanel p7 = new JPanel(new BorderLayout());
	
	JPanel sandwichPanel = new JPanel(new BorderLayout());
	JPanel drinkPanel = new JPanel(new BorderLayout());
	JPanel sidePanel = new JPanel(new BorderLayout());

	JFrame order = new JFrame("Order Frame");
	JFrame changeMaker = new JFrame("Change Maker");

	public void init() {

		setLayout(new BorderLayout());

		setSize(1000, 400);

		img1 = getImage(getCodeBase(), "Lab4Images/all/sign1.jpg");
		img2 = getImage(getCodeBase(), "Lab4Images/all/sign2.jpg");
		ic1 = new ImageIcon(img1);
		ic2 = new ImageIcon(img2);
		firstImage = new JLabel(ic1, JLabel.LEFT);
		secondImage = new JLabel(ic2, JLabel.RIGHT);

		img3 = getImage(getCodeBase(), "Lab4Images/all/submit.gif");
		img4 = getImage(getCodeBase(), "Lab4Images/all/cancel.gif");

		ic3 = new ImageIcon(img3);
		ic4 = new ImageIcon(img4);

		placeOrder1 = new JButton("Place Order", ic3);
		placeOrder1.setBorderPainted(false);
		placeOrder1.setContentAreaFilled(false); 
		placeOrder1.setOpaque(false);
		cancel1 = new JButton("Cancel", ic4);
		cancel1.setBorderPainted(false);
		cancel1.setContentAreaFilled(false);
		

		title.setFont(myFont);
		title.setForeground(Color.red);

		sandwich.add(0, "Select Sandwich");
		sandwich.add(1, "Hamburger");
		sandwich.add(2, "Cheeseburger");
		sandwich.add(3, "Ham & Cheese");
		sandwich.add(4, "Veggie");
		list1.setBackground(Color.red);

		drinks.add(0, "Select Drink");
		drinks.add(1, "Cola");
		drinks.add(2, "Ice Tea");
		drinks.add(3, "Coffee");
		drinks.add(4, "Water");
		list2.setBackground(Color.GREEN);

		sideOrders.add(0, "Select Side");
		sideOrders.add(1, "Fries");
		sideOrders.add(2, "Chips");
		sideOrders.add(3, "Onion Rings");
		sideOrders.add(4, "Salad");
		list3.setBackground(Color.magenta);

		size.addItem("Select Size");
		size.addItem("Small");
		size.addItem("Medium");
		size.addItem("Large");
		size.addItem("XLarge");

		p2.setBackground(Color.YELLOW);
		p3.setBackground(Color.YELLOW);
		p4.setBackground(Color.YELLOW);
		p5.setBackground(Color.YELLOW);
		p6.setBackground(Color.YELLOW);
		p7.setBackground(Color.YELLOW);

		add(p1);
		p1.add("North", p2);
		p1.add("Center", p3);
		p1.add("South", p4);

		p2.add(firstImage);
		p2.add(title);
		p2.add(secondImage);
		
		
		
		sandwichPanel.add("North", sandwichlbl);
		sandwichPanel.add("Center", sandwichsp);
		
		drinkPanel.add("North", drinklbl);
		drinkPanel.add("Center", drinksp);
		
		sidePanel.add("North", sidelbl);
		sidePanel.add("Center", sidesp);
		
		p3.add(sandwichPanel);
		p3.add(drinkPanel);
		p3.add(sidePanel);
		
		
		p3.add(p5);
		p5.add("North", size);
		p5.add("East", image);
		p5.add("Center", sound);
		p5.add("South", grilled);

		p4.add(prices);
		p4.add(p6);
			p6.add("North", placeOrder1);	
			p6.add("South", cancel1);
		p4.add(p7);
			p7.add("North", total);
			p7.add("Center", hours);
		
		orderFrame();
		changeMaker();
	}

	public void orderFrame() {
		Font ft1 = new Font("Times", Font.BOLD, 15);
		JLabel image;
		Image img5;
		ImageIcon ic5;
		JPanel orderDisplay = new JPanel(new BorderLayout());
		JLabel txt1 = new JLabel("Order yet to be selected", JLabel.CENTER);
		JLabel txt2 = new JLabel("Select Cancel before Another Order", JLabel.CENTER);
		
		txt1.setFont(ft1);
		txt2.setFont(ft1);
		img5 = getImage(getCodeBase(), "Lab4Images/all/complete.gif");
		ic5 = new ImageIcon(img5);
		image = new JLabel(ic5);

		orderDisplay.setBackground(Color.GREEN);
		txt1.setForeground(Color.WHITE);
		txt2.setForeground(Color.YELLOW);

		order.add(orderDisplay);
		orderDisplay.add("North", txt1);
		orderDisplay.add("Center", image);
		orderDisplay.add("South", txt2);
		order.setVisible(true);
		order.setSize(300, 300);
		order.setLocation(400, 500);
	}

	public void changeMaker() {
		
		Font ft2 = new Font("Times", Font.BOLD, 20);
		
		JPanel pan1 = new JPanel(new BorderLayout());
		JPanel pan3 = new JPanel(new FlowLayout());
		JPanel pan2 = new JPanel(new GridLayout(6, 2, 10, 0));

		JLabel lbl1 = new JLabel("To Pay");
		JTextField tf1 = new JTextField(" ", 5);
		
		JLabel lbl2 = new JLabel(" Amount");
		JTextField tf2 = new JTextField(" ", 5);

		JLabel lbl3 = new JLabel("Change Maker", JLabel.CENTER);
		lbl3.setFont(ft2);
		
		JButton dollarButton, quarterButton, dimeButton, nickelButton, pennyButton;

		Image i1, i2, i3, i4, i5;
		ImageIcon dollar, quarter, dime, nickel, penny;

		JButton bt1 = new JButton("Change");
		JButton bt2 = new JButton("Clear");
		
		i1 = getImage(getCodeBase(), "Lab4Images/changemaker/dollar.png");
		i2 = getImage(getCodeBase(), "Lab4Images/changemaker/quarter.png");
		i3 = getImage(getCodeBase(), "Lab4Images/changemaker/dime.png");
		i4 = getImage(getCodeBase(), "Lab4Images/changemaker/nickel.png");
		i5 = getImage(getCodeBase(), "Lab4Images/changemaker/penny.png");
		
		dollar = new ImageIcon(i1);
		quarter = new ImageIcon(i2);
		dime = new ImageIcon(i3);
		nickel = new ImageIcon(i4);
		penny = new ImageIcon(i5);
		
		JLabel lbl4 = new JLabel("dollar", dollar, JLabel.RIGHT);
		JLabel lbl5 = new JLabel("quarter", quarter, JLabel.RIGHT);
		JLabel lbl6 = new JLabel("dime", dime, JLabel.RIGHT);
		JLabel lbl7 = new JLabel("nickel", nickel, JLabel.RIGHT);
		JLabel lbl8 = new JLabel("penny", penny, JLabel.RIGHT);
		
		JTextField [] tfArray = new JTextField[5];
		for( int i=0; i < tfArray.length; i++){
			tfArray[i] = new JTextField(10);
		}
			
		
//		dollarButton = new JButton(dollar);
//		dollarButton.setBorderPainted(false);
//		dollarButton.setContentAreaFilled(false); 
//		dollarButton.setOpaque(false);
//		
//		quarterButton = new JButton(quarter);
//		quarterButton.setBorderPainted(false);
//		quarterButton.setContentAreaFilled(false); 
//		quarterButton.setOpaque(false);
//		
//		dimeButton = new JButton(dime);
//		dimeButton.setBorderPainted(false);
//		dimeButton.setContentAreaFilled(false); 
//		dimeButton.setOpaque(false);
//		
//		nickelButton = new JButton(nickel);
//		nickelButton.setBorderPainted(false);
//		nickelButton.setContentAreaFilled(false); 
//		nickelButton.setOpaque(false);
//		
//		pennyButton = new JButton(penny);
//		pennyButton.setBorderPainted(false);
//		pennyButton.setContentAreaFilled(false); 
//		pennyButton.setOpaque(false);
		
		changeMaker.add(pan1);
		
		pan1.add("North", pan3);
		pan1.add("Center", lbl3);
		pan1.add("South", pan2);
		
		pan3.setBackground(Color.CYAN);
		pan3.add(lbl1);
		pan3.add(tf1);
		pan3.add(lbl2);
		pan3.add(tf2);
		
		pan2.setBackground(Color.CYAN);
		pan2.add(bt1);
		pan2.add(bt2);
		pan2.add(lbl4);
		pan2.add(tfArray[0]);
		pan2.add(lbl5);
		pan2.add(tfArray[1]);
		pan2.add(lbl6);
		pan2.add(tfArray[2]);
		pan2.add(lbl7);
		pan2.add(tfArray[3]);
		pan2.add(lbl8);
		pan2.add(tfArray[4]);
		
		
		pan1.setBackground(Color.CYAN);
		changeMaker.setVisible(true);
		changeMaker.setSize(400, 400);
		changeMaker.setLocation(1200, 200);
	}
}
