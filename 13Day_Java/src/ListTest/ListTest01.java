package ListTest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("세종");
		
		List<String> list2=
					Arrays.asList("홍길동","이순신","세종","세종");
		System.out.println(list);
		System.out.println(list2);
	}

}
