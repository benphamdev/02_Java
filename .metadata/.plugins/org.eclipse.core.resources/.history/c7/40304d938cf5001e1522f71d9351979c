package Main;

import javax.swing.*;
import java.io.*;
import java.math.BigInteger;

public class DigitalSignature {
    public static void main(String[] args) {
        // Create the frame
        JFrame frame = new JFrame("Digital Signature");
        frame.setSize(800, 300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create panel
        JPanel panel = new JPanel();
        frame.add(panel);

        // Add components
        JTextField pField = new JTextField(5);
        JTextField qField = new JTextField(5);
        JTextField dField = new JTextField(5);
        JButton signButton = new JButton("Sign");
        JButton verifyButton = new JButton("Verify Signature");

        JTextArea publicKeyArea = new JTextArea(5, 20);
        publicKeyArea.setEditable(false);
        publicKeyArea.setLineWrap(true);

        JTextArea messageArea = new JTextArea(5, 20);
        messageArea.setEditable(false);
        messageArea.setLineWrap(true);

        JTextField verifyPField = new JTextField(5);
        JTextField verifyQField = new JTextField(5);

        panel.add(new JLabel("p:"));
        panel.add(pField);
        panel.add(new JLabel("q:"));
        panel.add(qField);
        panel.add(new JLabel("d:"));
        panel.add(dField);
        panel.add(signButton);
        panel.add(new JScrollPane(publicKeyArea));
        panel.add(new JLabel("Signed Message:"));
        panel.add(new JScrollPane(messageArea));
        panel.add(new JLabel("Verify Key1:"));
        panel.add(verifyPField);
        panel.add(new JLabel("Verify Key2:"));
        panel.add(verifyQField);
        panel.add(verifyButton);

        // Sign button action
        signButton.addActionListener(e -> {
            try {
                BigInteger p = new BigInteger(pField.getText());
                BigInteger q = new BigInteger(qField.getText());
                BigInteger d = new BigInteger(dField.getText());

                // Choose input file using JFileChooser
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
                int result = fileChooser.showOpenDialog(null);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();

                    // Read message from file
                    FileInputStream inputStream = new FileInputStream(selectedFile);
                    ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        byteStream.write(buffer, 0, bytesRead);
                    }
                    byte[] messageBytes = byteStream.toByteArray();
                    inputStream.close();

                    // Convert message to BigInteger
                    BigInteger message = new BigInteger(1, messageBytes);

                    // Compute signature
                    BigInteger n = p.multiply(q);
                    BigInteger signature = message.modPow(d, n);

                    // Write results to file
                    BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"));
                    writer.write("Message: " + new String(messageBytes) + "\n");
                    writer.write("Signature: " + signature + "\n");
                    writer.write("Public Key: (" + n + ", " + d.modInverse(p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE))) + ")\n");
                    writer.write("Private Key: (" + d + ")\n");
                    writer.write("Signed: " + signature + "\n");
                    writer.close();

                    publicKeyArea.setText("Public Key: (" + n + ", " + d.modInverse(p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE))) + ")");
                    messageArea.setText(new String(messageBytes));

                    JOptionPane.showMessageDialog(null, "File signed successfully.");
                } else {
                    JOptionPane.showMessageDialog(null, "No file selected.");
                }
            } catch (IOException | NumberFormatException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "An error occurred. Please check your input and try again.");
            }
        });

        // Verify button action
        verifyButton.addActionListener(e -> {
            try {
                BigInteger verifyP = new BigInteger(verifyPField.getText());
                BigInteger verifyQ = new BigInteger(verifyQField.getText());

                // Choose input file using JFileChooser
                JFileChooser fileChooser = new JFileChooser();
                fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
                int result = fileChooser.showOpenDialog(null);

                if (result == JFileChooser.APPROVE_OPTION) {
                    File selectedFile = fileChooser.getSelectedFile();

                    // Read the content of the file
                    FileInputStream inputStream = new FileInputStream(selectedFile);
                    ByteArrayOutputStream byteStream = new ByteArrayOutputStream();
                    byte[] buffer = new byte[1024];
                    int bytesRead;
                    while ((bytesRead = inputStream.read(buffer)) != -1) {
                        byteStream.write(buffer, 0, bytesRead);
                    }
                    byte[] fileContent = byteStream.toByteArray();
                    inputStream.close();

                    // Extract the signature from the file content
                    String fileContentString = new String(fileContent);
                    String[] lines = fileContentString.split("\n");
                    String signatureLine = null;
                    for (String line : lines) {
                        if (line.startsWith("Signature:")) {
                            signatureLine = line.trim();
                            break;
                        }
                    }

                    if (signatureLine != null) {
                        String[] parts = signatureLine.split(":");
                        if (parts.length >= 2) {
                            String signatureString = parts[1].trim();
                            BigInteger signature = new BigInteger(signatureString.trim());

                            // Compute n
                            BigInteger n = verifyP.multiply(verifyQ);

                            // Compute m^e mod n using public key
                            BigInteger computedMessage = signature.modPow(BigInteger.valueOf(65537), n); // Assuming e is 65537

                            // Compare computed message with the original message
                            if (new BigInteger(1, fileContent).equals(computedMessage)) {
                                JOptionPane.showMessageDialog(null, "Signature is valid.");
                            } else {
                                JOptionPane.showMessageDialog(null, "Signature is not valid.");
                            }
                        } else {
                            JOptionPane.showMessageDialog(null, "Invalid signature format in file.");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Signature not found in file.");
                    }
                } else {
                    JOptionPane.showMessageDialog(null, "No file selected.");
                }
            } catch (IOException | NumberFormatException ex) {
                ex.printStackTrace();
                JOptionPane.showMessageDialog(null, "An error occurred. Please check your input and try again.");
            }
        });

        frame.setVisible(true);
    }
}