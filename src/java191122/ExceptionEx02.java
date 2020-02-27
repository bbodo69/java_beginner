package java191122;

public class ExceptionEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread [main] (Suspended (exception ArrayIndexOutOfBoundsException))	
//		ExceptionEx02.main(String[]) line: 9	

		try{
			System.out.println(args[0]);
//		}catch(ArrayIndexOutOfBoundsException e) {
		}catch(Exception e) {										//Exception 을 해 줄때 알아서 오류 정보를 보내줌.
			System.out.println("인수를 입력하세요");
			System.out.println(e);
		}
	}

}
