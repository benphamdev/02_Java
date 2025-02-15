package Main;

import javax.swing.*;
import java.io.*;
import java.math.BigInteger;

public class DigitalSignature {
    // Method to compute signature
    private static BigInteger computeSignature(BigInteger message, BigInteger p, BigInteger q, BigInteger d) {
        BigInteger n = p.multiply(q);
        return message.modPow(d, n);
    }

    // Method to write results to file
    private static void writeResultsToFile(String outputFile, BigInteger message, BigInteger signature, BigInteger p, BigInteger q, BigInteger d) throws IOException {
        BigInteger n = p.multiply(q);
        BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
        writer.write("Message: " + message + "\n");
        writer.write("Signature: " + signature + "\n");
        writer.write("Public Key: (" + n + ", " + d.modInverse(p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE))) + ")\n");
        writer.write("Private Key: (" + d + ")\n");
        writer.write("Signed: " + signature + "\n");
        writer.close();
        System.out.println("Signature computation and output completed successfully.");
    }

    public static void main(String[] args) {
        // Input and output file paths
        String inputFile = "src//Main//input.txt";
        String outputFile = "src//Main//output.txt";
        BigInteger publicKeyN, publicKeyE;

        // Create JTextFields
        JTextField pField = new JTextField(10);
        JTextField qField = new JTextField(10);
        JTextField dField = new JTextField(10);

        // Create JFrame
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 200);

        // Create JPanel
        JPanel panel = new JPanel();
        panel.add(new JLabel("p:"));
        panel.add(pField);
        panel.add(new JLabel("q:"));
        panel.add(qField);
        panel.add(new JLabel("d:"));
        panel.add(dField);

        // Create JButton for choosing file, sign, and verify
        JButton chooseFileButton = new JButton("Choose File");
        JButton signButton = new JButton("Sign");
        JButton verifyButton = new JButton("Verify");

        // Add buttons to JPanel
        panel.add(chooseFileButton);
        panel.add(signButton);
        panel.add(verifyButton);

        // Add JPanel to JFrame
        frame.add(panel);
        frame.setVisible(true);

        // Action Listener for chooseFileButton
        chooseFileButton.addActionListener(e -> {
            JFileChooser fileChooser = new JFileChooser();
            fileChooser.setCurrentDirectory(new File(System.getProperty("user.dir")));
            int result = fileChooser.showOpenDialog(null);

            if (result == JFileChooser.APPROVE_OPTION) {
                File selectedFile = fileChooser.getSelectedFile();
                // Do something with the selected file
            } else {
                System.out.println("No file selected.");
            }
        });

        // Action Listener for signButton
        signButton.addActionListener(e -> {
            // Retrieve values from JTextFields
            BigInteger p = new BigInteger(pField.getText());
            BigInteger q = new BigInteger(qField.getText());
            BigInteger d = new BigInteger(dField.getText());

            // Read message from file
            try {
                BufferedReader reader = new BufferedReader(new FileReader(inputFile));
                StringBuilder messageBuilder = new StringBuilder();
                String line;
                while ((line = reader.readLine()) != null) {
                    messageBuilder.append(line);
                }
                reader.close();

                // Convert message to BigInteger
                BigInteger message = new BigInteger(messageBuilder.toString());

                // Compute signature
                BigInteger signature = computeSignature(message, p, q, d);

                // Write results to file
                writeResultsToFile(outputFile, message, signature, p, q, d);

                // Show results
                JOptionPane.showMessageDialog(null, "Signature: " + signature, "Digital Signature", JOptionPane.INFORMATION_MESSAGE);
                 publicKeyN = p.multiply(q);
                 publicKeyE = d.modInverse(p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE)));
                JOptionPane.showMessageDialog(null, "Public Key: (" + publicKeyN + ", " + publicKeyE + ")", "Digital Signature", JOptionPane.INFORMATION_MESSAGE);

                // Print signature and public key to console
                System.out.println("Signature: " + signature);
                System.out.println("Public Key: (" + publicKeyN + ", " + publicKeyE + ")");

            } catch (IOException ex) {
                System.out.println("An error occurred while reading/writing files.");
                ex.printStackTrace();
            }
        });

        // Action Listener for verifyButton
        verifyButton.addActionListener(e -> {
            // Add verification logic here
            System.out.println("Verification button clicked.");
        });
    }
}
