package topic3;

import java.util.ArrayList;

public class User {
	
	private int id;
	private String userName;
	private String email;
	private ArrayList<Cart> cartList;
	
	public User(int id, String userName, String email){
		this.id=id;
		this.userName=userName;
		this.email=email;
		cartList=new ArrayList<Cart>();
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public ArrayList<Cart> getCartList() {
		return cartList;
	}
	public void setCartList(ArrayList<Cart> cartList) {
		this.cartList = cartList;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", email=" + email + ", cartList=" + cartList + "]";
	}
	
}
