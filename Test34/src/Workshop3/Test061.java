package Workshop3;

import java.util.Scanner;

public class Test061 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		System.out.println("사람 수를 입력하시오.");
		int n=scan.nextInt();
		int[] arr=new int[n];
		for (int i = 0; i < arr.length; i++) {
			System.out.println((i+1)+"번째 사람의 키를 쓰시오.");
			arr[i]=scan.nextInt();
			System.out.println((i+1)+"번째 사람의 키:"+arr[i]+" cm");
		}
		int maxH=arr[0];
		for (int i = 0; i < arr.length; i++) {
			if(arr[i]>maxH) {
				maxH=arr[i];
			}
		}
		System.out.println("사람 수는 "+n+"명");
		System.out.println("최댓값은 "+maxH+" cm이다.");
	}

}
