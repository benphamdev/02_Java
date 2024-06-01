package cafe;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double n = sc.nextDouble();
		
		billCafe bc = new billCafe("trung nguyen", 100000.0, 5.5);
		System.out.println("total price : " + bc.totalPrice());
		System.out.println("kiem tra khoi luong lon hon n : " + bc.checkVolume(n));
		System.out.println("kiem tra tong tien lon hon 500 : " + bc.checkTotalPrice());
		System.out.println("giam gia : " + bc.priceSale(10.0));
		System.out.println("gia sau khi giam : " + bc.priceAfterSale(10.0));
	}
}
