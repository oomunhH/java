
public class Sample02_variable2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//*.1-2번 동시에 변수선언과 동시에 변수값 입력
		String name="홍길동";
		int age=20;
		String address="서울";
		char gender='남';
		boolean isMarried=false;
		float height=185.63F;
		double weight=78.25;
		
		System.out.println("이름은 "+name+" 나이 "+age+" 주소 "+address+
				" 성별 "+gender+" 결혼여부 "+isMarried+" 키 "+height+" 몸무게 "+weight);
		System.out.printf("이름은 %s 나이 %d 주소 %s 성별 %c 결혼여부 %b 키 %.2f 몸무게 %.2f"
				,name,age,address,gender,isMarried,height,weight);
	}

}
