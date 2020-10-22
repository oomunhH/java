package Test06;

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
	
	public double getWeightAvg(Student[] stu) {
		double avgWeight=0;
		int sumW=0;
		for (int i = 0; i < stu.length; i++) {
			sumW+=stu[i].getWeight();
		}
		avgWeight=(double)sumW/stu.length;
		return avgWeight;
	}
	public double getAgeAvg(Student[] stu) {
		double avgAge=0;
		int sumA=0;
		for (int i = 0; i < stu.length; i++) {
			sumA+=stu[i].getAge();
		}
		avgAge=(double)sumA/stu.length;
		return avgAge;
	}
	public double getHeightAvg(Student[] stu) {
		double avgHeight=0;
		int sumH=0;
		for (int i = 0; i < stu.length; i++) {
			sumH+=stu[i].getHeight();
		}
		avgHeight=(double)sumH/stu.length;
		return avgHeight;
	}
	public void printAllstudent(Student[] stu) {
		for (int i = 0; i < stu.length; i++) {
			System.out.println("이름: "+stu[i].getName()+"\t나이: "+stu[i].getAge()+"세\t키: "+stu[i].getHeight()+"cm\t몸무게: "+stu[i].getWeight()+"kg");
		}
	}
	//학생이 없을시 student Not found 사용자 정의 exception 사용하기
	public Student getAstudentInfo(Student[] arr,String name) throws UserStudentException {
		Student stu=null;
		for (int i = 0; i < arr.length; i++) {
			if(arr[i].getName().equals(name)) {
				stu=arr[i];
				
			}
				
		} if(stu==null) {throw new UserStudentException("Student Not Found");
		}
		return stu;
		
		}
	public String getAstudentInfo2(Student[]stu,String name) throws UserStudentException {
		int index=0;
		for (int i = 0; i < stu.length; i++) {
			if(stu[i].getName().equals(name)) {
				index=i; 
			} 
		}if(stu==null) {throw new UserStudentException("Student Not Found");}
		return "해당학생: "+stu[index].getName()+"\t나이: "+stu[index].getAge()+"\t키: "+stu[index].getHeight()+"\t몸무게: "+stu[index].getWeight();
	}
	
	
}
