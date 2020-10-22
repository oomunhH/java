package IOTest;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class IOFileTest06Serial_out {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectOutputStream oos=null;
		try {
			Person p=new Person("홍길동",20,"서울");
			File f=new File("c:\\test","serial.dat");
			FileOutputStream fos=new FileOutputStream(f);
			oos=new ObjectOutputStream(fos);
			oos.writeObject(p);
			
		} catch (Exception e) {
			e.printStackTrace();// TODO: handle exception
		}finally {
			try {
				oos.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
