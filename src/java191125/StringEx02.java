package java191125;

public class StringEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String java = "java";
		String cpp = "c++";
		String cpp1;
		int result = java.compareTo(cpp);
		System.out.println(result);

		System.out.println("abcd"+1+true+0.10e-1+'e'+"efg");
		
		int j = 5;
		String a = "        abc                def          ";
		String b = a.trim();                  //공백을 제거 해줌
		System.out.println(a);
		System.out.println(b);
		
		String c = "class";
		char d = c.charAt(2);
		System.out.println(d);
		
		String a1 = new String("     C#    ");
		System.out.println(a1.contains("#"));
		
		a1=a1.replace("C#", "java");
		System.out.println(a1);
		
		String b1 = new String("java, jsp, spring");
		String [] str = b1.split(",");
		for(String s : str) System.out.println(s);
		for (int i = 0 ; i < str.length ; i++) {
			System.out.println(str[i]);
			
		}
		System.out.println("HTML\nCSS\nJavaScript\n");
		
	}

}
