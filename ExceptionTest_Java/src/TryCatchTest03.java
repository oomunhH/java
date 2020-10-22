import java.sql.SQLException;

public class TryCatchTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("시작");
		try {
			int value=3;
			int num=3/value;
			int result=num+100;
			System.out.println("연산된 값: "+result);
		}catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println(e.getMessage());
		}

		System.out.println("프로그램 정상 종료");
	}

}
