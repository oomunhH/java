package com.dao;

import java.util.HashSet;

//객체 생성이 됐을 경우에 데이터 베이스에 접근해서 데이터를 꺼내올 때 쓰는 클래스
public class OracleDAO {
	public HashSet<Person> select() {
		HashSet<Person> set=new HashSet<Person>();
		set.add(new Person("홍길동",20,"서울"));
		set.add(new Person("이순신",44,"전라"));
		set.add(new Person("유관순",19,"한국"));
		return set;
	}
}
