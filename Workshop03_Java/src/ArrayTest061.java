import java.util.Scanner;

public class ArrayTest061 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("키의 최댓값을 구합니다.");
		int [] height=new int [3];
		int max=0;
		int num=0;
//		num=scan.nextInt();
		height[0]=scan.nextInt();
		height[1]=scan.nextInt();
		height[2]=scan.nextInt();
		//height[3]=scan.nextInt();
		for (int i = 0; i < height.length; i++) {
			max=(height[0]>height[1])?
					((height[0]>height[2])?height[0]:height[2]):((height[1]>height[2])?height[1]:height[2]);
		};
//		System.out.println("사람 수 : "+num);
		System.out.println("사람 1 : "+height[0]);
		System.out.println("사람 2 : "+height[1]);
		System.out.println("사람 3 : "+height[2]);
//		System.out.println("사람 4 : "+height[3]);
		System.out.println("최대값은 "+max+"입니다.");
	}

}
