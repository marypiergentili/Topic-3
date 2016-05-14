package topic3.Service;

import java.math.BigDecimal;

import topic3.Cart;
import topic3.Product;

public interface ServiceCart {
	
	/**
	 * Adds a Product to the Map identified by a key number
	 * @param key	Number used as a key to index a Product into the Map
	 * @param product	Product to add to the Map indexed with the specific key
	 */
	void addToCart(int key,Product product);
	
	/**
	 * Gets a Product object contained in the Map identified by a key number sent by parameters
	 * @param key	Number used as a key where the Product is indexed in the Map
	 * @return a Product object identified with the specific key
	 */
	Product readProduct(int key);
	
	/**
	 * Removes a Product object contained in the Map indexed by an key parameter
	 * @param key	int number that represents the key where the Product to remove is contained
	 * @return Product object deleted from the Map
	 */
	Product removeProduct(int key);
	
	/**
	 * Removes all Product objects form the Map<Cart>
	 * @return Cart object empty
	 */
	Cart emptyCart();
	
	/**
	 * Calculates the total Products amount contained into the Cart Map
	 * @return BigDecimal object representing the final amount
	 */
	BigDecimal calculateTotal();
	
	/**
	 * Returns the Cart object
	 * @return Cart object
	 */
	Cart getCart();

}
