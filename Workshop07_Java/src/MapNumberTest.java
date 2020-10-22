import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class MapNumberTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> map=new HashMap<>();
		map.put("일", 1);
		map.put("이", 2);
		map.put("삼", 3);
		map.put("사", 4);
		map.put("오", 5);
		map.put("육", 6);
		map.put("칠", 7);
		map.put("팔", 8);
		map.put("구", 9);
		map.put("십", 10);
		int sum=0;
		Set<String> keys=map.keySet();
		for (String key : keys) {
			sum+=map.get(key);
			
		}
		System.out.println("합계는:"+sum);
		sum=0;
		Iterator<String> ite=keys.iterator();
		while(ite.hasNext()) {
//			String key=ite.next();
			int number=map.get(ite.next());
//			System.out.println(map.get(key));
			System.out.println(map.get(ite.next()));
			sum+=number;
		}
		System.out.println("합계는:"+sum);
	}

}
