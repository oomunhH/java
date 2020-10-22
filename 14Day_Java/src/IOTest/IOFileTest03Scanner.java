package IOTest;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class IOFileTest03Scanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		File f=new File("C:\\수업\\3.JAVA\\new source\\14Day\\src\\IOTest","IOFileScannerTest03.java");
		Scanner scan=null;
		try {
			scan=new Scanner(f);
			while(scan.hasNext()) {
				System.out.println(scan.nextLine());
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}finally {
			if(scan!=null)scan.close();
		}
	}

}
