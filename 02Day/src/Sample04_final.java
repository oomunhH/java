
public class Sample04_final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 상수 : 값 변경 불가, 상수 이름 정할 때 전부 대문자로 표시
		final int SIZE=100;
		System.out.println(SIZE);
		//SIZE=200; 값 변경 못한다. 에러
		
		int num=10;
		System.out.println(num);
		num=20;
		System.out.println(num);
	}

}
