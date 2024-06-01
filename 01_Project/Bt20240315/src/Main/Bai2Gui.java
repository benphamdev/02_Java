package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.math.BigInteger;

public class Bai2Gui {
    public static void main(String[] args) {
        // Tạo cửa sổ và các thành phần Swing
        JFrame frame = new JFrame("ElGamal Digital Signature Application");
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();

        JLabel labelP = new JLabel("Enter value for p:");
        JLabel labelAlpha = new JLabel("Enter value for alpha:");
        JLabel labelA = new JLabel("Enter value for a:");
        JLabel labelX = new JLabel("Enter value for x:");
        JLabel labelK = new JLabel("Enter value for k:");

        JTextField fieldP = new JTextField(10);
        JTextField fieldAlpha = new JTextField(10);
        JTextField fieldA = new JTextField(10);
        JTextField fieldX = new JTextField(10);
        JTextField fieldK = new JTextField(10);

        JButton signButton = new JButton("Sign");
        JTextArea resultArea = new JTextArea(10, 30);
        resultArea.setEditable(false);

        // Xử lý sự kiện khi nhấn nút "Sign"
        signButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    // Lấy giá trị p, alpha, a, x, k từ người dùng
                    BigInteger p = new BigInteger(fieldP.getText());
                    BigInteger alpha = new BigInteger(fieldAlpha.getText());
                    BigInteger a = new BigInteger(fieldA.getText());
                    BigInteger x = new BigInteger(fieldX.getText());
                    BigInteger k = new BigInteger(fieldK.getText());

                    Bai2 elGamal = new Bai2(p, alpha, a);

                    // Ký thông điệp
                    BigInteger[] signature = elGamal.sign(x, k);
                    String signatureString = "(r, s) = (" + signature[0] + ", " + signature[1] + ")\n";

                    // Tạo khóa công khai y
                    BigInteger y = alpha.modPow(a, p);

                    // Xác minh chữ ký
                    boolean isVerified = elGamal.verify(x, signature[0], signature[1], y);
                    String verificationResult = "Signature is valid: " + isVerified;

                    // Hiển thị kết quả
                    resultArea.setText(signatureString + verificationResult);
                } catch (NumberFormatException ex) {
                    resultArea.setText("Invalid input! Please enter valid integers.");
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
        panel.add(labelAlpha, gbc);

        gbc.gridx = 1;
        gbc.gridy = 1;
        panel.add(fieldAlpha, gbc);

        gbc.gridx = 0;
        gbc.gridy = 2;
        panel.add(labelA, gbc);

        gbc.gridx = 1;
        gbc.gridy = 2;
        panel.add(fieldA, gbc);

        gbc.gridx = 0;
        gbc.gridy = 3;
        panel.add(labelX, gbc);

        gbc.gridx = 1;
        gbc.gridy = 3;
        panel.add(fieldX, gbc);

        gbc.gridx = 0;
        gbc.gridy = 4;
        panel.add(labelK, gbc);

        gbc.gridx = 1;
        gbc.gridy = 4;
        panel.add(fieldK, gbc);

        gbc.gridx = 0;
        gbc.gridy = 5;
        gbc.gridwidth = 2;
        gbc.anchor = GridBagConstraints.CENTER;
        panel.add(signButton, gbc);

        gbc.gridx = 0;
        gbc.gridy = 6;
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
