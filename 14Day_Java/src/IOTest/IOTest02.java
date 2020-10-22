package IOTest;

import java.io.IOException;
import java.io.InputStream;

public class IOTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		byte[] b=new byte[5];
		System.out.println("데이터 입력:");
		InputStream is=System.in;
		try {
			int n=is.read(b);
			for (byte c : b) {
				System.out.print((char)c);
			}
			
		}catch(IOException e) {
			e.printStackTrace();
		}finally {
			try {
				if(is!=null) is.close();
				
			}catch(IOException e) {
				e.printStackTrace();
			}
		
		}
	}

}
