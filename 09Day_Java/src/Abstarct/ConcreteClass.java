package Abstarct;

public class ConcreteClass extends AbstractClass {

	public ConcreteClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConcreteClass(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("Con=========A");
	}

	@Override
	public int b() {
		// TODO Auto-generated method stub
		System.out.println("Con=========B");
		return 0;
	}

	@Override
	public void c(int x) {
		// TODO Auto-generated method stub
		System.out.println("Con=========c");
	}
	
}
