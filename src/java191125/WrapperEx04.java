package java191125;

public class WrapperEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(Character.toLowerCase('A'));

		char c1 = '4', c2 = 'F';
		if(Character.isDigit(c1))	System.out.println(c1+"는 숫자");
		if(Character.isAlphabetic(c2)) System.out.println(c2+"는 영문자");
		
		boolean b = 4>3;
		System.out.println(b);
		
		int n = 10;
		Integer intObj = n;				//박싱
		System.out.println(intObj);
		
		int m = intObj + 10;				//언박싱
		System.out.println(m);
		
		
		
		
		
		
		
	}

}
