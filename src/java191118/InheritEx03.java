package java191118;

class S01{ //a, func01()
	int a = 10;
	void func01() {System.out.println("s01");}
}

class S02 extends S01{ // a, x, func01(), f()
	int x = 100;
	void foo() {
		System.out.println("foo");
	}
	void f() {
		foo();
		func01();
	}
	
}

public class InheritEx03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		S02 s = new S02();
		s.f();
	}

}
