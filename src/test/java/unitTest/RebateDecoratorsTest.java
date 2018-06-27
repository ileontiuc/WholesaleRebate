package unitTest;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

import decorators.Clearance;
import decorators.FriendsAndFamily;
import decorators.VAT;
import products.Chair;
import products.Product;

public class RebateDecoratorsTest {

	@Test
	public void friendsAndFamilyRebateTest() {		
		Product mockedProduct = mock(Chair.class);
	    when(mockedProduct.cost()).thenReturn(100.0);
	    mockedProduct = new FriendsAndFamily(mockedProduct);
	    assertEquals(mockedProduct.cost(), 90,0);
	}
	
	@Test
	public void clearanceRebateTest() {
        Product mockedProduct = mock(Chair.class);
        when(mockedProduct.cost()).thenReturn(100.0);
        mockedProduct = new Clearance(mockedProduct);
        assertEquals(mockedProduct.cost(), 30,0);
	}
	
	@Test
	public void vatRebateTest() {
        Product mockedProduct = mock(Chair.class);
        when(mockedProduct.cost()).thenReturn(100.0);
        mockedProduct = new VAT(mockedProduct);
        assertEquals(mockedProduct.cost(), 81,0);
	}
	
	
}
