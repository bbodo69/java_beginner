package java191119;

class AClass5{
	int x;
	void add() {
		System.out.println("AAAA");
	}
}

class BClass5 extends AClass5{
	int y;
	void add() { //�������̵� : AClass1 ���빰�� �ٲ�.
		System.out.println("BBBB");
	}
	void sub() {
		System.out.println("SubSub");
	}
}

public class PolyEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AClass5 a = new BClass5();
		
		BClass b = null;
		
		if(a instanceof BClass5) {
			System.out.println("����ȯ ����");
		}else {
			System.out.println("����ȯ �Ұ���");
		}
		
	}

}
