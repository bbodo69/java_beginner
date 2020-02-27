package java191128;

//#1. ������ Ŭ���� ����� : java.lang.Thread Ŭ���� ��ӹ޾� �����
class TimerThread extends Thread{
	int n = 0 ;
	
	//#2. run() �������̵�
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try{
				sleep(1000);              	//1�� ����
			}catch(InterruptedException e){
				e.printStackTrace();
				return;						//���ܰ� �߻��ϸ� ���� ����
			}	
		}
	}
}

public class ThreadEx01 {
	public static void main(String[] args) {

		//#3. ������ Ŭ���� ��ü ����
		TimerThread th = new TimerThread();
		//#4. ������ ����!!
		th.start();
	}
}
