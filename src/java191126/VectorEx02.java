package java191126;

import java.util.Vector;

public class VectorEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//#1. ���ƽ ��� x
		Vector v = new Vector();
		v.add("Apple");
		v.add("oRANGE");
		
		String tmp;
		for(int i = 0 ; i < v.size(); i++) {
			tmp = (String)v.get(i);
			System.out.println(tmp.toUpperCase());
		}
		
		//#2. ���ƽ ��� o
		Vector<String> vec = new Vector<String>();
		vec.add("Apple");
		vec.add("oRANGE");
		
		String temp;
		for(int i = 0 ; i < vec.size(); i++) {
			temp = vec.get(i);
			System.out.println(temp.toLowerCase());
		}
		
		//#3. ���׷��̵� ����
		for(String s : vec) {
			System.out.println(s.toLowerCase());
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
