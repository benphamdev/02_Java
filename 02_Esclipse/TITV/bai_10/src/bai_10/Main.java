package bai_10;

public class Main {
	public static void main(String[] args) {
		Dog dog = new Dog();
		dog.eat();
		dog.makeSound();
		dog.sleep();

		Cat cat = new Cat();
		cat.eat();
		cat.makeSound();
		cat.sleep();

		Bird bird = new Bird();
		bird.eat();
		bird.makeSound();
		bird.sleep();
	}
}
