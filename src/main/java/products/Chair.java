package products;

public class Chair extends Product{

	double price=78.99;
	
	public Chair() {
		description = "Chair - original price: "+price+"$ \n";
	}
	
	public double cost() {
		return 78.99;
	}
}
