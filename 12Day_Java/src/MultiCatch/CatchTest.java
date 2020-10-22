package MultiCatch;

public class CatchTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		String name=null;
		int [] num2= {10,20};
		
		try {
			
		System.out.println("문자열의 길이:"+name.length());
			System.out.println(num2[3]);
		} catch(NullPointerException e){
			System.out.println("널포인터"+e.getMessage());
			
		} try{
			int num=3/0;
			}catch(ArithmeticException e2) {
		
			System.out.println("아리스매틱"+e2.getMessage());
		} catch(Exception e3) {
			System.out.println("모든 예외처리 가능	"+e3.getMessage());
		}
		System.out.println("프로그램 정상종료");
	}

}
