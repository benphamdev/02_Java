package bai1;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		sc.nextLine();
		ArrayList<Account> l = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			Account a = new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
			l.add(a);
		}
//		Account[] l = new Account[n];
//		for (int i = 0; i < n; i++) {
//			Account[i] = new Account(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine());
//		}
		int q = sc.nextInt();
		sc.nextLine();
		while (q-- > 0) {
			String user = sc.nextLine(), pass = sc.nextLine();
			boolean ok = false;
			for (Account x : l) {
				if (x.getUserName().compareTo(user) == 0 && x.getPassword().compareTo(pass) == 0) {
					ok = true;
					break;
				}
			}
			if (!ok)
				System.out.println("Login Failed");
			else
				System.out.println("Login Successful");
		}
	}
}
//2
//2343ddd
//cus002
//28tech
//28techxyz
//13212dd
//cus001
//nguyenmy
//my12123
//1
//28tech
//28techxyz