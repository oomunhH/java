
public class Sample08_label {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//바깥에 있는 for문 전체를 A로 본다. A는 label
		A: 
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 4; j++) {
				System.out.println(i+"\t"+j);
				if(i==3)break A;
				
			}
			
		}
	}

}
