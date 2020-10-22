
public class TestPet {

	public static void main(String[] args) {
		
		Cat c=new Cat("고양이",10);
		System.out.println(c);
		Pet c1=new Cat("고양이",13);
		System.out.println(c1);
		Movement c2=new Cat("고양이",15);
		Movement d=new Dog("멍멍이",17);
		System.out.println(c2);
		
		c.cry();
		c2.cry();
		Movement[] m=new Movement[2];
		m[0]=c2;
		m[1]=d;
		
		Cat cat=(Cat)m[0];
		System.out.println(cat.getName());
	}

}
