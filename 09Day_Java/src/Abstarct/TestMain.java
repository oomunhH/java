package Abstarct;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AbstractClass x=new ConcreteClass(100);
		ConcreteClass y=new ConcreteClass(100);
		System.out.println(y.getNum());
		y.a();
		int n=y.b();
		y.c(100);

		AbstractClass z1=new ConcreteClass2(100);
		ConcreteClass2 z2=new ConcreteClass2(100);
		System.out.println(y.getNum());
		z2.a();
		int i=z2.b();
		z2.c(100);
		
		
	}

}
