
public class Sample01_for2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum=0;
		int n;
		
		for (n=1; n<=100; n++) {
			if(n%3==0) {
				System.out.println(n+":3의배수");
				sum+=n;}
									
		}
		System.out.println("for문 out");
		System.out.println("3의 배수"+sum);
		
	}

}
