
public class TestClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float result=9/2f;
		int result_int=9/2;
		System.out.println(result);
		System.out.println(result_int);
		char c='A';
		int int_c=c+1;
		System.out.println(int_c);
		char c2=(char)(c+1);
		System.out.println(result);
		System.out.println(c+"\t"+int_c+"\t"+c2);
		//A의 아스키코드 65에서 1을 더한 후 66을 다시 문자로 변환시켜주면 B가 된다는 것을 보여준다.
	}

}
