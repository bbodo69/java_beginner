package java191128;

//������ Ŭ���� �����
class ThreadEx extends Thread{
	@Override
	public void run() {
		
		for(int i = 0 ; i < 1000; i++) {
			System.out.println("a");
		}
	}
	
}
public class ThreadEx02 {
	public static void main(String[] args) {

		ThreadEx th = new ThreadEx();
	
		//th.run();			//�Ϲ� �޼��� ȣ��				- �̱۽����忡�� �۾� ����
		th.start();			//������ �����϶�� ȣ��		- �����尡 ���� �����Ǽ� ��Ƽ �����忡�� �۾� ���� 
		ThreadEx th2 = new ThreadEx();
		th2.start();

		for(int i = 0 ; i < 1000; i++) {
			System.out.println("==");
		}
	}

}
