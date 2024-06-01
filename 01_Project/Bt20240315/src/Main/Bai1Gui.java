package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class Bai1Gui {
    public static void main(String[] args) {
        // Tạo cửa sổ và các thành phần Swing
        JFrame frame = new JFrame("Digital Signature Application");
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel labelP = new JLabel("Enter value for p:");
        JLabel labelQ = new JLabel("Enter value for q:");
        JLabel labelD = new JLabel("Enter value for d:");
        JLabel labelMessage = new JLabel("Enter message:");

        JTextField fieldP = new JTextField(10);
        JTextField fieldQ = new JTextField(10);
        JTextField fieldD = new JTextField(10);
        JTextField fieldMessage = new JTextField(10);

        JButton signButton = new JButton("Sign");
        JTextArea resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        // Xử lý sự kiện khi nhấn nút "Sign"
        signButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Lấy giá trị p, q, d và message từ người dùng
                    BigInteger p = new BigInteger(fieldP.getText());
                    BigInteger q = new BigInteger(fieldQ.getText());
                    BigInteger d = new BigInteger(fieldD.getText());
                    BigInteger message = new BigInteger(fieldMessage.getText());

                    // Tính toán chữ ký
                    BigInteger n = p.multiply(q);
                    BigInteger signature = message.modPow(d, n);

                    // Hiển thị kết quả
                    resultArea.setText("Message: " + message + "\n");
                    resultArea.append("Signature: " + signature + "\n");
                    resultArea.append("Public Key: (713, 367)\n");
                    resultArea.append("Private Key: (" + d + ")\n");
                    resultArea.append("Signed: " + signature + "\n");

                    // Xác minh chữ ký
                    BigInteger e1 = d.modInverse(p.subtract(BigInteger.ONE).multiply(q.subtract(BigInteger.ONE)));
                    BigInteger verified = signature.modPow(e1, n);
                    resultArea.append("Verify Signature: " + verified + "\n");
                    resultArea.append("Verification Result: " + verified.equals(message));
                } catch (NumberFormatException ex) {
                    resultArea.setText("Invalid input! Please enter valid integers for p, q, d, and message.");
                }
            }
        });

        // Thiết lập vị trí và kích thước của các thành phần
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.LINE_START;
        panel.add(labelP, gbc);

        gbc.gridx = 1;
        gbc.gridy = 0;
        panel.add(fieldP, gbc);

        gbc.gridx = 0;
        gbc.gridy = 1;
        panel.add(labelQ, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(fieldQ, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(labelD, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(fieldD, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(labelMessage, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(fieldMessage, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(signButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        panel.add(resultArea, gbc);

        // Thêm panel vào frame và cấu hình frame
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null); // Hiển thị cửa sổ ở giữa màn hình
        frame.setVisible(true);
    }
}
