package java191122;

public class EeptionEx09 {
//	#1.
//	static void add() {
//		
//		try {
//			Exception e = new Exception();
//			throw e;
//		}
//		catch(Exception e) {
//			System.out.println("���ܹ߻�");
//		}		
//	}
		static void add() throws Exception {
			Exception e = new Exception();
			throw e;
		}
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		#1.
//		add();
		try {
		add();
	}catch(Exception e) {
		System.out.println("ȣ���� ������ ����ó��");
	}

}
}
