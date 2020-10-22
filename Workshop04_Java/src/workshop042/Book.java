package workshop042;

public class Book {
	private String bookName;
	private int bookPrice;
	private double bookDiscountRate;
	public Book() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Book(String bookName, int bookPrice, double bookDiscountRate) {
		super();
		this.bookName = bookName;
		this.bookPrice = bookPrice;
		this.bookDiscountRate = bookDiscountRate;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPrice() {
		return bookPrice;
	}
	public void setBookPrice(int bookPrice) {
		this.bookPrice = bookPrice;
	}
	public double getBookDiscountRate() {
		return bookDiscountRate;
	}
	public void setBookDiscountRate(double bookDiscountRate) {
		this.bookDiscountRate = bookDiscountRate;
	}
	
	public double getBookDiscount() {
		double price=bookPrice*(double)(1-bookDiscountRate/100);
		return price;
	}
	public String getReturn() {
		double AfPrice=getBookDiscount();
		
		return bookName+"\t"+bookPrice+"¿ø\t"+bookDiscountRate+"%\t"+AfPrice+"¿ø";
	}
}
