
public class Sample01_Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//2차원 배열
		//가. 배열선언
		int [][] num;
		//나. 배열생성
		num=new int [2][3]; //2행 3열
		num[0][0]=10;
		num[0][1]=20;
		num[0][2]=30;
		num[1][0]=40;
		num[1][1]=50;
		num[1][2]=60;
		int sum=0;
	
	
		System.out.println(num.length);
		System.out.println(num[0].length);
		for (int i = 0; i < num.length; i++) {
			for (int j = 0; j < num[i].length; j++) {
				System.out.println(num[i][j]);
				sum+=num[i][j];
			
				
			}
			System.out.println(sum);
			System.out.println("총합은="+sum);
	
			
		}
		
		
		sum=0;
		for (int[] i:num) {
			for(int j: i) {
				System.out.println(j);
				sum+=j;
			}
				
		}
		System.out.println("총합2은="+sum);
		System.out.println("총합2은="+sum/(num.length*num[0].length));
	}

	}
