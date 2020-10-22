import java.util.Arrays;

public class ArrayTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] str= {"홍길동","이순신","유관순"};
		String[] str2=Arrays.copyOf(str, str.length);
		for (String name : str2) {
			System.out.println("이름:"+name);
		}
	}

}
