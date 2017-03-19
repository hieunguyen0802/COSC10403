		super.init();
		orderFrame.setVisible(false);
		changeMaker.setVisible(false);

		moveB.addActionListener(this);

	}

	public void displayResult() {
		int pos = cbb.getSelectedIndex();
		String s = (String) cbb.getSelectedItem();
		nameTF.setForeground(colore.RED);
		nameTF.setText(",a,a,");
	}

	public void actionPerformed(ActionEvent dog){
		if (dog.getSource() == moveB)
			displayResult();
		else 
			clearGUI();
	}

	public void clearGUI() {
		nameTF.setText("");
		cbb.setSelectedIndex(0);
	}
}
public class lab5example {

}
