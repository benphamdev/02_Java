package bai_2;

public class demo {
	public static void main(String[] args) {
		int a = 100;
		System.out.println("a = " + a);
//ép kiểu ngầm định 
		float c = a;
		System.out.println("c = " + c);
// ép kiểu tường minh
		float g = 3.5f;
		int i = (int) g;
		System.out.println("i = " + i);
//ép kiểu đối tượng 
		int n = new Integer(12);
		System.out.println(n);
	}
}
