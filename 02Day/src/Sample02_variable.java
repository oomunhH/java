
public class Sample02_variable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//홍길동 20 성별(남) 결혼여부(false) 키(185.63) 체중(78.25)
        
		//1.변수선언 (메모리에 특정크기의 영역생성)
		String name;
		int age;
		String address;
		char gender;
		boolean isMarried;
		float height;
		double weight;
		
		//2.변수초기화 (값을 맨처음 설정하는 작업)
		name="홍길동";
		age=20;
		address="서울";
		gender='남';	
		isMarried=false;
		height=185.63F;
		weight=78.25;
		
		//3.출력
		System.out.println("String name="+name);
		System.out.println("int age="+age);
		System.out.println("string address="+address);
		System.out.println("char genger="+gender);
		System.out.println("isMarried="+isMarried);
		System.out.println("height="+height);
		System.out.println("weight="+weight);

			
	}

}
