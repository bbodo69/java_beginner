package java191113;

class Circle{
	
	int radius;
	
	//Circle(){} <= 눈에 안보이는 생성자가 생성되고 실행했음.
	
	void set(int r) {
		radius = r;
	}
	
	double getArea() {
		return radius * radius * 3.14;
	}
}

public class Const04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Circle pizza = new Circle();
		
		pizza.set(15);
		System.out.println(pizza.getArea());
		
		
	}

}
