package ktdhBai14;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Shape[] a = new Shape[n];
		for (int i = 0; i < n; i++) {
			String s = sc.next();
			if (s.equals("C")) {
				double r = sc.nextDouble();
				String color = sc.next();
				boolean filled = sc.nextBoolean();
				a[i] = new Circle(r, color, filled);
			} else if (s.equals("R")) {
				double w = sc.nextDouble(), l = sc.nextDouble();
				String color = sc.next();
				boolean filled = sc.nextBoolean();
				a[i] = new Rectangle(Math.max(w, l), Math.min(w, l), color, filled);
			} else {
				double side = sc.nextDouble();
				String color = sc.next();
				boolean filled = sc.nextBoolean();
				a[i] = new Square(side, side, color, filled);
			}
		}
		System.out.println("Circle : \n");
		for (int i = 0; i < n; i++) {
			if (a[i] instanceof Circle)
				System.out.println(a[i]);
		}
		System.out.println("Rectangle : \n");
		for (int i = 0; i < n; i++) {
			if (a[i] instanceof Rectangle && !(a[i] instanceof Square))
				System.out.println(a[i]);
		}
		System.out.println("Square : \n");
		for (int i = 0; i < n; i++) {
			if (a[i] instanceof Square)
				System.out.println(a[i]);
		}
	}
}
