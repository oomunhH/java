
public class TryCatchTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		try {
			System.out.println("B");
			int num=3/0; //arithmaticException 발생
			System.out.println("C");
		} catch (Exception e) {
			System.out.println("D");
		}
	System.out.println("E");
	}
	
	
}
