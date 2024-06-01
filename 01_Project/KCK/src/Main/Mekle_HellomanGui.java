package Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Mekle_HellomanGui extends JFrame {
	private JTextField sumField, numbersField;
	private JTextArea resultArea;

	public Mekle_HellomanGui() {
		setTitle("Merkle-Hellman Knapsack Problem");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		initComponents();
	}

	private void initComponents() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(4, 2, 10, 10));

		panel.add(new JLabel("Target Sum (S):"));
		sumField = new JTextField();
		panel.add(sumField);

		panel.add(new JLabel("Numbers (comma-separated):"));
		numbersField = new JTextField();
		panel.add(numbersField);

		JButton findSubsetButton = new JButton("Find Subset");
		findSubsetButton.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				performSubsetFinding();
			}
		});
		panel.add(findSubsetButton);

		resultArea = new JTextArea();
		resultArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(resultArea);

		add(panel, BorderLayout.NORTH);
		add(scrollPane, BorderLayout.CENTER);
	}

	private void performSubsetFinding() {
		try {
			int S = Integer.parseInt(sumField.getText());
			String[] numbersStr = numbersField.getText().split(",");
			int[] numbers = new int[numbersStr.length];

			for (int i = 0; i < numbersStr.length; i++) {
				numbers[i] = Integer.parseInt(numbersStr[i].trim());
			}

			ArrayList<Integer> solution = findSubset(numbers, S);
			if (solution != null) {
				resultArea.setText("Subset for S = " + S + ": " + solution);
			} else {
				resultArea.setText("No solution found.");
			}
		} catch (NumberFormatException ex) {
			resultArea.setText("Invalid input. Please enter valid integers.");
		}
	}

	public static ArrayList<Integer> findSubset(int[] numbers, int S) {
		ArrayList<Integer> subset = new ArrayList<>();
		for (int i = 0; i < numbers.length; i++) {
			int sum = numbers[i];
			subset.clear();
			subset.add(numbers[i]);

			for (int j = 0; j < numbers.length; j++) {
				if (j != i) {
					if (sum + numbers[j] <= S) {
						subset.add(numbers[j]);
						sum += numbers[j];
					}
				}
			}

			if (sum == S) {
				return subset;
			}
		}
		return null;
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				new Mekle_HellomanGui().setVisible(true);
			}
		});
	}
}
