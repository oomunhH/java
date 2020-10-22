package Test05;
//0.두개의 배열을 생성하고   RandomService 클래스의 makeRandomInt()에 각각 넘겨 랜덤한 숫자를 add 받아옴.
//1.printArrList()에게 두개의 ArrayList를 넘겨 나누고 결과 출력
import java.util.ArrayList;

public class ListTest05New01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			int num1=(int)(Math.random()*10);
			list1.add(num1);
			int num2=(int)(Math.random()*10);
			list2.add(num2);
		}
	}

}
