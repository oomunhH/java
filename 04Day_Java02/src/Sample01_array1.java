
public class Sample01_array1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num;
		int sum=0;
		num=new int[5];
		num[0]=10;
		num[1]=20;
		num[2]=30;
		num[3]=40;
		//num[4]=50;
		
		System.out.println(num[0]);
		System.out.println(num[1]);
		System.out.println(num[2]);
		System.out.println(num[3]);
		System.out.println(num[4]);
		System.out.println("배열길이는 "+num.length);
		for (int i = 0; i < num.length; i++) {
			System.out.println(">>"+num[i]);
		    sum=sum+num[i];	
		}
		System.out.println("총합="+sum); //총합
		System.out.println("평균="+sum/num.length);
		
		int sum_2=0;
		//foreach 문
		for(int x : num) {
			System.out.println(x);
			sum_2=sum_2+x;
		}
		System.out.println("for each 총합==="+sum_2);
	}

}
