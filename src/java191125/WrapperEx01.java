package java191125;

public class WrapperEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Integer i = new Integer(100);
		Integer i2 = new Integer(100);
		
		System.out.println(i == i2);					//래퍼런스 비교시 다른 객체
		System.out.println(i.equals(i2));				//값이 동일한 것이다.
		
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println(Integer.SIZE + "bit");
		System.out.println(Integer.TYPE);
	}

}
