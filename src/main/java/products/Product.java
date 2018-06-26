package products;

public abstract class Product {

	
	String description = "Unknown order to determine price";
	
	public String getDescription() {
		return description;
	}
	
	public abstract double cost();
}
