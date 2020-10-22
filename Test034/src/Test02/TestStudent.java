package Test02;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu00 =new Student("Kim",100,90,95,89);
		Student stu01 =new Student("Lee",60,70,99,98);
		Student stu02 =new Student("Park",68,86,60,40);
		
		Student[] stu=new Student[3];
		stu[0]=stu00;
		stu[1]=stu01;
		stu[2]=stu02;
		
		
		
		for(Student i:stu) {
			System.out.println(i.getResult());
		}
	}

}
