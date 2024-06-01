package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class RabinGui extends JFrame {
	private JTextField pField, qField, xField;
	private JTextArea resultArea;

	public RabinGui() {
		setTitle("Rabin Encryption/Decryption");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		initComponents();
	}

	private void initComponents() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 2, 10, 10));

		panel.add(new JLabel("p:"));
		pField = new JTextField();
		panel.add(pField);

		panel.add(new JLabel("q:"));
		qField = new JTextField();
		panel.add(qField);

		panel.add(new JLabel("Plaintext (x):"));
		xField = new JTextField();
		panel.add(xField);

		JButton encryptDecryptButton = new JButton("Encrypt/Decrypt");
		encryptDecryptButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				performEncryptionDecryption();
			}
		});
		panel.add(encryptDecryptButton);

		resultArea = new JTextArea();
		resultArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(resultArea);

		add(panel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);
	}

	private void performEncryptionDecryption() {
		try {
			int p = Integer.parseInt(pField.getText());
			int q = Integer.parseInt(qField.getText());
			int x = Integer.parseInt(xField.getText());

			int n = p * q;
			List<Integer> ciphertext = Rabin.encrypt(x, n);
			resultArea.setText("Encrypted Message: " + ciphertext.get(0));

			int decryptedMessage = Rabin.decrypt(ciphertext, p, q);
			resultArea.append("\nDecrypted Message: " + decryptedMessage);
		} catch (NumberFormatException ex) {
			resultArea.setText("Invalid input. Please enter valid integers.");
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new RabinGui().setVisible(true);
			}
		});
	}
}
