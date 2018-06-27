package cucumberJava;


import static org.junit.Assert.assertEquals;

import Wholesales.test.ChinesseClient;
import Wholesales.test.Client;
import Wholesales.test.Mom;
import cucumber.annotation.en.Given;
import cucumber.annotation.en.Then;
import cucumber.annotation.en.When;
import decorators.Clearance;
import products.Chair;
import products.Product; 

public class cucumberJava { 
	
	Product productOrdered;
	Client client;

	
   @Given("the client is the mom") 
   public void createMomClient() { 
	  client = new Mom();
   }
	
	@Given("the client is Chinesse") 
	   public void createChinesseClient() { 
		  client = new ChinesseClient();
	   }
	
   @When("^a chair is orderd$") 
   public void orderChair() { 
	   productOrdered = new Chair();
   }
   
   @When("^there is a clearance$") 
   public void applyClearance() { 
	   productOrdered = new Clearance(productOrdered);
   } 
	
   @Then("^Friends&Family and Clearance rebate applies$") 
   public void composedRebates() { 
	   Product finalOffer= client.getPriceForClient(productOrdered);	
	   double price = finalOffer.cost();
	   System.out.println(finalOffer.getDescription() + " $" + price);
	   assertEquals(21.3273, price, 0.001);
   }
   
   @Then("^VAT rebate applies$") 
   public void VATdefaultClientRebate() { 
	   Product finalOffer= client.getPriceForClient(productOrdered);
	   double price = finalOffer.cost();
	   System.out.println(finalOffer.getDescription() + " $" + price);
	   assertEquals(63.9819, price, 0.001);
   }
}