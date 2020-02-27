package java191128;

class TimeRunnable implements Runnable{
	
	int n= 0;
	
	@Override
	public void run() {
		// 
		while(true) {
			System.out.println(n);
			n++;
			try{
				Thread.sleep(1000);              	//1초 재우기
			}catch(InterruptedException e){
				e.printStackTrace();
				return;						//예외가 발생하면 강제 종료
			}	
		}
	}
}

public class RunnableEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread th = new Thread(new TimeRunnable());
		th.start();
				
	}

}
