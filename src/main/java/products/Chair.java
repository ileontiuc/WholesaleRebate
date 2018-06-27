package products;

public class Chair extends Product{

	private double price;
	
	public Chair() {
		price=78.99;
		description = "Chair - original price: "+price+"$ \n";
	}
	
	public double cost() {
		return price;
	}
}
