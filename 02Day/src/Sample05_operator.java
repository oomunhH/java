
public class Sample05_operator {
//산술연산자 + - * / %
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n=10;
		int n2=3;
		System.out.println("n+n2="+(n+n2));
		System.out.println("n-n2="+(n-n2));
		System.out.println("n*n2="+(n*n2));
		System.out.println("n/n2="+(n/n2)); //int와 int가 계산이 되어서 3 (정수)
		System.out.println("n/3.0="+(n/3.0)); //int와 double이 계산 되어서 3.3333
		System.out.println("n%n2="+(n%n2));
	
		System.out.println(10+5);
		System.out.println(5-2);
		System.out.println(4*3);
		System.out.println(14/3);
		System.out.println(14/3.0);
		System.out.println(3.2/2);
		System.out.println(5%3);
	}

}
