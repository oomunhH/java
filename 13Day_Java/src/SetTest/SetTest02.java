package SetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

//함수로 만들어서 불러오고 객체 Set<Person>타입으로 만들어서 저장해서 실행

public class SetTest02 {

	public Set<Person> getPersonSet() {
		Set<Person>	set=new HashSet<Person>();
		Person kkkk=new Person("유관순",17,"서울");
		set.add(new Person("홍길동",20,"서울"));
		set.add(new Person("이순신",44,"전라"));
		set.add(new Person("이순신",44,"전라"));
		set.add(kkkk);
		
		return set;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest02 set=new SetTest02();
		Set<Person> set2=set.getPersonSet();
		
		for (Person x : set2) {
			System.out.println(x.getName());
		}
		Iterator<Person> iterator=set2.iterator();
		while(iterator.hasNext()) {
			Person p=iterator.next();
			System.out.println(p.getName());
		}
		System.out.println(set2);
	}

}
