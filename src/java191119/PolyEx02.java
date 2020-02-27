package java191119;

class AClass{
	int x;
	void add() {
		System.out.println("AAAA");
	}
}

class BClass extends AClass{
	int y;
	void add() {
		System.out.println("BBBB");
	}
	void sub() {
		System.out.println("SubSub");
	}
}

public class PolyEx02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AClass a = new AClass();		// x, add()
		AClass a1 = new BClass();		// x, @add(), y, sub()
		
		System.out.println(a.x);
		a.add();
		a1.add();
		
		
	}

}
