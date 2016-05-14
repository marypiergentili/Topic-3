package topic3;


import topic3.Service.*;

public class Demo {

	public static void main(String[] args){
		
		//creating a cart using the service
		ServiceCart cartService1= ServiceCartFactory.getRemoteServiceCartUsingProxy();
		//add a new product to the cart
		cartService1.addToCart(1, new Product("Papas fritas", 17));
		System.out.println(cartService1.getCart());
		//add a new product to the cart
		cartService1.addToCart(2, new Product("Hamburguesa", 35));
		System.out.println(cartService1.getCart());
		//add a new product to the cart
		cartService1.addToCart(3, new Product("Coca Cola", 10));
		System.out.println(cartService1.getCart());
		//removes an existing product
		cartService1.removeProduct(2);
		System.out.println(cartService1.getCart());
		//showing on screen an existing product from the cart
		System.out.println(cartService1.readProduct(1));
		// removing all the products from the cart, then showing on the screen the empty cart
		System.out.println(cartService1.emptyCart());
		
		//creating a user using the service
		UserService userService1= UserServiceFactory.getRemoteUserServiceUsingProxy(1,"Cynthia","cyn@gmail.com");
		System.out.println(userService1.getUser());
		//adding the cart creted by the service to the user
		userService1.addCart(cartService1.getCart());
		System.out.println(userService1.getUser());
		
		//create other cart
		ServiceCart cartService2= ServiceCartFactory.getRemoteServiceCartUsingProxy();
		//add a new product
		cartService2.addToCart(1, new Product("Pollo",40));
		cartService2.addToCart(2, new Product("Ensalada",15));
		//calculates the total cart price
		cartService2.calculateTotal();
		
		//add the cart to the existing user
		userService1.addCart(cartService2.getCart());
		//show the user
		System.out.println(userService1.getUser());
		//removing the first empty cart
		System.out.println("Removing the "+userService1.removeCart(0));
		//showing on screen the total cart price
		System.out.println("Cart 1 total price: "+userService1.readCart(0).getTotalPrice());
		
		//removing all carts from the user and showing the user from screen
		userService1.emptyCart();
		System.out.println(userService1.getUser());
		
		
		


	}

}
