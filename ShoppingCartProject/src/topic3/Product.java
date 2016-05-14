package topic3;

public class Product {
	
	//attributes
	private String name;
	private double price;
	
	//constructor
	public Product(String name, double price){
		this.name=name;
		this.price=price;
	}
	
	//getter
	public String getName() {
		return name;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	//toString
	public String toString(){
		return "Product name: "+name+" Price: "+price;
	}

}
