
public class Bank {
		private static Bank b=new Bank();//2.static 변수 private선언하고 내부에서 하나의 객체생성
		private Bank() {}
		public static Bank getBank() {//1.생성자를 private 지정, 다른 클래스에서 객체 생성 안됨(new x)
			return b; //3.생성한 객체를 리턴(필요한 곳에서 return 해서 사용할 것이다.)
			//Bank 참조변수=Bank.getBank()로 얻어서..
	}
		public String getName() {
			return "xx은행";
		}
}
