package nov04ex1;

import java.util.Arrays;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

//Java Streams represent a sequence of elements on which one or more operations can be performed. Stream operations are either intermediate or terminal. Intermediate operations return a new stream so you can chain multiple methods in a row. Terminal operations, on the other hand, are either void or return a non-stream result.
//
//Here are some full examples of using Java Streams with explanations:
//
//### Example 1: Filtering and Mapping

class StreamExample1 {
	public static void main(String[] args) {
		List<String> myList = Arrays.asList("apple", "banana", "cherry", "date",
				"elderberry");

		List<String> filteredList = myList.stream().filter(s -> s.startsWith("a")) // Intermediate
																					// operation
				.map(String::toUpperCase) // Intermediate operation
				.collect(Collectors.toList()); // Terminal operation
		System.out.println(filteredList);
	}
}

//In this example:
//- We create a list of fruits.
//- We then create a stream from the list.
//- We filter only the fruits that start with the letter "a".
//- We map each element to its uppercase equivalent.
//- We collect the results into a new list.
//- We print out the new list.

//### Example 2: Summing Integers in a List

class StreamExample2 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		int sum = numbers.stream().filter(n -> n % 2 == 0) // Intermediate operation
				.mapToInt(Integer::intValue) // Intermediate operation
				.sum(); // Terminal operation

		System.out.println("Sum of even numbers: " + sum);
	}
}

//In this example:
//- We create a list of numbers.
//- We create a stream from the list.
//- We filter only the even numbers.
//- We convert the stream to an `IntStream` using `mapToInt`.
//- We compute the sum of these numbers using the `sum` method.
//
//### Example 3: Sorting and Collecting

class StreamExample3 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("stream", "operations", "are", "very",
				"cool");

		List<String> sortedWords = words.stream()
				.sorted(Comparator.comparingInt(String::length))
				.collect(Collectors.toList());

		System.out.println(sortedWords);
	}
}

//In this example:
//- We create a list of words.
//- We create a stream from the list.
//- We sort the stream by the length of the words.
//- We collect the sorted words into a new list.

//### Example 4: Finding the First Element

class StreamExample4 {
	public static void main(String[] args) {
		List<String> people = Arrays.asList("Sara", "Tom", "Paul", "Eric");

		Optional<String> firstPerson = people.stream().findFirst();

		firstPerson.ifPresent(System.out::println);
	}
}

//In this example:
//- We create a list of names.
//- We create a stream from the list.
//- We use `findFirst()` to get an `Optional` describing the first element of the stream.
//- We print out the value if it's present.

//Java Streams are very powerful and can be used for a wide variety of operations. These examples only scratch the surface of what's possible. Always remember that streams are not data structures, but instead, they are a way to manipulate existing data structures in a functional style.

//Certainly! Here are some additional examples that illustrate the usage of Java Streams in different scenarios:

//### Example 5: Matching

//Using `anyMatch()`, `allMatch()`, and `noneMatch()` to perform boolean checks on elements in the stream.

class StreamExample5 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		boolean anyMatch = numbers.stream().anyMatch(n -> n > 8); // true if any
																	// element > 8
		boolean allMatch = numbers.stream().allMatch(n -> n < 11); // true if all
																	// elements < 11
		boolean noneMatch = numbers.stream().noneMatch(n -> n < 0); // true if no
																	// element < 0

		System.out.println("Any number greater than 8? " + anyMatch);
		System.out.println("All numbers less than 11? " + allMatch);
		System.out.println("No numbers less than 0? " + noneMatch);
	}
}

//### Example 6: Reduce

//The `reduce()` operation combines all elements of the stream into a single result.

class StreamExample6 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(3, 4, 5, 6, 7);

		// Sum all numbers
		Optional<Integer> sum = numbers.stream().reduce(Integer::sum);
		sum.ifPresent(s -> System.out.println("Sum: " + s));

		// Multiply all numbers
		Integer product = numbers.stream().reduce(1, (a, b) -> a * b);
		System.out.println("Product: " + product);
	}
}

//### Example 7: Finding Maximum and Minimum

//Using `max()` and `min()` with a comparator to find the largest and smallest element in a stream.

class StreamExample7 {
	public static void main(String[] args) {
		List<String> names = Arrays.asList("Alex", "Brian", "Charles", "David");

		String longestName = names.stream().max(Comparator.comparingInt(String::length))
				.orElse("List was empty");

		String shortestName = names.stream()
				.min(Comparator.comparingInt(String::length)).orElse("List was empty");

		System.out.println("Longest name: " + longestName);
		System.out.println("Shortest name: " + shortestName);
	}
}

