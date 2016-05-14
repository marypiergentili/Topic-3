package topic3.Service;

import topic3.Cart;
import topic3.User;

public class UserServiceProxy implements UserService{
	
	private UserService implementation;
	
	//constructor
	public UserServiceProxy(UserService implementation){
		this.setImplementation(implementation);
	}
	//setters and getters
	public UserService getImplementation() {
		return implementation;
	}

	public void setImplementation(UserService implementation) {
		this.implementation = implementation;
	}

	@Override
	//adds a Cart to the User Cart List
	public boolean addCart(Cart cart) {
		return implementation.addCart(cart);
	}

	@Override
	//returns a Cart contained in the specific index from the Cart List
	public Cart readCart(int index) {
		return implementation.readCart(index);
	}

	@Override
	//removes an specific Cart contained identified by the index from the Cart List
	public Cart removeCart(int index) {
		return implementation.removeCart(index);
	}

	@Override
	//removes all the elements from the Cart List
	public void emptyCart() {
		implementation.emptyCart();
	}
	@Override
	public User getUser() {
		// TODO Auto-generated method stub
		return implementation.getUser();
	}



}
