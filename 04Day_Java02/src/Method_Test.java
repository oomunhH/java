
public class Method_Test {
	
	//public //1.호출한 곳으로 돌아갈 값의 타입/ 2.함수 이름(받을 인자값) 인자값 없을 경우 
	//아무곳에서 접근가능//1.돌려주는 값이 없을 때 void입력/2.a_Method(받을 인자값)	비워둔다
	public void a_Method(String name) {
		System.out.println("a_Method()호출_1");
		System.out.println("a_Method()호출_2");
		System.out.println("a_Method()호출_3");
		System.out.println("a_Method() 전달받은 인자"+name);
		}
	public void b_Method() {
			System.out.println("b_Method()호출_1");
			System.out.println("b_Method()호출_2");
			System.out.println("b_Method()호출_3");
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//프로그램 시작
		 Method_Test mt=new Method_Test(); //참조하고 있는 애가 mt ->밑에서 mt.a_Method()로 불러줘야한다. 

		 System.out.println("main 시작======");
		 mt.a_Method("받아!!"); //멤버메서드(함수) (클래스단에 선언되는 new로 불러줘야된다.)
		 mt.b_Method();
		 System.out.println("main 종료====");
	}

}
