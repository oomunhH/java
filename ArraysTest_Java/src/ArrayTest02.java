import java.util.Arrays;

public class ArrayTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] nums= {10,20,30};
		Arrays.fill(nums, 100);
		
		for (int num : nums) {
			System.out.println("fill 값"+num);
		}
	}

}
