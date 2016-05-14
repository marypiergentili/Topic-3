package topic3.Service;

import topic3.Cart;
import topic3.User;

public class UserServiceImplementation implements UserService{
	
	//user attribute
	private User user;
	
	//constructor
	public UserServiceImplementation(int id, String userName, String email){
		setUser(new User(id, userName, email));
	}
	
	//setters and getters
	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	@Override
	//adds a Cart to the User Cart List
	public boolean addCart(Cart cart) {
		return user.getCartList().add(cart);
	}

	@Override
	//returns a Cart contained in the specific index from the Cart List
	public Cart readCart(int index) {
		return user.getCartList().get(index);
	}

	@Override
	//removes an specific Cart contained identified by the index from the Cart List
	public Cart removeCart(int index) {
		return user.getCartList().remove(index);
	}

	@Override
	//removes all the elements from the Cart List
	public void emptyCart() {
		user.getCartList().clear();		
	}



}
