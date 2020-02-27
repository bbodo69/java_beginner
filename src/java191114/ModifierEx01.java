package java191114;

class Sample{
	//전체 공개
	public int a;
	//클래스 안에서만 접근가능
	private int b;
	//default, 패키지 내에서만 사용가능
	int c;
	//패키지, 다른패키지의 자식 클래스에서 사용 가능
	protected int d;
}


public class ModifierEx01 {

	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Sample s = new Sample();
		s.a = 10;
//		s.b = 5;         //private 지정자 이기 때문에 다른 클래스에서 b 사용 불가		
		
		
		System.out.println(s.a);
	}

}
