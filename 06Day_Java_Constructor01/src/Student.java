
public class Student {

	private String name;
	private int age;
	private String address;
	//기본(default) 생성자 묵시적 삽입
	public Student() {//형식 접근제한자(public), 리턴타입 없음, 클래스이름()
	System.out.println("student 생성자 호출");	
		name="홍길동";
		age=20;
		address="서울";
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
	
	

