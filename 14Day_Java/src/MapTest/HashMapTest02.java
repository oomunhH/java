package MapTest;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Set;

public class HashMapTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Person> map=new HashMap<String,Person>();
		map.put("one", new Person("홍길동",20,"서울"));
		map.put("two", new Person("유관순",19,"서울"));
		map.put("three", new Person("이순신",44,"전라"));
		
		System.out.println(map.get("one").getName());
		Person one=map.get("one");
		System.out.println(one.getName());
		
		System.out.println("=====세명의 이름 모두 출력(keySet)=====");
		Set<String> keys=map.keySet();
		for (String s : keys) {
			Person p=map.get(s);
			System.out.println(p.getName());
		}
		System.out.println("=====세명의 이름 모두 출력(iterator)=====");
		Iterator<String> ite=keys.iterator();
		while(ite.hasNext()) {
			String s=ite.next();
			Person p=map.get(s);
			System.out.println(s+"="+p.getName());
		}
	}

}
