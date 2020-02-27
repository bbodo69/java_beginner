package java191118;

class A1{
	public A1() {
		System.out.println("持失切 A");
		}
	
	public A1(int x) {
		System.out.println("持失切 A = param");
	}
}

class B1 extends A1{
	public B1() {
		System.out.println("持失切 B");
	}
	public B1 (int x) {
		System.out.println("持失切 B - param");
	}
}


class InheritEx06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		B1 b = new B1 (100); //衣引 葵 持失切 A, 陥製 匝 持失切 B - param
	}

}
