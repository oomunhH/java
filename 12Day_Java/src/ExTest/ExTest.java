package ExTest;
public class ExTest {


	public int a(int num1, int num2) throws ArithmeticException {
		int result=0;
		if(num2==0) {
			throw new ArithmeticException("0으로 나눌 수 없습니다. 다시 입력해주세요");
		}else {
			result=num1/num2;
		
		}
		
		return result;
		
//		int result=0;
//		result=num1/num2;
//		return result;
//		int result=0;
//		try {
//		result=num1/ num2;}
//		catch(Exception e){
//		System.out.println(e.getMessage());
//		}
//		return result;

	}
}
