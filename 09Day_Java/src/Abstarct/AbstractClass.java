package Abstarct;

public abstract class AbstractClass {
	private int num;
	public abstract void a();
	public abstract int b();
	public abstract void c(int x);
	//세가지함수는 반드시 구현을 하라(상속받은 클래스에서)
	
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public AbstractClass() {
		super();
		// TODO Auto-generated constructor stub
	}
	public AbstractClass(int num) {
		super();
		this.num = num;
	}	

	
		
}
