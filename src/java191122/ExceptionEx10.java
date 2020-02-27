package java191122;

public class ExceptionEx10 {

	static void method1() throws Exception{
		method2();
	}
	static void method2() throws Exception{
		throw new Exception();
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		method1();
		}catch(Exception e) {
			System.out.println("Ã³¸®");
			e.printStackTrace();
		}
	}
}
