package java191119;

class AClass3{
	int x;
	void add() {
		System.out.println("AAAA");
	}
}

class BClass3 extends AClass3{
	int y;
	void add() { //오버라이딩 : AClass1 내용물만 바꿈.
		System.out.println("BBBB");
	}
	void sub() {
		System.out.println("SubSub");
	}
}

public class PolyEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AClass3 a = null;
		BClass3 b = new BClass3();
		BClass3 b2 = null;
		
		a = (AClass3)b; //upcasting : 부모로 형변환
		b2 = (BClass3)a; //downcasting :자식형태로 형변환
		
		a.add();
		b2.add();
		
	}

}
