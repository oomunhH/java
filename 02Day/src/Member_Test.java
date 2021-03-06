public class Member_Test {//class블록
	//멤버, 인스턴스 변수 - class블록에 선언
	//선언 후 초기화 불필요 -> 사용시 자동 초기화
	//함수 안에서 new로 필요한 만큼 객체 생성 사용 (함수안에서 사용해야한다)
	static int num=10; //초기값 주지않으면 타입의 기본값으로 설정된다. 
	//static 넣어주면 객체 생성 없이 사용가능 (new 사용할 필요없다)
	String name="홍길동";
	String phoneNumber;
	String address;
	char gender;	
	public void printInfo() {//멤버메소드(함수)
		System.out.println(name+" "+phoneNumber+" "+address);
	}
	public static void main(String[] args) {//main블록
		// TODO Auto-generated method stub
		//로컬변수(메소드/함수에 선언된 변수)->선언과 초기화 한 후 사용할 수 있다.
		int num=10;
//		System.out.println("로컬변수"+" "+num);
//		System.out.println(Member_Test.num); //static 변수의 사용
//		Member_Test mem=new Member_Test();
//		System.out.println(mem.name); //-에러 객체생성 필요
		Member_Test mem1=new Member_Test();
		//--mem1 :새로 만들어진 객체의 값을 가지고 있는 위치를 알려주는 참조 변수
		mem1.name="박현우";
		mem1.phoneNumber="010-3921-1294";
		Member_Test mem2=new Member_Test();
		//--mem2 :새로 만들어진 객체의 값을 가지고 있는 위치를 알려주는 참조 변수
		mem2.name="홍길동";
		Member_Test mem3=new Member_Test();
		mem3.name="이순신";
		//--mem1 :새로 만들어진 객체의 값을 가지고 있는 위치를 알려주는 참조 변수
		mem2.printInfo();//객체 멤버 메소드 호출
		mem3.printInfo();//객체 멤버 메소드 호출
		System.out.println(mem1.name+" "+mem1.phoneNumber);
		System.out.println(mem2.name);
		System.out.println(mem3.name);
		Member_Test mem4=new Member_Test();
		mem4.name="이철원";
		mem4.address="서울";
		System.out.println("이름은 "+mem4.name+" 주소는 "+mem4.address+"이다.");
	}//main블록

}//class블록
