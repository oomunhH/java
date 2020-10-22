package Test06;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu00=new Student("홍길동",15,171,81);
		Student stu01=new Student("한사람",13,183,72);
		Student stu02=new Student("임걱정",16,175,65);
		
		Student[] stu=new Student[3];
		stu[0]=stu00;
		stu[1]=stu01;
		stu[2]=stu02;
		double sumAge=0;
		double sumHeight=0;
		double sumWeight=0;
		for (int i = 0; i < stu.length; i++) {
			sumAge+=stu[i].getAge();
			sumHeight+=stu[i].getHeight();
			sumWeight+=stu[i].getWeight();
		}
		System.out.println(sumAge/stu.length);
		System.out.println(sumHeight/stu.length);
		System.out.println(sumWeight/stu.length);
	}

}
