
public class Memeber_Test_New {
	//멤버, 인스턴스 변수 - class블록에 선언
		//선언 후 초기화 불필요 -> 사용시 자동 초기화
		//함수 안에서 new로 필요한 만큼 객체 생성 사용 (함수안에서 사용해야한다)
	String name;
	String phoneNumber;
	String address;
	char gender;	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
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
		System.out.println(mem1.name+" "+mem1.phoneNumber);
		System.out.println(mem2.name);
		System.out.println(mem3.name);
		Member_Test mem4=new Member_Test();
		mem4.name="이철원";
		mem4.address="서울";
		System.out.println("이름은 "+mem4.name+" 주소는 "+mem4.address+"이다.");	
	}

}
