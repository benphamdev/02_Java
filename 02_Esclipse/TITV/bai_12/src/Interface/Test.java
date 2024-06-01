package Interface;

public class Test {
	public static void main(String[] args) {
		// cau a :

//		Fx580 fx580 = new Fx580();
//		Vinacal vinacal = new Vinacal();
//		System.out.println(vinacal.addition(2, 3));
//		try {
//			System.out.println(fx580.division(12.0, 0.0));
//		} catch (ArithmeticException e) {
//			System.out.println("error!");
//		}

//		cau b : 

		int[] a = new int[] { 1, 2, 3, 4, 5 };
//		InsertionSort insertionSort = new InsertionSort();
//		insertionSort.sortDecending(a);

//		cau c 

		Computer computer = new Computer();
		System.out.println(computer.addition(2, 50));

		computer.sortDecending(a);
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}
}
