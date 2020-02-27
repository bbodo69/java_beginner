package java191125;

public class StringEx03 {
	
	static String s;					//참조형 클래스 변수 : 초기값 없이 선언하면 null
	static String s2 = "";			//

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "Apple Tree";
		System.out.println(a.toLowerCase());
		System.out.println(a.toUpperCase());
		
		for (int i = 1 ; i < 10; i++) {
			s += i;
			s2 += i;
		}
		System.out.println(s);
		System.out.println(s2);
		
		char [] c = new char[0];
		String str = new String(c);
		
		int value = 100;
		// #1. int -> String
		String v = String.valueOf(value);
		System.out.println(value);
		System.out.println(v);
		
		// #2. 
		int value2 = 100;
		String v2 = value2 + "";
		String v3 = value+""+value2;
		
	}

}
