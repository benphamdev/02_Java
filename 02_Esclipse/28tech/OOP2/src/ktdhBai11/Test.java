package ktdhBai11;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ArrayList<Cylinder> a = new ArrayList<>();
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			a.add(new Cylinder(sc.next(), sc.nextDouble(), sc.nextDouble()));
		}
		Collections.sort(a, new Comparator<Cylinder>() {
			public int compare(Cylinder o1, Cylinder o2) {
				if (o1.getVolume() != o2.getVolume()) {
					if (o1.getVolume() < o2.getVolume())
						return 1;
					return -1;
				}
				return o1.getColor().compareTo(o2.getColor());
			}
		});
		for (Cylinder x : a) {
			System.out.println(x);
		}
	}
}
//9
//Red 19 104
//White 13 156
//White 16 168
//Green 13 191
//Grey 11 159
//White 12 144
//Green 11 182
//Blue 14 194
//White 14 131