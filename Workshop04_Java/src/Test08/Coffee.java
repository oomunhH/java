package Test08;

public class Coffee {
	private String name;
	private int price;
	public Coffee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Coffee(String name, int price) {
		super();
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Coffee [name=" + name + ", price=" + price + "]";
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	
}
