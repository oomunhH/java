package Test01;

public class Calculator {
	
	public double plus(int a,int b) {
		double result=a+b;
		return result;
	}
	public double minus(int a,int b) {
		double result=a-b;
		return result;
	}
	public double multiplication(int a,int b) {
		double result=a*b;
		return result;
	}
	public void divide(int a,int b) {
		double result = 0;
		try {
			result=(double)a/b;
			System.out.println(result);
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
			System.out.println("Exception이 발생했습니다. 다시 입력 해주세요");
		}
		
	}
	
}
