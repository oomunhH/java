package Test02;

import java.util.List;

public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int size=10;
		MakeList makeList=new MakeList();
		makeList.makeArrayList(size);
		
		double avg=makeList.getAverage();
		System.out.println("평균값 :"+avg);
		
		List<Integer> list=null;
		list=makeList.getList();
		System.out.println(list);
	}

}
