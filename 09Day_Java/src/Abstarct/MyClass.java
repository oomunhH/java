package Abstarct;

abstract class MyClass {
	int num=3;

	public MyClass() {
		super();
		// TODO Auto-generated constructor stub
	}

	public MyClass(int num) {
		super();
		this.num = num;
	}
	public void methodA() {
		System.out.println("methodA");
	}
	public abstract void methodB();
}

class MyClassImp1 extends MyClass{
	public void print() {
		System.out.println();
	}

	@Override
	public void methodB() {
		// TODO Auto-generated method stub
		
	}
	
public class Ex07_1{
	public void main(String[] args) {
		
		MyClassImp1 imp=new MyClassImp1();
		imp.print();
		imp.methodB();
	}
}
}
