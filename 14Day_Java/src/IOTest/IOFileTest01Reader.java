package IOTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class IOFileTest01Reader {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("c:\\Test\\IOTest05.java");
		BufferedReader buffer=null;
		try {
			FileReader reader=new FileReader(f);
			buffer=new BufferedReader(reader);
			String data=buffer.readLine()	;
			while(data!=null) {
				System.out.println(data);
				data=buffer.readLine();
			}
		}catch(FileNotFoundException e	) {
			e.printStackTrace();
		}catch(IOException e	) {
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
