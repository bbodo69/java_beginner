package java191118;

class Super1{
	void func() {
		System.out.println("super!!");
	}
}
class Sub1 extends Super1{
	void func() { // --> �����, �ش��� �θ�.
		super.func();
		System.out.println("sub");			//�������̵�
	}
}

public class OverEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Sub1 s = new Sub1();
		s.func();
		//�������̵� �ϸ�, �θ��� �żҵ�� ���õǰ� �ڽ��� �żҵ尡 ȣ��ȴ�., �̰��� ���� ���ε�.
	}

}
