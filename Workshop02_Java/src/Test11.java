import java.util.Scanner;

public class Test11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("a값을 입력하시오");
		int a=scan.nextInt();
		int b;
		System.out.println("b값을 입력하시오");
		while(true) {
				b=scan.nextInt();
				if(b>a) {break;}
				System.out.println("a보다 큰 b값을 다시 입력하시오");
		}
		int s=b-a;
		System.out.println("a의 값:"+a);
		System.out.println("b의 값:"+b);
		System.out.println("b-a"+s);
	}

}
