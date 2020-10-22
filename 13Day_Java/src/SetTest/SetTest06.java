package SetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//인자로 person을 받아와서 set에 Add를 해주는 함수
public class SetTest06 {
	Set<Person> set=new HashSet<Person>();
	
	
	
	public void addPersonSet(Person p) {
		set.add(p);
	}
	
	public Set<Person> getSet(){
		return set;
	}
	public Set<Person> getPersonSet() {
		
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
		SetTest06 test=new SetTest06();
		Set<Person> set=test.getPersonSet();
		
		test.printPersonForeach(set);
		test.printPersonIterator(set);
		
		test.addPersonSet(new Person("강감찬",55,"한국"));
		System.out.println(test.getSet());

	
	}

}
