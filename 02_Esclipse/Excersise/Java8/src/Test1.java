import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Test1 {
	public static void main(String[] args) {
		Map<String, String> books = new HashMap<>();
		books.put("978-0201633610",
				"Design patterns : elements of reusable object-oriented software");
		books.put("978-1617291999",
				"Java 8 in Action: Lambdas, Streams, and functional-style programming");
		books.put("978-0134685991", "Effective Java");
		Optional<String> optionalIsbn = books.entrySet().stream()
				.filter(e -> "Effective Java".equals(e.getValue()))
				.map(Map.Entry::getKey).findFirst();
//		System.out.println(optionalIsbn.isPresent());
		List<String> isbnCodes = books.entrySet().stream()
				.filter(e -> e.getValue().startsWith("Effective Java"))
				.map(Map.Entry::getValue).collect(Collectors.toList());
//		isbnCodes.forEach(System.out::println);
		List<String> titles = books.entrySet().stream()
				.filter(e -> e.getKey().startsWith("978-0")).map(Map.Entry::getKey)
				.collect(Collectors.toList());
		titles.forEach(e -> System.out.println(e));
	}
}
