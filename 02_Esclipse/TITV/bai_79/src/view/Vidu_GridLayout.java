package view;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Vidu_GridLayout extends JFrame {
	public Vidu_GridLayout() {
		this.setTitle("vi du flowlayout");
		this.setSize(600, 400);
		// căn giữa của sổ chương trình
		this.setLocationRelativeTo(null);

//		set layout
		GridLayout fll = new GridLayout();
		GridLayout fll1 = new GridLayout(4, 4);
		GridLayout fll2 = new GridLayout(4, 4, 25, 25);
		this.setLayout(fll2);

		// add thành phần

		for (int i = 0; i < 4 * 4; i++) {
			JButton jbtt = new JButton(i + "");
			this.add(jbtt);
		}
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Vidu_GridLayout();
	}
}
