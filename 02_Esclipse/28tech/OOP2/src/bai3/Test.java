package bai3;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int blood = Integer.parseInt(sc.nextLine().substring(8));
		int power = Integer.parseInt(sc.nextLine().substring(8));
		String tmp = sc.nextLine();
		boolean alive = false;
		if (tmp.equals("ALIVE"))
			alive = true;
		Figure nv = new Figure(power, blood, alive);
		int q = sc.nextInt();
		sc.nextLine();
		while (q-- > 0) {
			String s = sc.nextLine();
			if (s.equals("pea")) {
				nv.meetPea();
			} else if (s.equals("mushroom")) {
				nv.meetMushroom();
			} else {
				int p = 0;
				if (s.charAt(0) == 's') {
					p = Integer.parseInt(s.substring(8));
					nv.meeetSolider(p);
				} else {
					p = Integer.parseInt(s.substring(6));
					nv.meetWitch(p);
				}
			}
			System.out.print(nv);
		}
	}
}

//POWER : 100
//BLOOD : 100
//ALIVE
//6
//witch 77
//mushroom
//pea
//pea
//solider 164
//solider 137