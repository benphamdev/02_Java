package view;

import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Vidu_FlowLayout extends JFrame {
	public Vidu_FlowLayout() {
		this.setTitle("vi du flowlayout");
		this.setSize(600, 400);
		// căn giữa của sổ chương trình
		this.setLocationRelativeTo(null);

//		set layout
		FlowLayout fll = new FlowLayout();
		FlowLayout fll1 = new FlowLayout(FlowLayout.RIGHT);
		FlowLayout fll2 = new FlowLayout(FlowLayout.CENTER, 40, 40);
		this.setLayout(fll2);

		JButton jbtt1 = new JButton("1");
		JButton jbtt2 = new JButton("2");
		JButton jbtt3 = new JButton("3");

		// add thành phần
		this.add(jbtt1);
		this.add(jbtt2);
		this.add(jbtt3);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Vidu_FlowLayout();
	}
}
