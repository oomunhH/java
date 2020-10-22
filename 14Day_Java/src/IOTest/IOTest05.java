package IOTest;

import java.io.File;

public class IOTest05 {

	public static void main(String[] args) {
		
		
		// 파일입력/출력
		// 파일의 메타데이터 살펴보기
		// new File("디렉토리");
		// new File("파일명");
		// new File("디렉토리/파일명");
		// new File("디렉토리","파일명");
		
		//File f = new File("C:\\Users\\acorn\\IOTest.java");
		//File f = new File("c:\\Test","IOTest.java");
		File f1 = new File("c:\\Test","IOTest05.java");
		
//		System.out.println("파일크기: "+ f1.length());
//		System.out.println("파일이름: "+ f1.getName());
//		System.out.println("파일경로: "+ f1.getPath());
//		System.out.println("파일절대경로: "+ f1.getAbsolutePath());
//		System.out.println("파일이냐?: "+ f1.isFile());
//		System.out.println("디렉토리이냐?: "+ f1.isDirectory());
//		System.out.println("파일이 존재? "+ f1.exists());
//		System.out.println("실행가능하냐: "+ f1.canExecute());
//		System.out.println("write 가능?: "+ f1.canWrite());
//		System.out.println("read 가능?: "+ f1.canRead());
		//System.out.println(f.delete());
//		File f2 = new File("c:\\");
//		String[]s=f2.list();
//		for (String string : s) {
//			System.out.println(string);
//		}
		File f3=new File("c:\\bbb");
		f3.mkdir();
        f3.delete();
	}//end main
}//end class
