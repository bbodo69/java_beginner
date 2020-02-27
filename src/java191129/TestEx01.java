package java191129;

public class TestEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "hello";
		System.out.println(str);
		char [] first = new char [str.length()];
		char [] ch = new char [str.length()];
		
		for(int i = 0 ; i < str.length() ; i++) {
			first[i] = str.charAt(i);
		}
		
		for(int i = 0 ; i < str.length() ; i++) {
			ch[i] = first[str.length()-(i+1)];
			System.out.print(ch[i]);
		}
				
	}

}
