package ktdhBai13;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for (int i = 0; i < n; i++) {
			MovablePoint temp = new MovablePoint(sc.nextFloat(), sc.nextFloat(), sc.nextFloat(), sc.nextFloat());
			int q = sc.nextInt();
			for (int j = 0; j < q; j++) {
				temp = temp.move();
			}
			System.out.println(temp);
		}
	}
}
//3
//-18.00 15.00 9.00 1.00 4
//19.00 13.00 8.00 7.00 2
//16.00 9.00 5.00 7.00 2
//-15.00 2.00 6.00 7.00 5
//14.00 4.00 10.00 2.00 5
//13.00 14.00 10.00 3.00 3