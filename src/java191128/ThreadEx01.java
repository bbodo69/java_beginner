package java191128;

//#1. 스레드 클래스 만들기 : java.lang.Thread 클래스 상속받아 만들기
class TimerThread extends Thread{
	int n = 0 ;
	
	//#2. run() 오버라이딩
	@Override
	public void run() {
		while(true) {
			System.out.println(n);
			n++;
			try{
				sleep(1000);              	//1초 재우기
			}catch(InterruptedException e){
				e.printStackTrace();
				return;						//예외가 발생하면 강제 종료
			}	
		}
	}
}

public class ThreadEx01 {
	public static void main(String[] args) {

		//#3. 스래드 클래스 객체 생성
		TimerThread th = new TimerThread();
		//#4. 스래드 시작!!
		th.start();
	}
}
