
public class Sample05_DoWhile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int evensum=0;
		int n=0;
		
		do {
			System.out.println(n+"world");
			evensum+=n;
			n+=2;
			
			
		}while(n<=10);
		
		System.out.println(evensum);
	}

}
