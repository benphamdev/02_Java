package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RsaGui extends JFrame {
	private JTextField pField, qField, eField, mField;
	private JTextArea resultArea;

	public RsaGui() {
		setTitle("RSA Encryption/Decryption");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		initComponents();
	}

	private void initComponents() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(5, 2, 10, 10));

		panel.add(new JLabel("p:"));
		pField = new JTextField();
		panel.add(pField);

		panel.add(new JLabel("q:"));
		qField = new JTextField();
		panel.add(qField);

		panel.add(new JLabel("e:"));
		eField = new JTextField();
		panel.add(eField);

		panel.add(new JLabel("Plaintext (m):"));
		mField = new JTextField();
		panel.add(mField);

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
			long p = Long.parseLong(pField.getText());
			long q = Long.parseLong(qField.getText());
			long e = Long.parseLong(eField.getText());
			long m = Long.parseLong(mField.getText());

			long r = p * q;
			long piN = (p - 1) * (q - 1);
			long res = 0;
			for (int i = 0; i <= piN; i++) {
				if ((i * e) % piN == 1) {
					res = i;
					break;
				}
			}

			long encryptedMessage = func(m, e, r);
			long decryptedMessage = func(encryptedMessage, res, r);

			resultArea.setText("d = " + res + "\n" + "Encrypted Message: " + encryptedMessage + "\n"
					+ "Decrypted Message: " + decryptedMessage);
		} catch (NumberFormatException ex) {
			resultArea.setText("Invalid input. Please enter valid integers.");
		}
	}

	public static long func(long a, long b, long mod) {
		long result = 1;
		a = a % mod;
		while (b > 0) {
			if ((b & 1) == 1)
				result = (result * a) % mod;
			b = b >> 1;
			a = (a * a) % mod;
		}
		return result;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new RsaGui().setVisible(true);
			}
		});
	}
}
