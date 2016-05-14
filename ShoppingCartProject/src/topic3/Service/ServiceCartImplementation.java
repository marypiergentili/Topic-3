package topic3.Service;

import java.math.BigDecimal;
import java.util.Map.Entry;

import topic3.Cart;
import topic3.Product;

public class ServiceCartImplementation implements ServiceCart {
	
	//attribute is a cart instance
	private Cart shoppingCart;
	
	public Cart getCart() {
		return shoppingCart;
	}

	public void setCart(Cart shoppingCart) {
		this.shoppingCart = shoppingCart;
	}

	//constructor
	public ServiceCartImplementation(){
		shoppingCart= new Cart();
	}

	@Override
	public void addToCart(int key, Product product) {
		//adds a Product element to the cart map
		shoppingCart.getProductsMap().put(key, product);
		
	}

	@Override
	public Product readProduct(int key) {
		//reads an specific Product identified with a key from the cart 
		return shoppingCart.getProductsMap().get(key);
	}

	@Override
	public Product removeProduct(int key) {
		//removes an specific Product identified with a key from the cart
		return shoppingCart.getProductsMap().remove(key);
		
	}

	@Override
	public Cart emptyCart() {
		//removes all the elements from the cart
		shoppingCart.getProductsMap().clear();
		return shoppingCart;
	}

	@Override
	public BigDecimal calculateTotal() {
		//returns the total price of all the products added to the cart
		
		double total=0;
		for (Entry<Integer, Product> iterable_element : shoppingCart.getProductsMap().entrySet()) {
			total+= iterable_element.getValue().getPrice();
		}
		shoppingCart.setTotalPrice(new BigDecimal(total));
		return shoppingCart.getTotalPrice();
	}
	
	

}
