package com.test2;

public class Ex05_15 {
	public Ex05_15() {System.out.println("()생성자 호출");}
	public Ex05_15(String a) {System.out.println("(String a)생성자 호출");}
	public Ex05_15(int a) {System.out.println("(int a	)생성자 호출");}
	public void sum() {System.out.println("()호출");}
	public void sum(int a) {System.out.println("(int a)호출");}
	public void sum(String a) {System.out.println("(String a)호출");}
	public void sum(int b, String a) {System.out.println("(int b, String a)호출");}
	public void sum(String a,int b) {System.out.println("(String a, int b)호출");}
	public static void main(String[] args) {
		Ex05_15 test=new Ex05_15();
		Ex05_15 test1=new Ex05_15("홍길동");
		
		test.sum("홍길동");
		test.sum(100);
		
		
	}
	
}
