import java.util.Scanner;

public class Test07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan=new Scanner(System.in);
		int sum=0;
		int multiple=0;
		int i =1; 
		System.out.println("숫자를 입력하세요");
		int number=scan.nextInt();
		while(i<=100) 
		
		{
		multiple=number*i;	
		sum+=multiple; 
		if(multiple>=100) break;	
		System.out.print("+"+multiple);
		i++;
		}
		System.out.print("="+sum);
		scan.close();
	}

}
