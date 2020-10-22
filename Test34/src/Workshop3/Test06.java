package Workshop3;

import java.util.Scanner;

public class Test06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		int n=4;
		int[] arr=new int[n];
		arr[0]=scan.nextInt();
		arr[1]=scan.nextInt();
		arr[2]=scan.nextInt();
		arr[3]=scan.nextInt();
		int max=arr[0];
		for (int i = 0; i < arr.length; i++) {
			
			if(max>arr[i]) {}
			else {
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}
