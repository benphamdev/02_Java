package view;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Vidu_BorderLayout extends JFrame {
	public Vidu_BorderLayout() {
		this.setTitle("vi du flowlayout");
		this.setSize(600, 400);
		// căn giữa của sổ chương trình
		this.setLocationRelativeTo(null);

//		set layout
		BorderLayout bll = new BorderLayout();
		BorderLayout bll1 = new BorderLayout(15, 15);
		this.setLayout(bll1);

		JButton jbtt1 = new JButton("1");
		JButton jbtt2 = new JButton("2");
		JButton jbtt3 = new JButton("3");
		JButton jbtt4 = new JButton("4");
		JButton jbtt5 = new JButton("5");

		// add thành phần

		this.add(jbtt1, BorderLayout.NORTH);
		this.add(jbtt2, BorderLayout.SOUTH);
		this.add(jbtt3, BorderLayout.WEST);
		this.add(jbtt4, BorderLayout.EAST);
		this.add(jbtt5, BorderLayout.CENTER);

		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

	public static void main(String[] args) {
		new Vidu_BorderLayout();
	}

}
