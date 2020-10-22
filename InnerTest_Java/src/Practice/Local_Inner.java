package Practice;

public class Local_Inner {
	int a=10;
	private int b=20;
	static int c=30;
	
	public void info() {
		int size=100;
		
		class Inner{
			int d=40;
			public void print() {
				System.out.println(a);
				System.out.println(b);
				System.out.println(c);
				System.out.println(d);
				System.out.println(size);
			}
		}
		Inner inner=new Inner();
		inner.print();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Local_Inner outer=new Local_Inner();
		outer.info();
	}

}
