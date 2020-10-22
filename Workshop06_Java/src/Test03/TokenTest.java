package Test03;

import java.util.StringTokenizer;

public class TokenTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str="4,2,3,6,7";
		int sum=0;
		StringTokenizer st=new StringTokenizer(str, ",");
		while(st.hasMoreElements()) {
			String token=st.nextToken();
			int i=Integer.parseInt(token);
			sum+=i;
		}
		System.out.println(sum);
	}

}
