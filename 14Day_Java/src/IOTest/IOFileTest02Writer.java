package IOTest;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class IOFileTest02Writer {

	public static void main(String[] args) {
			
			File f=new File("c:\\Test\\IOTest05.java");
			PrintWriter out=null;
			try {
				FileWriter writer=new FileWriter(f,true);
				out=new PrintWriter(writer);
				out.print("happy");
			}catch(IOException e) {
				e.printStackTrace();
			}finally {
				out.close();
			}
	}

}
