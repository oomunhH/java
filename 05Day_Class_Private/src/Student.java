
public class Student {
	//인스턴스 변수(멤버변수) in class단 but, 메소드 밖에서 선언
	//-메서드 밖에서 static(x)
	//new 사용시 변수 생성
	//생성시점?
	//객체생성~객체소멸(참조변수가 못가리킬때)
	//자동으로 초기화(각타입별 default 값)
//String앞에 접근제한자(ex. public 이 클래스는 아무 곳에서나 접근이 가능하다는 의미) 붙는다. 
//안붙이면 default가 붙어있다.	
	private String name;
	private int age;
	private String address;
	
	public String stuInfo() {
		return name+"/"+age+"/"+address;
	}//멤버변수로 한꺼번에 문자열로 변환 리턴
	
	public void setName(String name) {
		this.name=name;
	}//멤버변수 name 값 설정함수
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
	
	

