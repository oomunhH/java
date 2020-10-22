import java.util.Arrays;

public class ArrayTest06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String [] name= {"xMan","Alex","XMan","Bob","Curl","Flex","alex"};
		
		Arrays.sort(name);
		for (String n : name) {
			System.out.println("정렬된 이름:"+n);
			
		}
	
	}	

}
