package event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Test extends Frame implements ActionListener {
	TextField textField;

	Test() {
		// Component Creation
		textField = new TextField();

		// setBounds method is used to provide
		// position and size of the component
		textField.setBounds(60, 50, 180, 25);
		Button button = new Button("click Here");
		button.setBounds(100, 120, 80, 30);

		// Registering component with listener
		// this refers to current instance
		button.addActionListener(this);

		// add Components
		add(textField);
		add(button);

		// set visibility
		setVisible(true);
	}

	// implementing method of actionListener
	public void actionPerformed(ActionEvent e) {
		// Setting text to field
		textField.setText("GFG!");
	}

	public static void main(String[] args) {
		new Test();
	}
}
