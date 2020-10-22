package com.test;

class Sample01_overLoading {
	String name;
	int age;
	
	public Sample01_overLoading (String name) {
		this(name,19);
		System.out.println("person 생성자1");
	}
	
	public Sample01_overLoading(String name, int age) {
		this.name=name;
		this.age=age;
		System.out.println("person 생성자2");
	}
	public String getName() {return name;}
	public int getAge() {return age;}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sample01_overLoading p=new Sample01_overLoading("홍길동");
		Sample01_overLoading p1=new Sample01_overLoading("강감찬",20);
		Sample01_overLoading p2=new Sample01_overLoading("강감찬");
		System.out.println(p.getName()+"\t"+p.getAge());
		System.out.println(p1.getName()+"\t"+p1.getAge());
		System.out.println(p2.getName()+"\t"+p2.getAge());
	}

}
