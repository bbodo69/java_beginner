package java191119;
//�߻� Ŭ����

abstract class SuperClass{
		//�߻� �ż��� : �ż��� ����θ� �ۼ��ϰ� ; ���� ������.
	abstract void add();
		
	int a = 10;
	void func() {
		System.out.println("�߻�Ŭ����");
	}
	
}

class SubClass extends SuperClass{
	void add() {											//�߻� Ŭ������ ���������ָ� Ŭ������ ������ ����.
		
	}
}

public class AstractEx01 {

	public static void main(String[] args) {

		SubClass s = new SubClass();
		s.add();
		
//		SuperClass s1 = new SuperClass();					//�߻�޼ҵ�� ���� ����.
//		s1.add();													//
		
	}

}
