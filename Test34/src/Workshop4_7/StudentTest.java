package Workshop4_7;
import java.lang.reflect.Array;



public class StudentTest{

 

	public static void main(String[] args) {

		Student stu1 = new Student("홍길동",15,170,80);

		Student stu2 = new Student("한사람",13,180,70);

		Student stu3 = new Student("임걱정",16,175,65);

		

		Student [] arrays = new Student[3];

		arrays[0]=stu1;

		arrays[1]=stu2;

		arrays[2]=stu3;

		

		System.out.println("이름"+"\t"+"나이\t신장\t몸무게");

		for (int i =0; i<arrays.length; i++) {

			System.out.println(arrays[i].studentInfo());

		}

		double ageavg = (double)(stu1.getAge()+stu2.getAge()+stu3.getAge())/3;

		System.out.println("나이 평균:"+ageavg);

		

		double heightavg = (double)(stu1.getHeight()+stu2.getHeight()+stu3.getHeight())/3;

		System.out.printf("신장 평균:%.3f",heightavg);

		

		double weightavg = (double)(stu1.getWeight()+stu2.getWeight()+stu3.getWeight())/3;

		

		System.out.printf("\n몸무게 평균:%.3f",weightavg);

		System.out.println();

		

		Student ad=null;

		int minage=stu1.getAge();

		int maxage=stu1.getAge();

		int maxAgeIndex =0;

		int minAgeIndex =0;

		int maxHeightIndex =0;

		int minHeightIndex =0;

		int maxWeightIndex =0;

		int minWeightIndex =0;

		

		

		for(int i = 1; i<arrays.length; i++) {

			//나이 최대 최소

			if(arrays[i].getAge()<minage) {

				minAgeIndex = i;

			}

			if(arrays[i].getAge()>maxage) {

				maxAgeIndex = i;

			}

			if(arrays[i].getHeight()<minage) {

				minHeightIndex = i;

			}

			if(arrays[i].getHeight()>maxage) {

				maxHeightIndex = i;

			}

			if(arrays[minWeightIndex].getWeight()<minage) {

				minWeightIndex = i;

			}

			if(arrays[minWeightIndex].getHeight()>maxage) {

				maxWeightIndex = i;

			}

			

			//신장최대최소

			//몸무게 최대최소 

		}

		System.out.println("몸무게가 가장 많이 나가는 학생은 "+arrays[maxWeightIndex].getName());

		System.out.println("몸무게가 가장 적게 나가는 학생은 "+arrays[minWeightIndex].getName());

	}

		

}