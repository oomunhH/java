package UserException;
class UserException extends Exception{
	public UserException(String mesg) {
	super(mesg);
	}
	public void print() {
		System.out.println("사용자 정의 Ex");
	}
}

public class UserExceptionTest {
	public static void check(int num) throws UserException{
		if(num<100) {
			throw new UserException("num 값이 100보다 작다.");
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		try {
			check(70);
		}catch(Exception e) {
			System.out.println("예외발생: "+e.getMessage());
			UserException e1=(UserException)e;
			e1.print();
		}
		System.out.println("프로그램 종료");
	}

}
