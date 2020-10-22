package Workshop4_7;

public class Student2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student stu0=new Student("홍길동",15,170,80);
		Student stu1=new Student("한사람",13,180,70);
		Student stu2=new Student("임걱정",16,175,65);
	
		Student[] arrays=new Student[3];
		arrays[0]=stu0;
		arrays[1]=stu1;
		arrays[2]=stu2;
		int maxage=stu0.getAge();
		int minage=stu1.getAge();
		int maxageI=0;
		int minageI =0;
		for (int i = 0; i < arrays.length; i++) {
			if(arrays[i].getAge()<minage) {
				minageI=i;
			}
			if(arrays[i].getAge()>maxage) {
				maxageI=i;
			}
		}
		System.out.println(arrays[maxageI].getName());
		System.out.println(arrays[minageI].getName());
	}

}


