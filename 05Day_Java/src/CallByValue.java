
public class CallByValue {//call by value : 참조변수(주소를 가진애는 call by referenece)가 아닌 변수들)
		public void change(int num) {
			num=100;
			System.out.println("change num=="+num);
			
		}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num=1;
		System.out.println("호출전 num===="+num);
		CallByValue test=new CallByValue();
		test.change(num);
		System.out.println("호출 후====="+num);
	}

}
