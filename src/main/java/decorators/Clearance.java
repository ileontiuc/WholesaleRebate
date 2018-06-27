package decorators;

import products.Product;

public class Clearance extends Rebate{

		Product beverage;
		
		public Clearance(Product beverage) {
			this.beverage = beverage;
		}
		
		public String getDescription() {
			return beverage.getDescription() + "-- Clearance 70% discount";
		}
		
		public double cost() {
			return beverage.cost() * 0.3;
		}
}
