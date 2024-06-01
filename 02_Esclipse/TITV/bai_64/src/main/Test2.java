package main;

import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Test2 {
	Set<String> se = new TreeSet<String>();

	public Test2() {
	}

	public boolean addBallot(String s) {
		return this.se.add(s);
	}

	public boolean deleteBallot(String s) {
		return this.se.remove(s);
	}

	public boolean checkInvalid(String s) {
		return this.se.contains(s);
	}

	public void deleteAll() {
		this.se.clear();
	}

	public int quantityBallot() {
		return this.se.size();
	}

	public String drawnBallot() {
		Random random = new Random();
		int idx = random.nextInt(this.se.size());
		return (String) this.se.toArray()[idx];
	}

	public void print() {
		for (Iterator iterator = se.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Test2 test = new Test2();
		int op = 0;
		do {
			System.out.println("----------------------------------------");
			System.out.println("--------Menu--------");
			System.out.println("1. Add ma\n");
			System.out.println("2. Delete ma\n");
			System.out.println("3. Check ma Invalid\n");
			System.out.println("4. Delete All Ma\n");
			System.out.println("5. Quantity of ma\n");
			System.out.println("6. Drawn \n");
			System.out.println("7. Print \n");
			System.out.println("0. Exit Program\n");

			op = sc.nextInt();
			sc.nextLine();

			String tmp = "";
			if (op == 1 || op == 2 || op == 3) {
				System.out.println("nhap ma : ");
				tmp = sc.nextLine();
			}
			if (op == 1) {
				test.addBallot(tmp);
			} else if (op == 2) {
				test.deleteBallot(tmp);
			} else if (op == 3) {
				System.out.println(test.checkInvalid(tmp));
			} else if (op == 4) {
				test.deleteAll();
			} else if (op == 5) {
				System.out.println(test.quantityBallot());
			} else if (op == 6) {
				System.out.println(test.drawnBallot());
			} else if (op == 7) {
				test.print();
			}
		} while (op != 0);
		sc.close();
	}
}
