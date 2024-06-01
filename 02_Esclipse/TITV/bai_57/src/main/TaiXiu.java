package main;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class TaiXiu {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();

		Locale lc = new Locale("vi", "VN");
//		NumberFormat numf = NumberFormat.getInstance(lc);
		NumberFormat numf = NumberFormat.getCurrencyInstance(lc);
		int op = 1;
		double mainAcc = 5000000.99, betAmount = 0, tmp = 0;
		do {
			System.out.println("----- Please Choose -----");
			System.out.println("Enter 1 to play or Enter 0 to exit : ");
			op = sc.nextInt();
			if (op == 1) {

				System.out.println("main account : " + numf.format(mainAcc));

				System.out.println("enter 1 if tai otherwise 2 if xiu : ");
				do {
					tmp = sc.nextInt();
				} while (tmp != 1 && tmp != 2);

				System.out.println("note :  0 <= " + "bet amount" + " <= " + numf.format(mainAcc));
				do {
					System.out.println("enter bet amount : ");
					betAmount = sc.nextDouble();
				} while (0 >= betAmount || betAmount > mainAcc);

				double sumRandom = 0;
				String valRandom = "";

				for (int i = 0; i < 3; i++) {
					int n = rd.nextInt(5) + 1;
					sumRandom += n;
					valRandom += Integer.toString(n) + " ";
				}
				System.out.println("cac gia tri : " + valRandom);

				System.out.println("tong gia tri : " + sumRandom);

				if (sumRandom == 3 || sumRandom == 18 || (tmp == 1 && sumRandom <= 11)
						|| (tmp == 2 && sumRandom >= 11)) {
					System.out.println("Dealer Win !");
					betAmount *= (-1);
				}
				mainAcc += betAmount;
				System.out.println("main account : " + numf.format(mainAcc));
			}
		} while (op == 1 && mainAcc > 0);
	}
}
