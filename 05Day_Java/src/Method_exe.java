//import java.util.Scanner;

public class Method_exe {//덧셈, 뺄셈 함수 만들기

	public int sum(int num1,int num2) {
		System.out.println("====sum함수 호출====");
		int result=0;
		result=num1+num2;
		System.out.println("sum결과 : "+num1+"+"+num2+"="+result);
		return result;
	}
	public void sub(int num1,int num2) {
		System.out.println("====substrate함수 호출====");
		int sub=0;
		sub=num1-num2;
		System.out.println("substrate결과 : "+num1+"-"+num2+"="+sub);
	}
	public void mux(String num1,int num2) {
		System.out.println("====mux 함수 호출====");
		int result=Integer.parseInt(num1)*num2;
		System.out.println("mux 결과 : "+num1+"x"+num2+"="+result);}
	
		public void div(int num1,int num2) {
			System.out.println("====mux 함수 호출====");
			float result=(float)(num1/num2);
			System.out.println("div 결과 : "+num1+"/"+num2+"="+result);
		
	}
	public void printArr(String [] name) {
		System.out.println("=====printArr 함수 호출====");
		for (int j = 0; j < name.length; j++) {
			System.out.println("배열"+j+":"+name[j]);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("====메인 시작====");
		//Scanner number=new Scanner(System.in);
		Method_exe test = new Method_exe();
//		System.out.println("숫자를 입력하시오");
//		int n1=number.nextInt();
//		int n2=number.nextInt();
		int num1=10;
		int num2=20;
		String num="10";
		int sum_result=test.sum(num1,num2); //갯수랑 타입이 맞아야한다.
		System.out.println("반환결과는 "+sum_result);
		test.sub(num1, num2);
		test.mux(num, num2);
		test.div(num1, num2);
		
		String [] name;
		name=new String[2];
		name[0]="홍길동";
		name[1]="이순신";
		test.printArr(name);
		
		System.out.println("====메인 종료=====");
		
		
		
		
		
	}

}
