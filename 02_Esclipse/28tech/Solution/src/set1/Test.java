package set1;

import java.util.Scanner;

//14 5
//92 36 73 11 78 19 57 76 96 58 36 38 29 42
//19 21 15 4 78
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(), m = sc.nextInt(), a[] = new int[n], b[] = new int[m];
		for (int i = 0; i < n; i++)
			a[i] = sc.nextInt();
		for (int i = 0; i < m; i++)
			b[i] = sc.nextInt();
		IntSet s1 = new IntSet(a);
		IntSet s2 = new IntSet(b);
		IntSet s3 = s1.intersection(s2);
		System.out.println(s3);
	}
}
