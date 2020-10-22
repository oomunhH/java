package com.service;

import java.util.HashSet;

import com.dao.OracleDAO;
import com.dao.Person;
//메인에서 oracleservice를 new하는 순간 기본생성자 dao 클래스 자동생성해서 지정(Main에서 dao에 있는 select를 호출할 것이다.)
public class OracleService {
	OracleDAO dao;
	
	public OracleService() {
		dao= new OracleDAO();
	}
	public HashSet<Person> select() {
		HashSet<Person> xxx=dao.select();
		return xxx;
	}
}
