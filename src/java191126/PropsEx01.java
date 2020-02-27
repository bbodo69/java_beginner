package java191126;

import java.util.Enumeration;
import java.util.Properties;

public class PropsEx01 {

	public static void main(String[] args) {

		Properties prop = new Properties();
		
		prop.setProperty("language", "korea");		//(String name, String property)
		prop.setProperty("time", "16:20");
		prop.setProperty("subject", "java");
		
		// name들 가져오기
		Enumeration enu= prop.propertyNames();		//keySet();
		while(enu.hasMoreElements()) {
			String ele = (String)enu.nextElement();
			System.out.println(ele + " : " + prop.getProperty(ele));
		}

	}

}
