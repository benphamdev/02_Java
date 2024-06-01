package nov04ex1;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

//To model a simple Café Management System with the given entities (`Customer`, `Order`, `Product`, and `OrderDetail`), and perform CRUD operations using Java Streams, we will first define our entities with appropriate attributes and relationships.

//### Entity Classes

class Customer {
	private Long custID;
	private String custName;
	private String addr;
	private String mobilePhone;

	public Customer(Long custID, String custName, String addr, String mobilePhone) {
		this.custID = custID;
		this.custName = custName;
		this.addr = addr;
		this.mobilePhone = mobilePhone;
	}

	public Long getCustID() {
		return custID;
	}

	public void setCustID(Long custID) {
		this.custID = custID;
	}

	public String getCustName() {
		return custName;
	}

	public void setCustName(String custName) {
		this.custName = custName;
	}

	public String getAddr() {
		return addr;
	}

	public void setAddr(String addr) {
		this.addr = addr;
	}

	public String getMobilePhone() {
		return mobilePhone;
	}

	public void setMobilePhone(String mobilePhone) {
		this.mobilePhone = mobilePhone;
	}

	// Constructor, getters, and setters
	// ...

}

class Order {
	private Long orderID;
	private LocalDate orderDate;
	private Double totalPrice;
	private Long custID; // Foreign key to Customer

	public Order(Long orderID, LocalDate orderDate, Double totalPrice, Long custID) {
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
		this.custID = custID;
	}

	public Long getOrderID() {
		return orderID;
	}

	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}

	public LocalDate getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}

	public Double getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(Double totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Long getCustID() {
		return custID;
	}

	public void setCustID(Long custID) {
		this.custID = custID;
	}

	// Constructor, getters, and setters
	// ...
}

class Product {
	private Long productID;
	private String proName;
	private Double price;
	private Integer quantity;

	public Product(Long productID, String proName, Double price, Integer quantity) {
		this.productID = productID;
		this.proName = proName;
		this.price = price;
		this.quantity = quantity;
	}

	public Long getProductID() {
		return productID;
	}

	public void setProductID(Long productID) {
		this.productID = productID;
	}

	public String getProName() {
		return proName;
	}

	public void setProName(String proName) {
		this.proName = proName;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	// Constructor, getters, and setters
	// ...
}

class OrderDetail {
	private Long orderID; // Composite key part and Foreign key to Order
	private Long productID; // Composite key part and Foreign key to Product
	private Double price;
	private Integer quantity;

	public OrderDetail(Long orderID, Long productID, Double price, Integer quantity) {
		this.orderID = orderID;
		this.productID = productID;
		this.price = price;
		this.quantity = quantity;
	}

	public Long getOrderID() {
		return orderID;
	}

	public void setOrderID(Long orderID) {
		this.orderID = orderID;
	}

	public Long getProductID() {
		return productID;
	}

	public void setProductID(Long productID) {
		this.productID = productID;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQuantity() {
		return quantity;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	// Constructor, getters, and setters
	// ...
}

//### Café Management System

//For simplicity, let's assume we have `List<Customer>`, `List<Order>`, `List<Product>`, and `List<OrderDetail>` as our in-memory databases.

class CafeManagementSystem {
	private List<Customer> customers = new ArrayList<>();
	private List<Order> orders = new ArrayList<>();
	private List<Product> products = new ArrayList<>();
	private List<OrderDetail> orderDetails = new ArrayList<>();

	// CRUD operations for each entity...
	// For example, CRUD for Product:

	// CREATE
	public void addProduct(Product product) {
		products.add(product);
	}

	// READ
	public List<Product> getAllProducts() {
		return new ArrayList<>(products);
	}

	public Optional<Product> getProductById(Long productID) {
		return products.stream().filter(p -> p.getProductID().equals(productID)).findFirst();
	}

	// UPDATE
	public void updateProductQuantity(Long productID, Integer newQuantity) {
		products.stream().filter(p -> p.getProductID().equals(productID)).findFirst()
				.ifPresent(p -> p.setQuantity(newQuantity));
	}

	// DELETE
	public void deleteProduct(Long productID) {
		products.removeIf(p -> p.getProductID().equals(productID));
	}

	// The rest of the CRUD operations for Customer, Order, and OrderDetail follow a
	// similar pattern...
}

//For brevity, I'm showing only the CRUD operations for `Product`. You would implement similar methods for `Customer`, `Order`, and `OrderDetail`.

//### Basic CRUD Example Usage

class CafeApp {
	public static void main(String[] args) {
		CafeManagementSystem cafe = new CafeManagementSystem();

		// Example usage of CRUD operations for Product
		cafe.addProduct(new Product(1L, "Coffee", 3.99, 100));
		cafe.addProduct(new Product(2L, "Tea", 2.99, 50));

		// Update product quantity
		cafe.updateProductQuantity(1L, 80);

		// Get and print all products
		List<Product> productList = cafe.getAllProducts();
		productList.forEach(product -> System.out.println(product.getProName() + ": " + product.getQuantity()));

		// Delete a product
		cafe.deleteProduct(2L);

		// Rest of the CRUD operations would be similar for other entities
	}
}

//### Considerations:

//- For a real-world system, you would use a database to persist data.
//- Transactions, error handling, and concurrency control are important for a production system but are beyond the scope of this example.
//- It's good practice to separate the data access logic into repositories or DAOs (Data Access Objects).
//- Proper validation and exception handling should be added.

//This example provides a basic structure and illustrates how you might perform CRUD operations using Java Streams in a simple café management system.
public class Test1 {
	public static void main(String[] args) {
		CafeApp app = new CafeApp();
	}
}
