package java191126;

import java.util.Iterator;
import java.util.Vector;

public class MyTest01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Vector<String> v = new Vector<String>();
		v.add("�ȳ�");
		v.add("�ȳ�1");
		v.add("�ȳ�2");
		
		
		System.out.println(v.size());
		System.out.println(v);
		
		Iterator<String> it = v.iterator();
		while(it.hasNext()) {
			int n = it.next();
		}
	
	}

}
