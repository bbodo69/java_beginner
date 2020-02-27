package java191122;

public class ExceptionEx11 {

	static void method1() throws Exception{
		try {
		throw new Exception();
		}catch(Exception e) {
			System.out.println("method1에서 예외처리 완료");
			throw e;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		method1();
		}catch(Exception e){
			System.out.println("자꾸 미루네 예외처리를");
		}
	}

}
