package Main;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class EllipticCurveGui extends JFrame {
	private JTextArea resultArea;

	public EllipticCurveGui() {
		setTitle("Elliptic Curve Points Finder");
		setSize(400, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		initComponents();
	}

	private void initComponents() {
		JPanel panel = new JPanel();
		panel.setLayout(new BorderLayout());

		JButton findPointsButton = new JButton("Find Points on Elliptic Curve");
		findPointsButton.addActionListener(e -> displayPoints());

		resultArea = new JTextArea();
		resultArea.setEditable(false);
		JScrollPane scrollPane = new JScrollPane(resultArea);

		panel.add(findPointsButton, BorderLayout.NORTH);
		panel.add(scrollPane, BorderLayout.CENTER);

		add(panel);
	}

	private void displayPoints() {
		ArrayList<Point> points = findPointsOnCurve();

		StringBuilder result = new StringBuilder("Elliptic Curve Points:\n");
		for (Point point : points) {
			result.append("(").append(point.x).append(", ").append(point.y).append(")\n");
		}

		resultArea.setText(result.toString());
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(() -> new EllipticCurveGui().setVisible(true));
	}

	public static ArrayList<Point> findPointsOnCurve() {
		ArrayList<Point> points = new ArrayList<>();

		for (int x = 0; x < 11; x++) {
			int z = (int) (Math.pow(x, 3) + x + 6) % 11;

			if (isQuadraticResidue(z, 11)) {
				for (int y = 0; y < 11; y++) {
					if ((y * y) % 11 == z) {
						points.add(new Point(x, y));
					}
				}
			}
		}
		return points;
	}

	public static boolean isQuadraticResidue(int num, int p) {
		for (int x = 1; x < p; x++) {
			if ((x * x) % p == num) {
				return true;
			}
		}
		return false;
	}

	static class Point {
		int x;
		int y;

		public Point(int x, int y) {
			this.x = x;
			this.y = y;
		}
	}
}
