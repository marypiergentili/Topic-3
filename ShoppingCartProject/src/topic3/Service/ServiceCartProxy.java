package topic3.Service;

import java.math.BigDecimal;

import topic3.Cart;
import topic3.Product;

public class ServiceCartProxy implements ServiceCart{
	
	//contains an instance of the serviceCart
	ServiceCart implementation;
	
	public ServiceCart getServiceCart() {
		return implementation;
	}

	public void setImplementation(ServiceCart implementation) {
		this.implementation = implementation;
	}


	public ServiceCartProxy(ServiceCart implementation){
		//constructor set with a serviceCart object
		this.implementation=implementation;
	}
	

	@Override
	public void addToCart(int key, Product product) {
		//adds a Product element to the cart map
		implementation.addToCart(key, product);
		
	}

	@Override
	public Product readProduct(int key) {
		//reads an specific Product identified with a key from the cart 
		return implementation.readProduct(key);
	}

	@Override
	public Product removeProduct(int key) {
		//removes an specific Product identified with a key from the cart
		return implementation.removeProduct(key);
	}

	@Override
	public Cart emptyCart() {
		//removes all the elements from the cart
		return implementation.emptyCart();
	}

	@Override
	public BigDecimal calculateTotal() {
		// returns total price of the products add to the cart
		return implementation.calculateTotal();
	}

	@Override
	//returns the Cart implementation
	public Cart getCart() {
		return implementation.getCart();
	}
	
}
