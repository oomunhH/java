package Test06;

public class StudentTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu0=new Student();
		Student stu00=new Student("홍길동",15,171,81);
		Student stu01=new Student("한사람",13,183,72);
		Student stu02=new Student("임걱정",16,175,65);
		
		Student[] stu=new Student[3];
		stu[0]=stu00;
		stu[1]=stu01;
		stu[2]=stu02;
//		stu0.printAllstudent(stu);
//		System.out.println("평균 몸무게: "+stu0.getWeightAvg(stu));
//		System.out.println("평균 키: "+stu0.getHeightAvg(stu));
//		System.out.println("평균 나이: "+stu0.getAgeAvg(stu));
		try{System.out.println(stu0.getAstudentInfo2(stu, "홍길동"));}
		catch(UserStudentException e1){System.out.println(e1.getMessage());}
		try{System.out.println(stu0.getAstudentInfo(stu, "홍길동"));}
		catch(UserStudentException e2) {System.out.println(e2.getMessage());

	}

		try{System.out.println(stu0.getAstudentInfo(stu, "한사람"));}
		catch(UserStudentException e6) {System.out.println(e6.getMessage());
	
		}

		try{System.out.println(stu0.getAstudentInfo(stu, "김길동"));}
		catch(UserStudentException e4) {System.out.println(e4.getMessage());
	
		}

		try{System.out.println(stu0.getAstudentInfo(stu, "한길동"));}
		catch(UserStudentException e8) {System.out.println(e8.getMessage());
		
		}

}
}