//### Example 8: Grouping

//Using `Collectors.groupingBy()` to categorize elements in the list according to some property.

class StreamExample8 {
	public static void main(String[] args) {
		List<String> items = Arrays.asList("apple", "banana", "cherry", "apple",
				"banana", "cherry", "apple");

		Map<String, Long> itemCount = items.stream()
				.collect(Collectors.groupingBy(item -> item, Collectors.counting()));

		System.out.println(itemCount);
	}
}

//### Example 9: Joining Strings

//Using `Collectors.joining()` to merge elements in a stream into a single `String`.

class StreamExample9 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("Java", "Stream", "API");

		String sentence = words.stream().collect(Collectors.joining(" "));

		System.out.println(sentence);
	}
}

//Java Stream API

//### Example 10: Parallel Streams

//Using parallel streams for potentially better performance on large collections by utilizing multiple threads.

class StreamExample10 {
	public static void main(String[] args) {
		List<Integer> largeList = Arrays.asList(2, 3, 1);

//		List<Integer> squares = largeList.parallelStream().map(n -> n * n).

//				collect(Collectors.toList());

		List<Integer> squares = largeList.stream().map(n -> n * n)
				.collect(Collectors.toList());
		System.out.println(squares);
	}
}

//When using parallel streams, you need to ensure that the operations performed are thread-safe and that the performance gain is worth the overhead of context switching and potential threading issues.

//Streams provide a high-level abstraction for performing sequence operations in a functional style. They can significantly simplify the code and make it more readable and concise.

//Sure, I'll provide you with more varied examples of Java Stream operations, including the use of `flatMap`, `distinct`, `sorted`, `peek`, and `limit`.

//### Example 11: Using `flatMap` to Flatten Streams

class StreamExample11 {
	public static void main(String[] args) {
		List<List<String>> listOfLists = Arrays.asList(Arrays.asList("a", "b"),
				Arrays.asList("c", "d"), Arrays.asList("e", "f"));

		List<String> flatList = listOfLists.stream().flatMap(List::stream)
				.collect(Collectors.toList());

		System.out.println(flatList);
	}
}

//### Example 12: Removing Duplicates with `distinct`

class StreamExample12 {
	public static void main(String[] args) {
		List<Integer> numbersWithDuplicates = Arrays.asList(1, 2, 3, 2, 1, 4, 5, 4);

		List<Integer> distinctNumbers = numbersWithDuplicates.stream().distinct()
				.collect(Collectors.toList());

		System.out.println(distinctNumbers);
	}
}

//### Example 13: Sorting with `sorted`

class StreamExample13 {
	public static void main(String[] args) {
		List<String> words = Arrays.asList("B", "A", "D", "C");

		List<String> sortedWords = words.stream().sorted().collect(Collectors.toList());

		System.out.println(sortedWords);
	}
}

//### Example 14: Using `peek` for Debugging

class StreamExample14 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);

		List<Integer> result = numbers.stream()
				.peek(num -> System.out.println("will filter: " + num))
				.filter(n -> n % 2 == 0)
				.peek(num -> System.out.println("filtered: " + num))
				.collect(Collectors.toList());

		System.out.println("Result: " + result);
	}
}

//### Example 15: Limiting the Number of Elements with `limit`

class StreamExample15 {
	public static void main(String[] args) {
		Stream.iterate(0, n -> n + 1).limit(5).forEach(System.out::println);
	}
}

//### Example 16: Infinite Stream with `generate` and `limit`

class StreamExample16 {
	public static void main(String[] args) {
		Stream.generate(new Random()::nextInt).limit(5).forEach(System.out::println);
	}
}

//This will output five random integers.

//### Example 17: Using `collect` to Summarize

class StreamExample17 {
	public static void main(String[] args) {
		DoubleSummaryStatistics stats = Stream.of(1.5, 2.3, 3.7)
				.collect(Collectors.summarizingDouble(Double::doubleValue));

		System.out.println("Average: " + stats.getAverage());
		System.out.println("Sum: " + stats.getSum());
	}
}

//Streams are a powerful tool in Java for processing sequences of data. The examples above show how streams can simplify many tasks involving collections and how they can be applied in different ways to achieve complex data processing with minimal and readable code.
//Displaying 5845011626661728442.
public class Test {
	public static void main(String[] args) {
		StreamExample1 example1 = new StreamExample1();
	}
}
