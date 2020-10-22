package workshop042;

public class BookTest {
		public Book[] arrPrint(Book[] books) {
			for(Book book:books) {
				System.out.println(book.getBookName());
				
			}
			
			books[0]=new Book("AAAAA",50000,5);
			return books;
		}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book0=new Book("SQL Plus",50000,5.0);
		Book book1=new Book("Java 2.0",40000,3.0);
		Book book2=new Book("JSP Servlet",60000,6.0);
		Book[] bookList=new Book[3];
		
		System.out.println(book0.getBookDiscount());
		System.out.println(book1.getBookDiscount());
		System.out.println(book2.getBookDiscount());

		System.out.println(book0.getReturn());
		System.out.println(book1.getReturn());
		System.out.println(book2.getReturn());
		Book[] books=new Book[3];
		books[0]=book0;
		books[1]=book1;
		books[2]=book2;
		BookTest test=new BookTest();
		Book[] returnbook=test.arrPrint(books);
		System.out.println(returnbook[0].getBookName());
//		for (int i = 0; i < bookList.length; i++) {
//			System.out.println(bookList[i].getBookName()+"\t"+bookList[i].getBookPrice()+"��\t"+bookList[i].getBookDiscountRate()+"%\t"+bookList[i].getBookDiscount()+"��");
//		
//		}
//		for(Book i:bookList) {
//			System.out.println(i.getBookName()+"\t"+i.getBookPrice()+"원\t"+i.getBookDiscountRate()+"%\t"+i.getBookDiscount()+"원");
//		}
	}

}