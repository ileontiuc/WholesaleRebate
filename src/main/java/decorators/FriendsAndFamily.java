package decorators;
import products.Product;

public class FriendsAndFamily extends Rebate{
	
	Product product;
	
	public FriendsAndFamily(Product product) {
		this.product = product;
	}
	
	public String getDescription() {
		return product.getDescription() + ", Friends & Family 10% discount";
	}
	
	public double cost() {
		return  product.cost() * 0.9;
	}

}
