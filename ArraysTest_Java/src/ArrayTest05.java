import java.util.Arrays;

public class ArrayTest05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] num= {22,1,3,5,2,4,11};
		Arrays.sort(num);
		for (int i : num) {
			System.out.println("정렬된 정수값"+i);
		}
	}

}
