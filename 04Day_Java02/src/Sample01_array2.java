
public class Sample01_array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num=new int[3];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num=new int[4]; //전에 만든 방은 없어지고 새로운 방이 만들어 지는 것이다.
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		for(int x:num) {
			System.out.print(x);}
		for (int i = 0; i < num.length; i++) {
			System.out.print(num[i]);}
			
		}
		
	}


