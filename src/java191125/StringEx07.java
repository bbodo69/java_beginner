package java191125;

public class StringEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i = new Integer(10);
		int ii = i.intValue();
		System.out.println(ii);
		
		Character c = new Character('c');
		char cc = c.charValue();
		System.out.println(cc);
		
		//Double, Boolean 등 모두 기본형으로 리턴해주는 메서드 존재
		
		int a = Integer.parseInt("123");
		Boolean.parseBoolean("true");
		Double.parseDouble("3.14");
		
		Integer.toString(100);
		//Double, Character, Boolean -> toString
		
		int x = 10;
		Object obj = x;
		System.out.println(obj.getClass());
	}

}
