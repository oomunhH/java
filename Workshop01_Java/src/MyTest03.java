
public class MyTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a='a';
		System.out.println(a);
		int z='z';
		System.out.println(z);
		int a1='A';
		System.out.println(a1);
		int z1='Z';
		System.out.println(z1);
		char ch='z';
		
		//소문자 a보다 크거나 같고 z보다 작거나 같거나 A보다 크거나 같거나 B보다 크거나 같다.
		boolean b=ch>='a' && ch<='z'|| ch>='A' && ch<='Z'; 
		System.out.println(b);
	}

}
