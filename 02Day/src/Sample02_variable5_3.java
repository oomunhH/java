
public class Sample02_variable5_3 {
		String name;
		char c;
		int m;
	//인스턴스변수(instance variable), 멤버변수
	//생성시점, 객체생성(클래스 생성)-객체소멸(클래스 종료) 
		//-생성시 new 키워드, 새로 만들어진 객체의 위치를 알려준다.
	//메모리 : 힙(heap)
	//초기화 안하면 자동초기화 된다.
	  //정수 : 0, 실수:0.0, char:\u0000', boolean:false, 참조형 : null
		static int k; 
	//static 변수 (클래스 변수)
	//생성시점 : 프로그램 시작-종료, new 없이 사용
	//method area(클래스 정보, static, 상수,...)
	//초기화 안하면 자동 초기화 된다.
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	//로컬변수 : 함수나 메서드 안에서 선언
	//생성시점 : 메서드(함수라고 생각) 호출-종료
	//메모리 : 스택 (stack)
	//주의할 점 : 반드시 사용전에 초기화해야된다.
		int n=0;
		System.out.println(n);
		Sample02_variable5_3 test_1 = new Sample02_variable5_3();
		//멤버 변수 사용을 위해 객체 생성과정
		System.out.println(test_1.name);
		//생성 객체 멤버변수 사용
	}   

}
