import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class User {
	private final String name;
	private final int age;
	private final Rating rating = new Rating();

	public User(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Rating getRating() {
		return rating;
	}

	public String toString() {
		return "User{" + "name=" + name + ", age=" + age + '}';
	}
}

class Review {
	private int points;
	private String review;

	public Review(int points, String review) {
		this.points = points;
		this.review = review;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public String getReview() {
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}
}

class Rating {
	double points;
	List<Review> reviews = new ArrayList<>();

	public void add(Review review) {
		reviews.add(review);
		computeRating();
	}

	public double computeRating() {
		double totalPoints = reviews.stream().map(Review::getPoints).reduce(0,
				Integer::sum);
		this.points = totalPoints / reviews.size();
		return this.points;
	}

	public static Rating average(Rating r1, Rating r2) {
		Rating combined = new Rating();
		combined.reviews = new ArrayList<>(r1.reviews);
		combined.reviews.addAll(r2.reviews);
		combined.computeRating();
		return combined;
	}

	public double getPoints() {
		return points;
	}

	public List<Review> getReviews() {
		return reviews;
	}
}

public class Test3 {
	static void ex1() {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);
		// int res = numbers.stream().reduce(0, (subtotal, element) -> subtotal +
		// element);
		int res = numbers.stream().reduce(0, Integer::sum);
		System.out.println(res);

	}

	static void ex2() {
		List<String> letters = Arrays.asList("a", "b", "c", "d", "e");
//		String res = letters.stream().reduce("",
//				(partialString, element) -> partialString + element);
//		String res = letters.stream().reduce("", String::concat);
		String res = letters.stream().reduce("",
				(partial, element) -> partial.toUpperCase() + element.toUpperCase());
//		System.out.println(res);
		List<Integer> ages = Arrays.asList(25, 30, 45, 28, 32);
		int computedAges = ages.parallelStream().reduce(0, (a, b) -> a + b,
				Integer::sum);
		System.out.println(computedAges);
	}

	static void ex3() {
		List<User> users = Arrays.asList(new User("John", 30), new User("Julie", 35));
		int computedAges = users.stream().reduce(0,
				(partialAgeResult, user) -> partialAgeResult + user.getAge(),
				Integer::sum);
		System.out.println(computedAges);
	}

	public static int divide(int value, int factor) {
		int res = 0;
		try {
			res = value / factor;
		} catch (ArithmeticException e) {

		}
		return res;
	}

	public static int divideListElements(List<Integer> values, int divider) {
//		return values.stream().reduce(0, (a, b) -> {
//			try {
//				return a / divider + b / divider;
//			} catch (ArithmeticException e) {
//			}
//			return 0;
//		});
		return values.stream().reduce(0,
				(a, b) -> divide(a, divider) + divide(b, divider));
	}

	static void ex4() {
		User john = new User("John", 30);
		john.getRating().add(new Review(5, ""));
		john.getRating().add(new Review(3, "not bad"));
		User julie = new User("Julie", 35);
		john.getRating().add(new Review(4, "great!"));
		john.getRating().add(new Review(2, "terrible experience"));
		john.getRating().add(new Review(4, ""));
		List<User> users = Arrays.asList(john, julie);
		Rating averageRating = users.stream().reduce(new Rating(),
				(rating, user) -> Rating.average(rating, user.getRating()),
				Rating::average);
		averageRating.getPoints();
	}

	public static void main(String[] args) {
//		ex1();
//		ex2();
		ex3();
	}
}
