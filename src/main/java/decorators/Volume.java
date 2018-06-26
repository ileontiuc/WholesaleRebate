package decorators;

import products.Product;

public class Volume extends Rebate{

	Product beverage;
	
	public Volume(Product beverage) {
		this.beverage = beverage;
	}
	
	public String getDescription() {
		return beverage.getDescription() + ", Volume discount 20%";
	}
	
	public double cost() {
		return beverage.cost() *0.8;
	}
}
