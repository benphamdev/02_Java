package nov04ex1;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
//Trong Java, phương thức `reduce()` là một phương thức terminal operation
//của Stream API, được sử dụng để kết hợp các phần tử của một stream
//và tạo ra một kết quả duy nhất. Nói cách khác,
//`reduce()` thực hiện một phép tính lặp đi lặp lại trên các phần tử của stream
//và trả về một kết quả tùy ý, có thể là tổng các số, kết quả của một phép nhân, ghép chuỗi, v.v.

//Phương thức `reduce()` có ba biến thể:

//1. **Identify-less reduce()**
//   - Cú pháp: `Optional<T> reduce(BinaryOperator<T> accumulator)`
//   - Phương thức này không nhận giá trị identity,
//do đó nó trả về `Optional<T>`, vì có khả năng stream không chứa phần tử nào.

//2. **Identify-based reduce()**
//   - Cú pháp: `T reduce(T identity, BinaryOperator<T> accumulator)`
//   - Phương thức này nhận một giá trị identity và một BinaryOperator. 
//Giá trị identity đóng vai trò là giá trị ban đầu để thực hiện phép tính cộng dồn.
//Điều này đảm bảo rằng ngay cả khi stream trống, kết quả trả về sẽ là giá trị identity.

//3. **Reduce() with combiner (chủ yếu sử dụng trong parallel streams)**
//   - Cú pháp: 
//`T reduce(T identity, BiFunction<U, T, U> accumulator, BinaryOperator<U> combiner)`
//   - Phiên bản này của `reduce()` được sử dụng 
//khi chúng ta thực hiện các phép tính cộng dồn trên parallel streams,
//với giá trị identity, một accumulator để kết hợp các phần tử stream 
//và một combiner để kết hợp các kết quả của các tính toán cộng dồn từ các luồng khác nhau.

//Ví dụ sử dụng `reduce()` để tính tổng của các số trong một list:

class ReduceExample {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		// Ví dụ sử dụng identity-based reduce() để tính tổng
		int sum = numbers.stream().reduce(0, (a, b) -> a + b);

		// In ra kết quả
		System.out.println("Tổng là: " + sum);
	}
}

//Khi sử dụng `reduce()`, bạn cần cung cấp một `BinaryOperator`, 
//thường là một lambda expression, 
//để xác định cách thức hai phần tử được kết hợp lại với nhau.
//`reduce()` là một công cụ mạnh mẽ của Stream API, 
//vì nó cung cấp cơ chế linh hoạt để xử lý dữ liệu một cách tối giản và hiệu quả.

//Chắc chắn, dưới đây là các ví dụ cụ thể cho từng biến thể của phương thức 
//`reduce()` trong Java Streams:
//### 1. Identify-less reduce()

//Đối với biến thể không có identify, 
//kết quả là một `Optional<T>`, vì không có giá trị mặc định nếu stream rỗng.

class ReduceExample1 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		Optional<Integer> sum = numbers.stream().reduce((a, b) -> a + b);

		sum.ifPresent(s -> System.out.println("Tổng là: " + s));
		// Kết quả: Tổng là: 21
	}
}

//### 2. Identify-based reduce()

//Biến thể này sử dụng một giá trị identity, 
//vì vậy kết quả không bao giờ là `null`, thậm chí cả khi stream rỗng.

class ReduceExample2 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		// Giá trị identity ở đây là 0
		int sum = numbers.stream().reduce(0, Integer::sum);

		System.out.println("Tổng là: " + sum);
		// Kết quả: Tổng là: 21
	}
}

//### 3. Reduce() with combiner

//Biến thể này thường được sử dụng trong parallel streams,
//và bao gồm một combiner để kết hợp các kết quả từ các streams khác nhau.

class ReduceExample3 {
	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6);

		// Ví dụ này sẽ tính tổng bằng cách sử dụng parallelStream()
		int sum = numbers.parallelStream().reduce(0, (a, b) -> a + b, (a, b) -> a + b);

		System.out.println("Tổng là: " + sum);
		// Kết quả có thể giống như trên, tuy nhiên quá trình tính toán được thực hiện
		// song song.
	}
}

//Ở ví dụ trên, combiner `(a, b) -> a + b` không thực sự cần thiết 
//vì phép cộng là một phép toán kết hợp (associative) và không đổi (commutative), do đó, accumulator
//và combiner có thể dùng chung một implementation. 
//Tuy nhiên, nếu bạn đang kết hợp các phần tử theo cách không kết hợp, combiner sẽ cần một logic khác 
//để kết hợp kết quả từ các luồng song song khác nhau một cách chính xác
public class Test2 {

}
