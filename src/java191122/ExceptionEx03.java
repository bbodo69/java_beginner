package java191122;

public class ExceptionEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 100;
		int result = 0;
		for(int i = 0 ; i < 100; i ++) {
			try {
				result = num / (int)(Math.random()*10);
				System.out.println(result);
			}catch(Exception e) {
				System.out.println("0으로나눌 수 없습니다.");
			}
		}

	}

}
