package bai_10;

public class Bird extends Animal {

	public Bird() {
		super("bird");
	}

	@Override
	public void eat() {
		System.out.println("eat worm !");
	}

	@Override
	public void makeSound() {
		System.out.println("cuc cu !");
	}

}
