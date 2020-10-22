package SetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//출력하는 명령을 함수로 보내서 출력시키기
public class SetTest04 {
	
	public Set<Person> getPersonSet() {
		Set<Person> set=new HashSet<Person>();
		Person kkk=new Person("유관순",17,"서울");
		set.add(kkk);
		set.add(new Person("홍길동",20,"서울"));
		set.add(new Person("이순신",44,"전라"));
		set.add(new Person("이순신",44,"전라"));
		return set;
	}
	public void printPersonIterator(Set<Person> set) {
		Iterator<Person> iterator=set.iterator();
		while(iterator.hasNext()) {
			Person p=iterator.next();
			System.out.println(p.getName());
		}
	}
	public void printPersonForeach(Set<Person> set) {
		for (Person x : set) {
			System.out.println(x);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SetTest04 test=new SetTest04();
		Set<Person> set=test.getPersonSet();
		
		test.printPersonForeach(set);
		test.printPersonIterator(set);
		
	
	}

}
