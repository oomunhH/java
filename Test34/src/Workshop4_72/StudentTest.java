package Workshop4_72;


public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student stu00 =new Student("홍길동",15,170,80);
		Student stu01 =new Student("한사람",13,180,70);
		Student stu02 =new Student("임걱정",16,175,65);
		Student[] stu=new Student[3];
		stu[0]=stu00;
		stu[1]=stu01;
		stu[2]=stu02;
		int sumA=0;		
		int sumH=0;		
		int sumW=0;
		
		System.out.println("이름\t나이\t키\t몸무게");
		for (int i = 0; i < stu.length; i++) {
			System.out.println(stu[i].studentInfo());
		sumA+=stu[i].getAge();
		sumH+=stu[i].getHeight();
		sumW+=stu[i].getWeight();
		}
		double avgA=(double)sumA/stu.length;
		double avgH=(double)sumH/stu.length;
		double avgW=(double)sumW/stu.length;
		
		System.out.printf("나이 평균:%.3f\n",avgA);
		System.out.printf("신장 평균:%.3f\n",avgH);
		System.out.printf("몸무게 평균:%.3f\n",avgW);
		
		int mxA=stu[0].getAge();
		int mnA=stu[0].getAge();
		int mxAI=stu[0].getAge();
		int mnAI=stu[0].getAge();
		int mxH=stu[0].getHeight();
		int mnH=stu[0].getHeight();
		int mxHI=stu[0].getHeight();
		int mnHI=stu[0].getHeight();
		int mxW=stu[0].getWeight();
		int mnW=stu[0].getWeight();
		int mxWI=stu[0].getWeight();
		int mnWI=stu[0].getWeight();
		for (int i = 0; i < stu.length; i++) {
			if(stu[i].getAge()>mxA) {
				mxAI=i;
			}
			if(stu[i].getAge()<mnA)	{
				mnAI=i;
			}

		}
		System.out.println("나이가 가장 많은 학생:"+stu[mxAI].getName());
		System.out.println("나이가 가장 적은 학생:"+stu[mnAI].getName());

	}
		
}
