package java191118;

class A2{
	public A2() {
		System.out.println("������ A");
	}
	public A2(int x) {
		System.out.println("������ A - param : " + x);
	}
	
}

class B2 extends A2{
	public B2() {
		System.out.println("������ B");
	}
	public B2(int x) {
//		super(x);
		this();
		System.out.println("������ B - param" + x);
	}
}

public class InheritEx07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B2 b2 = new B2(100);
		System.out.println(b2);
	}

}
