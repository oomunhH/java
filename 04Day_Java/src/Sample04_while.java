
public class Sample04_while {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int total=0;
		int n=0;
		while(n<=10) {
			System.out.println("hello"+n);
			total+=n;
			n++;
		}
		System.out.println("0부터 10까지 합:"+total);
	}

}
