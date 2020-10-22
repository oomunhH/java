package com.service;

import com.dao.DBDAO;

public class DBService {
		
	DBDAO dao=null;
	//2.private으로 막고 자신이 static으로 자기자신 타입의 객체를 생성
	private static DBService service=new DBService();
	
	//3.public static(다른애가 가져갈 수 있도록 new없이 ) get메소드 만들기
	public static DBService getService() 
	{return service;}
	
	//1.기본생성자를 private으로 막는다.
	private DBService() {}
	
	public void setDAO(DBDAO dao) {
		this.dao=dao;
		dao.connect();
	}
	public void insert() {
		dao.insert();
	}
}

//값을 저장해주는곳?