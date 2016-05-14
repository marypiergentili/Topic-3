package topic3.Test;

import static org.junit.Assert.*;
import java.math.BigDecimal;

import org.junit.Before;
import org.junit.Test;

import topic3.Product;
import topic3.Service.ServiceCart;
import topic3.Service.ServiceCartFactory;

public class ShoppingCartTest {
	
	ServiceCart serviceCartTest;

	@Before
	public void setUp() throws Exception {
		serviceCartTest= ServiceCartFactory.getRemoteServiceCartUsingProxy();
	}

	@Test
	//tests if the product is correctly added to the shopping cart
	public void addToCart() {
		serviceCartTest.addToCart(1, new Product("Papas fritas",15));
		 assertEquals("Papas fritas", serviceCartTest.readProduct(1).getName());
		
	}
	
	@Test
	public void removeProduct(){
		serviceCartTest.addToCart(1, new Product("Papas fritas",15));
		 assertEquals("Papas fritas", serviceCartTest.removeProduct(1).getName());
		
	}
	
	@Test
	public void emptyCart(){
		serviceCartTest.addToCart(1, new Product("Papas fritas",15));
		serviceCartTest.addToCart(2, new Product("Hamburguesa",30.5));
		serviceCartTest.addToCart(3, new Product("Gaseosa",10.3));
		assertTrue(serviceCartTest.emptyCart().getProductsMap().isEmpty());
	}
	
	@Test
	public void readProductTest(){
		Product productTest= new Product("Papas fritas",15);
		serviceCartTest.addToCart(1, productTest);
		assertEquals(productTest.toString(), serviceCartTest.readProduct(1).toString());
		
	}
	
	@Test
	public void calculateTotal(){
		serviceCartTest.addToCart(1, new Product("Papas fritas",15));
		serviceCartTest.addToCart(2, new Product("Hamburguesa",30.5));
		serviceCartTest.addToCart(3, new Product("Gaseosa",10.3));
		serviceCartTest.calculateTotal();
		assertEquals(serviceCartTest.getCart().getTotalPrice(),new BigDecimal(55.8));
	}

}
