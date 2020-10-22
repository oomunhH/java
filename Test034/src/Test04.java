import java.util.Scanner;

public class Test04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		int num=scan.nextInt();
		int[]arr=new int[num];
		int maxH=arr[0];
		int i=0;
		for (i = 0; i < arr.length; i++) {
			arr[i]=scan.nextInt();
			if(maxH>arr[i]) {}
			else {maxH=arr[i];}
		}
		System.out.println("사람 수 :"+num);
		System.out.println("사람 1:"+arr[0]);
		System.out.println("사람 2:"+arr[1]);
		System.out.println("사람 3:"+arr[2]);
		System.out.println("사람 4:"+arr[3]);
		System.out.println("최댓값은 "+maxH+"입니다.");
	}

}
