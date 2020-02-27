package java191119;

class ShapeClass{
	public ShapeClass  next;					//다음에 연결될 객체의 주소를 복사
	public ShapeClass() { next = null;}	// null로 처리.(궂이 없어도 되는 생성자
	public void draw() {						
		System.out.println("Shape");
	}
}
class LineClass extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("Line");
	}
}
class RectClass extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("Rect");
	}
}
class CircleClass extends ShapeClass{
	@Override
	public void draw() {
		System.out.println("Circle");
	}
}


public class PolyEx10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ShapeClass start, last, obj;			//객체 생성
		// start : 링크드리스트 시작 객체 주소 담기
		// last : 마지막에 연결된 객체 주소 담기
		// obj : 새로운 객체 만들때 사용
		
		start = new LineClass();
		last = start;				//처음에는 start임과 동시에 last 객체이므로
		
		obj = new RectClass();
		last.next = obj;
		last = obj;
		obj = new LineClass();
		last.next = obj;
		last = obj;
		
		//모든 도형 출력
		ShapeClass s = start;		//start의 주소갓 회손을 막기위해
		//임의의 ShapeClass 타입 변수를 만들어 반복문에서 사용
		while(s!=null) {
			s.draw();
			s=s.next;
		}
	}

}
