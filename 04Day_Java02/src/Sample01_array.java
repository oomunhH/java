
public class Sample01_array {
	public void printArr(int[] receive) {
		System.out.println("printArr=====호출");
		for (int i = 0; i < receive.length; i++) {
			System.out.println(">>"+receive[i]);
			
		}
	}
	public void printForEach(int [] receive){
		System.out.println("printForeach=======호출");
		for(int i=0; i<receive.length;i++) {
			System.out.println(">>"+receive[i]);
		}
		
	}
	public static void main(String[] args) {
		System.out.println("main 함수 시행===========");
		Sample01_array test =new Sample01_array();

		
		// TODO Auto-generated method stub
		//1.배열 선언
		int [] num;
		
		//2.배열 생성
		num=new int[3];
	
		//3.배열 초기화
		num[0]=10;
		num[1]=20;
		num[2]=30;
		//num[3]=40;
		
		int [] num_1;
		
		//2.배열 생성
		num_1=new int[3];
	
		//3.배열 초기화
		num_1[0]=10;
		num_1[1]=20;
		num_1[2]=30;
		
		test.printArr(num);
		//test.printArr(num_1); // 인자에 넣어줄 값. class단에 receive인자가 1000을 받을것이다.
	
		test.printForEach(num);
		//test2.printForEach(num_1); // 인자에 넣어줄 값. class단에 receive인자가 1000을 받을것이다.
		System.out.println("main 함수 수행===========");
		
//		System.out.println(num[0]);
//		System.out.println(num[1]);
//		System.out.println(num[2]);
//		System.out.println("배열크기(길이)"+num.length);
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(">>"+num[i]);
//			
//		}
		
		
	}

}
