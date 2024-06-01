package bai_7;

public class demo {
	public static void main(String[] args) {
		int i = 0, j = 0;
		label: for (i = 0; i < 10; i++) {
			for (j = 0; j < 10; j++) {
				if (j > 5)
					break label;
			}
			System.out.println("in label " + i + " " + j);
		}
		System.out.println("out label " + i + " " + j);
	}
}
