
public class TestStudent {

	public static void main(String[] args) {

		
		
		
//		Student stu1=new Student();//default생성자 호출
//		Student stu2=new Student();//default생성자 호출
		//stu1과 stu2의 가지고 있는 기본 데이터는 같다.
		Student stu1= new Student("홍길동",23,"강남구");
		Student stu2= new Student("이순신",44,"서초구");
		Student stu3= new Student("유관순",19,"동작구");
		Book book1=new Book();
		Book book2=new Book();
		book1.setTitle("홍길동전");
		book1.setPrice(10000);
		stu1.setWrittenBook(book1);
//		book2.setTitle("해리포터");
//		book2.setPrice(20000);
//		stu2.setwrittenBook(book2);	
		
		//stu1의 책제목을 확인 하고 싶을 때
		Book stu1_book=stu1.getWrittenBook(); //stu1학생의 책의 정보
		String stu1_bookTitle=stu1_book.getTitle();
		System.out.println("1번"+stu1_book.getTitle());
		System.out.println("2번"+stu1_bookTitle);
		System.out.println(stu1.getWrittenBook().getTitle()); //이 사람이 가지고 있는 책의 제목을 꺼내올 수 있다.

//		System.out.print(stu1.getName());
//		System.out.print(stu1.getAge());
//		System.out.println(stu1.getAddress());
//		System.out.print(stu2.getName());
//		System.out.print(stu2.getAge());
//		System.out.println(stu2.getAddress());
//		System.out.print(stu3.getName());
//		System.out.print(stu3.getAge());
//		System.out.println(stu3.getAddress());
//		System.out.println(stu1.printInfo());
//		System.out.println(stu2.printInfo());
//		System.out.println(stu3.printInfo());
		
		
		
//		//Student stu3=new Student();
//
//		stu1.setName("홍길동");
//		stu2.setName("이순신");
//		String name=stu1.getName();
//		System.out.println(stu1.getName());
//		System.out.println(stu2.getName());
//
//		stu1.setAge(20);
//		stu2.setAge(44);
//		int age=stu1.getAge();
//		System.out.println(stu1.getAge());
//		System.out.println(stu2.getAge());
//	
//		stu1.setAddress("서울");
//		stu2.setAddress("강남구");
//		String address=stu1.getAddress();
//		System.out.println(stu1.getAddress());
//		System.out.println(stu2.getAddress());
//		
//		System.out.println(stu1);
//		System.out.println(stu2);
//		stu1=stu2;
//		System.out.println(stu1);
//		System.out.println(stu2);
//		System.out.println(stu1.stuInfo());
//		System.out.println(stu2.stuInfo());
//		
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
