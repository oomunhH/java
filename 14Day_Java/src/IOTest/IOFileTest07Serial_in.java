package IOTest;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class IOFileTest07Serial_in {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ObjectInputStream ois=null;
		try {
			
			File f=new File("c:\\test","serial.dat");
			FileInputStream fis=new FileInputStream(f);
			ois=new ObjectInputStream(fis);
			Person p=(Person)ois.readObject();
			System.out.println(p.getName()+"\t"+p.getAge()+"\t"+p.getAddress());
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				ois.close();
			}catch(IOException e) {
				e.printStackTrace();
			}
		}
	}

}
