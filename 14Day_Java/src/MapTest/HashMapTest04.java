package MapTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class HashMapTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Person> map1=new HashMap<>();
		map1.put("one", new Person("홍길동",20,"서울"));
		map1.put("two", new Person("이순신",30,"전라"));
		map1.put("Three", new Person("유관순",40,"서울"));

		HashMap<String, Person> map2=new HashMap<>();
		map2.put("one", new Person("홍길동2",20,"서울2"));
		map2.put("two", new Person("이순신2",30,"전라2"));
		map2.put("Three", new Person("유관순2",40,"서울2"));
		
		ArrayList<HashMap<String, Person>> list=new ArrayList<>();
		list.add(map1);
		list.add(map2);
		
		
		
		for (HashMap<String, Person> map : list) {
			Set<String> keys=map.keySet();
			for (String key : keys) {
			Person p= map.get(key);				
			System.out.println(p.getName()+" "+p.getAge()+" "+p.getAddress());
			
		}}
	}

}
