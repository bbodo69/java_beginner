package java191113;

class Circle{
	
	int radius;
	
	//Circle(){} <= ���� �Ⱥ��̴� �����ڰ� �����ǰ� ��������.
	
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
