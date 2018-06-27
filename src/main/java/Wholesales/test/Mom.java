package Wholesales.test;

import decorators.FriendsAndFamily;
import decorators.VAT;
import products.Product;

public class Mom implements Client{

	private Product addDefaultRebates(Product product) {
		return new FriendsAndFamily(product);
	}


	public Product getPriceForClient(Product product) {
		product = addDefaultRebates(product);
		return product;
	}
}
