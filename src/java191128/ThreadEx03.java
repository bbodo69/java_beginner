package java191128;

class TimeCheckTh extends Thread{
	public void run() {
		for(int i = 0 ; i < 100; i++) {
			System.out.println("||");
		}
		System.out.println("소요시간 2 : "+(System.currentTimeMillis() - ThreadEx03.startTime));
	}
}

public class ThreadEx03 {
	static long startTime = 0;
	
	public static void main(String[] args) {

		TimeCheckTh th1 = new TimeCheckTh();
		th1.start();
		startTime = System.currentTimeMillis();
		for(int i = 0 ; i < 100; i++) {
			System.out.println("===");
		}
		System.out.println("소요시간 1 : " 
		+ (System.currentTimeMillis()- ThreadEx03.startTime));
	}
}
