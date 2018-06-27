package decorators;

import products.Product;

public class VAT extends Rebate{

	private Product product;
	
	public VAT(Product product) {
		this.product = product;
	}
	
	@Override
	public String getDescription() {
		return product.getDescription() + "-- VAT 19% discount";
	}

	@Override
	public double cost() {
		return product.cost() * 0.81;
	}


}
