package java191118;

class Super1{
	void func() {
		System.out.println("super!!");
	}
}
class Sub1 extends Super1{
	void func() { // --> 선언부, 해더라 부름.
		super.func();
		System.out.println("sub");			//오버라이딩
	}
}

public class OverEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Sub1 s = new Sub1();
		s.func();
		//오버라이딩 하면, 부모의 매소드는 무시되고 자식의 매소드가 호출된다., 이것이 동적 바인딩.
	}

}
