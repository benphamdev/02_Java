package genericExample;

public class genericMethod {
	public static <T> void swap(T[] a, int i, int j) {
		T t = a[i];
		a[i] = a[j];
		a[j] = t;
	}

	public static <T extends Comparable<T>> void sort_generics(T[] a) {
		for (int i = 0; i < a.length - 1; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[j].compareTo(a[i]) < 0) {
					swap(a, i, j);
				}
			}
		}
		for (T i : a) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		genericMethod m = new genericMethod();
		Integer[] a = { 100, 22, 58, 41, 6, 50 };

		Character[] c = { 'v', 'g', 'a', 'c', 'x', 'd', 't' };

		String[] s = { "Virat", "Rohit", "Abhinay", "Chandu", "Sam", "Bharat", "Kalam" };

		System.out.print("Sorted Integer array :  ");
		sort_generics(a);

		System.out.print("Sorted Character array :  ");
		m.<Character>sort_generics(c);

		System.out.print("Sorted String array :  ");
		m.sort_generics(s);
	}
}
