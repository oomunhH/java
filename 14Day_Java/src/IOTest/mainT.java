package IOTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class mainT {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Path newFile= Paths.get("c:\\Test1\\xxx.txt");
		Path xx2=null;
//		try {
//			xx2= Files.createFile(newFile);			
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
	
//		//파일 디렉토리 삭제
//		try {
//			Files.delete(newdir);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		xx2= Paths.get("c:\\Test1\\xxx.txt");
//		try {
//			Files.deleteIfExists(xx2);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		//파일 또는 디렉토리 복사
				Path original = Paths.get("c:\\Test\\IOTest05.java");
				Path copy= Paths.get("c:\\Test\\IOTest05Copy.java");
				
				try {
					Path yyy= Files.copy(original, copy, StandardCopyOption.REPLACE_EXISTING);
					System.out.println(yyy);
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}		
	}

}
