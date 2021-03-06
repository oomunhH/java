
public class Sample03_typeCasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//정수랑 실수 두 개를 더 하면 실수가 나온다. d으로 변수 지정하면 더블형에 저장된다.
				int n=10;
				float f=20.3f;
				double d=n+f;
				
		//int 보다 작은 데이터형의 연산결과는 int로 자동으로 변경된다.
		//그래서 s+s2의 연산결과는 int이기 때문에 데이터 타입 short로 설정하려고 하면 오류가 난다.
				short s=10;
				short s2=20;
				int s3=s+s2;
				short s4=(short)(s+s2);
				
				int na=10;
				short n2 = (short)na;
				
				short x=10;
				short x2=20;
				short x3=(short)(x+x2);
				System.out.println(x3);
				
		//1.데이터 타입 변경 byte < short  < int < long < float < double < float < long
				byte b=10;
				short b2=b;
				int b3=b2;
				long b4=b3;
				float b5=b4;
				double b6=b5;
				
				double c=10;
				float c1=(float)c;	
				long c2=(long)c1;
				int c3=(int)c2;
				short c4=(short)c3;
				byte c5=(byte)c4;
				
		//2.char -> int 숫자를 문자로 형변환,  A=65 상수로 등록되어있는 값
				char naa='A';
				int na2=naa+1;
				System.out.println(na2);
				
		//3.int보다 작은 타입의 연산 결과는 int로
				short xx=10;
				short xx2=20;
				int xx3=xx+xx2;
	
		//4.문자열과 문자열이 아닌데이터의 연산=> 연결된 문장
				System.out.println("10"+1+2+3);
				System.out.println(1+2+3+"10");
		
		//5. 작은 타입과 큰 타입의 연산 -> 결과는 큰 타입
				int p = 100;
				double p2=3.14;
				double p3=p+p2;
				//int p4=p+p2는 에러
				
		// 문자 10을 숫자 10으로 "10"--->10
				//자바스크립트 : Number.parseInt("10") -> 숫자 10
				//자바 :Integer.parseInt("10") -> 숫자 10
				String k="10"; //"10" 문자열 등록
				System.out.println(k+20);
				int k2=Integer.parseInt(k); //"10" 문자열을 숫자 10으로 변환
				System.out.println(k2+20);
		//반대로 숫자 10을 문자 10 으로 변환
				//자바스크립트 : toString()
				//자바 : String.valueOf()
			System.out.println(String.valueOf(10)+10);
			System.out.println(10+"");
	}

}
