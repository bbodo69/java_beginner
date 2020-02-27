package java191119;

class AClass1{
	int x;
	void add() {
		System.out.println("AAAA");
	}
}

class BClass1 extends AClass1{
	int y;
	void add() { //오버라이딩 : AClass1 내용물만 바꿈.
		System.out.println("BBBB");
	}
	void sub() {
		System.out.println("SubSub");
	}
}

public class PolyEx04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 10;
		double d = (double)i; 					//형변환 생략가능	
		
		AClass1 a = null;
		BClass1 b = new BClass1();
		a=(AClass1)b;								// 형변환 생략가능-> 기독성을 위해 써줌.
		
		//AClass1 a = new BClass1();
		a.add();
		//a.sub(); 									//불가능
		//a.y;											//불가능
		
	}

}
