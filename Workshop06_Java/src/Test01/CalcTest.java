package Test01;

public class CalcTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		String num0=args[0];
		String symbol=args[1];
		String num2=args[2];
		System.out.println(num0);
		System.out.println(symbol);
		System.out.println(num2);
		int numI0=Integer.parseInt(args[0]);
		int numI2=Integer.parseInt(args[2]);
		Calculator calculator=new Calculator();
	if (args[1].equals("+")) {System.out.println(calculator.plus(numI0,numI2));}
	else if (args[1].equals("-")) {System.out.println(calculator.minus(numI0,numI2));}
	else if (args[1].equals("*")) {System.out.println(calculator.multiplication(numI0, numI2));}
	else if (args[1].equals("/")) {calculator.divide(numI0,numI2);}
	System.out.println("프로그램 종료");		
	}
	

}
