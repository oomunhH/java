
public class Sample02_variable5_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int test=100; //메인블록에서 선언한 변수는 메인 블록 안 전체에 다 사용가능하다
		{int num=10;
		System.out.println(num);
		System.out.println(test);
		//System.out.println(test2); 프로그램 코드는 위에서 부터 아래로 내려온다. 에러발생
	}//-block1
		//블록 밖에서는 변수는 인식 불가.
		int test2=2000;
		{int num=20;
		System.out.println(num);
		System.out.println(test*2);
		System.out.println(test2);
		}//-block2
	}//-main block 
}//-class block
