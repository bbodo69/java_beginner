package java191119;
//추상 클래스

abstract class SuperClass{
		//추상 매서드 : 매서드 선언부만 작성하고 ; 으로 끝맺음.
	abstract void add();
		
	int a = 10;
	void func() {
		System.out.println("추상클래스");
	}
	
}

class SubClass extends SuperClass{
	void add() {											//추상 클래스를 구현안해주면 클래스에 오류가 생김.
		
	}
}

public class AstractEx01 {

	public static void main(String[] args) {

		SubClass s = new SubClass();
		s.add();
		
//		SuperClass s1 = new SuperClass();					//추상메소드라서 되지 않음.
//		s1.add();													//
		
	}

}
