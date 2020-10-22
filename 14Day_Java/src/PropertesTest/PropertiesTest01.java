package PropertesTest;

import java.util.Properties;

public class PropertiesTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties prop=new Properties();
		prop.setProperty("일", "홍길동");
		prop.setProperty("이", "유관순");
		prop.setProperty("삼", "강감찬");
		
		String one=prop.getProperty("일");
		System.out.println(one);
		System.out.println(prop.getProperty("이"));
		System.out.println(prop.getProperty("삼"));
	}

}
