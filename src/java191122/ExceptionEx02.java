package java191122;

public class ExceptionEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		Thread [main] (Suspended (exception ArrayIndexOutOfBoundsException))	
//		ExceptionEx02.main(String[]) line: 9	

		try{
			System.out.println(args[0]);
//		}catch(ArrayIndexOutOfBoundsException e) {
		}catch(Exception e) {										//Exception �� �� �ٶ� �˾Ƽ� ���� ������ ������.
			System.out.println("�μ��� �Է��ϼ���");
			System.out.println(e);
		}
	}

}
