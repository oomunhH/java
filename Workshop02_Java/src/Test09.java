import java.util.Scanner;

public class Test09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		System.out.println("d");
		int a=scan.nextInt();
		System.out.println("d");
		int b=scan.nextInt();
		System.out.println("d");
		
		int c=scan.nextInt();
		int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
		
		System.out.println("a 값 :"+a);
		System.out.println("b 값 :"+b);
		System.out.println("c 값 :"+c);
		System.out.println("최댓값 :"+max);
	}

}
