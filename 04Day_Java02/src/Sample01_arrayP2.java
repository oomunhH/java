
public class Sample01_arrayP2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int [] kor=new int[3];
		int [] eng=new int[3];
int [] kor= {100,80,80};

//		kor[0]=100;
//		kor[1]=80;
//		kor[2]=80;
		eng[0]=90;
		eng[1]=75;
		eng[2]=60;
		int sum_k=0;
		int sum_e=0;
		
		for (int i = 0; i < eng.length; i++) {
			sum_k=sum_k+kor[i];
			sum_e=sum_e+eng[i];
						
		}
		System.out.println(sum_k/kor.length);
		System.out.println(sum_e/eng.length);
		
		
	}

}
