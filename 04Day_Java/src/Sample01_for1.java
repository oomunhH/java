
public class Sample01_for1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum1=0;
		int sum2=0;
		int n;
		//홀수만
		for (n=1; n<=10; n++) {
			if(n%2==1) {
				System.out.println(n+":홀수");
				sum1+=n;
			}else 
			{System.out.println(n+":짝수");
			sum2+=n;}
			 
			
		}
		System.out.println("for문 out");
		System.out.println(n);
		System.out.println("홀수 합"+sum1);
		System.out.println("짝수 합"+sum2);
				
	}

}
