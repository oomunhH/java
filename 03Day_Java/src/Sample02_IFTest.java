import java.util.Scanner;

public class Sample02_IFTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		//1. 단일 if문
//		System.out.println("문장1");
//		int num=0;
//		if(3==13) {
//			num=10;
//			System.out.println("문장2");
//			System.out.println("문장2-1");
//		}
//		System.out.println(num);
//		System.out.println("문장3");
//		
		// 2. if~else문
//		System.out.println("문장1");
//		int num=0;
//		if(3==3) {
//			num=3;
//			System.out.println("참");
//			System.out.println("참2");
//			System.out.println(num);
//		}else	{
//			System.out.println(num);
//			System.out.println("거짓");
//			System.out.println("거짓2");
//		
//		}
//		System.out.println(num);
//		System.out.println("문장3");

		// 3.다중 else if 문
		// 90이상 A 80이상 B 70이상 C 60이상 D 나머지 F
//				System.out.println("점수를 입력하시오");
//				Scanner scan=new Scanner(System.in);
//				int num=scan.nextInt();		
//				String grade=" ";
//				if(num>=90) {
//					System.out.println("A");
//					grade="A";
//				}else if(num>=70) {
//					System.out.println("C");
//					grade="C";
//				}else if(num>=80) {
//					System.out.println("B");
//					grade="B";
//				}else if(num>=60) {
//					System.out.println("D");
//					grade="D";
//				}else {System.out.println("F");
//				grade="F";
//				}
//				scan.close();
//				System.out.println("학점 : "+grade);
//		// 4. switch 문
//		System.out.println("점수를 입력하시오");
//		int num = 10;
//		switch (num) {
//		case 10:
//			System.out.println("10");
//			break;
//		case 20:
//			System.out.println("20");
//			break;
//		case 30:
//			System.out.println("30");
//			break;
//		case 40:
//			System.out.println("40");
//			break;
//		default:
//			System.out.println("default");
//			break;
//		}
//		System.out.println("프로그램 종료");
//	
//		char xxx2='F';
//		switch (xxx2) {
//		case 'A': System.out.println("A");
//			break;
//		case 'B': System.out.println("A2");
//			break;
//		case 'C': System.out.println("A3");
//			break;
//		case 'D': System.out.println("A4");
//			break;
//		default:
//			System.out.println("default");
//		}
//		System.out.println("문장3");
		char xxx2='F';
		if(xxx2=='A') {System.out.println("A");}
		else if(xxx2=='B') {System.out.println("A2");}
		else if(xxx2=='C') {System.out.println("A3");}
		else if(xxx2=='D') {System.out.println("A4");}
		else {System.out.println("default");
	
	}
	

	}
}
