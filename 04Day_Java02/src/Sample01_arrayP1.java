
public class Sample01_arrayP1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] kor=new int[3];
		int [] eng=new int[3];
		
		kor[0]=100;
		kor[1]=80;
		kor[2]=80;
		eng[0]=90;
		eng[1]=75;
		eng[2]=60;
		int sum_k=0;
		int sum_e=0;
		
		for(int x: kor) {
			sum_k=sum_k+x;
			
		}
		for(int x: eng) {
			sum_e=sum_e+x;
			
		}
		System.out.println(sum_k/kor.length);
		System.out.println(sum_e/eng.length);
		
	}

}
