package java191128;

//스레드 클래스 만들기
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
	
		//th.run();			//일반 메서드 호출				- 싱글스레드에서 작업 실행
		th.start();			//스레드 생성하라고 호출		- 스레드가 새로 생성되서 멀티 스레드에서 작업 실행 
		ThreadEx th2 = new ThreadEx();
		th2.start();

		for(int i = 0 ; i < 1000; i++) {
			System.out.println("==");
		}
	}

}
