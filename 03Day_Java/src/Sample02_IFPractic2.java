import java.util.Scanner;

public class Sample02_IFPractic2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//90이상 A 80이상 B 70이상 C 60이상 D 나머지 F
		System.out.println("점수를 입력하시오");
		Scanner scan=new Scanner(System.in);
		int num=scan.nextInt();		
		String grade=" ";
		if(num>=90) {
			System.out.println("A");
			grade="A";
		}else if(num>=70) {
			System.out.println("C");
			grade="C";
		}else if(num>=80) {
			System.out.println("B");
			grade="B";
		}else if(num>=60) {
			System.out.println("D");
			grade="D";
		}else {System.out.println("F");
		grade="F";
		}
		scan.close();
		System.out.println("학점 : "+grade);
	}

}
