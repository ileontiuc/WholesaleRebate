package cucumberJava;


import static org.junit.Assert.assertEquals;

import cucumber.annotation.en.Given; 
import cucumber.annotation.en.Then; 
import cucumber.annotation.en.When;
import decorators.Clearance;
import decorators.Volume;
import products.Chair;
import products.Product; 

public class cucumberJava { 
	
	Product beverage2;
	
	
   @Given("the factory has a chair") 
   public void createChair() { 
	   beverage2 = new Chair();
   } 
	
   @When("^I order a chair$") 
   public void goToFacebook() { 
	   beverage2 = new Volume(beverage2);
	   beverage2 = new Volume(beverage2);
	   beverage2 = new Clearance(beverage2); 
   } 
	
   @Then("^I get discount$") 
   public void discount() { 
	   double price= beverage2.cost();
	   System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
	   System.out.println(price);
	   assertEquals(15.166, price, 1);
	   //assertEquals(1, price, 1);
   } 
}