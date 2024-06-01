package TypeInheritance;

public class Test {
	public static void main(String[] args) {
//		1. Single inheritance 
//		Dog dog = new Dog();
//		dog.eat();
//		dog.bark();

//		2. multilevel inheritance 
		BabyDog babyDog = new BabyDog();
		babyDog.eat();
		babyDog.bark();
		babyDog.weep();

//		3. hierarchical inheritance 

		Cat cat = new Cat();
		cat.eat();
		cat.meow();

		Bird bird = new Bird();
		bird.eat();
		bird.fly();
	}
}
