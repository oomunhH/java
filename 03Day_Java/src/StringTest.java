
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//1. new 사용
//서로 글씨는 같으나 다른 주소를 가지고 있다 == 사용시 주소가 같은지 비교하는 것이다.
//글씨가 같은지 안의 내용을 비교하기 위해서는 *변수명.equals(비교할변수명)
		String s=new String("hello");
		String s2=new String("hello");
		System.out.println(s==s2);
		boolean result=s.equals(s2);
		System.out.println(result);
		
		//2. 
		//hello라는 글자의 주소를 가지고 있다.
		//but true나오는 이유, hello 같은 주소를 가지고 있다.
		String n="hello";
		String n2="hello";
		System.out.println(n==n2);
		System.out.println(n.equals(n2));
		
		//3.
	}

}
