package bai_10;

public class Dog extends Animal {

	public Dog() {
		super("dog");
	}

	@Override
	public void eat() {
		System.out.println("eat bone !");
	}

	@Override
	public void makeSound() {
		System.out.println("go go !");
	}

}
