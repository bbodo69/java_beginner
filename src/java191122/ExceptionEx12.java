package java191122;

class SpaceException extends Exception{
	public SpaceException(String msg) {
		super(msg);
	}
}
class MemoryException extends Exception{
	public MemoryException(String msg) {
		super(msg);
	}
}
		

public class ExceptionEx12 {


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
		startInstall();	//��ġ
		copyFiles();		//��ġ���� ������ ����
		}catch(SpaceException s){
			System.out.println("�����޼��� : " + s.getMessage());
			System.out.println("������ Ȯ���� �Ŀ� �ٽ� ��ġ�Ͻñ� �ٶ��ϴ�.");
		}catch(MemoryException m) {
			System.out.println("�����޼��� : " + m.getMessage());
			System.gc();
			System.out.println("�ٽ� ��ġ�� �õ��ϼ���.");
		}finally {
			System.out.println("�������� ����");
			deleteTempFiles(); 	//�������� ����
		}
		
				
	}
	
	static void startInstall() throws SpaceException, MemoryException {
		if(!enoughSpace()) {
			throw new SpaceException("��ġ������ �����մϴ�.");
		}
		if(!enoughMemory()) {
			throw new MemoryException("�޸𸮰� �����մϴ�.");
		}
		
	}
	static void copyFiles() {}
	static void deleteTempFiles() {}
	static boolean enoughSpace() {
		//............
		return true;
	}
	static boolean enoughMemory() {
		//..............
		return true;
	}

}
