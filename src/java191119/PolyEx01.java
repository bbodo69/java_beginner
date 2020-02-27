package java191119;
//다형성

class A {
	int x;
}

class B extends A{
	double y;
}

public class PolyEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

//		// 캐스팅
//		int a = 10;
//		double d = a;
		
//		double d = 5.7;		//자손 : 저웃, 실수 두개 갖고 있고
//		int a = (int)d ;    		//부모 : 타입 int 이므로 정수만 사용가능.
		
		//메모리 작은 쪽으로 강제 형변환
		A a = new A();
		B b = new B();
		
		//3. 다형성				// 조상의 참조변수로 자손의 객체를 생성하는것.
		A a1 = new B();
		System.out.println(a1.x); //ㅁ클래스가 갖고 있는 x만 사용가능.
		
		//double int 	: 기본형은 가능
		//B b1 = new A(); 	: 참조형은 에러, 자손이 조상객체로 만들기.
		
	}

}
