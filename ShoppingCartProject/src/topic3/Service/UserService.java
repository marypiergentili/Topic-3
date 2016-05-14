package topic3.Service;

import topic3.Cart;
import topic3.User;

public interface UserService {
	
	
	/**
	 * Adds a Cart item to the ArrayList<Cart>
	 * @param cart	The Cart object to be added to the Cart List
	 * @return true if the Cart was correctly added to the ArrayList<Cart>
	 */
	boolean addCart(Cart cart);
	
	/**
	 * Gets the Cart element identified by the ArrayList index
	 * @param index	The number where the Cart is indexed on the ArrayList
	 * @return the Cart object identified with the current index
	 */
	Cart readCart(int index);
	
	/**
	 * Removes a Cart object sent by parameters
	 * @param index The index from the Cart object to remove from the List
	 * @return the Cart object deleted
	 */
	Cart removeCart(int index);
	
	/**
	 * Removes all the Cart objects from the List
	 */
	void emptyCart();
	
	User getUser();
	
	

}
