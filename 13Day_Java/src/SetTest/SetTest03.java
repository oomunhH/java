package SetTest;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
//Set<Person>객체는 메인에서 생성하여 함수로 보낸후에 똑같이 나오도록 실행

public class SetTest03 {

	public Set<Person> getPersonSet(Set<Person> set) {
	
		Person kkkk=new Person("유관순",17,"서울");
		set.add(new Person("홍길동",20,"서울"));
		set.add(new Person("이순신",44,"전라"));
		set.add(new Person("이순신",44,"전라"));
		set.add(kkkk);
		
		return set;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Person>	set=new HashSet<Person>();//Set<Person> 객체생성
		
		
		SetTest02 set1=new SetTest02(); //SetTest객체생성(함수 불러오기 위해서)
		Set<Person> set2=set1.getPersonSet();//받아온 값을 저장하기 위해서 객체생성
		
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
