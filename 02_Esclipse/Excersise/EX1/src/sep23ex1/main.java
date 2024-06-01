package sep23ex1;

public class main {
	public static void main(String[] args) {
		Fish fish = new Fish("tre", "red", 3.2, false);
		caColour ca = new caColour("df", "green", 3.4, false, 5);
		System.out.println(ca);
		ca.swim();
	}
}
