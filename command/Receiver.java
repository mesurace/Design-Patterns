package com.cs525.lab5;

public class Receiver {

	VStack stack;
	Lab5 lab4;
	String pushstring;
	javax.swing.JList JList1;

	Receiver(Lab5 lab4, VStack stack, javax.swing.JList JList1) {
		this.lab4 = lab4;
		this.stack = stack;
		this.JList1 = JList1;
	}

	public void popMethod() {
		stack.pop();
		JList1.setListData(stack.getStackVector()); // refresh the JList
		lab4.repaint();
	}

	public void pushMethod() {
		pushstring = "";
		PushDialog dialog = new PushDialog(lab4); // ask the user what to push
		
		dialog.setVisible(true);
		if (!lab4.getPushString().equals("")) // after the dialog is closed,
			stack.push(lab4.getPushString()); // pushstring contains the user input
		JList1.setListData(stack.getStackVector()); // refresh the JList
		lab4.repaint();
	}

}
