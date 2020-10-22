import java.util.Arrays;

public class ArrayTest07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] s= {"홍길동","이순신","유관순"};
		int index=Arrays.binarySearch(s, "이순신");
		System.out.println(index);
		
	}

}
