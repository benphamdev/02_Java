package bai_10;

public class Cat extends Animal {

	public Cat() {
		super("cat");
	}

	@Override
	public void eat() {
		System.out.println("eat fish");
	}

	@Override
	public void makeSound() {
		System.out.println("meow meow");
	}

}
