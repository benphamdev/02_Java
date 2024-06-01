package Generic;

public class GenericsMethods {
	public static <T> boolean isEqual(GenericsType<T> g1, GenericsType<T> g2) {
		return g1.get().equals(g2.get());
	}

	public static void main(String[] args) {
		GenericsType<String> g1 = new GenericsType<>();
		g1.set("pank");
		GenericsType<String> g2 = new GenericsType<>();
		g2.set("pankadad");

		boolean isEqual = GenericsMethods.<String>isEqual(g1, g2);
		System.out.println(isEqual);
	}
}
