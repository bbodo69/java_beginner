package java191120;
// 인터페이스 정의
interface Test{
	public static final int NUM = 1; //상수
	public abstract void add();		//추상메서드
}
// 인터페이스 구현
interface Test2{
	void sub();
}
class Inter implements Test, Test2{//NUM, add()
	@Override
	public void add() {
		System.out.println("implements");
	}

	@Override
	public void sub() {
		System.out.println("sub");
	}
	
}



public class InterEx01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inter i = new Inter();
		i.add();
		i.sub();
		
		//다형성
		Test t = new Inter();
		t.add();
		
		Test2 t2 = new Inter();
		t2.sub();
		
		
				//new Inter 가 가진 모든 맴버에 접근하기 위해서는
				//Inter타입의 레퍼런스 변수에 Inter 타입으로 형변환해서 저장하여
				//Inter 타이븨 레퍼런스 변수를 사용하여 접근해야한다.
				
		Inter it = null;
		if(t instanceof Inter) { // t가 가르키는 객체가 Inter 의 객체라면 
			it = (Inter)t;			//it에 t를 대입해라
		}
		it.add();
		it.sub();
		System.out.println(it.NUM);
		
		}
		
	}


