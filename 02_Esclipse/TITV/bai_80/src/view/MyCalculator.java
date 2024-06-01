package view;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.UIManager;

public class MyCalculator extends JFrame {
	public MyCalculator() {
		this.setTitle("My caculator");

		this.setSize(300, 300);

		this.setLocationRelativeTo(null);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JTextField jtf = new JTextField(50);
		JPanel jp_head = new JPanel();
		jp_head.setLayout(new BorderLayout());
		jp_head.add(jtf, BorderLayout.CENTER);

		JButton jbt0 = new JButton("0");
		JButton jbt1 = new JButton("1");
		JButton jbt2 = new JButton("2");
		JButton jbt3 = new JButton("3");
		JButton jbt4 = new JButton("4");
		JButton jbt5 = new JButton("5");
		JButton jbt6 = new JButton("6");
		JButton jbt7 = new JButton("7");
		JButton jbt8 = new JButton("8");
		JButton jbt9 = new JButton("9");
		JButton jbt10 = new JButton("10");
		JButton jbtSum = new JButton("+");
		JButton jbtSub = new JButton("-");
		JButton jbtMul = new JButton("*");
		JButton jbtDiv = new JButton("/");
		JButton jbtEqua = new JButton("=");

		this.setLayout(new BorderLayout());
		JPanel jp_btt = new JPanel();
		jp_btt.setLayout(new GridLayout(5, 3));

		jp_btt.add(jbt0);
		jp_btt.add(jbt1);
		jp_btt.add(jbt2);
		jp_btt.add(jbt3);
		jp_btt.add(jbt4);
		jp_btt.add(jbt5);
		jp_btt.add(jbt6);
		jp_btt.add(jbt7);
		jp_btt.add(jbt8);
		jp_btt.add(jbt9);
		jp_btt.add(jbt10);
		jp_btt.add(jbtSum);
		jp_btt.add(jbtMul);
		jp_btt.add(jbtDiv);
		jp_btt.add(jbtEqua);

		this.add(jp_head, BorderLayout.NORTH);
		this.add(jp_btt, BorderLayout.CENTER);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
			new MyCalculator();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
