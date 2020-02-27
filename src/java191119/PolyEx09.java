package java191119;
// 오버라이딩으로 다형성 실현 예제
class Shape{
	void draw() {
		System.out.println("Shape");
	}
}

class Line extends Shape{
	@Override
	void draw() {
		System.out.println("Line");
	}
}

class Rect extends Shape{
	@Override
	void draw() {
		System.out.println("Rect");
	}
}

class Circle extends Shape{
	@Override
	void draw() {
		System.out.println("Circle");
	}
}

public class PolyEx09 {
	
	static void paint(Shape s) {
		s.draw();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Line line = new Line();
		paint(line);
		
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}

}
