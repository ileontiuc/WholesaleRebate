package Wholesales.test;

import decorators.VAT;
import products.Product;

public class ChinesseClient implements Client {

	private Product addDefaultRebates(Product product) {
		return new VAT(product);
	}


	public Product getPriceForClient(Product product) {
		product = addDefaultRebates(product);
		return product;
	}
}
