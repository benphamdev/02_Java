package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class ElgamalGui extends JFrame {
	private JTextField pField, alphaField, aField, xField, kField;
	private JTextArea resultArea;

	public ElgamalGui() {
	        setTitle("ElGamal Encryption/Decryption");
	        setSize(400, 300);
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        setLocationRelativeTo(null);

	        initComponents();
	    }

	private void initComponents() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(6, 2, 10, 10));

		panel.add(new JLabel("p:"));
		pField = new JTextField();
		panel.add(pField);

		panel.add(new JLabel("alpha:"));
		alphaField = new JTextField();
		panel.add(alphaField);

		panel.add(new JLabel("a:"));
		aField = new JTextField();
		panel.add(aField);

		panel.add(new JLabel("x:"));
		xField = new JTextField();
		panel.add(xField);

		panel.add(new JLabel("k:"));
		kField = new JTextField();
		panel.add(kField);

		JButton encryptButton = new JButton("Encrypt/Decrypt");
		encryptButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				performEncryptionDecryption();
			}
		});
		panel.add(encryptButton);

		resultArea = new JTextArea();
		resultArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(resultArea);

		add(panel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);
	}

	private void performEncryptionDecryption() {
		try {
			BigInteger p = new BigInteger(pField.getText());
			BigInteger alpha = new BigInteger(alphaField.getText());
			BigInteger a = new BigInteger(aField.getText());
			BigInteger x = new BigInteger(xField.getText());
			BigInteger k = new BigInteger(kField.getText());

			BigInteger beta = alpha.modPow(a, p);

			BigInteger[] encrypted = ElGamal.encrypt(x, k, p, alpha, beta);
			BigInteger decrypted = ElGamal.decrypt(encrypted[0], encrypted[1], a, p);

			resultArea.setText("Public Key (beta): " + beta + "\n" + "Encrypted (y1): " + encrypted[0] + "\n"
					+ "Encrypted (y2): " + encrypted[1] + "\n" + "Decrypted message: " + decrypted);
		} catch (NumberFormatException ex) {
			resultArea.setText("Invalid input. Please enter valid integers.");
		}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new ElgamalGui().setVisible(true);
			}
		});
	}
}
