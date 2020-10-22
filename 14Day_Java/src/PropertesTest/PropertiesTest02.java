package PropertesTest;

import java.util.Properties;
import java.util.Set;

public class PropertiesTest02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties props=System.getProperties();
		
		Set<String> keys=props.stringPropertyNames();
		for (String key : keys) {
			System.out.println(key+"="+props.getProperty(key));
		}

	}

}
