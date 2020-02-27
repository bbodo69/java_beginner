package java191121;

interface MyInter{
	void func();
	
}


public class AnonyEx01 {

	public static void main(String[] args) {


		//#1. 인터페이스 내부의 추상메서드 오버라이딩(구현)
		//	객체생성하여, 메서드 호출까지 한번에 해결.
		new MyInter() {
			// interface 의 추상메서드 구현
			public void func() {
				System.out.println("MyInter의 func() 오버라이드");
			}
			
		}.func();
	}

}
