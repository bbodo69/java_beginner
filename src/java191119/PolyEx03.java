package java191119;

class AClass3{
	int x;
	void add() {
		System.out.println("AAAA");
	}
}

class BClass3 extends AClass3{
	int y;
	void add() { //�������̵� : AClass1 ���빰�� �ٲ�.
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
		
		a = (AClass3)b; //upcasting : �θ�� ����ȯ
		b2 = (BClass3)a; //downcasting :�ڽ����·� ����ȯ
		
		a.add();
		b2.add();
		
	}

}
