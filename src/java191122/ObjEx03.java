package java191122;

public class ObjEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = "abc";
		String str2 = "abc";
		String str3;
		String str4 = new String("abc");
		String str5 = new String("abc");
//		str4 = "abc";
		System.out.println(str1);
		System.out.println(str2);
		System.out.println(str4);
		System.out.println(str5);
		
		if(str1==str2) {
			System.out.println("2121");
			
		}else {
			System.out.println("no");
		}
		if(str5==str4) {
			System.out.println("4545");
			
		}else {
			System.out.println("no");
		}
	}

}
