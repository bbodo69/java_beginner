package java191118;

class A1{
	public A1() {
		System.out.println("������ A");
		}
	
	public A1(int x) {
		System.out.println("������ A = param");
	}
}

class B1 extends A1{
	public B1() {
		System.out.println("������ B");
	}
	public B1 (int x) {
		System.out.println("������ B - param");
	}
}


class InheritEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B1 b = new B1 (100); //��� �� ������ A, ���� �� ������ B - param
	}

}
