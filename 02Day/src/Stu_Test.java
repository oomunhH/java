
public class Stu_Test {
	String name; //멤버변수 (객체생성 필요), 객체정보저장(한명한명의 정보를 넣어줄때), 초기값 넣어 줄 필요없다.
	int age;
	//printInfo 함수 만들기 (class단에)
	public void printInfo() { //멤버메소드, 객체생성, 호출사용, 동작관련
		int num=1;//로컬변수 함수 안에 들어있으므로
		num=num+10;
		System.out.println("printInfo() num====="+num);
		System.out.println(name+":"+age);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stu_Test st_1=new Stu_Test();
//		System.out.println(st_1);
		st_1.name="홍길동";
		st_1.age=25;
		st_1.printInfo();
		Stu_Test st_2=new Stu_Test();
//		System.out.println(st_2);
		st_2.name="에이콘";
		st_2.age=20;
		st_2.printInfo();
		
	}
}		