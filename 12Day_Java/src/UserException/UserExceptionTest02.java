package UserException;
class ByZeroException extends Exception{
	public ByZeroException(String mesg) {
		super(mesg);
	}
}
public class UserExceptionTest02 {
	public static void divide() throws ByZeroException{
		try {
			int num=3/0;
		} catch (ArithmeticException e) {
			throw new ByZeroException("0으로 나누어 예외발생");
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		try {
			divide();
		} catch (ByZeroException e) {
			// TODO: handle exception
			System.out.println("예외발생: "+e.getMessage());
		}
		System.out.println("프로그램 정상종료");
	}

}
