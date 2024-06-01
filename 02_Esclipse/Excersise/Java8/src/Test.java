import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import javax.net.ssl.HttpsURLConnection;

class Customer {
	private String name;
	private int points;
	private String profilePhotoUrl;

	// Constructor and standard getters
	public Customer(String name, int points) {
		this.name = name;
		this.points = points;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoints() {
		return points;
	}

	public void setPoints(int points) {
		this.points = points;
	}

	public boolean hasOverHundredPoints() {
		return this.points > 100;
	}

	public boolean hasValidProfilePhoto() throws IOException {
		URL url = new URL(this.profilePhotoUrl);
		HttpsURLConnection connection = (HttpsURLConnection) url.openConnection();
		return connection.getResponseCode() == HttpURLConnection.HTTP_OK;
	}
}

public class Test {

	public static void main(String[] args) {
		Customer john = new Customer("John P.", 15);
		Customer sarah = new Customer("Sarah M.", 200);
		Customer charles = new Customer("Charles B.", 150);
		Customer mary = new Customer("Mary T.", 1);

		List<Customer> customers = Arrays.asList(john, sarah, charles, mary);
//		List<Customer> customersWithMoreThan100points = customers.stream()
//				.filter(c -> c.getPoints() > 100).collect(Collectors.toList());
		List<Customer> customersWithMoreThan100points = customers.stream()
				.filter(Customer::hasOverHundredPoints).collect(Collectors.toList());
		List<Customer> charlesWithMoreThan100Points = customers.stream()
				.filter(c -> c.getPoints() > 100 && c.getName().startsWith("Charles"))
				.collect(Collectors.toList());
		List<Customer> customersWithValidProfilePhoto = customers.stream().filter(t -> {
			try {
				return t.hasValidProfilePhoto();
			} catch (IOException e) {
				// TODO Auto-generated catch block
			}
			return false;
		}).collect(Collectors.toList());
	}
}
