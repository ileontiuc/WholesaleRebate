package Wholesales.test;

import decorators.Clearance;
import decorators.Volume;
import products.Chair;
import products.Desk;
import products.Product;
import products.WhiteBoard;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
System.out.println("hello world");
		
		Product beverage = new Desk();
		System.out.println(beverage.getDescription() + " $" +beverage.cost()) ;
		
		Product beverage2 = new Chair();
		 beverage2 = new Volume(beverage2);
		 beverage2 = new Volume(beverage2);
		 beverage2 = new Clearance(beverage2);
		 System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
		 
		 Product beverage3 = new WhiteBoard();
		 beverage3 = new Volume(beverage3);
		 beverage3 = new Volume(beverage3);
		 beverage3 = new Clearance(beverage3);
		 System.out.println(beverage3.getDescription() + " $" + beverage3.cost());
		 		
    }
}
