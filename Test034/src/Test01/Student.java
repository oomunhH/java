package Test01;

public class Student {
	private String name;
	private int age;
	private int height;
	private int weight;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String name, int age, int height, int weight) {
		super();
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
	public int getWeight() {
		return weight;
	}
	public void setWeight(int weight) {
		this.weight = weight;
	}
	public String getResult() {
		return "이름: "+name+", 나이: "+age+"세, 키: "+height+" cm, 몸무게:"+weight+" kg";
	}
	
}