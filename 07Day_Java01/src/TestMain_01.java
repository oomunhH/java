
public class TestMain_01 {
	public void a(int...n) {
		for(int x:n) {
			System.out.println(x);
		}
	}
	public void c(String...n) {
		for(String x:n) {
			System.out.println(x);
		}
	}
	public static void b() {System.out.println("static 메소드");}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestMain_01 m = new TestMain_01();
		m.a(10);
		m.a(10,20);
		m.a(10,9,8);
		m.a(1,2,3,4,5);
		m.a(1,2,3,4,5,6);
		m.c("이순신","홍길동");
		b();
	}

}
