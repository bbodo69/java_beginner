package java191113;

public class ThisEx01 {

	// this는 인스턴트 매서드나 생성자에서 사용됨
	// 인스턴스 변스
	int x = 10;
	
	void add(int x) {
		this.x=x;
	}
	
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThisEx01 t = new ThisEx01();
		t.add(100);
		System.out.println(t.x);
		
	}

}
