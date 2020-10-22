package Emp;

import java.util.Date;

public class TestEmp {
	public void printEmp(Emp e) {
		System.out.println("printEmp 호출======");
		System.out.println(e.printInfo());
		if(e instanceof Man) {
			System.out.println(((Man) e).getDepart());
		}else if(e instanceof Eng) {
			System.out.println(((Eng) e).getSkill());
		}
	}
	
	public void printEmpArr(Emp[] emps) {
		for (Emp e:emps) {
		System.out.println(e.printInfo());
		if(e instanceof Man) {
			System.out.println(((Man) e).getDepart());
		}else if(e instanceof Eng) {
			System.out.println(((Eng) e).getSkill());
		}
		}
	}
	
	
	public Emp[] createEmpArr() {
		Emp man1=new Man("홍길동","영업부");
		Emp en1=new Eng("이순신","제조업");
		Emp en2=new Eng("강감찬","연구업");
		Emp[] emp=new Emp[3];
		emp[0]=man1;
		emp[1]=en1;
		emp[2]=en2;
		return emp;
	}
	
	public Emp searchChildData(Emp[] emp,String name) {
		Emp data=null;
		for (int i = 0; i < emp.length; i++) {
			if(emp[i].getName().equals(name)) {
				data=emp[i];
			}
		}
		return data;
	}
	public String searchChildDepart(Emp[] emp,String dept) {
		String name="";
		for (Emp i:emp) {
			if(i instanceof Man) {
				Man man=(Man)i;
			if(man.getDepart().equals(dept)) {
				name+=i.getName()+"/";
			}
			}
		}
		return "검색결과: "+name;
	}
	
	
	public static void main(String[] args) {
		Emp e=new Emp("홍길동");
		System.out.println(e);
		Emp m=new Man("이순신","영업부");
		System.out.println(m);
		
		Emp man1=new Man("홍길동","영업부");
		Emp en1=new Eng("이순신","제조업");
		Emp en2=new Eng("강감찬","연구업");
		Emp man2=new Man("이완용","영업부");
		Emp[] emp=new Emp[4];
		emp[0]=man1;
		emp[1]=en1;
		emp[2]=en2;
		emp[3]=man2;
		TestEmp test=new TestEmp();
//		test.printEmpArr(test.createEmpArr());
//		test.printEmp(test.searchChildData(emp,"홍길동"));
		System.out.println(test.searchChildDepart(emp,"영업부"));
//		System.out.println(man1.printInfo());
//		System.out.println(en1.printInfo());
		
//		test.printEmp(man1);
//		test.printEmp(en1);
//		test.printEmp(en2);
//		test.printEmpArr(emp);
		
		Date d=new Date();
		System.out.println(d);
		//참조변수만 넣을 시 jdk가 자동으로 d.toString()으로 변환. (주소가 아니라 날짜가 출력됨)
		System.out.println(d.toString());
		
		
	}

}
