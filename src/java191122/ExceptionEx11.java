package java191122;

public class ExceptionEx11 {

	static void method1() throws Exception{
		try {
		throw new Exception();
		}catch(Exception e) {
			System.out.println("method1���� ����ó�� �Ϸ�");
			throw e;
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		method1();
		}catch(Exception e){
			System.out.println("�ڲ� �̷�� ����ó����");
		}
	}

}
