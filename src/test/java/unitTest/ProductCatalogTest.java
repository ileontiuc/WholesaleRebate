package unitTest;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import products.Chair;
import products.Desk;
import products.Product;

public class ProductCatalogTest {

	@Test
	public void chairPriceTest() {
		Product chair = new Chair();
		assertEquals(78.99, chair.cost(),0);
	}
	
	@Test
	public void deskPriceTest() {
		Product desk = new Desk();
		assertEquals(222.06, desk.cost(),0);
	}
	
	

}
