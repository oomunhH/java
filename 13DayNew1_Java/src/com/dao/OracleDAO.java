package com.dao;

import java.util.HashSet;

//객체 생성이 됐을 경우에 데이터 베이스에 접근해서 데이터를 꺼내올 때 쓰는 클래스
public class OracleDAO {
	public HashSet<String> select() {
		HashSet<String> set=new HashSet<String>();
		set.add("홍길동");
		set.add("이순신");
		set.add("유관순");
		return set;
	}
}
