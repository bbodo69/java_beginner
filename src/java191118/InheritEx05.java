package java191118;

class A{
	A(){
		System.out.println("������ A");
	}
}

class B extends A{
	B(){
		System.out.println("������ B");
	}
}

class C extends B{
	C(){
		System.out.println("������ C");
	}
}
public class InheritEx05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		C c = new C();
	}

}
