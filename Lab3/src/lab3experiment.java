
import java.awt.*;
import javax.swing.*;
public class Lab3Experiment extends JApplet
{
    Font myFont = new Font("Times",Font.ITALIC,14);
    
    JLabel label1 = new JLabel("Label1");
    JLabel passwdLabel = new JLabel("Password:",Label.RIGHT);
        
    JTextField password = new JTextField(10);
        
    JCheckBox probation = new JCheckBox("Probation?");
        
    JButton cancel = new JButton("Cancel");
        
    JTextArea comments = new JTextArea("Will it wordwrap? Nope!\nThis appears on the next line.",5,8);
        
    DefaultListModel list = new DefaultListModel();
    JList myList     = new JList(list);
    
    JComboBox myChoice = new JComboBox();
    
    DefaultListModel model = new DefaultListModel();
    JList majors = new Jlist (model); 		
    JScrollPane spane = new JScrollPane (majors);
    public void init()
    {
     	setLayout(new FlowLayout());
        
     	// set applet's backgound color and size
        
     	setBackground(Color.magenta);
       	setSize(500,500);

        // set properties of individual widgets
        label1.setBackground(Color.pink);
        label1.setFont(myFont);
        label1.setSize(80,40);
        label1.setLocation(200,200);
                
        passwdLabel.setBackground(Color.green);
        passwdLabel.setForeground(Color.blue);
        passwdLabel.setFont(myFont);

        // add items to List widget
        list.add(0,"Potatoes");
        list.add(1,"Green Beans");
        list.add(2,"Okra");
        list.add(3,"Squash");
        list.add(4,"Asparagus");
        list.add(5,"Corn");
                
        // add items to Choice widget
        myChoice.addItem("Soccer");
        myChoice.addItem("Football");
        myChoice.addItem("Baseball");
                
        // add widgets to applet
        add(label1);
        add(probation);
        add(passwdLabel);
        add(password);
        add(cancel);
        add(comments);
        add(myList);
        add(myChoice);        
        }
}

