package Test01;

public class TestStudent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu00=new Student("홍길동",15,170,80);
		Student stu01=new Student("한사람",13,180,70);
		Student stu02=new Student("임걱정",16,175,65);
		
		Student[] stu=new Student[3];

		stu[0]=stu00;
		stu[1]=stu01;
		stu[2]=stu02;
		
		int MaxAge=stu[0].getAge();
		int MaxAgeI=0;
		
		for (int i = 0; i < stu.length; i++) {
			if(stu[i].getAge()>MaxAge) {
				MaxAgeI=i;
			}
		}
		System.out.println(stu[MaxAgeI].getResult());
		
	}

}
