
public class Cat extends Pet {

	private String gender;	//유일속성
	
	public Cat(String name, int age,String gender) {
		super(name, age);	//부모생성자 호출	
		this.gender = gender;
	}
	//동작
	
	public void cryCat() {
		System.out.println("야옹~");
	}
	@Override
	public void cry() {
		// TODO Auto-generated method stub
		System.out.println("==cat cry==");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("==cat eat==");
	}

	@Override
	public void sleep() {
		// TODO Auto-generated method stub
		
	}

	public void eatCat() {
		System.out.println("생선 먹기");
	}
	public void sleepCat() {
		System.out.println("새근새근~");	
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
//	@Override
//	public String printInfo() {
//		System.out.println("cat printInfo()호출==============");
//		return name+"\t"+age+"\t"+gender;
//	}
//	
	
	
}
