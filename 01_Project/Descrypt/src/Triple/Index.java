
package Triple;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Base64;

import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

public class Index extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JLabel lblKey1;
	private JTextField textFieldKey1;
	private JLabel lblKey2;
	private JTextField textFieldKey2;
	private JLabel lblKey3;
	private JTextField textFieldKey3;
	private JLabel lblOriginalText;
	private JTextArea textAreaOriginal;
	private JTextArea textAreaEncrypted;
	private JLabel lblEncryptedText;
	private JTextArea textAreaDecrypted;
	private JLabel lblDecryptedText;
	private JButton btnEncrypt;
	private JButton btnDecrypt;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Index frame = new Index();
					frame.setVisible(true);
					UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public void encrypt() {
		try {
			String originalText = textAreaOriginal.getText();
			String key1 = textFieldKey1.getText();
			String key2 = textFieldKey2.getText();
			String key3 = textFieldKey3.getText();

			byte[] byteEncrypted1 = encryptDES(key1, originalText.getBytes());
			byte[] byteEncrypted2 = encryptDES(key2, byteEncrypted1);
			byte[] byteEncrypted3 = encryptDES(key3, byteEncrypted2);

			String encrypted = Base64.getEncoder().encodeToString(byteEncrypted3);
			textAreaEncrypted.setText(encrypted);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	public void decrypt() {
		try {
			String encryptedText = textAreaEncrypted.getText();
			String key1 = textFieldKey1.getText();
			String key2 = textFieldKey2.getText();
			String key3 = textFieldKey3.getText();

			byte[] byteDecrypted3 = decryptDES(key3, Base64.getDecoder().decode(encryptedText));
			byte[] byteDecrypted2 = decryptDES(key2, byteDecrypted3);
			byte[] byteDecrypted1 = decryptDES(key1, byteDecrypted2);

			String decrypted = new String(byteDecrypted1);
			textAreaDecrypted.setText(decrypted);
		} catch (Exception ex) {
			ex.printStackTrace();
		}
	}

	private byte[] encryptDES(String key, byte[] data) throws Exception {
		SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), "DES");
		Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5PADDING");
		cipher.init(Cipher.ENCRYPT_MODE, skeySpec);
		return cipher.doFinal(data);
	}

	private byte[] decryptDES(String key, byte[] data) throws Exception {
		SecretKeySpec skeySpec = new SecretKeySpec(key.getBytes(), "DES");
		Cipher cipher = Cipher.getInstance("DES/ECB/PKCS5PADDING");
		cipher.init(Cipher.DECRYPT_MODE, skeySpec);
		return cipher.doFinal(data);
	}

	public Index() {
		setTitle("Triple DES Encryption");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 909, 249);
		this.contentPane = new JPanel();
		this.contentPane.setBackground(SystemColor.control);
		this.contentPane.setForeground(Color.WHITE);
		this.contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(this.contentPane);
		this.contentPane.setLayout(null);

		this.lblKey1 = new JLabel("Key 1: ");
		this.lblKey1.setBounds(10, 11, 46, 14);
		this.contentPane.add(this.lblKey1);

		this.textFieldKey1 = new JTextField();
		this.textFieldKey1.setBounds(48, 8, 146, 20);
		this.contentPane.add(this.textFieldKey1);
		this.textFieldKey1.setColumns(10);

		this.lblKey2 = new JLabel("Key 2: ");
		this.lblKey2.setBounds(204, 11, 46, 14);
		this.contentPane.add(this.lblKey2);

		this.textFieldKey2 = new JTextField();
		this.textFieldKey2.setBounds(246, 8, 146, 20);
		this.contentPane.add(this.textFieldKey2);
		this.textFieldKey2.setColumns(10);

		this.lblKey3 = new JLabel("Key 3: ");
		this.lblKey3.setBounds(402, 11, 46, 14);
		this.contentPane.add(this.lblKey3);

		this.textFieldKey3 = new JTextField();
		this.textFieldKey3.setBounds(448, 8, 146, 20);
		this.contentPane.add(this.textFieldKey3);
		this.textFieldKey3.setColumns(10);

		this.lblOriginalText = new JLabel("Original text: ");
		this.lblOriginalText.setBounds(10, 43, 76, 14);
		this.contentPane.add(this.lblOriginalText);

		this.textAreaOriginal = new JTextArea();
		this.textAreaOriginal.setLineWrap(true);
		this.textAreaOriginal.setBounds(10, 68, 200, 121);
		this.contentPane.add(this.textAreaOriginal);

		this.btnEncrypt = new JButton("Encrypt >>");
		this.btnEncrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				encrypt();
			}
		});
		this.btnEncrypt.setBounds(220, 108, 107, 23);
		this.contentPane.add(this.btnEncrypt);

		this.textAreaEncrypted = new JTextArea();
		this.textAreaEncrypted.setLineWrap(true

		);
		this.textAreaEncrypted.setBounds(337, 68, 200, 121);
		this.contentPane.add(this.textAreaEncrypted);

		this.lblEncryptedText = new JLabel("Encrypted text: ");
		this.lblEncryptedText.setBounds(337, 43, 95, 14);
		this.contentPane.add(this.lblEncryptedText);

		this.btnDecrypt = new JButton("Decrypt >>");
		this.btnDecrypt.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				decrypt();
			}
		});
		this.btnDecrypt.setBounds(558, 108, 107, 23);
		this.contentPane.add(this.btnDecrypt);

		this.textAreaDecrypted = new JTextArea();
		this.textAreaDecrypted.setLineWrap(true);
		this.textAreaDecrypted.setBounds(675, 68, 200, 121);
		this.contentPane.add(this.textAreaDecrypted);

		this.lblDecryptedText = new JLabel("Decrypted text: ");
		this.lblDecryptedText.setBounds(675, 43, 105, 14);
		this.contentPane.add(this.lblDecryptedText);
	}
}
