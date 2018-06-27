package products;
public class Desk extends Product{

	private double price;
	
	public Desk() {
		price = 222.06;
		description = "Desk - original price: "+ price + "$ \n";
	}
	
	public double cost() {
		return price;
	}
}
