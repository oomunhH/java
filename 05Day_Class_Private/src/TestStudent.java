
public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		클래스명 변수명=new 클래스명();
//학생마다 객체가 달라서 stu1 2 3 설정
		Student stu1=new Student();//private으로 막혀있어도 객체생성은 가능
		Student stu2=new Student();
		//Student stu3=new Student();

		stu1.setName("홍길동");
		stu2.setName("이순신");
		String name=stu1.getName();
		System.out.println(stu1.getName());
		System.out.println(stu2.getName());

		stu1.setAge(20);
		stu2.setAge(44);
		int age=stu1.getAge();
		System.out.println(stu1.getAge());
		System.out.println(stu2.getAge());
	
		stu1.setAddress("서울");
		stu2.setAddress("강남구");
		String address=stu1.getAddress();
		System.out.println(stu1.getAddress());
		System.out.println(stu2.getAddress());
		
		System.out.println(stu1);
		System.out.println(stu2);
		stu1=stu2;
		System.out.println(stu1);
		System.out.println(stu2);
		System.out.println(stu1.stuInfo());
		System.out.println(stu2.stuInfo());
		
//		stu1.name="홍길동";
//		stu1.age=20;
//		stu1.address="서울";
//		
//		stu2.name="이순신";
//		stu2.age=44;
//		stu2.address="전라";
//		
//		stu3.name="유관순";
//		stu3.age=19;
//		stu3.address="경기";
//		
//		System.out.println(stu1.name);
//		System.out.println(stu1.age);
//		System.out.println(stu1.address);
//		System.out.println(stu2.name);
//		System.out.println(stu2.age);
//		System.out.println(stu2.address);
//		System.out.println(stu3.name);
//		System.out.println(stu3.age);
//		System.out.println(stu3.address);
	}

}
