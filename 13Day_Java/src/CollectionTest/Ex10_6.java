package CollectionTest;

import java.util.HashSet;
import java.util.Set;

public class Ex10_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<String> s=new HashSet<String>();
		s.add("홍길동");
		s.add("이순신");
		s.add("유관순");
		s.add("홍길동");
		s.add("홍길동");
//	System.out.println("ToString() 전체 출력:"+s);
//
//	for(String data:s) {
//		System.out.println("foreach전체 출력"+data);
//	}
//	System.out.println("Set의 데이터 갯수? "+s.size());
//	System.out.println("Set이 비어있나? "+s.isEmpty());
//	System.out.println("Set에 이순신 포함 여부? "+s.contains("이순신"));
//	System.out.println("===이순신 삭제 실행=== ");
//	s.remove("이순신");
//	for(String data:s) {
//		System.out.println("foreach전체 출력"+data);
//	}
//	Object [] xxx=s.toArray();
//	for (Object o : xxx) {
//		System.out.println(o);
//	}
	s.clear();
	System.out.println(s);
	
	}
	

}
