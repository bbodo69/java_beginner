package java191119;

class AClass1{
	int x;
	void add() {
		System.out.println("AAAA");
	}
}

class BClass1 extends AClass1{
	int y;
	void add() { //�������̵� : AClass1 ���빰�� �ٲ�.
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
		double d = (double)i; 					//����ȯ ��������	
		
		AClass1 a = null;
		BClass1 b = new BClass1();
		a=(AClass1)b;								// ����ȯ ��������-> �⵶���� ���� ����.
		
		//AClass1 a = new BClass1();
		a.add();
		//a.sub(); 									//�Ұ���
		//a.y;											//�Ұ���
		
	}

}
