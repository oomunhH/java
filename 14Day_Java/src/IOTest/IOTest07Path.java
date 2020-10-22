package IOTest;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class IOTest07Path {

	public static void main(String[] args) {
		Path path= Paths.get("c:\\Test");
		boolean exsits= Files.exists(path);
		System.out.println("folder exisit==="+ exsits);
		boolean readable=Files.isReadable(path);
		boolean writable = Files.isWritable(path);
		boolean executable= Files.isExecutable(path);
		System.out.println(readable+ "\t"+ writable+ "\t"+ executable);
		
		//파일 및 디렉토리 생성
		Path newdir= Paths.get("c:\\Test\\ccc");//디렉토리생성
//		try {
//			Path xxx= Files.createDirectories(newdir);
//			System.out.println("path ====="+ xxx);
//		}catch(IOException e) {
//			e.printStackTrace();
//		}
		Path newFile= Paths.get("c:\\Test\\xxx.txt");
		Path xx2= null;
		try {
			xx2= Files.createFile(newFile);			
		}catch(IOException e) {
			e.printStackTrace();
		}
	
		//파일 디렉토리 삭제
		try {
			Files.delete(newdir);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		xx2=Paths.get("c:\\Test\\xxx.txt");
		try {
			Files.deleteIfExists(xx2);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//파일 또는 디렉토리 복사
		Path original = Paths.get("c:\\Test\\IOTest.java");
		Path copy= Paths.get("c:\\Test\\IOTestCopy.java");
		
		try {
			Path yyy= Files.copy(original, copy, StandardCopyOption.REPLACE_EXISTING);
			System.out.println(yyy);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
