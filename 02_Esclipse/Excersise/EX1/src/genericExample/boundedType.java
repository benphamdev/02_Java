package genericExample;

class geClass<T extends Number> {
	public void display() {
		System.out.println("this is a bounded type generic class");
	}
}

public class boundedType {
	public static void main(String[] args) {
		geClass<Integer> obj = new geClass();
	}
}
