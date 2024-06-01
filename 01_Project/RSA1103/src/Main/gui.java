package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class gui extends JFrame {

    private JTextField pField, qField, eField, mField;
    private JTextArea resultArea;

    public gui() {
        setTitle("Modular Arithmetic Calculator");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel mainPanel = new JPanel(new BorderLayout());

        JPanel inputPanel = new JPanel(new GridLayout(4, 2));
        inputPanel.add(new JLabel("p:"));
        pField = new JTextField();
        inputPanel.add(pField);
        inputPanel.add(new JLabel("q:"));
        qField = new JTextField();
        inputPanel.add(qField);
        inputPanel.add(new JLabel("e:"));
        eField = new JTextField();
        inputPanel.add(eField);
        inputPanel.add(new JLabel("m:"));
        mField = new JTextField();
        inputPanel.add(mField);

        JButton calculateButton = new JButton("Calculate");
        calculateButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                calculate();
            }
        });

        resultArea = new JTextArea();
        resultArea.setEditable(false);

        mainPanel.add(inputPanel, BorderLayout.CENTER);
        mainPanel.add(calculateButton, BorderLayout.SOUTH);
        mainPanel.add(resultArea, BorderLayout.NORTH);

        add(mainPanel);
    }

    private void calculate() {
        try {
            long p = Long.parseLong(pField.getText());
            long q = Long.parseLong(qField.getText());
            long e = Long.parseLong(eField.getText());
            long m = Long.parseLong(mField.getText());

            long phi = (p - 1) * (q - 1);
            long[] gcdExtendedResult = gcdExtended(e, phi);
            long inverse = (gcdExtendedResult[1] % phi + phi) % phi;
            long powerResult = power(m, e, p * q);

            resultArea.setText("Modular multiplicative inverse: " + inverse + "\nPower: " + powerResult);
        } catch (NumberFormatException ex) {
            resultArea.setText("Invalid input. Please enter valid integer values.");
        }
    }

    private long power(long x, long y, long p) {
        long res = 1;
        x = x % p;
        if (x == 0) {
            return 0;
        }
        while (y > 0) {
            if ((y & 1) == 1) {
                res = (res * x) % p;
            }
            y = y >> 1;
            x = (x * x) % p;
        }
        return res;
    }

    private long[] gcdExtended(long a, long b) {
        if (a == 0) {
            return new long[]{b, 0, 1};
        }
        long[] vals = gcdExtended(b % a, a);
        long gcd = vals[0];
        long x1 = vals[1];
        long y1 = vals[2];
        long x = y1 - (b / a) * x1;
        long y = x1;
        return new long[]{gcd, x, y};
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> new gui().setVisible(true));
    }
}
