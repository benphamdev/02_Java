package view;

import javax.swing.JFrame;

public class Test {
	public static void main(String[] args) {
		JFrame jf = new JFrame();
		// gắn tên
		jf.setTitle("vi du ve jframe");

//		gắn kích cỡ 
		jf.setSize(600, 400);

//		while (true) {
//			System.out.println("program is running");
//		}

		// gắn vị trí hiển thị
		jf.setLocation(300, 300);

		// thoát khỏi chương trình khi đóng cửa sổ jframe
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		// cho phép hiển thị
		jf.setVisible(true);
	}
}
