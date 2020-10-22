package Abstarct;

public class ConcreteClass2 extends AbstractClass {
	
	public ConcreteClass2() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ConcreteClass2(int num) {
		super(num);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void a() {
		// TODO Auto-generated method stub
		System.out.println("Con2=========a()");
	}

	@Override
	public int b() {
		// TODO Auto-generated method stub
		System.out.println("Con2=========b()");
		return 0;
	}

	@Override
	public void c(int x) {
		// TODO Auto-generated method stub
		System.out.println("Con2=========c()");
	}

}
