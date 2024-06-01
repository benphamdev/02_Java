
public class CustomerFactory {
	public static Customer createCustomer(String type) {
		if ("individual".equals(type)) {
			return new IndividualCustomer("pham duy chien", "thai binh");
		} else if ("business".equals(type)) {
			return new BusinessCustomer("viettel", "kien giang", "ban quan ao");
		} else {
			throw new IllegalArgumentException("Invalid customer type: " + type);
		}
	}
}
