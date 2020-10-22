package IOTest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class IOFileTest04Writer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("데이터를 입력하시오.");
		BufferedReader buffer=null;
		PrintWriter out=null;
		try {
			File f=new File("c:\\Test","IOTest05.java");
			buffer=new BufferedReader(new InputStreamReader(System.in));//console에 데이터 입력해서 in
			FileWriter writer=new FileWriter(f,true);//지정한 파일에 fileWriter 연결
			out=new PrintWriter(writer);//PrintWriter클래스타입의 out객체에 데이터를 저장
			out.println(buffer.readLine()+"\n");//콘솔에 입력한 글 파일에 입력,프린트
		} catch (IOException e) {
			e.printStackTrace();
			// TODO: handle exception
		}finally {
			try {
				if(buffer!=null)buffer.close();
				if(out !=null) out.close();
			} catch (Exception e) {
				e.printStackTrace();
				// TODO: handle exception
			}
		}
	}

}
