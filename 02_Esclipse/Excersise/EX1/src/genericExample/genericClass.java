package genericExample;

public class genericClass<T> {
	private T data;

	public genericClass(T data) {
		this.data = data;
	}

	public T getData() {
		return this.data;
	}

	public static void main(String[] args) {
		genericClass<Integer> iObj = new genericClass<Integer>(11);
		System.out.println(iObj.getData());

		genericClass<String> sObj = new genericClass<String>("pham duy chien");
		System.out.println(sObj.getData());
	}
}
