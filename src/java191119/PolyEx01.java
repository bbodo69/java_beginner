package java191119;
//������

class A {
	int x;
}

class B extends A{
	double y;
}

public class PolyEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// ĳ����
//		int a = 10;
//		double d = a;
		
//		double d = 5.7;		//�ڼ� : ����, �Ǽ� �ΰ� ���� �ְ�
//		int a = (int)d ;    		//�θ� : Ÿ�� int �̹Ƿ� ������ ��밡��.
		
		//�޸� ���� ������ ���� ����ȯ
		A a = new A();
		B b = new B();
		
		//3. ������				// ������ ���������� �ڼ��� ��ü�� �����ϴ°�.
		A a1 = new B();
		System.out.println(a1.x); //��Ŭ������ ���� �ִ� x�� ��밡��.
		
		//double int 	: �⺻���� ����
		//B b1 = new A(); 	: �������� ����, �ڼ��� ����ü�� �����.
		
	}

}
