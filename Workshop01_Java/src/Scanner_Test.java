import java.util.Scanner;

public class Scanner_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner	scan=new Scanner(System.in);
		//Scanner class이므로 객체 생성 해주어야한다.
		//System.in 화면에서 입력 받아 올 것이다.
		System.out.println("1.이름을 입력하세요");
		String name=scan.next();
		System.out.println("2.나이를 입력하세요");
		String age=scan.next();
		System.out.println(name+"\t"+age);
		scan.close();
		//닫아 주기.
	}

}
