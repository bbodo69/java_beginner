package java191108;

class Tv{
	boolean power = false;
	int vol = 0, ch = 1;
}

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Tv t;         //선언
		t = new Tv(); //생성(메모리 생성시점)
		
		//Tv t = new Tv();
		
		System.out.println(t.power);
		System.out.println(t.ch);
		System.out.println(t.vol);
		
		t.power = true;
		t.ch = 10;
		t.vol = 100;
		
		System.out.println(t.power);
		System.out.println(t.ch);
		System.out.println(t.vol);
		
		Tv t1 = new Tv();
		Tv t2 = new Tv();
		Tv t3 = new Tv();
		
		System.out.println(t1);
		System.out.println(t2);
		System.out.println(t3);
		// 패키지며, 클래스명 @ 객체고유번호
		
		t1.ch = 10;
		System.out.println(t1.ch);
		
		
		//같은 타입끼리 대입가능
		int a = 10;
		int b = 20;
		
		//Tv 라는 같은 타입이라 대입가능.
		t1 = t2;
		t2 = t1;
		
		}
		
	}


