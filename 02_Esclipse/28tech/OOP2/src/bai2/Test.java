package bai2;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Test {
	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		int n = sc.nextInt();
//		BankAccount[] a = new BankAccount[n];
//		for (int i = 0; i < n; i++) {
//			sc.nextLine();
//			a[i] = new BankAccount(sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextLine(), sc.nextInt());
//		}
//		int q = sc.nextInt();
//		while (q-- > 0) {
//			sc.nextLine();
//			String s = sc.nextLine();
//			if (s.equals("transfer")) {
//				String acc1 = sc.next(), acc2 = sc.next();
//				int money = sc.nextInt();
//				int pos1 = BankAccount.findPos(a, acc1), pos2 = BankAccount.findPos(a, acc2);
//				if (a[pos1].getBalance() - money >= 50000) {
//					a[pos1].withdraw(money);
//					a[pos2].recharge(money);
//				}
//			} else {
//				String acc = sc.next();
//				int money = sc.nextInt();
//				int pos = BankAccount.findPos(a, acc);
//				if (s.equals("withdraw")) {
//					a[pos].withdraw(money);
//				} else {
//					a[pos].recharge(money);
//				}
//			}
//		}
//		for (int i = 0; i < n; i++) {
//			System.out.println(a[i]);
//		}
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		LinkedHashMap<String, BankAccount> accList = new LinkedHashMap<>();
		for (int i = 0; i < n; i++) {
			sc.nextLine();
			String x = sc.nextLine();
			String y = sc.nextLine();
			String z = sc.nextLine();
			String t = sc.nextLine();
			int u = sc.nextInt();
			BankAccount temp = new BankAccount(z, y, z, t, u);
			accList.put(z, temp);
		}
		int q = sc.nextInt();
		while (q-- > 0) {
			sc.nextLine();
			String s = sc.nextLine();
			if (s.equals("transfer")) {
				String acc1 = sc.next(), acc2 = sc.next();
				int money = sc.nextInt();
				if (accList.containsKey(acc1))
					if (accList.get(acc1).getBalance() - money >= 50000) {
						accList.get(acc1).withdraw(money);
						accList.get(acc2).recharge(money);
					}
			} else {
				String acc = sc.next();
				int money = sc.nextInt();
				if (s.equals("withdraw")) {
					accList.get(acc).withdraw(money);
				} else {
					accList.get(acc).recharge(money);
				}
			}
		}
		Set<Map.Entry<String, BankAccount>> entrySet = accList.entrySet();
		for (Map.Entry<String, BankAccount> entry : entrySet) {
			System.out.println(entry.getValue());
		}
	}
}
//6
//8s123
//sla1k
//12312312
//89797987
//14000000
//8s124
//sla2k
//12312313
//89797988
//20000000
//8s125
//sla3k
//12312314
//89797923
//37000000
//8s126
//slff3k
//12312323
//89732323
//60000000
//swer88
//iasdfasd
//234235346
//234234234
//62000000
//12sdfasdf
//1234adsfasdf
//234234234235
//1234245
//85000000
//2
//deposit
//234234234235 95000000
//withdraw
//234235346 15000
