
public class Sample02_DoubleFor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("        짝수단 출력");
		for (int i = 2; i < 10; i+=2) 
		{	System.out.println("----"+i+"단 출력----");
			for (int j = 1; j < 10; j++) {
				System.out.println("    "+i+"x"+j+"="+i*j);
		//1번 for문 i, 2번 for문 j		
			}			
		}
	}

}
