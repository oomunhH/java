package Practice;


	
public class Cat extends Pet {
	private String gender;	//유일속성
	//동작
	public Cat() {
		super();
	}
	public Cat(String name, int age,String gender) {
		super(name,age);
		
		this.gender = gender;
	}
	
	public void cryCat() {
		System.out.println("야옹~");
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

	@Override
	public String printInfo() {
		System.out.println("cat호출==");
		return name+"\t"+age+"\t"+gender;
	}
	
	
}
