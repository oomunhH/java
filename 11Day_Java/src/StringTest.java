
public class StringTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a="hello";
		String b="hello";
				System.out.println("a==b는 "+(a==b));
				System.out.println("a.equals(b)는 "+a.equals(b));

		String c=new String("hello");
		String d=new String("hello");
			System.out.println("c==d는 "+(c==d));
			System.out.println("c.equals(d)는 "+c.equals(d));
			
		String e="홍길동,이순신,강감찬";
		String[] names=e.split(",");
		for(String i:names) {
			System.out.println(i);
		}
		

	}

}
