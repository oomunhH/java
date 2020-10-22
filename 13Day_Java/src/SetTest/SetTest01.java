package SetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person>	set=new HashSet<Person>();
		Person kkkk=new Person("유관순",17,"서울");
		set.add(new Person("홍길동",20,"서울"));
		set.add(new Person("이순신",44,"전라"));
		set.add(new Person("이순신",44,"전라"));
		set.add(kkkk);
		System.out.println(set);
		
		for (Person x : set) {
			System.out.println(x.getName());
		}
		Iterator<Person> iterator=set.iterator();
		while(iterator.hasNext()) {
			Person p=iterator.next();
			System.out.println(p.getName());
		}
	}

}
