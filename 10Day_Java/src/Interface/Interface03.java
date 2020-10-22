package Interface;
interface A{}
interface B{}

interface C extends A,B{}
class My implements A,B{}

public class Interface03 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		A a=new A(); //객체생성 불가
		A a2=new My();//다형성
				
	}

}
