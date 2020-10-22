package SetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetService {
	public Set<Person> getPersonSet() {
		Set<Person> set=new HashSet<Person>();
		Person kkk=new Person("유관순",17,"서울");
		set.add(kkk);
		set.add(new Person("홍길동",20,"서울"));
		set.add(new Person("이순신",44,"전라"));
		set.add(new Person("이순신",44,"전라"));
		return set;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetService service=new SetService();
		Set<Person> set1=service.getPersonSet();
		
		for (Person x : set1) {
			System.out.println(x);
		}
		
		Iterator<Person> iterator=set1.iterator();
		while(iterator.hasNext()) {
			Person p=iterator.next();
			System.out.println(p.getName());
		}
	}

}
