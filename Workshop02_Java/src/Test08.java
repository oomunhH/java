
public class Test08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 1; i <=100 ; i++) {
			System.out.print("\n"+i);
			if(i%3==0) {
				System.out.print(" foo");
			} if(i%5==0) {
				System.out.print(" bar");
			} if(i%7==0)	{
				System.out.print(" baz");
			}
		}
	}

}
