package Throws;
class SuperClass{
	public void a() throws NullPointerException{}
	public void b() throws Exception{}
	public void c() throws ArithmeticException{}
	
}
class SubClass extends SuperClass{

	@Override
	public void a() throws NullPointerException {
		// TODO Auto-generated method stub
		super.a();
	}

	@Override
	public void b() throws Exception {
		// TODO Auto-generated method stub
		super.b();
	}

	@Override
	public void c() throws ArithmeticException {
		// TODO Auto-generated method stub
		super.c();
	}
	
}
public class ThrowsInherit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
