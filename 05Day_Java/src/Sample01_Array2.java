
public class Sample01_Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열 (비정방형)
		int[][] num=new int[2][]; //2행
		num[0]=new int[3];
		num[1]=new int[2]; //비정방형 생성
		int sum=0;
		 num[0][0]=10;
		 num[0][1]=20;
		 num[0][2]=30;
		 num[1][0]=40;
		 num[1][1]=50;
		 System.out.println(num[0].length);
		 System.out.println(num[1].length);
		 System.out.println(num.length);
		 int times=0;
		for (int i = 0; i < num.length; i++) {
			
			
			for (int j = 0; j < num[i].length; j++) {
				System.out.println(num[i][j]);
				sum+=num[i][j];
				times+=num[i].length;
			}
			
			
		}
		System.out.println("몇명="+times);
		
		 for(int[] i:num) {
			 for(int x :i) {
		 }
	}

}
}