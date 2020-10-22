import java.util.Arrays;

public class ArrayTest03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] fruits= {"사과","배","수박","바나나"};
		Arrays.fill(fruits,0,2,"딸기");
		for (String fruit : fruits) {
			System.out.println("fruit:  "+fruit
					);
		}
	}

}
