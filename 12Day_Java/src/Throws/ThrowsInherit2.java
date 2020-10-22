package Throws;



public class ThrowsInherit2 {
	public static void a() {
		b();
		
	}
	public static void b() {
		int num=10;
		if(num==10) 
		try {throw new NullPointerException("NullPointerException 발생");
		} catch (Exception e) {
		System.out.println(e.getMessage());
//			e.getStackTrace();
		}
}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("프로그램 시작");
		a();
		System.out.println("프로그램 종료");
	}

}





