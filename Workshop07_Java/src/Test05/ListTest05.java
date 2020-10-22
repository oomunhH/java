package Test05;

import java.util.ArrayList;

public class ListTest05 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list1=new ArrayList<Integer>();
		ArrayList<Integer> list2=new ArrayList<Integer>();
		
		for (int i = 0; i < 10; i++) {
			int num1=(int)(Math.random()*10);
			list1.add(num1);
			int num2=(int)(Math.random()*10);
			list2.add(num2);
		}
		for (int j = 0; j < 10; j++) {
			double remainder=0;
//			if(list2.get(j)==0) {
		try {						
			remainder=list1.get(j)/list2.get(j);
			System.out.println(j+"번째 나눗셈 한 결과:"+remainder);
//			throw new ArithmeticException(j+"번째 분모는 0입니다.");
		}						
		catch(Exception e) {
			System.out.println("분모는 0이다");		
		}		
//		}else {remainder=(double)list1.get(j)/list2.get(j);
//		System.out.println(j+"번째 나눗셈 한 결과:"+remainder);}
	}
	}

}
