
public class Student {

	private String name;
	private int age;
	private String address;
	//기본(default) 생성자 묵시적 삽입
	private Book writtenBook;
	//Book 타입을 멤버변수로 가져옴.

	public void setWrittenBook(Book writtenbook) {
		this.writtenBook=writtenbook;
	}
	public Book getWrittenBook() {
		return writtenBook;
	}
	
		
	public Student() {} //기본생성자(default값을 가지는)를 명시적으로 꼭 기재할 것.
	public Student(String name, int age, String address) {
		System.out.println(
			"student 생성자 호출");	
		this.name=name;
		this.age=age;
		this.address=address;
	
	}
	
	public String printInfo() {
		//return name+":"+age+","+address;
		return getName()+":"+getAge()+","+getAddress();
}
	
	public String stuInfo() {
		return name+"/"+age+"/"+address;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() { 
		return name;
	}
	
	public void setAge(int age) {
		this.age=age;}
	public int getAge() {
		return age;
	}
	
	public void setAddress(String address) {
		this.address=address;}
		public String getAddress() {
			return address;
	}

}
	
	

