import java.util.Scanner;

public class Test071 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("한자리 정수를 입력하시오.");
		int n1=scan.nextInt();
		int sum=0;
		for (int i = 1; i<100; i++) {
			
			if(n1*i<10) {
				System.out.print(n1*i);
				sum+=n1*i;
			}else if(n1*i<100) {
				System.out.print("+"+n1*i);
				sum+=n1*i;
			}
			
			}
		    System.out.print("="+sum);	
			
			
			
		}
	}


