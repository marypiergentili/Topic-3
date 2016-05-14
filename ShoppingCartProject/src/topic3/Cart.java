package topic3;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Map;

public class Cart {
	
	//the cart has a map to contain the products identified by a key number
	private Map<Integer,Product> productsMap;
	private BigDecimal totalPrice;
	
	//constructor
	public Cart(){
		//use a hashmap to implement the cart map
		productsMap = new HashMap<Integer, Product>();
		setTotalPrice(new BigDecimal(0));
	}

	//getter
	public Map<Integer,Product> getProductsMap() {
		return productsMap;
	}
	
	@Override
	public String toString() {
		return "Cart [productsMap=" + productsMap + "]";
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

}
