package IOTest;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IOTest04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("데이터 입력");
		InputStream is=System.in;
		InputStreamReader reader=null;
		BufferedReader buffer=null;
		try {
			reader=new InputStreamReader(is);
			buffer=new BufferedReader(reader);
			String mesg=buffer.readLine();
			System.out.println(mesg);
			
		}catch(IOException e){
			e.printStackTrace();
		}finally {
			try {
				buffer.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
			
		}
	}

}
