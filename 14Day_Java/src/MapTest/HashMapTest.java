package MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, String> map=new HashMap<String,String>();
		map.put("one", "홍길동");
		map.put("one", "강감찬");
		map.put("name", "홍길동");
		map.put("age", "20");
		map.put("address", "서울");
		map.put("email", null);
		
		System.out.println("이름은 :"+map.get("name"));
		System.out.println("나이는 :"+map.get("age"));
		System.out.println("주소는 :"+map.get("address"));
		System.out.println("email은 :"+map.get("email"));
		
		System.out.println("데이터의 크기(길이) ?"+map.size());
		System.out.println("데이터가 비어있나 ?"+map.isEmpty());
		System.out.println("age key가 있나?"+map.containsKey("age"));
		System.out.println("홍길동 값이 있나?"+map.containsValue("홍길동"));
		System.out.println("삭제 전 전체 데이터 출력 :"+map);
		System.out.println("age key에 해당하는 데이터 삭제");
		map.remove("age");
		
		System.out.println("삭제 후 전체 데이터 출력 :"+map);
		
		Set<String>	keys=map.keySet();
		for(String key:keys) {
			System.out.println(key+"="+map.get(key));
		}
		
		Iterator<String> ite=keys.iterator();
		while(ite.hasNext()) {
			String key=ite.next();
			System.out.println(key+"\t"+map.get(key));
		}
	}

}
