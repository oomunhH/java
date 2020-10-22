package Finally;

public class FinallyTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		try {
			int num=3/5;
			System.out.println("결과값: "+num);
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
			// TODO: handle exception
		} finally {
			System.out.println("반드시 수행되는 문장");
		}
		System.out.println("프로그램 정상 종료");
	}

}
