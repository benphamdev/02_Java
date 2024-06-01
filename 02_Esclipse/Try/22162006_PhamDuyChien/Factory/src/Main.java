
public class Main {
	public static void main(String[] args) {
		Customer customer1 = CustomerFactory.createCustomer("individual");

		System.out.println("------------ca nhan------------");
		System.out.println("name: " + customer1.getName());
		System.out.println("address: " + customer1.getAddress());
		System.out.println("type customer: " + customer1.getType());

		Customer customer2 = CustomerFactory.createCustomer("business");

		System.out.println("-------------doanh nghiep------");
		System.out.println("name: " + customer2.getName());
		System.out.println("address: " + customer2.getAddress());
		System.out.println("type customer: " + customer2.getType());
	}
}
