package ListTest;
import java.util.ArrayList;
import java.util.List;

public class Ex10_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list=new ArrayList<String>();
		list.add("홍길동");
		list.add("이순신");
		list.add("유관순");
		list.add("강감찬");
	
		System.out.println("수정하기 전 출력=="+list);
		
		//데이터 추가
		list.add("정도전");
		//데이터 수정
		list.set(0, "임꺽정");
		//인덱스를 이용한 데이터 삭제
		list.remove(3);
		//값을 이용한 데이터 삭제
		list.remove("이순신");
		
		System.out.println("수정한 후 출력======"+list);
}
}
